<%-- 
    Document   : GetLogDetails
    Created on : 17 May, 2020, 5:03:05 PM
    Author     : Surya0499
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head> <title>GetLogDetailsPage</title> 
  </head> 
  <body style="background: url(https://htmlcolorcodes.com/assets/images/html-color-codes-color-tutorials-hero-00e10b1f.jpg);background-size: 100%; no-repeat"> 
  <jsp:include page="Template.jsp"></jsp:include> 
  <td valign="top" rowspan="200"colspan="80"> 
      <table>
          <tr>
              <td><jsp:include page="/GetLogDetails">
                  <jsp:param name="title" value="GetLogDetails"/> 
                  </jsp:include>
      </table> 
  </body> 
</html>
