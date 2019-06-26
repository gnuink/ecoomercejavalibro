package nocone;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class Conectar {
    static Connection conect;
    static String bd = "jdbc:ucanaccess://src\\base\\base3.accdb";
    static String drv = "net.ucanaccess.jdbc.UcanaccessDriver";
    
    public Connection Conexion(){
        try {
            Class.forName(drv) ;
        } catch(java.lang.ClassNotFoundException e) {
          JOptionPane.showMessageDialog(null,"SQLException: " + e);
            System.err.println(e.getMessage()) ;
            
        }
        try {
            conect = DriverManager.getConnection(bd, "java", "sun");
        } catch(SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        return conect;
    }
     public static void CerrarBD(){
        try{
            conect.close();
        } catch(SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage()) ;
        }
    }
}   
