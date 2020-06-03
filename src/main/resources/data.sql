-- import recipe
INSERT INTO "RECIPE" VALUES
  ('ALOOPARA', 'Aloo Paratha', 'https://www.youtube.com/watch?v=SfaPcyQA5rc'),
  ('POHA', 'Poha', 'https://www.youtube.com/watch?v=8LwYrE7PaC0'),
  ('DOSA', 'Dosa', 'https://www.youtube.com/watch?v=1QU11QPbV3U'),
  ('PULAO', 'Pulao', 'https://www.youtube.com/watch?v=qZKX3OOc2dk'),
  ('MAGGI', 'Maggi', 'https://www.youtube.com/watch?v=PzzlF3r1l2g'),
  ('UPMA', 'Upma', 'https://www.youtube.com/watch?v=F2Rvwl7BYmw'),
  ('DAALCHAWAL', 'Daal Chawal', 'https://www.youtube.com/watch?v=Utly_hN-gPM'),
  ('GOBHISABZI', 'Gobhi Ki Sabzi', 'https://www.youtube.com/watch?v=CYpueCIV4YY'),
  ('DALKHICHDI', 'Daal Khichdi', 'https://www.youtube.com/watch?v=c1tYk3I-H70'),
  ('FREIDRICE', 'Fried Rice', 'https://www.youtube.com/watch?v=aWArcqFI9ag'),
  ('ROTICHURA', 'Roti Ka Poha / Roti Chura', 'https://www.youtube.com/watch?v=ccHALOXbl_M'),
  ('KADHI', 'Kadhi', 'https://www.youtube.com/watch?v=NLFOt-vzU1M'),
  ('PAKODA', 'Pakoda', 'https://www.youtube.com/watch?v=dGd6GTNMOP8'),
  ('MIXDAAL', 'Mix Daal', 'https://www.youtube.com/watch?v=6DHYyoG5r9c'),
  ('TOORDAAL', 'Toor Daal', 'https://www.youtube.com/watch?v=6DHYyoG5r9c'),
  ('METHIPARAT', 'Methi Ke Parathe', 'https://www.youtube.com/watch?v=YkuXhgei6Uw'),
  ('MASALAPURI', 'Masaala Puri', 'https://www.youtube.com/watch?v=DwXxIv8S6gg'),
  ('EGGBHURJI', 'Egg Bhurji', 'https://www.youtube.com/watch?v=EMTCplPvF0Y'),
  ('BOILEDEGG', 'Boiled Egg', 'https://www.youtube.com/watch?v=5Ca3X_YiWbk'),
  ('OMELETTE', 'Omelette', 'https://www.youtube.com/watch?v=w6Be4fSTkdM'),
  ('CHANASABZI', 'Chane ki Sabzi', 'https://www.youtube.com/watch?v=1hC3EQ9UFrI'),
  ('CHANACHAAT', 'Kaala Chana Chaat', 'https://www.youtube.com/watch?v=0HkFHDCcLUk'),
  ('SABUDKHICH', 'Sabudana Khichdi', 'https://www.youtube.com/watch?v=Sboyf70QR9A'),
  ('TAWAPULAO', 'Tawa Pulao', 'https://www.youtube.com/watch?v=W7VCZ4wuTb4'),
  ('ALOOTICKY', 'Aloo Ticky', 'https://www.youtube.com/watch?v=JOcnHa8FnBM'),
  ('TAMATCHATN', 'Tamaatar ki Chatni', 'https://www.youtube.com/watch?v=iXVqF9MonDE'),
  ('SOOJIHALWA', 'Sooji ka Halwa / Sheera', 'https://www.youtube.com/watch?v=9KsM8q9n13g'),
  ('FISHCURRY', 'Fish Curry', 'https://www.youtube.com/watch?v=PpKCLohDDaQ'),
  ('PRAWNCURRY', 'Prawns Curry', 'https://www.youtube.com/watch?v=1Kv8otboMyg'),
  ('CHICKCURRY', 'Chicken Curry', 'https://www.youtube.com/watch?v=8zRqfj6uOoI'),
  ('FISHFRY', 'Fish Fry', 'https://www.youtube.com/watch?v=XaPIumr1_mQ'),
  ('PIZZA', 'Pizza', 'https://www.youtube.com/watch?v=56eRAEY1t8A'),
  ('SANDWICH', 'Sandwich', 'https://www.youtube.com/watch?v=b8d0gpsXzEk');


