/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backup;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Surya0499
 */
@WebServlet(name = "CartServlet", urlPatterns = {"/CartServlet"})
public class CartServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            out.println("<html>"); 
            out.println("<head>"); 
            out.println("<title>Order Details</title>"); 
            out.println("</head>"); 
            out.println("<body>"); 
            out.println("<table border='0' bgcolor='#000080' align='top' width='100%' style='height:100px'>"); 
            out.println("<tr>"); 
            out.println("<td bgcolor='#000080' align='center'>"); 
            out.println("<font style='font-family: 'Arial Rounded MT Bold', Gadget, sans-serif;' size='+4' color='#FFE4B5'>The Mobile Store</font>"); 
            out.println("</td>"); 
            out.println("<td bgcolor='000080' align='left' width='180'>"); 
            out.println("<img src='Images/1.jpg' width='180' height='120' align='right'/>"); 
            out.println("</td>"); 
            out.println("</tr>");
            out.println("</table>");
            out.println("<br/>");
            out.println("<table cellspacing='50' align='center'border='2' bordercolor='black'>");
            out.println("<tr><td bordercolor='white'>");
            out.println("<font style='font-family: 'Arial Rounded MT Bold', Gadget, sans-serif;' size='+1' color='black'>Thank you your Device Ordered will be dispatched soon</font>");
            out.println("</td>");
            out.println("</head>"); 
            out.println("</html>");
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
