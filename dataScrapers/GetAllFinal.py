# combines final CSVs of each rarity

import pandas as pd

# load files
rare = pd.read_csv("BattleCats/CatsRare/rare_cats_final.csv")
super_rare = pd.read_csv("BattleCats/CatsSuperRare/super_rare_cats_final.csv")

combined_df = pd.concat([rare, super_rare])

# save output
print(combined_df)
output_path = "BattleCats/final_data.csv"
combined_df.to_csv(output_path, index=False)
