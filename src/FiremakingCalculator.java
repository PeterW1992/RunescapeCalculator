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
        this.readFromSkillDataFile(this.getSkillName());
      this.readFromXpTable();
    }
}
