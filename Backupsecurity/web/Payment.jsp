<%-- 
    Document   : Flights
    Created on : 17 May, 2020, 5:04:06 PM
    Author     : Surya0499
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head> 
        <title>Flights Page</title> 
    </head> 
    <body style="background: url(https://htmlcolorcodes.com/assets/images/html-color-codes-color-tutorials-hero-00e10b1f.jpg);background-size: 100%; no-repeat"> 
    <jsp:include page="Template.jsp"></jsp:include> 
    <td valign="top" rowspan="200"colspan="80"> 
        <table>
            <tr>
            <tr> 
            <td><font color='darkblue' size='+1'><a style="color:yellow" href='<%out.println(response.encodeURL("ConstructionPage.jsp").toString());%>'>Motorola</a></td> 
            <td><font color='darkblue' size='+1'><a style="color:yellow" href='<%out.println(response.encodeURL("ConstructionPage.jsp").toString());%>'>Xiaomi</a></td> 
            <td><font color='darkblue' size='+1'><a style="color:yellow" href='<%out.println(response.encodeURL("ConstructionPage.jsp").toString());%>'>Realme</a></td> 
            <td><font color='darkblue' size='+1'><a style="color:yellow" href='<%out.println(response.encodeURL("ConstructionPage.jsp").toString());%>'>OnePlus</a></td>
            <td><font color='darkblue'size='+1'><a style="color:yellow" href='<%out.println(response.encodeURL("Google.jsp").toString());%>'>Google</a></td>
            <td><font color='darkblue' size='+1'><a style="color:yellow" href='<%out.println(response.encodeURL("PlaceOrder.jsp").toString()) ;%>'>Place Order</a></td> </tr> </table> <br> 
        </tr> 
    </table> 
            <br>
            <table cellspacing='10' align='center'> 
                    <tr>
            <td bordercolor='white'><font align='center' color='yellow' >Please select your Mode of Payment <br> 
            <br> 
            </tr>
            <form action='<%out.println(response.encodeURL("SessionServlet").toString() );%>' name='MyForm' Method='POST'>  
                <tr>        
                <td bordercolor='white'><font color='yellow'> Select mode of payment: </font></td> 
                        <td bordercolor='white'> <select name='Paymentmeth'> 
                                <option value='Card'>Card</option> 
                                <option value='NetBanking'>NetBanking</option> 
                                <option value='UPI'>UPI</option> 
                                <option value='CashOnDeliver'>CashOnDeliver</option>
                            </select> 
                            <input type='hidden' value='Payment' name='PageName'/> 
                        </td> 
                    </tr>
                    <tr> 
                        <td bordercolor='white' align="center"><input type='submit' Value='Next'></input></a> 
                        </td> 
                    </tr> 
                </table>
            </form>
    </body> 
    <jsp:include page="Footer.jsp"></jsp:include> 
</html>
