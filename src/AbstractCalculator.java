/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PeterW
 */

import java.io.*;
import java.net.URL;
import java.util.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public abstract class AbstractCalculator 
{
    public static Map<Integer,Integer> xpForLevels = new HashMap<>();
    public static boolean isCombatSkill;

    public int targetLevel;
    public double currentXp;
    public Map<String,Double> nameAndXpGained = new TreeMap();
    public static Map<String,Long> storedXPMapHighscores = new HashMap<>();
    public Set<String> skillFilter = new HashSet<>();
    public Map<String,Integer> storedXPMap = new TreeMap();
    public static File StoredXPFile;
    public static boolean isRead = false;
    public boolean hasReadScores = false;
  
    public void readFromXpTable() 
   {

     String currentLine;

     String fileName = "XPTable.txt";
     try
     {
     BufferedReader bufferedFileReader =  new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(fileName)));
     currentLine = bufferedFileReader.readLine();
     int level;
     int xpRequiredForLevel;
     while (currentLine != null)
     {
      Scanner lineScanner = new Scanner(currentLine);
      lineScanner.useDelimiter("\\|");
      level = lineScanner.nextInt(); 
      xpRequiredForLevel = lineScanner.nextInt();
      xpForLevels.put(level, xpRequiredForLevel);
      currentLine = bufferedFileReader.readLine();
     }
     bufferedFileReader.close();
   }
   catch(Exception anException)
   {
      System.out.println("This the Exception: " + anException);
   }

}
  public void readFromMonsterTable()
  {
    String currentLine;
    String fileName = "C:\\Users\\Peter\\Dropbox\\History\\Monsters.txt";
    skillFilter.add("Free-Play Monsters");
    skillFilter.add("Members Monsters");
    skillFilter.add("Slayer Monsters");

     try
     {
     File aFile = new File(fileName);
     BufferedReader bufferedFileReader =  new BufferedReader(new FileReader(aFile));
     currentLine = bufferedFileReader.readLine();
     double xpGained;
     double slayerXpGained;
     String monsterName;
     int monsterLevel;
     while (currentLine != null)
     {
      Scanner lineScanner = new Scanner(currentLine);
      lineScanner.useDelimiter("\\|");
      monsterName = lineScanner.next();
      xpGained = lineScanner.nextDouble();
      slayerXpGained = lineScanner.nextDouble();
      monsterLevel = lineScanner.nextInt();
      if (this.getSkillName().equals("Slayer"))
      {
       if (slayerXpGained != 0.0)
       {
       nameAndXpGained.put(monsterName, slayerXpGained);
       }
      }
      else
      {
      if (this.getSkillName().equals("Constitution"))
      {
      nameAndXpGained.put(monsterName, xpGained / 4);
      }
      else
      {
      nameAndXpGained.put(monsterName, xpGained);
       System.out.println("\"('"+ monsterName.replaceAll("'", "''") + "', "+ xpGained + ", " + slayerXpGained + ", " + monsterLevel +
              "), \" + ");
      }
      }
     currentLine = bufferedFileReader.readLine();
     }
    bufferedFileReader.close();
     
    }
     catch (Exception anException)
     {
         System.out.println("readFromMonsterTable: " + anException);
     }
   }
 
 public void readFromXpStore()
 {
       if (isRead){
           System.out.println(StoredXPFile);
     try
     {
     BufferedReader bufferedFileReader =  new BufferedReader(new FileReader(StoredXPFile));
     
     String currentLine = bufferedFileReader.readLine();
     while (currentLine != null)
     {
        String aSkillName = currentLine.substring(0,currentLine.indexOf("|"));
        long xpScanned = Integer.parseInt(currentLine.substring(currentLine.indexOf("|") + 1));
        storedXPMapHighscores.put(aSkillName , xpScanned);
        currentLine = bufferedFileReader.readLine();
     }
     bufferedFileReader.close();
     }
     catch (Exception anException)
     {
         System.out.println(anException + " Woopas");
     }
     }
 }
 
  public void setStoredXPAll() throws IOException
 {
    //StoredXPFile = new File("temp_StoredXP.txt");
    StoredXPFile = File.createTempFile("temporaryXPStore", ".txt");
    StoredXPFile.deleteOnExit();
    System.out.println(StoredXPFile);
    String fileName = "StoredXp";
     try
     {
      BufferedWriter bufferedFileWriter =  new BufferedWriter(new FileWriter(StoredXPFile));
      for (String aSkillName : storedXPMapHighscores.keySet())
      {
          bufferedFileWriter.write(aSkillName + "|" + storedXPMapHighscores.get(aSkillName));
          bufferedFileWriter.newLine();
      }
      bufferedFileWriter.close();
     }
     catch (Exception anException)
     {
     System.out.println("This " + anException);
     }

 }
    /**
    * Set target level.
    */
   public void setTargetLevel(int aLevel)
   {
      if ((aLevel > 1) && (aLevel < 100))
      {this.currentXp = aLevel;}
   }
   
   public String getSkillName()
   {
        String parseSkillName = this.getClass().toString().substring(0, this.getClass().toString().length() - 10);
        String skillName = parseSkillName.substring(6);
        return skillName;
   }
   
   /**
    * Take xp entered as argument and return the level that xp corresponds to
    * @param xp
    * @return level
    */
   public int getCurrentLevel(long xp)
   {
       int level = 1;
       int levelCount = 1;
       if (xp >= 0)
       {
       while (levelCount <= 100)
       {
           if (xp >= this.getXpForLevels().get(levelCount) && xp < this.getXpForLevels().get(levelCount + 1))
           {level = levelCount;}
           levelCount++;
       }
       }
       return level;
   }
   
   /**
    * Set current XP.
    */
   public void setCurrentXp(double xpAmount)
   {
      if (xpAmount > 0)
      {this.currentXp = xpAmount;}
   }
   
   public Map<String,Double> getNameAndXpGained()
   {
      return this.nameAndXpGained;
   }
   
   public Map<Integer,Integer> getXpForLevels()
   {
      return this.xpForLevels;
   }
   
   public Set<String> getFilter(){
       return this.skillFilter;
   }
   
   public DefaultListModel getUniformTable(Map<String,Double> calculatorMap, String filterSelected)
   {
            Set<String> calculatorKeySet = calculatorMap.keySet();
            DefaultListModel listModel = new DefaultListModel();
            String longestName = " ";
            double sizeOfXp = 0.0;
            for (String getLength : calculatorKeySet)
            {
                if (getLength.length() > longestName.length())
                {
                    longestName = getLength;
                }
                if (calculatorMap.get(getLength) > sizeOfXp)
                {
                    sizeOfXp = calculatorMap.get(getLength);
                }
            }
           
            for (String name : calculatorKeySet){
                if (name.startsWith(filterSelected + "Level") ||
                    name.startsWith(filterSelected) && this.getSkillName().equals("Prayer"))
                  {
                      String actualName = name.substring(filterSelected.length(),name.length() );
                      String makeUniform = actualName;
                      while (makeUniform.length() != longestName.length() - filterSelected.length())
                      {
                          makeUniform = makeUniform.concat(" ");
                      }
                      String xpGained = " XP Gained: " +  calculatorMap.get(name);
                      while (xpGained.length() != (" XP Gained: " + sizeOfXp).length())
                      {
                          xpGained = xpGained + " ";
                      }
                      listModel.addElement(makeUniform + xpGained + " Iterations: --");
                  }
               
            }
            return listModel;
   }
   
   public DefaultListModel getUniformTableForCombat(Map<String,Double> calculatorMap, String filterSelected)
   {
            Set<String> calculatorKeySet = calculatorMap.keySet();
            DefaultListModel listModel = new DefaultListModel();
            String longestName = " ";
            double sizeOfXp = 0.0;
            for (String getLength : calculatorKeySet)
            {
                if (getLength.length() > longestName.length())
                {
                    longestName = getLength;
                }
                if (calculatorMap.get(getLength) > sizeOfXp)
                {
                    sizeOfXp = calculatorMap.get(getLength);
                }
            }
           
            for (String name : calculatorKeySet){
                      String makeUniform = name;
                      while (makeUniform.length() != longestName.length())
                      {
                          makeUniform = makeUniform.concat(" ");
                      }
                      String xpGained = " XP Gained: " +  calculatorMap.get(name);
                      while (xpGained.length() != (" XP Gained: " + sizeOfXp).length())
                      {
                          xpGained = xpGained + " ";
                      }
                      listModel.addElement(makeUniform + xpGained + " Iterations: --");

            }
            return listModel;
   }
   
    public int getLongestName(Map<String,Double> calculatorMap)
    {
        String longestName = "";
        Set<String> calculatorKeySet = calculatorMap.keySet();
        for (String name : calculatorKeySet)
        {
            if (name.length() > longestName.length())
            {
                longestName = name;
            }
        }
        return longestName.length();
    }
    
    public double getHighestXp(Map<String,Double> calculatorMap)
    {
        double HighestXp = 0.0;
        Set<String> calculatorKeySet = calculatorMap.keySet();
        for (String name : calculatorKeySet)
        {
            if (this.getNameAndXpGained().get(name) > HighestXp)
            {
                HighestXp = this.getNameAndXpGained().get(name);
            }
        }
        return HighestXp;
    }
        
    public int getXpRequiredForTheLevel(int level)
    {
           return this.getXpForLevels().get(level);
        
        }


    public Map<String,Long>  getPlayerHighscores() throws  IOException
    {
 return this.storedXPMapHighscores;
    }
 
    public void  setPlayerHighscores(String username) throws  IOException
    {
            
     String currentLine;
     URL url = new URL("http://services.runescape.com/m=hiscore/index_lite.ws?player=" + username);
     List<Long> xpHighscores = new ArrayList<>();
     try
     {
     Scanner s = new Scanner(url.openStream()).useDelimiter(" ");
     currentLine = s.nextLine();
     Scanner lineScanner = new Scanner(currentLine);
     long xp;
     int i = 0;
     while (s.hasNext() && i < 27)
     {
     lineScanner.useDelimiter(",");
     lineScanner.next();
     lineScanner.next();
     
      xp = Long.parseLong(lineScanner.next());
      
      xpHighscores.add(xp);
      i++;
      currentLine = s.nextLine();
      lineScanner = new Scanner(currentLine);
     }
     
     this.addSkillNamesToMap(xpHighscores);
     this.isRead = true;
     s.close();
   }
   catch(Exception anException)
   {
      JOptionPane.showMessageDialog(null, "Player Not Found" + anException );
   }


        }

    public void addSkillNamesToMap(List<Long> xpHighscores)
    {
        this.storedXPMapHighscores.put("Overall",xpHighscores.get(0));
        this.storedXPMapHighscores.put("Attack",xpHighscores.get(1));
        this.storedXPMapHighscores.put("Defence",xpHighscores.get(2));
        this.storedXPMapHighscores.put("Strength",xpHighscores.get(3));
        this.storedXPMapHighscores.put("Constitution",xpHighscores.get(4));
        this.storedXPMapHighscores.put("Ranged",xpHighscores.get(5));
        this.storedXPMapHighscores.put("Prayer",xpHighscores.get(6));
        this.storedXPMapHighscores.put("Magic",xpHighscores.get(7));
        this.storedXPMapHighscores.put("Cooking",xpHighscores.get(8));
        this.storedXPMapHighscores.put("Woodcutting",xpHighscores.get(9));
        this.storedXPMapHighscores.put("Fletching",xpHighscores.get(10));
        this.storedXPMapHighscores.put("Fishing",xpHighscores.get(11));
        this.storedXPMapHighscores.put("Firemaking",xpHighscores.get(12));
        this.storedXPMapHighscores.put("Crafting",xpHighscores.get(13));
        this.storedXPMapHighscores.put("Smithing",xpHighscores.get(14));
        this.storedXPMapHighscores.put("Mining",xpHighscores.get(15));
        this.storedXPMapHighscores.put("Herblore",xpHighscores.get(16));
        this.storedXPMapHighscores.put("Agility",xpHighscores.get(17));
        this.storedXPMapHighscores.put("Thieving",xpHighscores.get(18));
        this.storedXPMapHighscores.put("Slayer",xpHighscores.get(19));
        this.storedXPMapHighscores.put("Farming",xpHighscores.get(20));
        this.storedXPMapHighscores.put("Runecrafting",xpHighscores.get(21));
        this.storedXPMapHighscores.put("Hunter",xpHighscores.get(22));
        this.storedXPMapHighscores.put("Construction",xpHighscores.get(23));
        this.storedXPMapHighscores.put("Summoning",xpHighscores.get(24));
        this.storedXPMapHighscores.put("Dungeoneering",xpHighscores.get(25));
        this.storedXPMapHighscores.put("Divination",xpHighscores.get(26));
        }

   }
            
 