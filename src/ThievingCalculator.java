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

        this.readFromSkillDataFile(this.getSkillName());
    }
    
}
