/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PeterW
 */
public class RunecraftingCalculator extends AbstractCalculator{
    RunecraftingCalculator()
    {
        this.isCombatSkill = false;
        skillFilter.add("Standard Runes");
    nameAndXpGained.put("Standard RunesLevel 01 - Air Rune",5.0);
nameAndXpGained.put("Standard RunesLevel 02 - Mind Rune",5.5);
nameAndXpGained.put("Standard RunesLevel 05 - Water Rune",6.0);
nameAndXpGained.put("Standard RunesLevel 09 - Earth Rune",6.5);
nameAndXpGained.put("Standard RunesLevel 14 - Fire Rune",7.0);
nameAndXpGained.put("Standard RunesLevel 20 - Body Rune",7.5);
nameAndXpGained.put("Standard RunesLevel 27 - Cosmic Rune",8.0);
nameAndXpGained.put("Standard RunesLevel 35 - Chaos Rune",8.5);
nameAndXpGained.put("Standard RunesLevel 40 - Astral Rune",8.7);
nameAndXpGained.put("Standard RunesLevel 44 - Nature Rune",9.0);
nameAndXpGained.put("Standard RunesLevel 54 - Law Rune",9.5);
nameAndXpGained.put("Standard RunesLevel 65 - Death Rune",10.0);
nameAndXpGained.put("Standard RunesLevel 77 - Blood Rune",10.5);
nameAndXpGained.put("Standard RunesLevel 90 - Soul Rune",11.0);

skillFilter.add("Combination Runes");
nameAndXpGained.put("Combination RunesLevel 06 - Mist Rune - Air Altar",8.0);
nameAndXpGained.put("Combination RunesLevel 06 - Mist Rune - Water Altar",8.5);
nameAndXpGained.put("Combination RunesLevel 10 - Dust Rune - Air Altar",8.3);
nameAndXpGained.put("Combination RunesLevel 10 - Dust Rune - Earth Altar",9.0);
nameAndXpGained.put("Combination RunesLevel 13 - Mud Rune - Water Altar",9.3);
nameAndXpGained.put("Combination RunesLevel 13 - Mud Rune - Earth Altar",9.5);
nameAndXpGained.put("Combination RunesLevel 15 - Smoke Rune - Air Altar",8.5);
nameAndXpGained.put("Combination RunesLevel 15 - Smoke Rune - Fire Altar",9.5);
nameAndXpGained.put("Combination RunesLevel 19 - Steam Rune - Water Altar",9.3);
nameAndXpGained.put("Combination RunesLevel 19 - Steam Rune - Fire Altar",10.0);
nameAndXpGained.put("Combination RunesLevel 23 - Lava Rune - Earth Altar",10.0);
nameAndXpGained.put("Combination RunesLevel 23 - Lava Rune - Fire Altar",10.5);

skillFilter.add("Tiaras");
nameAndXpGained.put("TiarasLevel 01 - Air Tiara",25.0);
nameAndXpGained.put("TiarasLevel 01 - Mind Tiara",27.5);
nameAndXpGained.put("TiarasLevel 01 - Water Tiara",30.0);
nameAndXpGained.put("TiarasLevel 01 - Earth Tiara",32.5);
nameAndXpGained.put("TiarasLevel 01 - Fire Tiara",35.0);
nameAndXpGained.put("TiarasLevel 01 - Body Tiara",37.5);
nameAndXpGained.put("TiarasLevel 01 - Cosmic Tiara",40.0);
nameAndXpGained.put("TiarasLevel 01 - Chaos Tiara",42.5);
nameAndXpGained.put("TiarasLevel 01 - Nature Tiara",45.0);
nameAndXpGained.put("TiarasLevel 01 - Law Tiara",47.5);
nameAndXpGained.put("TiarasLevel 01 - Death Tiara",50.0);
nameAndXpGained.put("TiarasLevel 01 - Blood Tiara",52.5);

skillFilter.add("Dungeon Runes");
nameAndXpGained.put("Dungeon RunesLevel 01 - Air Rune (Dungeon)",0.5);
nameAndXpGained.put("Dungeon RunesLevel 02 - Mind Rune (Dungeon)",0.5);
nameAndXpGained.put("Dungeon RunesLevel 05 - Water Rune (Dungeon)",0.6);
nameAndXpGained.put("Dungeon RunesLevel 09 - Earth Rune (Dungeon)",0.6);
nameAndXpGained.put("Dungeon RunesLevel 14 - Fire Rune (Dungeon)",0.7);
nameAndXpGained.put("Dungeon RunesLevel 20 - Body Rune (Dungeon)",0.7);
nameAndXpGained.put("Dungeon RunesLevel 27 - Cosmic Rune (Dungeon)",0.8);
nameAndXpGained.put("Dungeon RunesLevel 35 - Chaos Rune (Dungeon)",0.8);
nameAndXpGained.put("Dungeon RunesLevel 40 - Astral Rune (Dungeon)",0.8);
nameAndXpGained.put("Dungeon RunesLevel 44 - Nature Rune (Dungeon)",0.9);
nameAndXpGained.put("Dungeon RunesLevel 54 - Law Rune (Dungeon)",0.9);
nameAndXpGained.put("Dungeon RunesLevel 65 - Death Rune (Dungeon)",1.0);
nameAndXpGained.put("Dungeon RunesLevel 77 - Blood Rune (Dungeon)",1.0);

skillFilter.add("Dungeon Staves");
nameAndXpGained.put("Dungeon StavesLevel 50 - Catalytic Staff",39.5);
nameAndXpGained.put("Dungeon StavesLevel 99 - Empowered Catalytic Staff",106.0);
    }
}
