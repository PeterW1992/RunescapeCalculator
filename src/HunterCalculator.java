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
skillFilter.add("Barehanded");
nameAndXpGained.put("BarehandedLevel 80 - Ruby harvest (Barehanded)",300.0);
nameAndXpGained.put("BarehandedLevel 85 - Sapphire glacialis (Barehanded)",400.0);
nameAndXpGained.put("BarehandedLevel 90 - Snowy knight (Barehanded)",500.0);
nameAndXpGained.put("BarehandedLevel 95 - Black warlock (Barehanded)",650.0);
skillFilter.add("Tracking");
nameAndXpGained.put("TrackingLevel 01 - Polar Kebbit",30.0);
nameAndXpGained.put("TrackingLevel 03 - Common Kebbit",36.0);
nameAndXpGained.put("TrackingLevel 07 - Feldip Weasel",48.0);
nameAndXpGained.put("TrackingLevel 13 - Desert Devil",66.0);
nameAndXpGained.put("TrackingLevel 45 - Penguin (Tracking)",250.0);
nameAndXpGained.put("TrackingLevel 49 - Razor-Backed Kebbit",348.0);
skillFilter.add("Bird-Catching");
nameAndXpGained.put("Bird-CatchingLevel 01 - Crimson Swift",34.0);
nameAndXpGained.put("Bird-CatchingLevel 05 - Golden Warbler",47.6);
nameAndXpGained.put("Bird-CatchingLevel 09 - Copper Longtail",61.0);
nameAndXpGained.put("Bird-CatchingLevel 11 - Cerulean Twitch",64.6);
nameAndXpGained.put("Bird-CatchingLevel 19 - Tropical Wagtail",95.2);
nameAndXpGained.put("Bird-CatchingLevel 39 - Wimpy Bird",167.0);
skillFilter.add("Butterfly-Catching");
nameAndXpGained.put("Butterfly-CatchingLevel 15 - Ruby Harvest",24.0);
nameAndXpGained.put("Butterfly-CatchingLevel 25 - Sapphire Glacialis",34.0);
nameAndXpGained.put("Butterfly-CatchingLevel 35 - Snowy Knight",44.0);
nameAndXpGained.put("Butterfly-CatchingLevel 45 - Black Warlock",54.0);
skillFilter.add("Deadfall Traps");
nameAndXpGained.put("Deadfall TrapsLevel 23 - Wild Kebbit",128.0);
nameAndXpGained.put("Deadfall TrapsLevel 33 - Barb-Tailed Kebbit",168.0);
nameAndXpGained.put("Deadfall TrapsLevel 37 - Prickly Kebbit",204.0);
nameAndXpGained.put("Deadfall TrapsLevel 44 - Diseased Kebbit",225.0);
nameAndXpGained.put("Deadfall TrapsLevel 51 - Sabre-Toothed Kebbit",200.0);
nameAndXpGained.put("Deadfall TrapsLevel 51 - Penguin (Deadfall)",210.0);
skillFilter.add("Box Traps");
nameAndXpGained.put("Box TrapsLevel 27 - Baby Gecko",100.0);
nameAndXpGained.put("Box TrapsLevel 27 - Baby Monkey",100.0);
nameAndXpGained.put("Box TrapsLevel 27 - Baby Raccoon",100.0);
nameAndXpGained.put("Box TrapsLevel 27 - Ferret",115.2);
nameAndXpGained.put("Box TrapsLevel 48 - Platypus",205.0);
nameAndXpGained.put("Box TrapsLevel 53 - Chinchompa",198.4);
nameAndXpGained.put("Box TrapsLevel 56 - Penguin (Box)",150.0);
nameAndXpGained.put("Box TrapsLevel 63 - Red Chinchompa",265.0);
nameAndXpGained.put("Box TrapsLevel 66 - Pawya",400.0);
nameAndXpGained.put("Box TrapsLevel 77 - Grenwall",1100.0);
skillFilter.add("Net Traps");
nameAndXpGained.put("Net TrapsLevel 29 - Baby Squirrel",152.0);
nameAndXpGained.put("Net TrapsLevel 29 - Swamp Lizard",152.0);
nameAndXpGained.put("Net TrapsLevel 47 - Orange Salamander",224.0);
nameAndXpGained.put("Net TrapsLevel 50 - Penguin (Net)",250.0);
nameAndXpGained.put("Net TrapsLevel 59 - Red Salamander",272.0);
nameAndXpGained.put("Net TrapsLevel 67 - Black Salamander",304.0);
skillFilter.add("Pitfalls");
nameAndXpGained.put("PitfallsLevel 31 - Spined Larupia",180.0);
nameAndXpGained.put("PitfallsLevel 41 - Horned Graahk",240.0);
nameAndXpGained.put("PitfallsLevel 55 - Sabre-Toothed Kyatt",300.0);
skillFilter.add("Falconry");
nameAndXpGained.put("FalconryLevel 43 - Spotted Kebbit",104.0);
nameAndXpGained.put("FalconryLevel 57 - Dark Kebbit",132.0);
nameAndXpGained.put("FalconryLevel 69 - Dashing Kebbit",156.0);
skillFilter.add("Implings in Puro Puro");
nameAndXpGained.put("Implings in Puro PuroLevel 17 - Baby Impling (Puro Puro)",20.0);
nameAndXpGained.put("Implings in Puro PuroLevel 22 - Young Impling (Puro Puro)",48.0);
nameAndXpGained.put("Implings in Puro PuroLevel 28 - Gourmet Impling (Puro Puro)",82.0);
nameAndXpGained.put("Implings in Puro PuroLevel 36 - Earth Impling (Puro Puro)",126.0);
nameAndXpGained.put("Implings in Puro PuroLevel 42 - Essence Impling (Puro Puro)",160.0);
nameAndXpGained.put("Implings in Puro PuroLevel 50 - Eclectic Impling (Puro Puro)",205.0);
nameAndXpGained.put("Implings in Puro PuroLevel 54 - Spirit Impling (Puro Puro)",227.0);
nameAndXpGained.put("Implings in Puro PuroLevel 58 - Nature Impling (Puro Puro)",250.0);
nameAndXpGained.put("Implings in Puro PuroLevel 65 - Magpie Impling (Puro Puro)",289.0);
nameAndXpGained.put("Implings in Puro PuroLevel 74 - Ninja Impling (Puro Puro)",339.0);
nameAndXpGained.put("Implings in Puro PuroLevel 76 - Pirate impling (Puro Puro)",350.0);
nameAndXpGained.put("Implings in Puro PuroLevel 83 - Dragon Impling (Puro Puro)",390.0);
nameAndXpGained.put("Implings in Puro PuroLevel 87 - Zombie Impling (Puro Puro)",412.0);
nameAndXpGained.put("Implings in Puro PuroLevel 91 - Kingly Impling (Puro Puro)",434.0);
skillFilter.add("Implings in Gielinor");
nameAndXpGained.put("Implings in GielinorLevel 17 - Baby Impling (Gielinor)",25.0);
nameAndXpGained.put("Implings in GielinorLevel 22 - Young Impling (Gielinor)",65.0);
nameAndXpGained.put("Implings in GielinorLevel 28 - Gourmet Impling (Gielinor)",113.0);
nameAndXpGained.put("Implings in GielinorLevel 36 - Earth Impling (Gielinor)",177.0);
nameAndXpGained.put("Implings in GielinorLevel 42 - Essence Impling (Gielinor)",225.0);
nameAndXpGained.put("Implings in GielinorLevel 50 - Eclectic Impling (Gielinor)",289.0);
nameAndXpGained.put("Implings in GielinorLevel 54 - Spirit Impling (Gielinor)",321.0);
nameAndXpGained.put("Implings in GielinorLevel 58 - Nature Impling (Gielinor)",353.0);
nameAndXpGained.put("Implings in GielinorLevel 65 - Magpie Impling (Gielinor)",409.0);
nameAndXpGained.put("Implings in GielinorLevel 74 - Ninja Impling (Gielinor)",481.0);
nameAndXpGained.put("Implings in GielinorLevel 76 - Pirate impling (Gielinor)",497.0);
nameAndXpGained.put("Implings in GielinorLevel 83 - Dragon Impling (Gielinor)",553.0);
nameAndXpGained.put("Implings in GielinorLevel 87 - Zombie Impling (Gielinor)",585.0);
nameAndXpGained.put("Implings in GielinorLevel 91 - Kingly Impling (Gielinor)",617.0);
skillFilter.add("Other");
nameAndXpGained.put("OtherLevel 27 - White Rabbit",144.0);
nameAndXpGained.put("OtherLevel 71 - Imp-in-a-box",450.0);
skillFilter.add("Trapping (Herblore Habitat)");    
nameAndXpGained.put("Trapping (Herblore Habitat)Level 70 - Common jadinko",350.0);
nameAndXpGained.put("Trapping (Herblore Habitat)Level 74 - Igneous jadinko",465.0);
nameAndXpGained.put("Trapping (Herblore Habitat)Level 75 - Cannibal jadinko",475.0);
nameAndXpGained.put("Trapping (Herblore Habitat)Level 76 - Aquatic jadinko",475.0);
nameAndXpGained.put("Trapping (Herblore Habitat)Level 77 - Amphibian jadinko",485.0);
nameAndXpGained.put("Trapping (Herblore Habitat)Level 78 - Carrion jadinko",505.0);
nameAndXpGained.put("Trapping (Herblore Habitat)Level 80 - Draconic jadinko",525.0);
nameAndXpGained.put("Trapping (Herblore Habitat)Level 81 - Guthix jadinko",600.0);
nameAndXpGained.put("Trapping (Herblore Habitat)Level 81 - Saradomin jadinko",600.0);
nameAndXpGained.put("Trapping (Herblore Habitat)Level 81 - Zamorak jadinko",600.0);
skillFilter.add("Tracking (Herblore Habitat)");
nameAndXpGained.put("Tracking (Herblore Habitat)Level 71 - Shadow jadinko",475.0);
nameAndXpGained.put("Tracking (Herblore Habitat)Level 78 - Diseased jadinko",580.5);
nameAndXpGained.put("Tracking (Herblore Habitat)Level 79 - Camouflaged jadinko",600.0);
skillFilter.add("Dungeon Traps");
nameAndXpGained.put("Dungeon TrapsLevel 01 - Protomastyx",55.0);
nameAndXpGained.put("Dungeon TrapsLevel 10 - Submastyx",94.5);
nameAndXpGained.put("Dungeon TrapsLevel 20 - Paramastyx",164.0);
nameAndXpGained.put("Dungeon TrapsLevel 30 - Archaemastyx",247.0);
nameAndXpGained.put("Dungeon TrapsLevel 40 - Dromomsatyx",330.0);
nameAndXpGained.put("Dungeon TrapsLevel 50 - Spinomastyx",435.5);
nameAndXpGained.put("Dungeon TrapsLevel 60 - Gallimastyx",519.0);
nameAndXpGained.put("Dungeon TrapsLevel 70 - Stegomastyx",599.5);
nameAndXpGained.put("Dungeon TrapsLevel 80 - Megamastyx",673.0);
nameAndXpGained.put("Dungeon TrapsLevel 90 - Tyrannomastyx",745.5);


    }
}
