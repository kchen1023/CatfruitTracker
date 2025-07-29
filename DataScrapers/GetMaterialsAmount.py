import requests
from bs4 import BeautifulSoup
import pandas as pd

# load files
df = pd.read_csv("battle_cats/super_rare_cats_merged.csv")

results = []

for _, row in df.iterrows():
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

        # Safely locate the True Form Costs table
        tf_div = soup.find("div", id="tfcollapse")
        if not tf_div:
            raise ValueError("Missing 'tfcollapse' div")

        table = tf_div.find("table")
        if not table:
            raise ValueError("Missing table inside 'tfcollapse'")

        rows = table.find_all("tr")

        data_cells = rows[1].find_all("td")[1:]
        numbers = [cell.text.strip().replace("×", "") for cell in data_cells]

        results.append({
            "id": str(row['id']),
            "name": cat,
            "numbers": numbers
        })

    except Exception as e:
        results.append({
            "id": formatted_cat_id,
            "name": cat,
            "numbers": "N/A on UDP"
        })

# Output results to CSV
df_out = pd.DataFrame(results)
print(df_out)
df_out.to_csv("battle_cats/super_rare_cats_costs.csv", index=False)
print("✅ Saved")
