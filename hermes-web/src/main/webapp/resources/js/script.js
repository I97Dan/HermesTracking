$(document).ready(function () {

    //Menu activation
    $('.nav.navbar-nav a[href^="' + location.pathname + '"]').parent(this).addClass('active');

    //New shipment
    $('#newShipmentForm').submit(function (event) {
        var recipient = $('#recipient').val();
        var street = $('#street').val();
        var house = $('#house').val();
        var flat = $('#flat').val();
        var postcode = $('#postcode').val();
        var city = $('#city').val();
        var country = $('#country').val();

        var json = {recipient: recipient,
            recipientAddress: {
                street: street,
                house: house,
                flat: flat,
                postcode: postcode,
                city: city,
                country: country
            }};

        $.ajax({
            url: $('#newShipmentForm').attr("action"),
            data: JSON.stringify(json),
            type: "POST",
            dataType: "json",
            beforeSend: function (xhr) {
                xhr.setRequestHeader("Accept", "application/json");
                xhr.setRequestHeader("Content-Type", "application/json");
            },
            success: function (data, status, xhr) {
                console.log('Status=' + status + "xhr=" + xhr + 'data=' + data);
                var responseContent = "";
                responseContent += "<div class='alert alert-success alert-dismissable'>Utworzono przesyłkę o numerze ID: [";
                responseContent += data;
                responseContent += "]</div>";
                $('#newShipmentResponse').html(responseContent);

            }
        });
        event.preventDefault();
    });

    //CheckShipment
    $('#checkShipmentForm').submit(function (event) {
        var shipmentId = $('#shipmentId').val();
        var json = {shipmentId: shipmentId            };

        $.ajax({
            url: $('#checkShipmentForm').attr("action"),
            data: JSON.stringify(json),
            type: "POST",
            dataType: "json",
            beforeSend: function (xhr) {
                xhr.setRequestHeader("Accept", "application/json");
                xhr.setRequestHeader("Content-Type", "application/json");
            },
            success: function (data, status, xhr) {
                console.log('Status=' + status + "xhr=" + xhr + 'data=' + data);
                var responseContent = "";
                responseContent += "<div class='alert alert-success alert-dismissable'>Dane przesyłki:";
                responseContent += "<div><span>Id: </span><span>" + data.id + "</span></div>"
                responseContent += "<div><span>Odbiorca: </span><span>" + data.recipient + "</span></div>"
                var address = '';
                if (data.address != null) {
                    var address = data.address.city + " " + data.address.house;
                    if (data.address.flat != null) {
                        address += " m. " + data.address.flat + ", ";
                    } else {
                        address += ", ";
                    }
                    address += data.address.postcode + " " + data.address.city;
                }
                responseContent += "<div><span>Adres: </span><span>" + address + "</span></div>"
                responseContent += "</div>";
                $('#checkShipmentResponse').html(responseContent);

            }
        });
        event.preventDefault();
    })
    ;


})
;
