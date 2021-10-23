/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PeterW
 */
import com.sun.org.apache.xerces.internal.parsers.IntegratedParserConfiguration;
import org.omg.CORBA.Environment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import javax.swing.*;
public class RunescapeCalculator extends javax.swing.JFrame {

       AbstractCalculator calculator = null;
       List<RSAction> calculatorMap;
       DefaultListModel listModel;
       public static Map<String, Long> StoredXp = null;

    String[] columnNames = {
            "Level",
            "Description",
            "Xp Gained",
            "Iterations"};

    Object[][] data = {
            {"1", "Snowboarding",
                    "3.0", "10"},
            {"10", "Sucking dick",
                    "25.0", "1"}};
       
     /**
     * Creates new form RunescapeCalculator
     */
    public RunescapeCalculator() {
       initComponents();
       comboboxSkills.setSelectedItem("Agility");
       calculator = new AgilityCalculator();
    }


    private void outputToFile(Map<String,Double> nameAndXpGained, String skillName) {
        List<RSAction> actions = new ArrayList<RSAction>();
        for (String key : nameAndXpGained.keySet()) {
            RSAction action = generateRSAction(key, nameAndXpGained.get(key));
            actions.add(action);
        }

        try {
            String fileName = ".\\data\\" + skillName + ".csv";
            File myObj = new File(fileName);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }

            FileWriter myWriter = new FileWriter(fileName);
            for (RSAction action : actions)
            {
                myWriter.write(action.toString() + "\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


    private RSAction generateRSAction(String actionString, Double xp) {

        String description = null;
        Integer minimumLevel = null;
        String category = null;

        if (actionString.contains("-")) {
            description = actionString.substring(actionString.indexOf('-') + 1).trim();
        }

        if (actionString.contains("Level ")) {
            minimumLevel = Integer.parseInt(actionString.substring(actionString.indexOf("Level ") + 6, actionString.indexOf("Level ") + 8));
            category = actionString.substring(0, actionString.indexOf("Level"));
        }

        if (calculator.getSkillName().equals("Prayer")) {
            for (String skillFilter : calculator.skillFilter) {
                if (actionString.contains(skillFilter)){
                    actionString = actionString.replace(skillFilter, "");
                    category = skillFilter;
                }
            }
            description = actionString;
        }

        return new RSAction(description, xp, minimumLevel, category);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        comboboxSkills = new javax.swing.JComboBox();
        txtCurrentXPOrLevel = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        tblActions = new JTable(data,columnNames);
        lblTargetLevel = new javax.swing.JLabel();
        txtTargetLevel = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        comboboxSkillFilter = new javax.swing.JComboBox();
        lblPlayersCurrentLevel = new javax.swing.JLabel();
        btnPlayerHighscores = new javax.swing.JButton();
        comboboxXPOrLevel = new javax.swing.JComboBox();
        btn_BeastDatabase = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Runescape Calculator");

        comboboxSkills.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Agility", "Attack", "Constitution", "Cooking", "Crafting", "Defence", "Firemaking", "Fishing", "Fletching", "Herblore", "Hunter", "Magic", "Mining", "Prayer", "Ranged", "Runecrafting", "Slayer", "Smithing", "Strength", "Summoning", "Thieving", "Woodcutting" }));
        comboboxSkills.setMaximumSize(new java.awt.Dimension(87, 20));
        comboboxSkills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxSkillsActionPerformed(evt);
            }
        });

        txtCurrentXPOrLevel.setText("0");
        txtCurrentXPOrLevel.setToolTipText("Enter current xp here");
        txtCurrentXPOrLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurrentXPOrLevelActionPerformed(evt);
            }
        });

        jList1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setToolTipText("");
        tblActions.setFillsViewportHeight(true);
        jScrollPane1.setViewportView(jList1);

        lblTargetLevel.setText("Target Level:");
        lblTargetLevel.setToolTipText("");

        txtTargetLevel.setText("1");
        txtTargetLevel.setToolTipText("Enter target level here");

        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        comboboxSkillFilter.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Courses" }));
        comboboxSkillFilter.setName("ComboBoxFilter"); // NOI18N
        comboboxSkillFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxSkillFilterActionPerformed(evt);
            }
        });

        lblPlayersCurrentLevel.setText("Your Level is:");
        lblPlayersCurrentLevel.setToolTipText("");

        btnPlayerHighscores.setText("Get Player's Highscore XP");
        btnPlayerHighscores.setToolTipText("");
        btnPlayerHighscores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayerHighscoresActionPerformed(evt);
            }
        });

        comboboxXPOrLevel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Current XP", "Current Level" }));

        btn_BeastDatabase.setText("Beast Database");
        btn_BeastDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BeastDatabaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboboxSkillFilter, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboboxSkills, 0, 182, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboboxXPOrLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCurrentXPOrLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTargetLevel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTargetLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPlayersCurrentLevel, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                .addGap(61, 61, 61))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPlayerHighscores)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_BeastDatabase)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboboxSkills, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboboxXPOrLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCurrentXPOrLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTargetLevel)
                            .addComponent(txtTargetLevel)
                            .addComponent(lblPlayersCurrentLevel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboboxSkillFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPlayerHighscores)
                            .addComponent(btn_BeastDatabase)))
                    .addComponent(btnCalculate, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private static void txtCurrentXPOrLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCurrentXPOrLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCurrentXPOrLevelActionPerformed

    private void comboboxSkillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxSkillsActionPerformed
        switch ((String) comboboxSkills.getSelectedItem())
        {           
            case "Agility":
            calculator = new AgilityCalculator();
            break;
            
            case "Attack":
            calculator = new AttackCalculator();
            break;
            
            case "Cooking":
            calculator = new CookingCalculator();
            break;
            
            case "Constitution":
            calculator = new ConstitutionCalculator();
            break;
            
            case "Crafting":
            calculator = new CraftingCalculator();
            break;
                
            case "Defence":
            calculator = new DefenceCalculator();
            break;
                
            case "Firemaking":
            calculator = new FiremakingCalculator();
            break;
                
            case "Fishing":
            calculator = new FishingCalculator();
            
            break;
                
            case "Fletching":
            calculator = new FletchingCalculator();
            break;
                
            case "Herblore":
            calculator = new HerbloreCalculator();
            
            break;
                
            case "Hunter":
            calculator = new HunterCalculator();
            break;
                
            case "Magic":
            calculator = new MagicCalculator();
           
            break;
                
            case "Mining":
            calculator = new MiningCalculator();
            break;
            
            case "Prayer":
            calculator = new PrayerCalculator();
            break;
                
            case "Ranged":
            calculator = new RangedCalculator();
            break;
                
            case "Runecrafting" :
            calculator = new RunecraftingCalculator();   
            break;
                
            case "Slayer":
            calculator = new SlayerCalculator();
            
            break;
                
            case "Strength":
            calculator = new StrengthCalculator();
            break;
                
            case "Thieving":
            calculator = new ThievingCalculator();
            break;
                
            case "Woodcutting":
            calculator = new WoodcuttingCalculator();
            break;
            
        }
        try {
            this.StoredXp = calculator.getPlayerHighscores();
        } catch (IOException ex) {
           ex.printStackTrace();
       }

        this.changeCalculator();

        
    }//GEN-LAST:event_comboboxSkillsActionPerformed

    private  void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
    if (comboboxXPOrLevel.getSelectedItem().toString() == "Current XP")
    {
      this.calculateUsingExperience(); 
    }
    if (comboboxXPOrLevel.getSelectedItem().toString() == "Current Level")
    {
        this.calculateUsingLevel(); 
    }
    }//GEN-LAST:event_btnCalculateActionPerformed
    
    private void calculateUsingExperience()
    {
    int currentXp = 0;
    int targetLevel = 0;
    try {
    currentXp = Integer.parseInt(txtCurrentXPOrLevel.getText());
    targetLevel = Integer.parseInt(txtTargetLevel.getText());
    if (targetLevel > 120)
    {
        targetLevel = 120;
        txtTargetLevel.setText("120");
    }

    this.updatePlayersCurrentLevel();
    listModel.removeAllElements();
    List<RSAction> actions = new ArrayList<RSAction>();
       for (String name : nameAndXpGained)
       {
           if (name.startsWith(comboboxSkillFilter.getSelectedItem().toString()))
                  {
                      double xpGained = calculatorMap.get(name);
                      int xpToLevel = calculator.getXpForLevels().get(targetLevel) - currentXp;
                      double iterations = xpToLevel / calculatorMap.get(name);

                      String firstPart = name.substring(comboboxSkillFilter.getSelectedItem().toString().length(),name.length());

                      while (firstPart.length() != calculator.getLongestName(calculatorMap) - comboboxSkillFilter.getSelectedItem().toString().length())
                      {
                          firstPart = firstPart + " ";
                      }
                      String secondPart = " XP Gained: " + xpGained;
                      
                      while ((" XP Gained: " + calculator.getHighestXp(calculatorMap)).length() != secondPart.length())
                      {
                          secondPart = secondPart + " ";
                      }
                      String tableEntry = (firstPart + secondPart + " Iterations: " + (int)(iterations+0.99));
                      int minimumLevel = Integer.parseInt(name.substring(name.indexOf("Level ") + 6, name.indexOf("Level ") + 8));
                      String desc = firstPart.substring(firstPart.indexOf('-') + 1).trim();
                      RSAction action = new RSAction(desc, xpGained,minimumLevel, comboboxSkillFilter.getSelectedItem().toString());
                      actions.add(action);

                      listModel.addElement(tableEntry);
                  }
            }

        this.jList1.setModel(listModel);
    }
    catch (Exception anException){
    JOptionPane.showMessageDialog(null, "Incorrect input(s), Current Xp and Target Level must be numbers" + anException);
    }
    }

    
    private  void calculateUsingLevel()
    {
    int currentXp = 0;
    int targetLevel = 0;
    for (Integer level :AbstractCalculator.xpForLevels.keySet()){
        System.out.println("\" (" + level +  " ," + AbstractCalculator.xpForLevels.get(level) + "), \" + " );
    }
    
    try {
    currentXp = calculator.getXpRequiredForTheLevel(Integer.parseInt(txtCurrentXPOrLevel.getText()));
    targetLevel = Integer.parseInt(txtTargetLevel.getText());
    if (targetLevel > 99)
    {
        targetLevel = 99;
        txtTargetLevel.setText("99");
    }
    this.updatePlayersCurrentLevel();
    listModel.removeAllElements();
       for (RSAction rsAction : calculator.nameAndXpGained)
       {
          if (rsAction.GetCategory().equals(comboboxSkillFilter.getSelectedItem().toString()))
                  {
                      double xpGained = rsAction.GetXp();
                      int xpToLevel = calculator.getXpForLevels().get(targetLevel) - currentXp;
                      double iterations = xpToLevel / xpGained;

                      String lvlPrefix = "";
                      if (rsAction.GetMinimumLevel() != null) {
                        lvlPrefix = "Level " + rsAction.GetMinimumLevel() + ", ";
                      }
                      String tableEntry = (lvlPrefix + rsAction.GetMinimumLevel() + rsAction.GetDescription() + " Iterations: " + (int)(iterations+0.99));

                      listModel.addElement(tableEntry);
                  }
       }
        this.jList1.setModel(listModel);
    }
    catch (Exception anException){
    JOptionPane.showMessageDialog(null, "Incorrect input(s), Current Xp and Target Level must be numbers" + anException);
    }
    }
    
    private  void comboboxSkillFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxSkillFilterActionPerformed
            if (calculator.getFilter().contains((String) comboboxSkillFilter.getItemAt(0)))
            {
                String selectedItem = comboboxSkillFilter.getSelectedItem().toString();
                listModel.removeAllElements();
                comboboxSkillFilter.removeAllItems();
               for (String skillFilter : calculator.getFilter())
               {
                   comboboxSkillFilter.addItem(skillFilter);
               }
               
            calculatorMap = calculator.getNameAndXpGained();
            comboboxSkillFilter.setSelectedItem(selectedItem);
            if (calculator.isCombatSkill)
            {
            listModel = calculator.getUniformTableForCombat(calculatorMap, selectedItem);
            }
            else
            {
            listModel = calculator.getUniformTable(calculatorMap, selectedItem);
            }
            this.jList1.setModel(listModel);
            }
            else
            {
            for (String skillFilter : calculator.getFilter())
            {
                comboboxSkillFilter.addItem(skillFilter);
            }
            calculatorMap = calculator.getNameAndXpGained();
            calculatorKeySet = calculatorMap.keySet();
            listModel = new DefaultListModel();
            for (String name : calculatorKeySet){
                if (name.startsWith(comboboxSkillFilter.getSelectedItem().toString()))
                  {
                      String actualName = name.substring(comboboxSkillFilter.getItemAt(0).toString().length(),name.length() );
                      listModel.addElement(actualName + " XP Gained: " + calculatorMap.get(name) + " Iterations: --");
                  }
            }
            this.jList1.setModel(listModel);
            }
    }//GEN-LAST:event_comboboxSkillFilterActionPerformed
    
    private  void changeCalculator()
    {
            txtTargetLevel.setText("");
            comboboxSkillFilter.removeAllItems();
            calculatorMap = calculator.getNameAndXpGained();
            if (calculator.isCombatSkill)
            {
            listModel = calculator.getUniformTableForCombat(calculatorMap, comboboxSkillFilter.getItemAt(0).toString());
            }
            else
            {
            listModel = calculator.getUniformTable(calculatorMap, comboboxSkillFilter.getItemAt(0).toString());
            }
            this.jList1.setModel(listModel);
            this.updatePlayersCurrentLevel();
            }
    
    private void updatePlayersCurrentLevel()
    {
        if (StoredXp != null)
            {    
            if (calculator.isRead)
            {
            this.txtCurrentXPOrLevel.setText(StoredXp.get(calculator.getSkillName()).toString());
            if (!StoredXp.get(calculator.getSkillName()).equals("-1"))
            {
            
            lblPlayersCurrentLevel.setText("Your " + calculator.getSkillName() + " Level is: " + calculator.getCurrentLevel(StoredXp.get(calculator.getSkillName())));
                }
           
            }
            if (comboboxXPOrLevel.getSelectedItem().toString() == "Current XP")
            {
            lblPlayersCurrentLevel.setText("Your " + calculator.getSkillName() + " Level is: " + calculator.getCurrentLevel(Integer.parseInt(txtCurrentXPOrLevel.getText())));
            }
            if (comboboxXPOrLevel.getSelectedItem().toString() == "Current Level")
            {
            lblPlayersCurrentLevel.setText("Your " + calculator.getSkillName() + " Level is: " + Integer.parseInt(txtCurrentXPOrLevel.getText()));
            }
            }
        
    }
    
    private void btnPlayerHighscoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayerHighscoresActionPerformed
        String userName = JOptionPane.showInputDialog("Enter Username","Shakes5856");
        if (userName != null)
        {
        try {
         calculator.setPlayerHighscores(userName);
         StoredXp.putAll(calculator.getPlayerHighscores());
         this.updatePlayersCurrentLevel();
        } catch (IOException ex) {
            System.out.println("Player not found");
            //ex.printStackTrace();            
        }
        }
    }//GEN-LAST:event_btnPlayerHighscoresActionPerformed

    private static void btn_BeastDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BeastDatabaseActionPerformed
    //this.setVisible(false);
    new BeastDetails().setVisible(true);
    }//GEN-LAST:event_btn_BeastDatabaseActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RunescapeCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RunescapeCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RunescapeCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RunescapeCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RunescapeCalculator().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnPlayerHighscores;
    private javax.swing.JToggleButton btn_BeastDatabase;
    private javax.swing.JComboBox comboboxSkillFilter;
    private javax.swing.JComboBox comboboxSkills;
    private javax.swing.JComboBox comboboxXPOrLevel;
    private javax.swing.JList jList1;
    private javax.swing.JTable tblActions;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPlayersCurrentLevel;
    private javax.swing.JLabel lblTargetLevel;
    private javax.swing.JTextField txtCurrentXPOrLevel;
    private javax.swing.JTextField txtTargetLevel;
    // End of variables declaration//GEN-END:variables
}
