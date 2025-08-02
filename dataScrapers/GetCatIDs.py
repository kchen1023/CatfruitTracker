import requests
from bs4 import BeautifulSoup
import pandas as pd

# URL of the Battle Cats release order page
url = "https://battle-cats.fandom.com/wiki/Cat_Release_Order"

# Attempt to fetch and parse the page
response = requests.get(url)
soup = BeautifulSoup(response.text, "html.parser")

# Find the table containing cat IDs and names
table = soup.find("table", class_="article-table")
rows = table.find_all("tr")[1:]  # Skip the header row

# Extract ID and Name
cat_data = []
for row in rows:
    cols = row.find_all("td")
    if len(cols) >= 3:
        try:
            cat_id = cols[0].text.strip()
            cat_name = cols[2].text.strip()
            cat_data.append({"id": cat_id, "name": cat_name})
        except:
            continue

# Convert to DataFrame
df = pd.DataFrame(cat_data)

# Save to CSV
df.to_csv("battle_cats/all_cats_ids.csv", index=False)
print(f"✅ saved")
