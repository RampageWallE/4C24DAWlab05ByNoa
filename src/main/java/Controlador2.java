/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(urlPatterns = {"/Controlador2"})
public class Controlador2 extends HttpServlet {

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
        
        try {
            String number1 = request.getParameter("numero1");
            String number2 = request.getParameter("numero2"); 
            String operacion = request.getParameter("operacion");
            double respuesta;
            double numero1 = Double.parseDouble(number1);
            double numero2 = Double.parseDouble(number2);


            switch (operacion) {
                case "suma":
                    respuesta = numero1 + numero2;
                    break;
                case "resta":
                    respuesta = numero1 - numero2;
                    break;
                case "multiplicacion":
                    respuesta = numero1 * numero2;
                    break;
                case "division":
                    respuesta = numero1/numero2;
                    break;
                default:
                    throw new AssertionError();
            }
            
                    try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title></title>");  
            out.println("<link rel=\"stylesheet\" href=\"webjars/bootstrap/5.1.2/css/bootstrap.min.css\" type=\"text/css\" />");  
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='card'> <div class='card-body'>");
            out.println("La respuesta de la operacion es:<br>");
            out.println("<h1>"+respuesta +"</h1>");
            out.println("</div></div>");
            out.println("</body>");
            out.println("</html>");
        }
        } catch (Exception e) {
            try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title></title>");
            out.println("<link rel=\"stylesheet\" href=\"webjars/bootstrap/5.1.2/css/bootstrap.min.css\" type=\"text/css\" />");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='card'> <div class='card-body'>");
            out.println("Ingrese los datos de manera correcta");
            out.println("</div></div>");
            out.println("<a href=\"FormOperaciones.jsp\"> Volver a intentar</a>");
            out.println("</body>");
            out.println("</html>");
        }
            
            
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
