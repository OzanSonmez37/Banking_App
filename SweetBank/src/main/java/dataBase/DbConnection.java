
package dataBase;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

 
public class DbConnection {  // Super class
    
    private final String HOST = "localhost";
    private final String PORT = "3306";
    private final String VERITABANI_ISMI = "sweet_bank";
    private final String USER = "root";
    private final String PASSWORD = "";
    
    protected Connection connection = null;
    protected Statement statement = null;

    public DbConnection() {
                    //jdbc:mysql://localhost:3306/sweet_bank
        String url = "jdbc:mysql://" + this.HOST + ":" + this.PORT + "/" + this.VERITABANI_ISMI;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            this.connection = DriverManager.getConnection(url, this.USER, this.PASSWORD);
            System.out.println("Baglanti Basarili.");
        } catch (SQLException ex) {
            System.out.println("Baglanti Basarisiz.");
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
}
