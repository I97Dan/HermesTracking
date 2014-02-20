<?xml version="1.0" encoding="UTF-8" ?>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <title><tiles:insertAttribute name="title"/></title>
    <link media="screen" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css"
          type="text/css"/>
    <link media="screen" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/font-awesome.css"
          type="text/css"/>
    <link media="screen" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/metronic.css"
          type="text/css"/>
    <link media="screen" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css"
          type="text/css"/>
    <script type="text/javascript">
        var contextPath = "<%=request.getContextPath()%>";
    </script>
    <script src="${pageContext.request.contextPath}/resources/js/jquery-1.10.2.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/resources/js/script.js" type="text/javascript"></script>
</head>
<body>
<div>
    <tiles:insertAttribute name="header"/>
    <div class="content">
        <tiles:insertAttribute name="content"/>
    </div>
    <div class="footer">
        <tiles:insertAttribute name="footer"/>
    </div>
</div>
</body>
</html>
