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
@WebServlet(name = "Google", urlPatterns = {"/Google"})
public class Google extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<html>"); 
            out.println("<head>"); 
            out.println("<title>Log Details Page</title>"); 
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
            out.println("<B> <font style='font-family':'Times New Roman',Gadget, sans-seriff: 'size='+1' color='darkblue'>The pixel Range of devices made by google. </B> ");
            out.println("<br/>");
            out.println("<table border='0' bgcolor='White' align='top' width='100%' style='height:100px'>"); 
            out.println("<tr>"); 
            out.println("<td bgcolor='white' align='left'>"); 
            out.println("<td><font color='darkblue' size='+2'><a href='Pixel'>Pixel</a></td>"); 
            out.println("</td>"); 
            out.println("<td bgcolor='white' align='left' width='180'>"); 
            out.println("<img src='Images/pixel.jpg' width='180' height='200' align='right'/>"); 
            out.println("</B></td>"); 
            out.println("</tr>");
            out.println("</table>");
            out.println("<table border='0' bgcolor='white' align='top' width='100%' style='height:100px'>"); 
            out.println("<tr>"); 
            out.println("<td bgcolor='white' align='left'>"); 
            out.println("<td><font color='darkblue' size='+2'><a href='Pixel 2'>Pixel 2</a></td>");  
            out.println("</td>"); 
            out.println("<td bgcolor='white' align='left' width='180'>"); 
            out.println("<img src='Images/pixel2.jpg' width='180' height='200' align='right'/>"); 
            out.println("</td>"); 
            out.println("</tr>");
            out.println("</table>");
            out.println("<table border='0' bgcolor='white' align='top' width='100%' style='height:100px'>"); 
            out.println("<tr>"); 
            out.println("<td bgcolor='white' align='left'>"); 
            out.println("<td><font color='darkblue' size='+2'><a href='Pixel 3'>Pixel 3</a></td>"); 
            out.println("</td>"); 
            out.println("<td bgcolor='white' align='left' width='180'>"); 
            out.println("<img src='Images/pixel 3.jpg' width='180' height='200' align='right'/>"); 
            out.println("</td>"); 
            out.println("</tr>");
            out.println("</table>");
            out.println("<table border='0' bgcolor='white' align='top' width='100%' style='height:100px'>"); 
            out.println("<tr>"); 
            out.println("<td bgcolor='white' align='left'>"); 
            out.println("<td><font color='darkblue' size='+2'><a href='Pixel 3a'>Pixel 3a</a></td>"); 
            out.println("</td>"); 
            out.println("<td bgcolor='white' align='left' width='180'>"); 
            out.println("<img src='Images/pixel3a.jpg' width='180' height='200' align='right'/>"); 
            out.println("</td>"); 
            out.println("</tr>");
            out.println("</table>");
            out.println("<table border='0' bgcolor='white' align='top' width='100%' style='height:100px'>"); 
            out.println("<tr>"); 
            out.println("<td bgcolor='white' align='left'>"); 
            out.println("<td><font color='darkblue' size='+2'><a href='Pixel 4'>Pixel 4</a></td>"); 
            out.println("</td>"); 
            out.println("<td bgcolor='white' align='left' width='180'>"); 
            out.println("<img src='Images/pixel2.jpg' width='180' height='200' align='right'/>"); 
            out.println("</td>"); 
            out.println("</tr>");
            out.println("</table>");
             
            out.println("<form method='Post' action='SubmitServlet'>");
            out.println("<table cellspacing='10'align='center'>");
            out.println("<tr>");
            out.println("</td>");
            out.println("</table>");
            out.println("</form>");
            out.println("</body>");
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
