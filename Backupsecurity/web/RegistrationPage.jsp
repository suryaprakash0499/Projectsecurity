<%-- 
    Document   : RegistrationPage
    Created on : 17 May, 2020, 5:02:19 PM
    Author     : Surya0499
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
    <head> <title>Registration Page</title> 
    </head> 
    <body style="background: url(https://htmlcolorcodes.com/assets/images/html-color-codes-color-tutorials-hero-00e10b1f.jpg);background-size: 100%; no-repeat"> 
    <jsp:include page="Template.jsp"></jsp:include> 
    <td valign="top">
        <html:form method='Post' action="/RegistrationAction"> 
            <table cellspacing='10' align='center'> 
                <tr> <td>
                    <font color='darkblue' size='+2'>New User Registration Form </tr> </td> </table> 
            <table cellspacing='10' align='center'border='2' bordercolor='black'> 
                
                <tr><td bordercolor='white'>User Name:<td COLSPAN='2'bordercolor='white'>
                <html:text property="username"/> 
                <tr><td bordercolor='white'>User Id:<td COLSPAN='2'bordercolor='white'> 
                    <html:text property="userid"/>  </tr>
                <tr><td bordercolor='white'>Password:<td COLSPAN='2'bordercolor='white'> 
                    <html:password property="password"/>  </tr>
                <tr><td bordercolor='white'>Re-enter Password:<td COLSPAN='2' bordercolor='white'>
                        <html:password property="reenterpassword"/>  
                        <tr><td bordercolor='white'>Address:<td COLSPAN='2' bordercolor='white'>
                        <html:textarea property="address"/> 
                        <tr><td bordercolor='white'>State:<td COLSPAN='2' bordercolor='white'>
                        <html:text property="state"/>  <tr><td bordercolor='white'>Country:<td COLSPAN='2' bordercolor='white'>
                        <html:text property="country"/>  <tr>
                            <td bordercolor='white'></br> 
                        <tr><td bordercolor='white'><input type='Submit'value='Submit'> 
                            <td bordercolor='white'><input type='Reset'text='Reset'> 
            </table> 
        </html:form> 
    </body> 
</html>
