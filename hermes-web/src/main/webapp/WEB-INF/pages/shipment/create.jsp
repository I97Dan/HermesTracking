<?xml version="1.0" encoding="UTF-8" ?>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<div class="container">
    <div class="row">
        <div class="col-lg-12">
            <div id="newShipmentResponse"></div>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-12">
            <h1>Nowa przesyłka</h1>

            <p>Wpisz poniżej dane adresata przesyłki</p>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <form id="newShipmentForm" action="${pageContext.request.contextPath}/shipment/create.json" method="post">
                <div class="form-group">
                    <label for="recipient">Nazwa:</label>
                    <input id="recipient" type="text" class="form-control" placeholder="Nazwa"/>
                </div>
                <div class="form-group">
                    <label for="street">Numer domu:</label>
                    <input id="street" type="text" class="form-control" placeholder="Ulica"/>
                </div>
                <div class="form-group">
                    <label for="house">Numer domu:</label>
                    <input id="house" type="text" class="form-control" placeholder="Numer domu"/>
                </div>
                <div class="form-group">
                    <label for="flat">Numer mieszkania:</label>
                    <input id="flat" type="text" class="form-control" placeholder="Numer mieszkania"/>
                </div>
                <div class="form-group">
                    <label for="postcode">Kod pocztowy:</label>
                    <input id="postcode" type="text" class="form-control" placeholder="Kod pocztowy"/>
                </div>
                <div class="form-group">
                    <label for="city">Miejscowość:</label>
                    <input id="city" type="text" class="form-control" placeholder="Miejscowość"/>
                </div>
                <div class="form-group">
                    <label for="country">Kraj:</label>
                    <input id="country" type="text" class="form-control" placeholder="Kraj"/>
                </div>

                <button type="submit" class="btn btn-primary">Utwóz</button>

            </form>
        </div>
    </div>
</div>
