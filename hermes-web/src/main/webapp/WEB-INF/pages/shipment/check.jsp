<?xml version="1.0" encoding="UTF-8" ?>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container">
    <div class="row">
        <div class="col-lg-12">
            <h1>Śledzenie przesyłki</h1>

            <p>Wpisz poniżej numer przesyłki</p>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-6">
            <form id="checkShipmentForm" action="${pageContext.request.contextPath}/shipment/check.json" method="post">
                <div class="form-group">
                    <label for="shipmentId">Numer przesyłki</label>
                    <input id="shipmentId" type="text" class="form-control" placeholder="Numer przesyłki"/>
                </div>
                <button type="submit" class="btn btn-primary">Sprawdź</button>
            </form>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-12">
            <div id="checkShipmentResponse"></div>
        </div>
    </div>
</div>
