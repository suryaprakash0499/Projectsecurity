<%-- 
    Document   : TourPackage
    Created on : 17 May, 2020, 5:03:40 PM
    Author     : Surya0499
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head> 
        <title>Order Page</title> 
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
            <td><font color='darkblue' size='+1'><a style="color:yellow" href='<%out.println(response.encodeURL("PlaceOrder.jsp").toString()) ;%>'>Place Order</a></td> </tr> </table> <br> 
        </table> <br> 
        <table cellspacing='10' align='center'> <tr> 
        <td bordercolor='white'>
        <font align='center' color='white' size='+1'>Please select the Device you want to purchase <br>
        <br>
        <form action='<%out.println(response.encodeURL("SessionServlet").toString() );%>' name='MyForm' Method='POST'>
        </tr>
                <td bordercolor='white'><font color='yellow'> Select your Model: 
                    </font></td> <td>
                        <select name='Device'> 
                        <option value='Pixel'>Pixel</option> 
                        <option value='Pixel 2'>Pixel 2</option>
                        <option value='Pixel 3'>Pixel 3</option> 
                        <option value='Pixel 4'>Pixel 4</option> 
                    </select> <input type='hidden' value='Device' name='PageName'/> 
                </td> </tr> 
            <tr> <td bordercolor='white'> <input type='submit' Value='Next'></input></a> 
                </td>
            </tr> 
        </table> 
    </form> 
    </body> 
    <jsp:include page="Footer.jsp"></jsp:include> 
</html>
