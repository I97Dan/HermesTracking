<?xml version="1.0" encoding="UTF-8" ?>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>HERMES - Śledzenie przesyłki</title>
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
    <script type="text/javascript">
        $( document ).ready( function ()
                             {
                                 $( '#checkShipmentForm' ).submit( function ( event )
                                                                   {
                                                                       var shipmentId = $( '#shipmentId' ).val();

                                                                       var json = { shipmentId: shipmentId };

                                                                       $.ajax( {
                                                                                   url: $( '#checkShipmentForm' ).attr( "action" ),
                                                                                   data: JSON.stringify( json ),
                                                                                   type: "POST",
                                                                                   beforeSend: function ( xhr )
                                                                                   {
                                                                                       xhr.setRequestHeader( "Accept", "application/json" );
                                                                                       xhr.setRequestHeader( "Content-Type", "application/json" );
                                                                                   },
                                                                                   success: function ( shipment )
                                                                                   {
                                                                                       var responseContent = "";
                                                                                       responseContent += "<span class='success'>[";
                                                                                       /*responseContent += shipment;*/
                                                                                       responseContent += "]</span>";

                                                                                       $( '#checkShipmentResponse' ).html( responseContent );
                                                                                   }
                                                                               } );
                                                                       event.preventDefault();
                                                                   } );
                             } );

    </script>
</head>
<body>
<div id="container">
    <div id="checkShipmentResponse"></div>

    <h1>Śledzenie przesyłki</h1>

    <p>Wpisz poniżej numer przesyłki</p>

    <form:form id="checkShipmentForm" action="${pageContext.request.contextPath}/shipment/check.json">
        <table>
            <tr>
                <td>Numer przesyłki:</td>
                <td><input id="shipmentId"/></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Utwórz"/></td>
            </tr>
        </table>
    </form:form>
</div>

</body>
</html>