/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PeterW
 */
public class CraftingCalculator extends AbstractCalculator{
    CraftingCalculator(){
        this.isCombatSkill = false;
        skillFilter.add("Armour");
        nameAndXpGained.put("ArmourLevel 01 - Leather Gloves",13.8); 
        nameAndXpGained.put("ArmourLevel 07 - Leather Boots",16.3); 
        nameAndXpGained.put("ArmourLevel 09 - Leather Cowl",18.5);
	nameAndXpGained.put("ArmourLevel 11 - Leather Vambraces",22.0); 
        nameAndXpGained.put("ArmourLevel 14 - Leather Body",25.0); 
        nameAndXpGained.put("ArmourLevel 15 - Snail Helmet",32.5); 
        nameAndXpGained.put("ArmourLevel 15 - Crab Helmet",33.0);
	nameAndXpGained.put("ArmourLevel 18 - Leather Chaps",27.0);
        nameAndXpGained.put("ArmourLevel 28 - Hard Leather Body",35.0); 
        nameAndXpGained.put("ArmourLevel 30 - Carapace Gloves",12.0); 
        nameAndXpGained.put("ArmourLevel 31 - Carapace Boots",12.0);
	nameAndXpGained.put("ArmourLevel 32 - Spiked Vambraces",5.8); 
        nameAndXpGained.put("ArmourLevel 33 - Carapace Helm",24.0); 
        nameAndXpGained.put("ArmourLevel 34 - Carapace Legs",24.0); 
        nameAndXpGained.put("ArmourLevel 35 - Fremennik Shield",34.0);
	nameAndXpGained.put("ArmourLevel 35 - Carapace Torso",36.0);
	nameAndXpGained.put("ArmourLevel 35 - Broodoo Shield",100.0); 
        nameAndXpGained.put("ArmourLevel 38 - Coif",37.0); 
        nameAndXpGained.put("ArmourLevel 38 - Painted Rune Full Helmet",37.0);
	nameAndXpGained.put("ArmourLevel 38 - Painted Steel full helmet",37.0); 
        nameAndXpGained.put("ArmourLevel 41 - Studded Body",40.0); 
        nameAndXpGained.put("ArmourLevel 43 - Yak-hide Leg Armour",32.0); 
        nameAndXpGained.put("ArmourLevel 43 - Painted Rune kiteshield",40.0);
	nameAndXpGained.put("ArmourLevel 43 - Painted Steel kiteshield",40.0);											
        nameAndXpGained.put("ArmourLevel 44 - Studded Chaps",42.0); 
        nameAndXpGained.put("ArmourLevel 45 - Snakeskin Boots",30.0); 
        nameAndXpGained.put("ArmourLevel 46 - Yak-Hide Body Armour",32.0);
	nameAndXpGained.put("ArmourLevel 47 - Snakeskin Vambraces",35.0); 
        nameAndXpGained.put("ArmourLevel 48 - Snakeskin Bandana",45.0); 
        nameAndXpGained.put("ArmourLevel 51 - Snakeskin Chaps",50.0); 
        nameAndXpGained.put("ArmourLevel 53 - Snakeskin Body",55.0);
	nameAndXpGained.put("ArmourLevel 57 - Green Dragonhide Vambraces",62.0);
        nameAndXpGained.put("ArmourLevel 60 - Green Dragonhide Chaps",124.0); 
        nameAndXpGained.put("ArmourLevel 63 - Green Dragonhide Body",186.0); 
        nameAndXpGained.put("ArmourLevel 64 - Green d'hide shield",248.0);
	nameAndXpGained.put("ArmourLevel 66 - Blue Dragonhide Vambraces",70.0); 
        nameAndXpGained.put("ArmourLevel 68 - Blue Dragonhide Chaps",140.0); 
        nameAndXpGained.put("ArmourLevel 71 - Blue Dragonhide Body",210.0); 
        nameAndXpGained.put("ArmourLevel 72 - Blue d'hide shield",280.0);
	nameAndXpGained.put("ArmourLevel 73 - Red Dragonhide Vambraces",78.0);	
	nameAndXpGained.put("ArmourLevel 75 - Red Dragonhide Chaps",156.0); 
        nameAndXpGained.put("ArmourLevel 77 - Red Dragonhide Body",234.0); 
        nameAndXpGained.put("ArmourLevel 78 - Red d'hide shield",312.0);
	nameAndXpGained.put("ArmourLevel 79 - Headdress",50.0); 
        nameAndXpGained.put("ArmourLevel 79 - Black Dragonhide Vambraces",86.0); 
        nameAndXpGained.put("ArmourLevel 82 - Black Dragonhide Chaps",172.0); 
        nameAndXpGained.put("ArmourLevel 84 - Black Dragonhide Body",258.0);
	nameAndXpGained.put("ArmourLevel 85 - Black d'hide shield",344.0);				
	nameAndXpGained.put("ArmourLevel 87 - Royal Dragonhide Vambraces",94.0); 
        nameAndXpGained.put("ArmourLevel 89 - Royal Dragonhide Chaps",188.0);
	nameAndXpGained.put("ArmourLevel 93 - Royal Dragonhide Body",282.0);
        skillFilter.add("Jewellery");
        nameAndXpGained.put("JewelleryLevel 01 - String Amulets/Symbols",4.0);
	nameAndXpGained.put("JewelleryLevel 01 - Cut Opal Gem",15.0);
        nameAndXpGained.put("JewelleryLevel 05 - Gold Ring",15.0);
	nameAndXpGained.put("JewelleryLevel 06 - Gold Necklace",20.0);
        nameAndXpGained.put("JewelleryLevel 07 - Gold Bracelet",25.0);
	nameAndXpGained.put("JewelleryLevel 08 - Gold Amulet",30.0);
        nameAndXpGained.put("JewelleryLevel 13 - Cut Jade Gem",20.0);
	nameAndXpGained.put("JewelleryLevel 16 - Cut Red Topaz Gem",25.0);
        nameAndXpGained.put("JewelleryLevel 16 - Holy Symbol",50.0);
	nameAndXpGained.put("JewelleryLevel 17 - Unholy Symbol",50.0);
        nameAndXpGained.put("JewelleryLevel 20 - Sapphire Ring",40.0);
	nameAndXpGained.put("JewelleryLevel 20 - Cut Sapphire Gem",50.0);
        nameAndXpGained.put("JewelleryLevel 22 - Sapphire Necklace",55.0);
	nameAndXpGained.put("JewelleryLevel 23 - Tiara",52.5);
        nameAndXpGained.put("JewelleryLevel 23 - Sapphire Bracelet",60.0);
	nameAndXpGained.put("JewelleryLevel 24 - Sapphire Amulet",65.0);
        nameAndXpGained.put("JewelleryLevel 27 - Emerald Ring",55.0);
	nameAndXpGained.put("JewelleryLevel 27 - Cut Emerald Gem",67.0);
        nameAndXpGained.put("JewelleryLevel 29 - Emerald Necklace",60.0);
	nameAndXpGained.put("JewelleryLevel 30 - Emerald Bracelet",65.0);
        nameAndXpGained.put("JewelleryLevel 31 - Emerald Amulet",70.0);
	nameAndXpGained.put("JewelleryLevel 34 - Ruby Ring",70.0);
        nameAndXpGained.put("JewelleryLevel 34 - Cut Ruby Gem",85.0);
	nameAndXpGained.put("JewelleryLevel 40 - Ruby Necklace",75.0);
        nameAndXpGained.put("JewelleryLevel 42 - Ruby Bracelet",80.0);
	nameAndXpGained.put("JewelleryLevel 43 - Diamond Ring",85.0);
        nameAndXpGained.put("JewelleryLevel 43 - Cut Diamond Gem",107.5);
	nameAndXpGained.put("JewelleryLevel 50 - Ruby Amulet",85.0);
        nameAndXpGained.put("JewelleryLevel 55 - Dragonstone Ring",100.0);
	nameAndXpGained.put("JewelleryLevel 55 - Cut Dragonstone Gem",137.5);    											
	nameAndXpGained.put("JewelleryLevel 56 - Diamond Necklace",90.0);
	nameAndXpGained.put("JewelleryLevel 58 - Diamond Bracelet",95.0);
        nameAndXpGained.put("JewelleryLevel 67 - Onyx Ring",115.0);
	nameAndXpGained.put("JewelleryLevel 67 - Cut Onyx Gem",167.5);
        nameAndXpGained.put("JewelleryLevel 70 - Diamond Amulet",100.0);
	nameAndXpGained.put("JewelleryLevel 72 - Dragonstone Necklace",105.0);
        nameAndXpGained.put("JewelleryLevel 74 - Dragonstone Bracelet",110.0);
	nameAndXpGained.put("JewelleryLevel 80 - Dragonstone Amulet",150.0);
	nameAndXpGained.put("JewelleryLevel 82 - Onyx Necklace",120.0);
        nameAndXpGained.put("JewelleryLevel 84 - Onyx Bracelet",125.0);
	nameAndXpGained.put("JewelleryLevel 90 - Onyx Amulet",165.0);
        skillFilter.add("Glass");
        nameAndXpGained.put("GlassLevel 01 - Molten Glass - Superglass Make",10.0);
        nameAndXpGained.put("GlassLevel 01 - Beer Glass",17.5);
	nameAndXpGained.put("GlassLevel 01 - Molten Glass",20.0);
        nameAndXpGained.put("GlassLevel 04 - Candle Lantern",19.0);
        nameAndXpGained.put("GlassLevel 12 - Oil Lamp",25.0);
	nameAndXpGained.put("GlassLevel 33 - Vial",35.0);
        nameAndXpGained.put("GlassLevel 42 - Fishbowl",42.5);
        nameAndXpGained.put("GlassLevel 46 - Glass Orb",52.5);
	nameAndXpGained.put("GlassLevel 49 - Bullseye Lantern Lens",55.0);
        nameAndXpGained.put("GlassLevel 87 - Dorgeshuun Light Orb",70.0);
        nameAndXpGained.put("GlassLevel 87 - Add Filament to Light Orb",104.0);
	nameAndXpGained.put("GlassLevel 87 - Glass, Light Orb, and Filament",194.0);
        skillFilter.add("Weaponry");
        nameAndXpGained.put("WeaponryLevel 21 - Silver Bolts x 10",50.0);
        nameAndXpGained.put("WeaponryLevel 54 - Water Battlestaff",100.0);
        nameAndXpGained.put("WeaponryLevel 58 - Earth Battlestaff",112.5);
        nameAndXpGained.put("WeaponryLevel 62 - Fire Battlestaff",125.0);
        nameAndXpGained.put("WeaponryLevel 66 - Air Battlestaff",137.5);
	skillFilter.add("Funeral Pyre Ships");
        nameAndXpGained.put("Funeral Pyre ShipsLevel 11 - Achey Pyre",10.0);
        nameAndXpGained.put("Funeral Pyre ShipsLevel 11 - Wooden Pyre",10.0);
        nameAndXpGained.put("Funeral Pyre ShipsLevel 25 - Oak Pyre",15.0);
        nameAndXpGained.put("Funeral Pyre ShipsLevel 40 - Willow Pyre",22.5);
        nameAndXpGained.put("Funeral Pyre ShipsLevel 45 - Teak Pyre",26.2);
        nameAndXpGained.put("Funeral Pyre ShipsLevel 52 - Arctic Pine Pyre",31.2);
        nameAndXpGained.put("Funeral Pyre ShipsLevel 55 - Maple Pyre",33.7);
        nameAndXpGained.put("Funeral Pyre ShipsLevel 60 - Mahogany Pyre",39.3);
        nameAndXpGained.put("Funeral Pyre ShipsLevel 70 - Yew Pyre",50.6);
	nameAndXpGained.put("Funeral Pyre ShipsLevel 85 - Magic Pyre",75.9);
        skillFilter.add("Dungeon Leather Armour");
        nameAndXpGained.put("Dungeon Leather ArmourLevel 01 - Protoleather Vambraces",13.1);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 03 - Protoleather Boots",14.8);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 05 - Protoleather Coif",33.0);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 07 - Protoleather Chaps",54.6);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 09 - Protoleather Body",99.5);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 11 - Subleather Vambraces",21.6);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 13 - Subleather Boots",23.3);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 15 - Subleather Coif",50.0);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 17 - Subleather Chaps",80.1);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 19 - Subleather Body",142.0);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 21 - Paraleather Vambraces",30.1);
	nameAndXpGained.put("Dungeon Leather ArmourLevel 23 - Paraleather Boots",31.8);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 25 - Paraleather Coif",67.0);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 27 - Paraleather Chaps",105.6);				
	nameAndXpGained.put("Dungeon Leather ArmourLevel 29 - Paraleather Body",184.5);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 31 - Archleather Vambraces",38.6);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 33 - Archleather Boots",40.3);
	nameAndXpGained.put("Dungeon Leather ArmourLevel 35 - Archleather Coif",84.0);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 37 - Archleather Chaps",131.1);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 39 - Archleather Body",269.5);				
	nameAndXpGained.put("Dungeon Leather ArmourLevel 41 - Dromoleather Vambraces",47.1);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 43 - Dromoleather Boots",48.8);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 45 - Dromoleather Coif",101.0);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 47 - Dromoleather Chaps",156.6);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 49 - Dromoleather Body",269.5);				
	nameAndXpGained.put("Dungeon Leather ArmourLevel 51 - Spinoleather Vambraces",55.6);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 53 - Spinoleather Boots",57.3);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 55 - Spinoleather Coif",118.0);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 57 - Spinoleather Chaps",182.1);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 59 - Spinoleather Body",312.0);				
	nameAndXpGained.put("Dungeon Leather ArmourLevel 61 - Gallileather Vambraces",64.1);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 63 - Gallileather Boots",65.8);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 65 - Gallileather Coif",135.0);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 67 - Gallileather Chaps",207.6);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 69 - Gallileather Body",354.5);				
	nameAndXpGained.put("Dungeon Leather ArmourLevel 71 - Stegoleather Vambraces",72.6);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 73 - Stegoleather Boots",74.5);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 75 - Stegoleather Coif",152.0);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 77 - Stegoleather Chaps",233.1);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 79 - Stegoleather Body",397.0);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 81 - Megaleather Vambraces",81.1);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 83 - Megaleather Boots",82.8); 
        nameAndXpGained.put("Dungeon Leather ArmourLevel 85 - Megaleather Coif",169.0);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 87 - Megaleather Chaps",258.6);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 89 - Megaleather Body",439.5);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 91 - Tyrannoleather Vambraces",89.6); 
        nameAndXpGained.put("Dungeon Leather ArmourLevel 93 - Tyrannoleather Boots",91.3);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 95 - Tyrannoleather Coif",186.0);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 97 - Tyrannoleather Chaps",284.1);
        nameAndXpGained.put("Dungeon Leather ArmourLevel 99 - Tyrannoleather Body",482.0);
  	skillFilter.add("Dungeon Cloth Armour");
        nameAndXpGained.put("Dungeon Cloth ArmourLevel 02 - Salve Gloves",14.2);
	nameAndXpGained.put("Dungeon Cloth ArmourLevel 04 - Salve Hood",31.8);
        nameAndXpGained.put("Dungeon Cloth ArmourLevel 06 - Salve Robe Bottom",52.8);
	nameAndXpGained.put("Dungeon Cloth ArmourLevel 08 - Salve Robe Top",96.5);
        nameAndXpGained.put("Dungeon Cloth ArmourLevel 10 - Wildercress Gloves",21.0);
	nameAndXpGained.put("Dungeon Cloth ArmourLevel 12 - Wildercress Shoes",22.7);
        nameAndXpGained.put("Dungeon Cloth ArmourLevel 14 - Wildercress Hood",48.8);
	nameAndXpGained.put("Dungeon Cloth ArmourLevel 16 - Wildercress Robe Bottom",78.3);
        nameAndXpGained.put("Dungeon Cloth ArmourLevel 18 - Wildercress Robe Top",139.0);
	nameAndXpGained.put("Dungeon Cloth ArmourLevel 20 - Blightleaf Gloves",29.5);
        nameAndXpGained.put("Dungeon Cloth ArmourLevel 22 - Blightleaf Shoes",31.2);
	nameAndXpGained.put("Dungeon Cloth ArmourLevel 24 - Blightleaf Hood",65.8);
        nameAndXpGained.put("Dungeon Cloth ArmourLevel 26 - Blightleaf Robe Bottom",103.8);
	nameAndXpGained.put("Dungeon Cloth ArmourLevel 28 - Blightleaf Robe Top",181.5);
        nameAndXpGained.put("Dungeon Cloth ArmourLevel 30 - Roseblood Gloves",38.0);
	nameAndXpGained.put("Dungeon Cloth ArmourLevel 32 - Roseblood Shoes",39.7);
        nameAndXpGained.put("Dungeon Cloth ArmourLevel 34 - Roseblood Hood",82.8);
	nameAndXpGained.put("Dungeon Cloth ArmourLevel 36 - Roseblood Robe Bottom",129.3);
        nameAndXpGained.put("Dungeon Cloth ArmourLevel 38 - Roseblood Robe Top",224.0);
	nameAndXpGained.put("Dungeon Cloth ArmourLevel 40 - Bryll Gloves",46.5);
        nameAndXpGained.put("Dungeon Cloth ArmourLevel 42 - Bryll Shoes",48.2);
	nameAndXpGained.put("Dungeon Cloth ArmourLevel 44 - Bryll Hood",99.8);
        nameAndXpGained.put("Dungeon Cloth ArmourLevel 46 - Bryll Robe Bottom",154.8);
	nameAndXpGained.put("Dungeon Cloth ArmourLevel 48 - Bryll Robe Top",266.5);
        nameAndXpGained.put("Dungeon Cloth ArmourLevel 50 - Duskweed Gloves",55.0);
	nameAndXpGained.put("Dungeon Cloth ArmourLevel 52 - Duskweed Shoes",56.7);
        nameAndXpGained.put("Dungeon Cloth ArmourLevel 54 - Duskweed Hood",116.8);
	nameAndXpGained.put("Dungeon Cloth ArmourLevel 56 - Duskweed Robe Bottom",180.3);
	nameAndXpGained.put("Dungeon Cloth ArmourLevel 58 - Duskweed Robe Top",309.0);
        nameAndXpGained.put("Dungeon Cloth ArmourLevel 60 - Soulbell Gloves",63.5);
        nameAndXpGained.put("Dungeon Cloth ArmourLevel 62 - Soulbell Shoes",65.2);
        nameAndXpGained.put("Dungeon Cloth ArmourLevel 64 - Soulbell Hood",133.8);
        nameAndXpGained.put("Dungeon Cloth ArmourLevel 66 - Soulbell Robe Bottom",205.8);
        nameAndXpGained.put("Dungeon Cloth ArmourLevel 68 - Soulbell Robe Top",351.5);
        nameAndXpGained.put("Dungeon Cloth ArmourLevel 70 - Ectogloves",72.0);
        nameAndXpGained.put("Dungeon Cloth ArmourLevel 72 - Ectoshoes",73.7);
        nameAndXpGained.put("Dungeon Cloth ArmourLevel 74 - Ectohood",150.8);
        nameAndXpGained.put("Dungeon Cloth ArmourLevel 76 - Ectorobe Bottom",231.3);
        nameAndXpGained.put("Dungeon Cloth ArmourLevel 78 - Ectorobe Top",394.0);
        nameAndXpGained.put("Dungeon Cloth ArmourLevel 80 - Runic Gloves",80.5);
        nameAndXpGained.put("Dungeon Cloth ArmourLevel 82 - Runic Shoes",82.2);
        nameAndXpGained.put("Dungeon Cloth ArmourLevel 84 - Runic Hood",167.8);
        nameAndXpGained.put("Dungeon Cloth ArmourLevel 86 - Runic Robe Bottom",256.8);
        nameAndXpGained.put("Dungeon Cloth ArmourLevel 88 - Runic Robe Top",439.5);
        nameAndXpGained.put("Dungeon Cloth ArmourLevel 90 - Spiritbloom Gloves",89.0);
        nameAndXpGained.put("Dungeon Cloth ArmourLevel 92 - Spiritbloom Shoes",90.7);
	nameAndXpGained.put("Dungeon Cloth ArmourLevel 94 - Spiritbloom Hood",184.8);
        nameAndXpGained.put("Dungeon Cloth ArmourLevel 96 - Spiritbloom Robe Bottom",282.3);
        nameAndXpGained.put("Dungeon Cloth ArmourLevel 98 - Spiritbloom Robe Top",482.0);				
	skillFilter.add("Urn");	
        nameAndXpGained.put("UrnLevel 01 - Cracked mining urn",28.0);
        nameAndXpGained.put("UrnLevel 02 - Cracked cooking urn",30.0);
        nameAndXpGained.put("UrnLevel 02 - Cracked fishing urn",30.0);
        nameAndXpGained.put("UrnLevel 02 - Impious urn",30.0);
        nameAndXpGained.put("UrnLevel 04 - Cracked smelting urn",38.5);
        nameAndXpGained.put("UrnLevel 04 - Cracked woodcutting urn",38.5);
        nameAndXpGained.put("UrnLevel 12 - Fragile cooking urn",40.0);
        nameAndXpGained.put("UrnLevel 15 - Fragile fishing urn",50.0);
        nameAndXpGained.put("UrnLevel 17 - Fragile woodcutting urn",50.0);
        nameAndXpGained.put("UrnLevel 17 - Fragile mining urn",53.0);
        nameAndXpGained.put("UrnLevel 17 - Fragile smelting urn",53.0);
        nameAndXpGained.put("UrnLevel 26 - Accursed urn",62.5);
        nameAndXpGained.put("UrnLevel 32 - Mining urn",68.0);
        nameAndXpGained.put("UrnLevel 35 - Smelting urn",70.0);
        nameAndXpGained.put("UrnLevel 36 - Cooking urn",71.5);
        nameAndXpGained.put("UrnLevel 41 - Fishing urn",78.0);
        nameAndXpGained.put("UrnLevel 44 - Woodcutting urn",80.0);
        nameAndXpGained.put("UrnLevel 48 - Strong mining urn",80.0);
        nameAndXpGained.put("UrnLevel 49 - Strong smelting urn",83.5);
        nameAndXpGained.put("UrnLevel 51 - Strong cooking urn",87.5);
        nameAndXpGained.put("UrnLevel 53 - Strong fishing urn",90.0);
        nameAndXpGained.put("UrnLevel 59 - Decorated mining urn",95.0);
        nameAndXpGained.put("UrnLevel 61 - Strong woodcutting urn",97.0);
        nameAndXpGained.put("UrnLevel 62 - Infernal urn",100.0);
        nameAndXpGained.put("UrnLevel 76 - Decorated fishing urn",120.0);
        nameAndXpGained.put("UrnLevel 81 - Decorated cooking urn",130.0);
        skillFilter.add("Other");
        nameAndXpGained.put("OtherLevel 01 - Ball of Wool",2.7);
        nameAndXpGained.put("OtherLevel 01 - Pot",12.6);
        nameAndXpGained.put("OtherLevel 01 - Flax Bowstring",15.0);
        nameAndXpGained.put("OtherLevel 04 - Clay ring",19.9);
        nameAndXpGained.put("OtherLevel 07 - Pie Dish",25.0);
        nameAndXpGained.put("OtherLevel 08 - Bowl",33.0);
        nameAndXpGained.put("OtherLevel 10 - Sinew Crossbow String",15.0);
        nameAndXpGained.put("OtherLevel 19 - Magic String",30.0);
        nameAndXpGained.put("OtherLevel 19 - Plant pot",37.5);
        nameAndXpGained.put("OtherLevel 21 - Vegetable Sack",38.0);
        nameAndXpGained.put("OtherLevel 25 - Pot Lid",40.0);
        nameAndXpGained.put("OtherLevel 30 - Rope",25.0);
        nameAndXpGained.put("OtherLevel 36 - Fruit Basket",56.0);
        nameAndXpGained.put("OtherLevel 48 - Banner",42.0);
        nameAndXpGained.put("OtherLevel 52 - Seaweed Net",83.0);
				
    }
}