-- import recipe_tags
INSERT INTO "RECIPE_TAGS" VALUES
  ('ALOOPARA', 'veg'),
  ('ALOOPARA', 'meal'),
  ('POHA', 'veg'),
  ('POHA', 'snack'),
  ('DOSA', 'veg'),
  ('DOSA', 'meal'),
  ('DOSA', 'snack'),
  ('PULAO', 'veg'),
  ('PULAO', 'meal'),
  ('MAGGI', 'veg'),
  ('MAGGI', 'meal'),
  ('MAGGI', 'snack'),
  ('UPMA', 'veg'),
  ('UPMA', 'snack'),
  ('DAALCHAWAL', 'veg'),
  ('DAALCHAWAL', 'meal'),
  ('GOBHISABZI', 'veg'),
  ('GOBHISABZI', 'meal'),
  ('DALKHICHDI', 'veg'),
  ('DALKHICHDI', 'meal'),
  ('FREIDRICE', 'veg'),
  ('FREIDRICE', 'meal'),
  ('ROTICHURA', 'veg'),
  ('ROTICHURA', 'snack'),
  ('KADHI', 'veg'),
  ('KADHI', 'meal'),
  ('PAKODA', 'veg'),
  ('PAKODA', 'meal'),
  ('MIXDAAL', 'veg'),
  ('MIXDAAL', 'meal'),
  ('TOORDAAL', 'veg'),
  ('TOORDAAL', 'meal'),
  ('METHIPARAT', 'veg'),
  ('METHIPARAT', 'meal'),
  ('MASALAPURI', 'veg'),
  ('MASALAPURI', 'snack'),
  ('EGGBHURJI', 'veg'),
  ('EGGBHURJI', 'meal'),
  ('BOILEDEGG', 'veg'),
  ('BOILEDEGG', 'snack'),
  ('OMELETTE', 'veg'),
  ('OMELETTE', 'meal'),
  ('CHANASABZI', 'veg'),
  ('CHANASABZI', 'meal'),
  ('CHANACHAAT', 'veg'),
  ('CHANACHAAT', 'meal'),
  ('SABUDKHICH', 'veg'),
  ('SABUDKHICH', 'meal'),
  ('TAWAPULAO', 'veg'),
  ('TAWAPULAO', 'meal'),
  ('ALOOTICKY', 'veg'),
  ('ALOOTICKY', 'snack'),
  ('TAMATCHATN', 'veg'),
  ('TAMATCHATN', 'meal'),
  ('SOOJIHALWA', 'veg'),
  ('SOOJIHALWA', 'snack'),
  ('FISHCURRY', 'non-veg'),
  ('FISHCURRY', 'meal'),
  ('PRAWNCURRY', 'non-veg'),
  ('PRAWNCURRY', 'meal'),
  ('CHICKCURRY', 'non-veg'),
  ('CHICKCURRY', 'meal'),
  ('FISHFRY', 'non-veg'),
  ('FISHFRY', 'meal'),
  ('PIZZA', 'veg'),
  ('PIZZA', 'meal'),
  ('SANDWICH', 'veg'),
  ('SANDWICH', 'snack');

-- import ingredients
INSERT INTO "INGREDIENT" VALUES
  ('POTATO', 'potatao'),
  ('FLOOR', 'aata'),
  ('POHA', 'poha'),
  ('DOSABATTER', 'dosa-batter'),
  ('RICE', 'rice'),
  ('MAGGI', 'maggi'),
  ('SEMOLINA', 'rava'),
  ('DAAL', 'daal'),
  ('CAULIFLOW', 'gobhi'),
  ('CHAPATI', 'roti'),
  ('CURD', 'dahi'),
  ('TOORDAAL', 'toor-daal'),
  ('GRAMFLOOR', 'besan'),
  ('BLACKGRAM', 'kaala-chana'),
  ('SAGO', 'sabu-daana'),
  ('TOMATO', 'tamatar'),
  ('FISH', 'fish'),
  ('PRAWN', 'prawn'),
  ('CHICKEN', 'chicken'),
  ('BREAD', 'bread'),
  ('EGG', 'egg'),
  ('PIZZADOUGH', 'pizza-dough'),
  ('FENUGREEK', 'methi');


INSERT INTO "RECIPE_INGREDIENTS" VALUES
  ('ALOOPARA', 'POTATO'),
  ('ALOOPARA', 'FLOOR'),
  ('POHA', 'POHA'),
  ('DOSA', 'DOSABATTER'),
  ('MAGGI', 'MAGGI'),
  ('UPMA', 'SEMOLINA'),
  ('DAALCHAWAL', 'DAAL'),
  ('DAALCHAWAL', 'RICE'),
  ('GOBHISABZI', 'CAULIFLOW'),
  ('ROTICHURA', 'CHAPATI'),
  ('KADHI', 'CURD'),
  ('KADHI', 'GRAMFLOOR'),
  ('PULAO', 'RICE'),
  ('DALKHICHDI', 'DAAL'),
  ('DALKHICHDI', 'RICE'),
  ('PAKODA', 'GRAMFLOOR'),
  ('MIXDAAL', 'DAAL'),
  ('TOORDAAL', 'TOORDAAL'),
  ('FREIDRICE',   'RICE'),
  ('METHIPARAT', 'FENUGREEK'),
  ('METHIPARAT', 'FLOOR'),
  ('EGGBHURJI', 'EGG'),
  ('BOILEDEGG', 'EGG'),
  ('OMELETTE', 'EGG'),
  ('CHANASABZI', 'BLACKGRAM'),
  ('CHANACHAAT', 'BLACKGRAM'),
  ('SABUDKHICH', 'SAGO'),
  ('TAWAPULAO', 'RICE'),
  ('ALOOTICKY', 'POTATO'),
  ('TAMATCHATN', 'TOMATO'),
  ('SOOJIHALWA', 'SEMOLINA'),
  ('FISHCURRY', 'FISH'),
  ('PRAWNCURRY', 'PRAWN'),
  ('CHICKCURRY', 'CHICKEN'),
  ('FISHFRY', 'FISH'),
  ('SANDWICH', 'BREAD'),
  ('PIZZA', 'PIZZADOUGH'),
  ('MASALAPURI', 'FLOOR');
