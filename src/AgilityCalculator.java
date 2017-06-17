
import javax.swing.DefaultListModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PeterW
 */
public class AgilityCalculator extends AbstractCalculator {
    
     /**
     * Constructor for AgilityCalculator class.
     */
    AgilityCalculator()
    {
      this.isCombatSkill = false;
      skillFilter.add("Courses");
      nameAndXpGained.put("CoursesLevel 01 - Burthorpe",79.5); nameAndXpGained.put("CoursesLevel 01 - Gnome Stronghold",86.5);  nameAndXpGained.put("CoursesLevel 30 - Penguin Agility Course",540.0);
      nameAndXpGained.put("CoursesLevel 30 - Agility Pyramid",1014.0); nameAndXpGained.put("CoursesLevel 35 - Barbarian Outpost",139.5); nameAndXpGained.put("CoursesLevel 48 - Ape Atoll",580.0); 
      nameAndXpGained.put("CoursesLevel 52 - Wilderness",571.4); nameAndXpGained.put("CoursesLevel 60 - Bandos Throne Room",380.0); nameAndXpGained.put("CoursesLevel 60 - Werewolf",540.0); 
      nameAndXpGained.put("CoursesLevel 80 - Dorgesh-Kaan (Ropes)",2375.0); nameAndXpGained.put("CoursesLevel 85 - Gnome Advanced",725.0); nameAndXpGained.put("CoursesLevel 90 - Barbarian Advanced",740.7); 
      
      skillFilter.add("Other");
      nameAndXpGained.put("OtherLevel 01 - Catch Toy Mouse",2.0); nameAndXpGained.put("OtherLevel 01 - Brimhaven (1 Ticket)",240.0);  nameAndXpGained.put("OtherLevel 01 - Brimhaven (10 Tickets)",2480.0);
      nameAndXpGained.put("OtherLevel 01 - Brimhaven (25 Tickets)",6500.0); nameAndXpGained.put("OtherLevel 01 - Brimhaven (100 Tickets)",28000.0); nameAndXpGained.put("OtherLevel 01 - Brimhaven (1000 Tickets)",320000.0);
      nameAndXpGained.put("OtherLevel 25 - Skullball (Under 4 Minutes)",750.0);  nameAndXpGained.put("OtherLevel 75 - Ruby harvest (Barehanded)",50.0);
      nameAndXpGained.put("OtherLevel 80 - Sapphire glacialis (Barehanded)",70.0); nameAndXpGained.put("OtherLevel 85 - Snowy Knight (Barehanded)",100.0); nameAndXpGained.put("OtherLevel 90 - Black warlock (Barehanded)",125.0);
      this.readFromXpTable();
      
    }

    
}
