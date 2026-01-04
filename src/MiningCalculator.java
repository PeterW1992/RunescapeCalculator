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
        this.readFromSkillDataFile(this.getSkillName());
        this.readFromXpTable();
    }
}
