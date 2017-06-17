/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PeterW
 */
public class FiremakingCalculator extends AbstractCalculator{
    
    FiremakingCalculator () {
        this.isCombatSkill = false;
      skillFilter.add("Untreated Materials");
      nameAndXpGained.put("Untreated MaterialsLevel 01 - Wooden Tree",50.0); nameAndXpGained.put("Untreated MaterialsLevel 15 - Oak Tree",85.0);  nameAndXpGained.put("Untreated MaterialsLevel 30 - Willow Tree",105.0);
      nameAndXpGained.put("Untreated MaterialsLevel 35 - Teak Tree",120.0);; nameAndXpGained.put("Untreated MaterialsLevel 45 - Maple Tree",140.0); nameAndXpGained.put("Untreated MaterialsLevel 50 - Mahogany Tree",157.5); 
      nameAndXpGained.put("Untreated MaterialsLevel 54 - Arctic Pine Tree",130.0); nameAndXpGained.put("Untreated MaterialsLevel 58 - Eucalyptus Tree",195.0);nameAndXpGained.put("Untreated MaterialsLevel 60 - Yew Tree",260.0); 
      nameAndXpGained.put("Untreated MaterialsLevel 75 - Magic Tree",309.5);
      
      skillFilter.add("Dungeon Wood");
      nameAndXpGained.put("Dungeon WoodLevel 01 - Tangle Gum Tree",25.0); nameAndXpGained.put("Dungeon WoodLevel 10 - Seeping Elm Tree",44.5);  nameAndXpGained.put("Dungeon WoodLevel 20 - Blood Spindle Tree",65.6);
      nameAndXpGained.put("Dungeon WoodLevel 30 - Utuku Tree",88.3); nameAndXpGained.put("Dungeon WoodLevel 40 - Spinebeam Tree",112.6); nameAndXpGained.put("Dungeon WoodLevel 50 - Bovistrangler Tree",138.5);
      nameAndXpGained.put("Dungeon WoodLevel 60 - Thigat Tree",166.0); nameAndXpGained.put("Dungeon WoodLevel 70 - Corpsethorn Tree",195.1); nameAndXpGained.put("Dungeon WoodLevel 80 - Entgallow Tree",225.8);
      nameAndXpGained.put("Dungeon WoodLevel 90 - Grave Creeper Tree",258.1);
      this.readFromXpTable();
    }
    
}
