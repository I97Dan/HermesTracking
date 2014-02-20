<?xml version="1.0" encoding="UTF-8" ?>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<nav class="header navbar navbar-default navbar-fixed-top" role="navigation">
    <a class="navbar-brand" href="#">HERMES</a>
    <ul class="nav navbar-nav">
        <li>
            <a href="${pageContext.request.contextPath}/shipment/list">Lista przesyłek</a>
        </li>
        <li>
            <a href="${pageContext.request.contextPath}/shipment/create">Rejestruj przesyłkę</a>
        </li>
        <li>
            <a href="${pageContext.request.contextPath}/shipment/check">Sprawdź przesyłkę</a>
        </li>
    </ul>
</nav>
