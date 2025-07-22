# Catfruit Tracker

Game: The Battle Cats

Restarting my project. Making this because I got annoyed in having to track the amount of materials I needed for unit evolutions.

Unit data is taken from [Unit Description Project](https://thanksfeanor.pythonanywhere.com/UDP) and [PackPack](https://discord.com/discovery/applications/779311078412255242) (Discord Bot). Additional information about cats can also be found at [MyGamatoto](https://mygamatoto.com/).

## GOAL 1
A chart with each row detailing the materials needed for evolution to the requested form.
Near the bottom, it will display the total needed number for each material.
At the bottom, there will be areas for the user to fill in with their inventory.
![IMG_1208](https://github.com/user-attachments/assets/b0cef434-fb2b-406e-98d2-1222193569fe)

With user input, the "TOTAL NEEDED" row will update, showing the remaining amount of materials needed.
![IMG_1209](https://github.com/user-attachments/assets/ce3541b8-0b62-4d8b-82ba-d6624746267c)

**Data Storage: PostgreSQL**

Tables:
- Cats
  - Rare
  - Super Rate
  - Uber Rare
- Materials
  - Seeds
  - Fruits
  - Behemoth Stones
  - Behemoth Gems
- Cats + Materials
  - Rare
  - Super Rate
  - Uber Rare
