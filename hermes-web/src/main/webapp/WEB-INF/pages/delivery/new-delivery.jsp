<?xml version="1.0" encoding="UTF-8" ?>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>HERMES - Nowa przesyłka</title>
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
    <script type="text/javascript">
        $( document ).ready( function () {
            $( '#newDeliveryForm' ).submit( function ( event){
                var recipient = $('#recipient' ).val();
                var street = $('#street').val();
                var house = $('#house').val();
                var flat = $('#flat').val();
                var postcode = $('#postcode').val();
                var city = $('#city').val();
                var country = $('#country').val();

                var json = {recipient:recipient,
                            recipientAddress:{
                                street:street,
                                house:house,
                                flat:flat,
                                postcode:postcode,
                                city:city,
                                country:country
                            }};

                $.ajax({
                    url: $('#newDeliveryForm' ).attr("action"),
                    data: JSON.stringify(json),
                    type: "POST",
                    beforeSend: function(xhr){
                        xhr.setRequestHeader("Accept","application/json");
                        xhr.setRequestHeader("Content-Type", "application/json");
                    },
                    success: function(id){
                        var responseContent = "";
                        responseContent += "<span class='success'>Utworzono przesyłkę o numerze ID: [";
                        responseContent += id;
                        responseContent += "]</span>";

                        $('#newDeliveryResponse' ).html(responseContent);
                    }
                });
                event.preventDefault();
            });
        } );

    </script>
</head>
<body>
<div id="container">
    <div id="newDeliveryResponse"></div>

    <h1>Nowa przesyłka</h1>

    <p>Wpisz poniżej dane adresata przesyłki</p>

    <form:form id="newDeliveryForm" action="${pageContext.request.contextPath}/delivery/create.json">
        <table>
            <tr>
                <td>Nazwa:</td>
                <td><input id="recipient"/></td>
            </tr>
            <tr>
                <td>Ulica:</td>
                <td><input id="street"/></td>
            </tr>
            <tr>
                <td>Numer domu:</td>
                <td><input id="house"/></td>
            </tr>
            <tr>
                <td>Numer mieszkania:</td>
                <td><input id="flat"/></td>
            </tr>
            <tr>
                <td>Kod pocztowy:</td>
                <td><input id="postcode"/></td>
            </tr>
            <tr>
                <td>Miejscowość:</td>
                <td><input id="city"/></td>
            </tr>
            <tr>
                <td>Kraj:</td>
                <td><input id="country"/></td>
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