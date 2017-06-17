/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PeterW
 */
public class PrayerCalculator extends AbstractCalculator{
        /**
     * Constructor for PrayerCalculator class.
     */
    PrayerCalculator()
    {
        this.isCombatSkill = false;
      skillFilter.add("Bones and Ashes");
      nameAndXpGained.put("Bones and AshesImpious Ashes",4.0); nameAndXpGained.put("Bones and AshesNormal Bones",4.5);  nameAndXpGained.put("Bones and AshesBurnt Bones",4.5);
      nameAndXpGained.put("Bones and AshesWolf Bones",4.5); nameAndXpGained.put("Bones and AshesSmall Monkey Zombie Bones",5.0); nameAndXpGained.put("Bones and AshesLarge Monkey Zombie Bones",5.0);
      nameAndXpGained.put("Bones and AshesBat Bones",5.3); nameAndXpGained.put("Bones and AshesAccursed Ashes",12.5); nameAndXpGained.put("Bones and AshesBig Bones",15.0);
      nameAndXpGained.put("Bones and AshesJorge Bones",15.0); nameAndXpGained.put("Bones and AshesMonkey Archer Bones",16.0); nameAndXpGained.put("Bones and AshesMonkey Ninja Bones",16.0);
      nameAndXpGained.put("Bones and AshesDark Monkey Guard Bones",18.0); nameAndXpGained.put("Bones and AshesLight Monkey Guard Bones",20.0); nameAndXpGained.put("Bones and AshesZorge Bones",22.5);
      nameAndXpGained.put("Bones and AshesShaikahan Bones",25.0); nameAndXpGained.put("Bones and AshesBaby Dragon Bones",30.0); nameAndXpGained.put("Bones and AshesWyvern Bones",50.0);
      nameAndXpGained.put("Bones and AshesInfernal Ashes",62.5); nameAndXpGained.put("Bones and AshesDragon Bones",72.0); nameAndXpGained.put("Bones and AshesFayrg Bones",84.0);
      nameAndXpGained.put("Bones and AshesRaurg Bones",96.0); nameAndXpGained.put("Bones and AshesDagannoth Bones",125.0); nameAndXpGained.put("Bones and AshesOurg Bones",140.0); 
      nameAndXpGained.put("Bones and AshesFrost Dragon Bones",180.0);
      
      skillFilter.add("Other");
      nameAndXpGained.put("OtherLong Bone",15.0); nameAndXpGained.put("OtherKill a Ghast",30.0);  nameAndXpGained.put("OtherCremate Loar Remains",33.0);
      nameAndXpGained.put("OtherCremate Phrin Remains",46.5); nameAndXpGained.put("OtherCremate Riyl Remains",59.5); nameAndXpGained.put("OtherCremate Asyn Remains",82.5);
      nameAndXpGained.put("OtherCremate Fiyr Remains",100.0);
     this.readFromXpTable();
    }
}
