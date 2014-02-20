<?xml version="1.0" encoding="UTF-8" ?>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container">
    <div class="row">
        <div class="col-lg-12">
            <h1>Lista przesyłek</h1>
            <table class="table table-hover table-stripped">
                <thead>
                <tr>
                    <th>Id</th>
                    <th>Odbiorca</th>
                    <th>Adres</th>
                    <th></th>
                </tr>
                </thead>
                <c:forEach var="shipment" items="${shipmentList}">
                    <tr>
                        <td>${shipment.id}</td>
                        <td>${shipment.recipient}</td>
                        <td>
                            <c:if test="${shipment.address!=null}">
                                ${shipment.address.street}, ${shipment.address.house}
                                <c:if test="${not empty shipment.address.flat}"> m. ${shipment.address.flat}</c:if>
                                , ${shipment.address.postcode} ${shipment.address.city}
                            </c:if>
                        </td>
                        <td>
                            <a href="create" class="btn btn-info"><i class="fa fa-edit"></i> Edytuj</a>
                            <a href="create" class="btn btn-danger"><i class="fa fa-times fa-"></i> Usuń</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</div>