import requests
from bs4 import BeautifulSoup
import pandas as pd

# load files
input_file = "battle_cats/cats_super_rare/super_rare_cats_list.csv"
cats_list = pd.read_csv(input_file)

# wiki URL used to scrape data
base_url = "https://battlecats.miraheze.org/wiki/{}_(Super_Rare_Cat)"
# must be included, not sure why...
headers = {
    "User-Agent": (
        "Mozilla/5.0 (Windows NT 10.0; Win64; x64) "
        "AppleWebKit/537.36 (KHTML, like Gecko) "
        "Chrome/115.0.0.0 Safari/537.36"
    )
}

# all materials in same format as SQL DB
material_columns = [
    "green_seed", "purple_seed", "red_seed", "blue_seed", "yellow_seed",
    "epic_seed", "aku_seed", "elder_seed", "gold_seed",
    "green_fruit", "purple_fruit", "red_fruit", "blue_fruit", "yellow_fruit",
    "epic_fruit", "aku_fruit", "elder_fruit", "gold_fruit",
    "purple_behemoth_stone", "red_behemoth_stone", "blue_behemoth_stone",
    "green_behemoth_stone", "yellow_behemoth_stone", "epic_behemoth_stone",
    "purple_behemoth_gem", "red_behemoth_gem", "blue_behemoth_gem",
    "green_behemoth_gem", "yellow_behemoth_gem"
]

# converts wiki material name to match DB names
def normalize_material_name(raw_name):
    if raw_name == "RainbowSeed":
        return "epic_seed"
    if raw_name == "RainbowFruit":
        return "epic_fruit"
    if raw_name == "AncientFruit":
        return "elder_fruit"
    if raw_name == "GoldenFruit":
        return "gold_fruit"
    if raw_name.endswith("Stone"):
        name = raw_name.replace('Stone', '').lower()
        return f"{name}_behemoth_stone"
    if raw_name.endswith("Gem"):
        name = raw_name.replace('Gem', '').lower()
        return f"{name}_behemoth_gem"
    if raw_name.endswith("Seed"):
        name = raw_name.replace('Seed', '').lower()
        return f"{name}_seed"
    if raw_name.endswith("Fruit"):
        name = raw_name.replace('Fruit', '').lower()
        return f"{name}_fruit"
    
    return None

# get and store results
results = []

for cat in cats_list["name"]:
    wiki_name = cat.replace(" ", "_")
    url = base_url.format(wiki_name)
    print(f"🔍 scraping *{cat}* at {url}")

    try:
        res = requests.get(url, headers=headers)
        if res.status_code != 200:
            print(f"❌ failed to retrieve page for {cat}")
            continue

        soup = BeautifulSoup(res.content, "html.parser")

        table = soup.find("table", class_="CatfruitTable")
        # if table not found, then table (most likely) not exist:
        if not table:
            print(f"🚫 no evolution information found for {cat}")
            continue
        else:
            evolve_materials = table.find("tr", class_="evolve-materials")

        # initialize row with all materials set to 0
        row = {col: 0 for col in material_columns}
        row["name"] = cat

        # mark found materials as 1 (exists)
        for td in evolve_materials.find_all("td"):
            fruit_link = td.find("a")
            if fruit_link and 'title' in fruit_link.attrs:
                raw_name = fruit_link['title']
            # print(raw_name)

            # normalize the names to fit DB
            if raw_name:
                # print(raw_name)
                normalized_name = normalize_material_name(raw_name)
                if normalized_name:
                    if normalized_name in row:
                        row[normalized_name] = 1
                    else:
                        print(f"⚠️ normalized name not recognized: {normalized_name}")
                else:
                    print(f"⚠️ unknown material: {raw_name}")

        results.append(row)

    except Exception as e:
        print(f"❌ error processing {cat}: {e}")

# save output
df = pd.DataFrame(results)
ordered_cols = ["name"]
for col in material_columns:
    if col != "name":
        ordered_cols.append(col)

# put name col first
df = df[ordered_cols]
print(df)

df.to_csv("battle_cats/super_rare_cats_materials.csv", index=False)
print("✅ saved")
