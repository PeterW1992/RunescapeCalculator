/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.DatabaseMetaData;
import java.sql.Statement;
/**
 *
 * @author Peter
 */
public class DBHandler {
    
    static String TBL_CATEGORY = "tblCategories";
    static String TBL_XP_TABLE = "tblXPTable";
    static String TBL_MONSTERS = "tblMonsters";
    
    public static void createDatabase() {
 
        String url = "jdbc:sqlite:data.db";
 
        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                ExecuteSQL("CREATE " + TBL_XP_TABLE + " ( " +
                        "  " +                        
                        ")");
            }
 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void ExecuteSQL(String sql) {
        // SQLite connection string
        String url = "jdbc:sqlite:C://sqlite/db/tests.db";
                
        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        createDatabase();
    }
}
