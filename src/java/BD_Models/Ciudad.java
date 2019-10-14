
package BD_Models;

import BaseDeDatos.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;


public class Ciudad {
    private PreparedStatement prstmt=null;
    private ResultSet result = null;
    private Conexion conexion;    
    private Connection cn;

    public Ciudad(){
        Conexion conexion = new Conexion();
        cn=conexion.conectar();
    }
    
    public void consultar(StringBuffer respuesta){   
        String sql="select * from CIUDAD";
        try{
        prstmt = cn.prepareStatement(sql);                        
        result = prstmt.executeQuery();            
            if (result!=null){
                while (result.next()){   
                  respuesta.append("<option value=\"" + result.getString("CODIGO") + "\">").append(result.getString("ALUMNO_ID")).append("</td>");
                }
            }else{
                respuesta.append("error al consultar");
            }
        }
        catch(SQLException ex){
           ex.getMessage();
        }
    }
}
