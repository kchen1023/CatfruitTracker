import requests
from bs4 import BeautifulSoup
import pandas as pd

url = "https://battlecats.miraheze.org/wiki/True_Form"
headers = {
    "User-Agent": "Mozilla/5.0"
}

res = requests.get(url, headers=headers)
soup = BeautifulSoup(res.content, "html.parser")

# Locate the "Super Rare Cats" section
super_rare_header = soup.find("span", id="Super_Rare_Cats")
ul = super_rare_header.find_parent("h3").find_next_sibling("ul")

# Extract names from <li> elements
cat_names = []
for li in ul.find_all("li", recursive=False):
    a_tag = li.find("a")
    if a_tag:
        name = a_tag.text.strip()
        cat_names.append(name)

# Save to CSV
df = pd.DataFrame({"name": cat_names})
print(df)

df.to_csv("battle_cats/super_rare_cats_list.csv", index=False)
print("✅ saved")
