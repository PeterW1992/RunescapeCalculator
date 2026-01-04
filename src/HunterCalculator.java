/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PeterW
 */
public class HunterCalculator extends AbstractCalculator{
    HunterCalculator()
    {
        this.isCombatSkill = false;
        this.readFromSkillDataFile(this.getSkillName());
    }
}
