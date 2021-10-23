/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PeterW
 */
public class ThievingCalculator extends AbstractCalculator{
    ThievingCalculator()
    {
        this.isCombatSkill = false;

        this.readFromSkillDataFile("");
        this.skillFilter.add("Other");
        this.nameAndXpGained.put("OtherLevel 25 - Thieves Guild Door (North)", 210.0);
        this.nameAndXpGained.put("OtherLevel 35 - Thieves Guild Door (South)", 280.0);
        this.skillFilter.add("Pickpocketing");
	this.nameAndXpGained.put("PickpocketingLevel 01 - Man", 8.0);
        this.nameAndXpGained.put("PickpocketingLevel 10 - Farmer", 14.5);
        this.nameAndXpGained.put("PickpocketingLevel 15 - Female H.A.M. Follower", 18.5);
        this.nameAndXpGained.put("PickpocketingLevel 20 - Entrana Church Candles", 20.0);
        this.nameAndXpGained.put("PickpocketingLevel 20 - Male H.A.M. Follower", 22.2);
        this.nameAndXpGained.put("PickpocketingLevel 25 - Warrior", 26.0);
        this.nameAndXpGained.put("PickpocketingLevel 32 - Rogue", 35.5);
        this.nameAndXpGained.put("PickpocketingLevel 36 - Cave Goblin", 40.0);
        this.nameAndXpGained.put("PickpocketingLevel 38 - Master Farmer", 43.0);
        this.nameAndXpGained.put("PickpocketingLevel 40 - Guard", 46.8);
        this.nameAndXpGained.put("PickpocketingLevel 45 - Bearded Pollivnian Bandit", 65.0);
        this.nameAndXpGained.put("PickpocketingLevel 45 - Fremennik", 65.0);
        this.nameAndXpGained.put("PickpocketingLevel 45 - KO & Thieve Bearded Pollivnian Bandit", 75.0);
        this.nameAndXpGained.put("PickpocketingLevel 53 - Desert Bandit", 79.4);
        this.nameAndXpGained.put("PickpocketingLevel 55 - Knight of Ardougne", 84.3);
        this.nameAndXpGained.put("PickpocketingLevel 55 - Pollivnian Bandit", 84.3);
        this.nameAndXpGained.put("PickpocketingLevel 55 - KO & Thieve Pollivnian Bandit", 94.3);
        this.nameAndXpGained.put("PickpocketingLevel 65 - Menaphite Thug", 137.5);
        this.nameAndXpGained.put("PickpocketingLevel 65 - Yanille Watchman", 137.5);
        this.nameAndXpGained.put("PickpocketingLevel 65 - KO & Thieve Menaphite Thug", 147.5);
        this.nameAndXpGained.put("PickpocketingLevel 70 - Monkey knife fighter", 150.0);
        this.nameAndXpGained.put("PickpocketingLevel 70 - Paladin", 151.8);
        this.nameAndXpGained.put("PickpocketingLevel 75 - Gnome", 198.3);
        this.nameAndXpGained.put("PickpocketingLevel 80 - Hero", 275.3);										
	this.nameAndXpGained.put("PickpocketingLevel 85 - Elf", 353.3);
        this.nameAndXpGained.put("PickpocketingLevel 90 - Dwarf trader", 556.5);
        this.skillFilter.add("Stalls");
        this.nameAndXpGained.put("StallsLevel 02 - Vegetable Stall", 10.0);
        this.nameAndXpGained.put("StallsLevel 05 - Crafting Stall", 10.0);
        this.nameAndXpGained.put("StallsLevel 05 - Cake Stall", 16.0);
        this.nameAndXpGained.put("StallsLevel 05 - Monkey Food Stall", 16.0);
        this.nameAndXpGained.put("StallsLevel 05 - Tea Stall", 16.0);
        this.nameAndXpGained.put("StallsLevel 20 - Silk Stall", 24.0);
        this.nameAndXpGained.put("StallsLevel 22 - Wine Stall", 27.0);
        this.nameAndXpGained.put("StallsLevel 27 - Seed Stall", 10.0);
        this.nameAndXpGained.put("StallsLevel 35 - Fur Stall", 36.0);
        this.nameAndXpGained.put("StallsLevel 42 - Fish Stall", 42.0);
        this.nameAndXpGained.put("StallsLevel 49 - Crossbow Stall", 52.0);
        this.nameAndXpGained.put("StallsLevel 50 - Silver Stall", 54.0);
        this.nameAndXpGained.put("StallsLevel 63 - Customs evidence files", 75.0);
        this.nameAndXpGained.put("StallsLevel 65 - Magic Stall", 81.0);
        this.nameAndXpGained.put("StallsLevel 65 - Spice Stall", 81.6);
        this.nameAndXpGained.put("StallsLevel 65 - Scimitar Stall", 160.0);
        this.nameAndXpGained.put("StallsLevel 75 - Gem Stall", 160.0);
        this.skillFilter.add("Chests");
        this.nameAndXpGained.put("ChestsLevel 13 - 10-Coins Chest", 7.5);
        this.nameAndXpGained.put("ChestsLevel 20 - Zogre Coffin", 27.0);
        this.nameAndXpGained.put("ChestsLevel 25 - Thieves Guild Chest (North)", 30.0);
        this.nameAndXpGained.put("ChestsLevel 28 - Nature Rune Chest", 25.0);
        this.nameAndXpGained.put("ChestsLevel 35 - Thieves Guild Chest (South)", 180.0);
        this.nameAndXpGained.put("ChestsLevel 43 - 50-Coins Chest", 125.0);
        this.nameAndXpGained.put("ChestsLevel 47 - Steel Arrowheads Chest", 150.0);
        this.nameAndXpGained.put("ChestsLevel 50 - Wall Safe", 70.0);
        this.nameAndXpGained.put("ChestsLevel 52 - Average Dorgesh-Kaan Chest", 200.0);
        this.nameAndXpGained.put("ChestsLevel 59 - Blood Rune Chest", 250.0);
        this.nameAndXpGained.put("ChestsLevel 72 - Lathas' Tower Chest", 500.0);
        this.nameAndXpGained.put("ChestsLevel 78 - Rich Dorgesh-Kaan Chest", 650.0);
	this.skillFilter.add("Sq'irk Juice");
        this.nameAndXpGained.put("Sq'irk JuiceLevel 01 - Winter Sq'irk Juice", 350.0);
	this.nameAndXpGained.put("Sq'irk JuiceLevel 25 - Spring Sq'irk Juice", 1350.0);
        this.nameAndXpGained.put("Sq'irk JuiceLevel 45 - Autumn Sq'irk Juice", 2350.0);
        this.nameAndXpGained.put("Sq'irk JuiceLevel 65 - Summer Sq'irk Juice", 3000.0);	
    }
    
}
