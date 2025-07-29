import pandas as pd

# load files
materials_df = pd.read_csv("battle_cats/super_rare_cats_materials.csv")
ids_df = pd.read_csv("battle_cats/all_cats_ids.csv")

# drop the row that doesnt have an id (cat god)
ids_df = ids_df.dropna(subset=["id", "name"])
# make sure ID is treated as an int
ids_df["id"] = ids_df["id"].astype(int)

# merge directly on 'name'
merged_df = pd.merge(materials_df, ids_df[["id", "name"]], on="name", how="left")

# reorder columns so that id is first
original_cols = materials_df.columns.tolist()
final_df = merged_df[["id"] + original_cols]

# Save the result
output_path = "battle_cats/super_rare_cats_merged.csv"
final_df.to_csv(output_path, index=False)

print(f"✅ saved")
