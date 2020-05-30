<%-- 
    Document   : WelcomeAdminPage
    Created on : 17 May, 2020, 5:02:33 PM
    Author     : Surya0499
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head> 
        <title>Admin Page</title>
    </head> 
   <body style="background: url(https://htmlcolorcodes.com/assets/images/html-color-codes-color-tutorials-hero-00e10b1f.jpg);background-size: 100%; no-repeat"> 
    <jsp:include page="Template.jsp"></jsp:include>
    <td valign="top" rowspan="200"colspan="80"> 
        <table> 
             
            <td><font color='darkblue'size='+1'><a style="color:yellow"  href='<%out.println(response.encodeURL("ConstructionPage.jsp").toString());%>'>Motorola</a></td> 
            <td><font color='darkblue'size='+1'><a style="color:yellow" href='<%out.println(response.encodeURL("ConstructionPage.jsp").toString());%>'>Xiaomi</a></td> 
            <td><font color='darkblue'size='+1'><a style="color:yellow" href='<%out.println(response.encodeURL("ConstructionPage.jsp").toString());%>'>Realme</a></td>
            <td><font color='darkblue'size='+1'><a style="color:yellow" href='<%out.println(response.encodeURL("ConstructionPage.jsp").toString());%>'>Oneplus</a></td>
            <td><B><font color='darkblue'size='+2'><a style="color:greenyellow" href='<%out.println(response.encodeURL("Google.jsp").toString()) ;%>'>Google</a></td></B> 
            <td><B><font color='darkblue'size='+2'><a style="color:greenyellow" href='<%out.println(response.encodeURL("PlaceOrder.jsp").toString()) ;%>'>Place Order</a></td></B> 
            <td><B><font color='darkblue'size='+2'><a style="color:greenyellow" href='<%out.println(response.encodeURL("GetLogDetails.jsp").toString( ));%>'>Get Log Details</a></td></B> 
        </tr> 
        <tr> 
            <td><br></br> 
        <tr> 
            <td rowspan="200"colspan="80"> 
        <font color='darkblue' size='+2'>Welcome to the Website!! </table> 
    </body> 
    <table cellspacing='85' align='center'border='0' bordercolor='black'>
             <tr>
    <jsp:include page="Footer.jsp"></jsp:include> 
</html>
