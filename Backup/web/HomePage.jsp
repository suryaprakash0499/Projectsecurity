<%-- 
    Document   : HomePage
    Created on : 17 May, 2020, 5:01:47 PM
    Author     : Surya0499
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
<head> 
    <title>Home Page</title> 
</head> 
<body style="background: url(https://htmlcolorcodes.com/assets/images/html-color-codes-color-tutorials-hero-00e10b1f.jpg);background-size: 100%; no-repeat"> 
<jsp:include page="Template.jsp"></jsp:include> 
<table align='center'border='0' opacity="0.1"> 
    <tr>
    <td valign="top"> <br/><br/><B><I><font  size='+1' color='white' >The Mobile Store is a website for purchasing of the phones currently present in the website.Please login to veiw further  </B></I>
             </tr> 
            </td>
            </table> 
            <br/>
        <br/> 
        <html:form method='post' action="/SubmitAction"> 
            <table border='0' cellspacing='10' align='center'> 
                <tr> <td><B><font color='Black' size='+3'>LOGIN AS: </B>
                </tr> 
            </td>
            </table> 
            <table border='0' cellspacing='10' align='center'border='2' bordercolor='black'> 
                <tr><td bordercolor='white'><B><font color='Black' size='+2'><html:radio property='r1'value="existinguser">Existing User</html:radio></B> 
                <tr><td bordercolor='white'><B><font color='Black' size='+2'><html:radio property='r1'value="newuser">New User</html:radio></B>
                <tr><td bordercolor='white'>
                <input type='Submit'value='Submit'>
            </table> 
        </html:form> 
    </tr> 
</table> 
<body> 
    <jsp:include page="Footer.jsp"></jsp:include> 
    </html>
    
