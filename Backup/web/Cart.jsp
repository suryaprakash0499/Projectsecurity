<%-- 
    Document   : Cart
    Created on : 17 May, 2020, 5:04:20 PM
    Author     : Surya0499
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head> 
        <title>Cart Page</title> 
    </head> 
   <body style="background: url(https://htmlcolorcodes.com/assets/images/html-color-codes-color-tutorials-hero-00e10b1f.jpg);background-size: 100%; no-repeat"> 
    <jsp:include page="Template.jsp"></jsp:include> 
    <td valign="top" rowspan="200"colspan="80"> 
        <table> 
            <tr>
<td><font color='darkblue' size='+1'><a style="color:yellow" href='<%out.println(response.encodeURL("ConstructionPage.jsp").toString());%>'>Motorola</a></td> 
            <td><font color='darkblue' size='+1'><a style="color:yellow" href='<%out.println(response.encodeURL("ConstructionPage.jsp").toString());%>'>Xiaomi</a></td> 
            <td><font color='darkblue' size='+1'><a style="color:yellow" href='<%out.println(response.encodeURL("ConstructionPage.jsp").toString());%>'>Realme</a></td> 
            <td><font color='darkblue' size='+1'><a style="color:yellow" href='<%out.println(response.encodeURL("ConstructionPage.jsp").toString());%>'>OnePlus</a></td>
            <td><font color='darkblue'size='+1'><a style="color:yellow" href='<%out.println(response.encodeURL("Google.jsp").toString());%>'>Google</a></td>
            <td><font color='darkblue' size='+1'><a style="color:yellow" href='<%out.println(response.encodeURL("PlaceOrder.jsp").toString()) ;%>'>Place Order</a></td>
        </tr> 
    </table> 
            <br>
            <table cellspacing='10' align='center'>
            <tr><td bordercolor='white'>
                <font align='center' color='Yellow' size='+3'>Your Order: </font> 
            <br/> 
            <br/> 
            <br/> 
            <table cellspacing='10' align='center'>
                <tr><B><td bordercolor='white'><font align='center' color='Yellow' size="+2">Model:<td COLSPAN='2'bordercolor='white'><font align='center' color='white' size="+2"><%out.println(session.getAttribute("selDevice").toString()); %></B> 
                <tr><B><td bordercolor='white'><font align='center' color='Yellow' size="+2">Storage:<td COLSPAN='2' bordercolor='white'><font align='center' color='white' size="+2"><%out.println(session.getAttribute("selStorage").toString());%></B>
                <tr><B><td bordercolor='white'><font align='center' color='Yellow' size="+2">Total number Devices Purchased:<td bordercolor='white'><font align='center' color='white' size="+2"><%out.println(session.getAttribute("numDevice").toString());%></B> 
                <tr><B><td bordercolor='white'><font align='center' color='Yellow' size="+2">Mode of Payment:<td bordercolor='white'><font align='center' color='white' size="+2">  <%out.println(session.getAttribute("selPayment").toString());%></B> </table> 
            </table>
                </body>
    
    <jsp:include page="Footer.jsp"></jsp:include> 
</html>
