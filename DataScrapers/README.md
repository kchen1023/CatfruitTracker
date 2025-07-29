`GetMaterials.py`
- used to retrieve the materials used for a cat's evolution
- 1 if exists, else 0
- creates a csv that is used for later processes

`MergeIDsAndCats.py`
- attaches an id number to the cats to be used as primary key

`GetMaterialsCosts.py`
- scrapes a [different community project](https://thanksfeanor.pythonanywhere.com/UDP) 
- retrieve the required amount of evolution materials needed
- number is not explicitly stated in html of wiki site

`GetFinal.py`
- because the general layout for evolution materials are in the same order, we can just loop through and replace the 1s in the ccsv with the numbers scraped from `GetMaterialsAmount.py`
- generates the final csv with information about the cat's evolution materials to be imported into the DB
