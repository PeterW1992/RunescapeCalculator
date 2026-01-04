

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
      readFromSkillDataFile(this.getSkillName());
      this.readFromXpTable();
    }

    
}
