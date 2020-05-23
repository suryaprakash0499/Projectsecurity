/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backup;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain; 
import javax.servlet.FilterConfig; 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 *
 * @author Surya0499
 */
@WebFilter(filterName = "IPFilter", urlPatterns = {"/GetLogDetails"}, initParams = {
    @WebInitParam(name = "validip", value = "192.168.1.3")})
public class IPFilter implements Filter {
  private String validip; 
   @Override 
   public void init(final FilterConfig filterConfig) 
           throws ServletException 
   { 
       this.validip = filterConfig.getInitParameter("validip");
   }
 
@Override 
public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
throws ServletException, IOException 
{ 
if (request.getRemoteAddr().equals(this.validip))
{ 
RequestDispatcher rd=request.getRequestDispatcher("GetLogDetails.jsp"); 
rd.forward(request,response); 
} 
else 
{ 
RequestDispatcher rd=request.getRequestDispatcher("GetLogDetails.jsp"); 
rd.forward(request,response); 
} 
chain.doFilter(request, response); 
} 
@Override 
public void destroy() 
{ 
throw new UnsupportedOperationException("Not supported yet."); 
}
}