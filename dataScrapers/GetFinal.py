import pandas as pd
import ast
from pathlib import Path

# load csv files
merged_df = pd.read_csv("BattleCats/rare_cats_merged.csv")
costs_df = pd.read_csv("BattleCats/rare_cats_costs.csv")
# merged_df = pd.read_csv("BattleCats/super_rare_cats_merged.csv")
# costs_df = pd.read_csv("BattleCats/super_rare_cats_costs.csv")

# skip id and name cols
material_columns = []
for col in merged_df.columns:
    if col not in ["id", "name", "rarity"]:
        material_columns.append(col)

# parse valid rows from costs_df and clean
costs_df = costs_df[costs_df["numbers"].str.startswith("[")].copy()
costs_df.loc[:, "numbers"] = costs_df["numbers"].apply(ast.literal_eval)

# create mapping from name to cost list
cost_dict = dict(zip(costs_df["name"], costs_df["numbers"]))

# loop through the cols and find the non-zero cols
# this means the material is needed to evolve
# replace it with the respective value in the cost_list in the same position
# (e.g., the second material is the first col that is non-zero, so replace with first cost from list
# the fourth material is the second col that is non-zero, so replace with second cost from list)
results = []

for _, row in merged_df.iterrows():
    cat = row["name"]
    cost_list = cost_dict.get(cat, [])
    # print(cost_list)
    
    new_row = row.copy()
    cost_index = 0

    for col in material_columns:
        if row[col] != 0 and cost_index < len(cost_list):
            new_row[col] = int(cost_list[cost_index])
            cost_index += 1

    results.append(new_row)


df = pd.DataFrame(results)
# print(df)

df.to_csv("BattleCats/rare_cats_final.csv", index=False)
# df.to_csv("BattleCats/super_rare_cats_final.csv", index=False)
print(f"✅ saved")
