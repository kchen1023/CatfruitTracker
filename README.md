# Catfruit Tracker

Game: The Battle Cats (PONOS)

Restarting my project. I'm making this because I got annoyed having to track the number of items I needed for unit evolutions.

Unit data is taken from [The Battle Cats Wiki (Fandom)](https://battle-cats.fandom.com/wiki/Battle_Cats_Wiki), [The Battle Cats Wiki (Miraheze)](https://battlecats.miraheze.org/wiki/Battle_Cats_Wiki), the [Unit Description Project](https://thanksfeanor.pythonanywhere.com/UDP), PackPack (Discord Bot), and [MyGamatoto](https://mygamatoto.com/).

Inspiration taken from MyGamatoto!

## GOAL 1 (Revised)
A chart that displays all of the cats (or of a rarity) in a table, along with items and numbers needed for evolution.
<br>Displayed with Thymeleaf.
![IMG_145F45E01377-1](https://github.com/user-attachments/assets/58ff973f-0146-4fbd-8fd6-2738a1537dec)

## GOAL 2 (Revised)
Allow users to select (add and remove) cats onto the chart, and dynamically calculate the total number of each material needed for evolution.
<br>Displayed with Thymeleaf.
![IMG_08DAD79FFF83-1](https://github.com/user-attachments/assets/9cf913e7-099c-469b-8de9-966487baeb9a)

## GOAL 3 (Current intention of final product)
At the bottom, there will be areas for the user to fill in with their inventory.
<br>Displayed with React.
![IMG_1208](https://github.com/user-attachments/assets/b0cef434-fb2b-406e-98d2-1222193569fe)

With user input, the "TOTAL NEEDED" row will update, showing the remaining number of items needed.
![IMG_1209](https://github.com/user-attachments/assets/ce3541b8-0b62-4d8b-82ba-d6624746267c)


**Data Storage: PostgreSQL**
- Cats
  - Special (not yet implemented)
  - Rare
  - Super Rate
  - Uber Rare (not yet implemented)
- items
  - Seeds
  - Fruits
  - Behemoth Stones
  - Behemoth Gems
