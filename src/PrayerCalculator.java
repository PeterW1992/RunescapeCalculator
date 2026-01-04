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
        this.readFromXpTable();
        this.readFromSkillDataFile(this.getSkillName());
    }
}
