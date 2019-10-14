/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import BD_Models.Alumno;
import BD_Models.Ciudad;
import BaseDeDatos.Conexion;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/AlumnoController"})
public class AlumnoController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        Conexion conexion = new Conexion();
        conexion.conectar();
        
        try{
            if((request.getParameter("control")).equals("INSERT")){
                 Alumno alumno = new Alumno();   
                String respuesta =(
                        alumno.insert(
                        request.getParameter("carne"), 
                        request.getParameter("nombre"),
                        request.getParameter("correo"),
                        request.getParameter("telefono"),
                        request.getParameter("direccion"),
                        Integer.parseInt(request.getParameter("genero")),
                        Integer.parseInt(request.getParameter("ciudad")) 

                        ));
                response.getWriter().println(respuesta);
            }else if((request.getParameter("control")).equals("CIUDADES")){
                Ciudad ciudad = new Ciudad();
                
               response.getWriter().println(respuesta);                   
            }else{
                 response.getWriter().println("error al insertar");
            }
            
        }catch(Exception e){
            e.getMessage();
        }
        
       
       
        
      
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
