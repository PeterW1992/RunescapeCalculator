/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PeterW
 */
public class MiningCalculator extends AbstractCalculator{
    
    /**
     * Constructor for MiningCalculator class.
     */
    MiningCalculator()
    {
        this.isCombatSkill = false;
      skillFilter.add("Ore");
      
      nameAndXpGained.put("OreLevel 01 - Clay",5.0); nameAndXpGained.put("OreLevel 01 - Rune Essence",5.0);  nameAndXpGained.put("OreLevel 01 - Copper Ore",17.5);
      nameAndXpGained.put("OreLevel 01 - Tin Ore",17.5); nameAndXpGained.put("OreLevel 10 - Blurite Ore",17.5); nameAndXpGained.put("OreLevel 10 - Limestone",26.5);
      nameAndXpGained.put("OreLevel 15 - Iron Ore",35.0); nameAndXpGained.put("OreLevel 20 - Silver Ore",40.0); nameAndXpGained.put("OreLevel 30 - Pure Essence",5.0);
      nameAndXpGained.put("OreLevel 30 - Coal",50.0); nameAndXpGained.put("OreLevel 35 - Sandstone Average",45.0); nameAndXpGained.put("OreLevel 40 - Gold Ore",65.0);
      nameAndXpGained.put("OreLevel 40 - Gem Rock",65.0); nameAndXpGained.put("OreLevel 41 - Obsidian",40.0); nameAndXpGained.put("OreLevel 45 - Granite - Average",75.0);
      nameAndXpGained.put("OreLevel 46 - Rubium",17.5); nameAndXpGained.put("OreLevel 55 - Mithril Ore",80.0); nameAndXpGained.put("OreLevel 70 - Adamantite Ore",95.0);
      nameAndXpGained.put("OreLevel 73 - Living Rock Remains",25.0); nameAndXpGained.put("OreLevel 77 - Concentrated Coal Deposits",50.0); nameAndXpGained.put("OreLevel 80 - Concentrated Gold Deposits",65.0);
      nameAndXpGained.put("OreLevel 85 - Runite Ore",125.0);
      
      skillFilter.add("Dungeon Ore");
      nameAndXpGained.put("Dungeon OreLevel 01 - Novite Ore",15.0); nameAndXpGained.put("Dungeon OreLevel 10 - Bathus Ore",27.5);  nameAndXpGained.put("Dungeon OreLevel 20 - Marmaros Ore",41.0);
      nameAndXpGained.put("Dungeon OreLevel 30 - Kratonium Ore",56.5); nameAndXpGained.put("Dungeon OreLevel 40 - Fractite Ore",71.0); nameAndXpGained.put("Dungeon OreLevel 50 - Zephyrium",85.0);
      nameAndXpGained.put("Dungeon OreLevel 60 - Argonite Ore",105.5); nameAndXpGained.put("Dungeon OreLevel 70 - Katagon Ore",117.0); nameAndXpGained.put("Dungeon OreLevel 80 - Gorgonite Ore",131.5);
      nameAndXpGained.put("Dungeon OreLevel 90 - Promethium Ore",148.0);
      this.readFromXpTable();
       
     
     
    }
}
