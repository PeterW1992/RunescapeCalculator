/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PeterW
 */
public class WoodcuttingCalculator extends AbstractCalculator{
    
     /**
     * Constructor for WoodcuttingCalculator class.
     */
    WoodcuttingCalculator()
    {
        this.isCombatSkill = false;
      skillFilter.add("Trees");
      nameAndXpGained.put("TreesLevel 01 - Wooden Tree",25.0); nameAndXpGained.put("TreesLevel 15 - Oak Tree",37.5);  nameAndXpGained.put("TreesLevel 30 - Willow Tree",67.5);
      nameAndXpGained.put("TreesLevel 35 - Teak Tree",85.0); nameAndXpGained.put("TreesLevel 45 - Hollow Tree",82.5); nameAndXpGained.put("TreesLevel 45 - Maple Tree",100.0);
      nameAndXpGained.put("TreesLevel 50 - Mahogany Tree",125.0); nameAndXpGained.put("TreesLevel 54 - Arctic Pine Tree",140.2); nameAndXpGained.put("TreesLevel 58 - Eucalyptus Tree",165.0);
      nameAndXpGained.put("TreesLevel 60 - Yew Tree",175.0); nameAndXpGained.put("TreesLevel 68 - Ivy",332.5); nameAndXpGained.put("TreesLevel 75 - Magic Tree",250.0); 
      nameAndXpGained.put("TreesLevel 82 - Cursed Magic Tree",275.0); 
       
      skillFilter.add("Dungeon Trees");
      nameAndXpGained.put("Dungeon TreesLevel 01 - Tangle Gum Tree",35.0); nameAndXpGained.put("Dungeon TreesLevel 10 - Seeping Elm Tree",60.0);  nameAndXpGained.put("Dungeon TreesLevel 20 - Blood Spindle Tree",85.0);
      nameAndXpGained.put("Dungeon TreesLevel 30 - Utuku Tree",115.0); nameAndXpGained.put("Dungeon TreesLevel 40 - Spinebeam Tree",145.0); nameAndXpGained.put("Dungeon TreesLevel 50 - Bovistrangler Tree",175.0);
      nameAndXpGained.put("Dungeon TreesLevel 60 - Thigat Tree",210.0); nameAndXpGained.put("Dungeon TreesLevel 70 - Corpsethorn Tree",245.0); nameAndXpGained.put("Dungeon TreesLevel 80 - Entgallow Tree",285.0);
      nameAndXpGained.put("Dungeon TreesLevel 90 - Grave Creeper Tree",330.0);
      
      skillFilter.add("Other");
      nameAndXpGained.put("OtherLevel 10 - Light Jungle",32.0); nameAndXpGained.put("OtherLevel 12 - Log Canoe",30.0);  nameAndXpGained.put("OtherLevel 20 - Medium Junlge",55.0);
      nameAndXpGained.put("OtherLevel 27 - Dugout Canoe",60.0); nameAndXpGained.put("OtherLevel 35 - Dense Jungle",80.0); nameAndXpGained.put("OtherLevel 42 - Stable Dugout Canoe",90.0);
      nameAndXpGained.put("OtherLevel 56 - Split a Log",42.5); nameAndXpGained.put("OtherLevel 57 - Waka Canoe",150.0);
      this.readFromXpTable();
    }
}
