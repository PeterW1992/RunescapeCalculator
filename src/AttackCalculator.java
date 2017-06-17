
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PeterW
 */
public class AttackCalculator extends AbstractCalculator {
    
    /**
     * Constructor for AttackCalculator class.
     */
    AttackCalculator()
    {
        this.isCombatSkill = true;
        this.readFromMonsterTable();
    }
}
