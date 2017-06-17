/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PeterW
 */
public class FishingCalculator extends AbstractCalculator{
       
    FishingCalculator(){
        this.isCombatSkill = false;
        skillFilter.add("Fish");
        skillFilter.add("Dungeon Fish");
        nameAndXpGained.put("FishLevel 01 - Shrimp",10.0); nameAndXpGained.put("FishLevel 01 - Crayfish",10.0); nameAndXpGained.put("FishLevel 05 - Karambwanji",5.0);
        nameAndXpGained.put("FishLevel 05 - Sardine",20.0); nameAndXpGained.put("FishLevel 10 - Herring",30.0); nameAndXpGained.put("FishLevel 15 - Anchovies",40.0);
        nameAndXpGained.put("FishLevel 16 - Mackerel",10.0); nameAndXpGained.put("FishLevel 20 - Trout",50.0); nameAndXpGained.put("FishLevel 23 - Cod",45.0);
        nameAndXpGained.put("FishLevel 25 - Pike",60.0); nameAndXpGained.put("FishLevel 28 - Slimey Eel",65.0); nameAndXpGained.put("FishLevel 30 - Salmon",70.0);
        nameAndXpGained.put("FishLevel 33 - Frogspawn",75.0); nameAndXpGained.put("FishLevel 35 - Tuna",80.0); nameAndXpGained.put("FishLevel 38 - Cave Eel",80.0);
        nameAndXpGained.put("FishLevel 38 - Rainbow Fish",80.0); nameAndXpGained.put("FishLevel 40 - Lobster",90.0); nameAndXpGained.put("FishLevel 46 - Bass",100.0);
        nameAndXpGained.put("FishLevel 48 - Leaping Trout",50.0); nameAndXpGained.put("FishLevel 50 - Swordfish",100.0); nameAndXpGained.put("FishLevel 53 - Lava Eel",60.0);
        nameAndXpGained.put("FishLevel 55 - Tuna (Barehanded)",80.0); nameAndXpGained.put("FishLevel 58 - Leaping Salmon",70.0); nameAndXpGained.put("FishLevel 62 - Monkfish",120.0);
        nameAndXpGained.put("FishLevel 65 - Karambwan",105.0); nameAndXpGained.put("FishLevel 65 - Swordfish (Using Gauntlets)",200.0); nameAndXpGained.put("FishLevel 70 - Leaping Sturgeon",80.0);
        nameAndXpGained.put("FishLevel 70 - Swordfish (Barehanded)",100.0); nameAndXpGained.put("FishLevel 76 - Shark",110.0); nameAndXpGained.put("FishLevel 79 - Sea Turtle",38.0);
        nameAndXpGained.put("FishLevel 81 - Manta Ray",46.0); nameAndXpGained.put("FishLevel 85 - Cavefish",300.0); nameAndXpGained.put("FishLevel 90 - Shark (Using Gauntlets)",210.0);
        nameAndXpGained.put("FishLevel 90 - Rocktail",380.0); nameAndXpGained.put("FishLevel 95 - Tiger shark", 80.0); nameAndXpGained.put("FishLevel 96 - Shark (Barehanded)",110.0);
    
        nameAndXpGained.put("Dungeon FishLevel 01 - Helm Crab",9.0); nameAndXpGained.put("Dungeon FishLevel 10 - Red-Eye",27.0); nameAndXpGained.put("Dungeon FishLevel 20 - Dusk Eel",45.0);
        nameAndXpGained.put("Dungeon FishLevel 30 - Giant Flatfish",63.0); nameAndXpGained.put("Dungeon FishLevel 40 - Short-Finned Eel",81.0); nameAndXpGained.put("Dungeon FishLevel 50 - Web Snipper",99.0);
        nameAndXpGained.put("Dungeon FishLevel 60 - Bouldabass",117.0); nameAndXpGained.put("Dungeon FishLevel 70 - Salve Eel",135.0); nameAndXpGained.put("Dungeon FishLevel 80 - Blue Crab",153.0);
        nameAndXpGained.put("Dungeon FishLevel 90 - Cave Moray",171.0);
    
    
    
    }
}
