
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Peter
 */
public class BeastDetails extends javax.swing.JFrame {
Collection<String> namesOfAllMonsters = new TreeSet<>();
Collection<Beast> beastCollection = new TreeSet<>();
Collection<Integer> idOfAllMonsters = new TreeSet<>();

    /**
     * Creates new form BeastDetails
     */
    public BeastDetails() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        try
        {
        //this.getAllMonstersID();
        this.readFromTextFile();
        //his.getInfoOnBeasts();
        this.updateMonsterList();
        //this.saveMonstersToTextFile();
        }
        catch (Exception anException)
        {
        System.out.println("Exception: "+ anException);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        pnl_TopPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_Search = new javax.swing.JTextField();
        pnl_Stats = new javax.swing.JPanel();
        txt_BeastID = new javax.swing.JTextField();
        txt_BeastName = new javax.swing.JTextField();
        txt_BeastXP = new javax.swing.JTextField();
        txt_BeastLevel = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel5.setText("Search:");

        txt_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SearchActionPerformed(evt);
            }
        });
        txt_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_SearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnl_TopPanelLayout = new javax.swing.GroupLayout(pnl_TopPanel);
        pnl_TopPanel.setLayout(pnl_TopPanelLayout);
        pnl_TopPanelLayout.setHorizontalGroup(
            pnl_TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_TopPanelLayout.setVerticalGroup(
            pnl_TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        txt_BeastID.setText("Beasth ID:");

        txt_BeastName.setText("Beast Name: ");
        txt_BeastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BeastNameActionPerformed(evt);
            }
        });

        txt_BeastXP.setText("Beast XP:");

        txt_BeastLevel.setText("Beast Level: ");

        jLabel1.setText("Beast Name:");

        jLabel2.setText("Beast ID:");

        jLabel3.setText("Beast XP:");

        jLabel4.setText("Beast Level:");

        javax.swing.GroupLayout pnl_StatsLayout = new javax.swing.GroupLayout(pnl_Stats);
        pnl_Stats.setLayout(pnl_StatsLayout);
        pnl_StatsLayout.setHorizontalGroup(
            pnl_StatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_StatsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_StatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnl_StatsLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_BeastName, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_StatsLayout.createSequentialGroup()
                        .addGroup(pnl_StatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_StatsLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(8, 8, 8))
                            .addGroup(pnl_StatsLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_StatsLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(pnl_StatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_BeastID)
                            .addComponent(txt_BeastXP)
                            .addComponent(txt_BeastLevel, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_StatsLayout.setVerticalGroup(
            pnl_StatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_StatsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_StatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_BeastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_StatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_BeastID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_StatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_BeastXP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_StatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_BeastLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(235, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnl_Stats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_Stats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private static void txt_BeastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BeastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BeastNameActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
    Beast aBeast = (Beast)this.jList1.getSelectedValue();
    this.txt_BeastID.setText(aBeast.getID()+"");
    this.txt_BeastLevel.setText(aBeast.getLevel()+"");
    this.txt_BeastXP.setText(aBeast.getXP()+"");
    this.txt_BeastName.setText(aBeast.getName());
    }//GEN-LAST:event_jList1ValueChanged

    private static void txt_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SearchActionPerformed

    private  void txt_SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SearchKeyReleased
DefaultListModel aModel = new DefaultListModel();
    for (Beast aBeast: this.beastCollection)
    {
        if (aBeast.getName().contains(txt_Search.getText()))
        {
        aModel.addElement(aBeast);
        }
}
    jList1.setModel(aModel);
    }//GEN-LAST:event_txt_SearchKeyReleased
    public void getInfoOnBeasts() throws IOException
    {  
        URL aUrl = null; 
        for (int id: this.idOfAllMonsters)
        {
                try
                {  
                aUrl = new URL("http://services.runescape.com/m=itemdb_rs/bestiary/beastData.json?beastid=" + id);
                }
                catch (Exception anException)
                {
                System.out.println("Exception: "+ anException);
                
                }
        if (aUrl != null)
        {
        Scanner aScanner = new Scanner(aUrl.openStream());
        String aString = aScanner.nextLine();
        if (aString.contains("\"defence\""))
        {
        int nameBegin = aString.indexOf("\"name\":\"") + 8;
        int nameEnd = nameBegin + aString.substring(nameBegin, nameBegin + 50).indexOf("\"");
        String beastName = aString.substring(nameBegin, nameEnd);
        int levelBegin = aString.indexOf("\"level\":") + 8;
        int levelEnd = levelBegin + aString.substring(levelBegin, levelBegin + 10).indexOf(",");
        
        int beastLevel =  Integer.parseInt(aString.substring(levelBegin, levelEnd));
        if (aString.contains("xp\":\""))
        {
        int xpBegin = aString.indexOf("xp\":\"") + 5;
        int xpEnd = xpBegin + aString.substring(xpBegin, xpBegin + 10).indexOf("\"");
        double beastXP = Double.parseDouble(aString.substring(xpBegin, xpEnd));
        Beast aBeast = new Beast(beastName,id,beastXP,beastLevel);       
        System.out.println(aBeast);
        this.beastCollection.add(aBeast);
        }
        
        }
         
        }
           
        }
        this.updateMonsterList();
  
    }
    private void saveMonstersToTextFile()
    {
    File aFile = new File("C:\\Users\\Peter\\Desktop\\Monsters.txt");
    BufferedWriter file = null;
    try
    {
    file = new BufferedWriter(new FileWriter(aFile));
    int size = 0;
    for (Beast aBeast : this.beastCollection)
    {
        file.append(aBeast.getName()+"|"+aBeast.getID()+"|"+aBeast.getXP()+"|"+aBeast.getLevel());
        file.newLine();
        size++;
        
    }
    file.close();
    System.out.println("Calculated Size = " + size + "Actual Size: " + this.beastCollection.size());
    }
    catch(Exception anException)
    {
       System.out.println("Exception :" + anException);
    }
    
    }
    private void readFromTextFile()
    {
    File aFile = new File("C:\\Users\\Peter\\Desktop\\Monsters.txt");
    try
    {
    BufferedReader file = new BufferedReader(new FileReader(aFile));
    String currentLine = file.readLine();
    Scanner aScanner;
    while (currentLine != null)
    {
        aScanner = new Scanner(currentLine);
        aScanner.useDelimiter("\\|");
        System.out.println(currentLine);
        String name = aScanner.next(); //Name;
        int id = aScanner.nextInt(); //ID;
        double xp = Double.parseDouble(aScanner.next()); //XP
        int level = aScanner.nextInt(); //Level;
        this.beastCollection.add(new Beast(name,id,xp,level));
        currentLine = file.readLine();
        
    }
    file.close();
    }
    catch(Exception anException)
    {
       System.out.println("Exception :" + anException);
    }
    }
    private void getAllMontersNames() throws IOException
    {
        URL aUrl;
        try
    {
       aUrl = new URL("http://services.runescape.com/m=itemdb_rs/bestiary/levelGroup.json?identifier=1-10000");
    }
    catch(Exception anException)
    {
        System.out.println("af");
    aUrl= null;
    }
        
        Scanner aScanner = new Scanner(aUrl.openStream());
        aScanner.useDelimiter("\"label\":\"");
        aScanner.next();
        String aString = aScanner.next();
        
        while (aString != null)
        {
            System.out.println(aString);
            if (!aString.contains("("))
            {
        aString = aString.substring(0, aString.indexOf("\""));
            }
            else
            {
        aString = aString.substring(0, aString.indexOf("("));
            }
        
        namesOfAllMonsters.add(aString);
        if (aScanner.hasNext())
        {
        aString = aScanner.next();
        }
        else
        {
        aString = null;
        }
        }
    }
    private void getAllMonstersID() throws IOException
    {  
        URL aUrl;
        try
    {
       aUrl = new URL("http://services.runescape.com/m=itemdb_rs/bestiary/levelGroup.json?identifier=1-10000");
    }
    catch(Exception anException)
    {
        System.out.println("af");
    aUrl= null;
    }
        
        Scanner aScanner = new Scanner(aUrl.openStream());
        aScanner.useDelimiter("\"value\":");
        aScanner.next();
        String aString = aScanner.next();
        
        while (aString != null)
        {
        int id;    
        id = Integer.parseInt(aString.substring(0, aString.indexOf(",")));
        
        idOfAllMonsters.add(id);
        if (aScanner.hasNext())
        {
        aString = aScanner.next();
        }
        else
        {
        aString = null;
        }
        }
    }
    
    private boolean doesIDExist(int i)
    {
        URL aUrl;
        boolean exists = false;
        try
                {
                aUrl = new URL("http://services.runescape.com/m=itemdb_rs/bestiary/beastData.json?beastid=" + i);
                Scanner aScanner = new Scanner(aUrl.openStream());
                if (aScanner.hasNext())
                {
                    exists = true;
                }
                
                }
        catch (Exception anException)
        {
         System.out.println("Exception: "+ anException);
         return false;
        }
        
    return exists;
    }
    
    private void updateMonsterList()
    {
    DefaultListModel aModel = new DefaultListModel();
    for (Beast aBeast: this.beastCollection)
    {
    aModel.addElement(aBeast);
    }
    this.jList1.setModel(aModel);   
    }
    
    private Beast getBeastWithID(int id) throws IOException
    {
        Beast aBeast = null;
        URL aUrl;
        try
                {  
                aUrl = new URL("http://services.runescape.com/m=itemdb_rs/bestiary/beastData.json?beastid=" + id);
                }
                catch (Exception anException)
                {
                System.out.println("Exception: "+ anException);
                aUrl = null;
                }
        if (aUrl != null)
        {
        Scanner aScanner = new Scanner(aUrl.openStream());
        String aString = aScanner.nextLine();
        if (aString.contains("\"defence\""))
        {
        int nameBegin = aString.indexOf("\"name\":\"") + 8;
        int nameEnd = nameBegin + aString.substring(nameBegin, nameBegin + 50).indexOf("\"");
        String beastName = aString.substring(nameBegin, nameEnd);
        int levelBegin = aString.indexOf("\"level\":") + 8;
        int levelEnd = levelBegin + aString.substring(levelBegin, levelBegin + 10).indexOf(",");
        
        int beastLevel =  Integer.parseInt(aString.substring(levelBegin, levelEnd));
        if (aString.contains("xp\":\""))
        {
        int xpBegin = aString.indexOf("xp\":\"") + 5;
        int xpEnd = xpBegin + aString.substring(xpBegin, xpBegin + 10).indexOf("\"");
        double beastXP = Double.parseDouble(aString.substring(xpBegin, xpEnd));
        
        aBeast = new Beast(beastName,id,beastXP,beastLevel);
        
    
    }
    }
        }
        return aBeast;
    }
    private void checkForCopies()
    {
        int countOfCopies = 0;
    for (Beast aBeast:this.beastCollection)
    {
        if (this.beastCollection.isEmpty())
        {
        countOfCopies++;
        }
    }
    System.out.println(countOfCopies);
    
    }
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
            java.util.logging.Logger.getLogger(BeastDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BeastDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BeastDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BeastDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BeastDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnl_Stats;
    private javax.swing.JPanel pnl_TopPanel;
    private javax.swing.JTextField txt_BeastID;
    private javax.swing.JTextField txt_BeastLevel;
    private javax.swing.JTextField txt_BeastName;
    private javax.swing.JTextField txt_BeastXP;
    private javax.swing.JTextField txt_Search;
    // End of variables declaration//GEN-END:variables
}
