package Secure;
import java.sql.*;
import javax.swing.*;


public class MysqlConnect {
    
    
    Connection conn=null;
    
    public static Connection ConnectDB () {
    
        try {
        
            
            Class.forName ("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/technosoft","root","qwerty123");
            JOptionPane.showMessageDialog (null, "connected to database");
            return conn;
            
            
        }
     catch (Exception e) {
        
    JOptionPane.showMessageDialog(null, e);
    return null;
}
}
    
}
     
    
    

