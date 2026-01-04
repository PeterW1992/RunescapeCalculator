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
        this.readFromSkillDataFile(this.getSkillName());
        this.readFromXpTable();
    }
}
