<?xml version="1.0" encoding="UTF-8" ?>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<div id="content">
    <h1>Strona startowa</h1>

    <p>
        <a href="${pageContext.request.contextPath}/shipment/create.htm">Nowa przesyłka</a><br/>
        <a href="${pageContext.request.contextPath}/shipment.htm">Przesyłki</a><br/>
    </p>
</div>