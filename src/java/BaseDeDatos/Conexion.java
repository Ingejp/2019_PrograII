
package BaseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private String url="jdbc:oracle:thin:@localhost:1521:XE";//url de nuestro odbc
    private String usuario="progra";
    private String clave="programacion"; 
    private Connection conexion=null;
    
    
    public Connection conectar(){   
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            conexion=DriverManager.getConnection( url, usuario,clave);
        }  catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {   
           ex.printStackTrace();
        }  
       
        return conexion;
        
    }
}
