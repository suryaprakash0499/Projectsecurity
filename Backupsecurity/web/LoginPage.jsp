<%-- 
    Document   : LoginPage
    Created on : 17 May, 2020, 5:02:05 PM
    Author     : Surya0499
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
<head> <title>Login Page</title> 
</head>
<body style="background: url(https://htmlcolorcodes.com/assets/images/html-color-codes-color-tutorials-hero-00e10b1f.jpg);background-size: 100%; no-repeat"> 
<jsp:include page="Template.jsp"></jsp:include>
<td valign="top"> 
    <html:form action="/ValidateAction" method="Post"> 
        <table cellspacing='10' align='center'> 
            <tr> <td><font color='yellow' size='+2'>Login Form </tr> </td> </table> 
        <table cellspacing='10' align='center'> 
            <tr><td bordercolor='white'><font color='yellow' size='+1'>User Id:<td COLSPAN='2'>
            <html:text property="userid"/> 
            <tr><td bordercolor='white'><font color='yellow' size='+1'>Password:<td COLSPAN='2'>
            <html:password property="password"/> 
            <tr><td bordercolor='white'><font color='yellow' size='+1'>Role:<td bordercolor='white'>
            <html:radio property="r1" value="admin"><font color='yellow' size='+1'>Administrator</html:radio>
            <td bordercolor='white'>
            <html:radio property="r1" value="Customer"><font color='yellow' size='+1'>Customer</html:radio>
            <tr><td bordercolor='white'></br> 
            <tr><td bordercolor='white'><input type='Submit'value='Submit'> 
                <td bordercolor='white'><input type='Reset'text='Reset'> 
        </table>
    </html:form> 
</body> 
<jsp:include page="Footer.jsp"></jsp:include> 
</html>