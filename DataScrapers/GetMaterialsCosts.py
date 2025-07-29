import requests
from bs4 import BeautifulSoup
import pandas as pd

# load files
input_file = pd.read_csv("battle_cats/super_rare_cats_merged.csv")

results = []

for _, row in input_file.iterrows():
    # pad left with 0 if only two digits to fit link
    formatted_cat_id = str(row['id']).zfill(3)
    cat = row['name']
    url = f"https://thanksfeanor.pythonanywhere.com/UDP/{formatted_cat_id}"

    try:
        print(f"🔍 Scraping *{cat}* at {url}")
        res = requests.get(url)
        if res.status_code != 200:
            print(f"❌ failed to retrieve page for {cat}")
            continue

        soup = BeautifulSoup(res.content, "html.parser")

        tf_div = soup.find("div", id="tfcollapse")
        table = tf_div.find("table")
        rows = table.find_all("tr")

        # we need to grab the second row (index 1) and then grab the numbers starting from the
        # second column (index 1) since the first number represent the xp needed, which is irrelevant
        cells = rows[1].find_all("td")[1:]
        # get rid of the "x" in the retrieved value (e.g., "x5" -> "5")
        numbers = []
        for cell in cells:
            text = cell.text.strip().replace("x", "")
            numbers.append(text)

        # numbers = # of materials needed for each item for the evolution
        results.append({
            "id": str(row['id']),
            "name": cat,
            "numbers": numbers
        })

    except Exception as e:
        # UDP does have information on all of the cats
        results.append({
            "id": formatted_cat_id,
            "name": cat,
            "numbers": "N/A on UDP"
        })

df = pd.DataFrame(results)
print(df)

df.to_csv("battle_cats/super_rare_cats_costs.csv", index=False)
print("✅ saved")
