/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PeterW
 */
public class HerbloreCalculator extends AbstractCalculator{
    HerbloreCalculator()
    {
        this.isCombatSkill = false;
        this.readFromSkillDataFile(this.getSkillName());
    }
}
