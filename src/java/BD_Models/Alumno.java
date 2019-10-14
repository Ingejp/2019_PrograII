
package BD_Models;

import BaseDeDatos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Alumno {
    private Conexion conn;
    private Connection cn;
    private PreparedStatement prstmt = null;
    private ResultSet result = null;
    
    public Alumno(){
        conn= new Conexion();
        cn=conn.conectar();
    }
  
    public String insert(String carne, String nombre, String correo, String telefono, String direccion, int genero, int ciudad){
        String sql = "INSERT INTO ALUMNO(ALUMNO_ID, NOMBRE, CORREO, TELEFONO, DIRECCION, GENERO_GENERO_ID, CIUDAD_CODIGO) ";
             sql += " VALUES( ?,?,?,?,?,?,?)"; 
        try{
            prstmt = cn.prepareStatement(sql); 
            prstmt.setString(1, carne);
            prstmt.setString(2, nombre);
            prstmt.setString(3, correo);
            prstmt.setString(4, telefono);
            prstmt.setString(5, direccion);
            prstmt.setInt(6, genero);
            prstmt.setInt(7, ciudad);
             int resultado = prstmt.executeUpdate(); 
                if(resultado > 0){
                   return "1";
                }else{
                     return "0";
                }
        }catch(SQLException e){
            String error = e.getMessage();  
            if(error.indexOf("ORA-00001") != -1){
                //salida.append("ORA-00001");
                  return "ORA-00001";
            }else{
                //salida.append(error);
                  return "error al guardar";
            }
        }
    
    }
    
    public void consultarRegistros(StringBuffer respuesta){   
        String sql="select * from ALUMNO";
        try{
        prstmt = cn.prepareStatement(sql);                        
        result = prstmt.executeQuery();            
            respuesta.append("<table id=\"tabla_elementos\" border='1' class=\"tabla-1\">");
            respuesta.append("<thead>");  
            //respuesta.append("<center><h5 >").append(" Registros Existentes  ").append("</tr></center>");
            respuesta.append("<tr id=\"trprincipal\" >");
            respuesta.append("<td style=\"width:100px;\">").append("ALUMNO_ID").append("</td>");//titulo de la columna
            respuesta.append("<td style=\"width:340px;\">").append("NOMBRE").append("</td>");//titulo de la column
            respuesta.append("</tr>");
            respuesta.append("</thead>");
            if (result!=null){
                while (result.next()){
                respuesta.append("<tr>");
                 respuesta.append("<td >").append(result.getString("ALUMNO_ID")).append("</td>");
                respuesta.append("<td >").append(result.getString("NOMBRE")).append("</td>");
               // respuesta.append("<td id=\"").append(index).append("_1\"  ondblclick=\"edit(this.id);\">").append(result.getString("DESCRIPCION")).append("</td>");
                respuesta.append("</tr>");
                }
            }else{
                respuesta.append("error al consultar");
            }
            respuesta.append("</table>");
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    
}