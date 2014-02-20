<?xml version="1.0" encoding="UTF-8" ?>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <link media="screen" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css"
          type="text/css"/>
    <link media="screen" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/font-awesome.css"
          type="text/css"/>
    <link media="screen" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/metronic.css"
          type="text/css"/>
    <link media="screen" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css"
          type="text/css"/>
    <link media="screen" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/login.css"
          type="text/css"/>

    <script src="${pageContext.request.contextPath}/resources/js/jquery-1.10.2.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/script.js"></script>
    <title>HERMES - Strona logowania</title>
    <script type="text/javascript">
        function getParameters() {
            var searchString = window.location.search.substring(1)
                    , params = searchString.split("&")
                    , hash = {};
            for (var i = 0; i < params.length; i++) {
                var val = params[i].split("=");
                hash[decodeURI(val[0])] = decodeURI(val[1]);
            }
            return hash;
        }

        function setMessage() {
            var hash = getParameters();
            if (hash["failure"] == 'true') {
                $('#failure').removeClass('hide');
                console.log("something");
            }
        }
    </script>
</head>
<body class="login" onLoad="setMessage()">
<div class="logo">
    <div>HERMES</div>
</div>
<div class="content">
    <form name='f' action="j_spring_security_check" method='POST'>
        <h3 class="form-title">Zaloguj się</h3>

        <div id="failure" class="alert alert-danger fade in hide">
            <button class="close" data-dismiss="alert">
                <i class="fa fa-times"></i>
            </button>
            <span>Nieprawidłowy login lub hasło</span>
        </div>
        <div class="form-group">
            <div class="input-icon">
                <i class="fa fa-user"></i>
                <input id="j_username" name='j_username' class="form-control" type="text" placeholder="Login"/>
            </div>
        </div>
        <div class="form-group">
            <div class="input-icon">
                <i class="fa fa-lock"></i>
                <input id="j_password" name='j_password' class="form-control" type="password" placeholder="Hasło"/>
            </div>
        </div>
        <div class="form-actions">
            <button class="btn green pull-right" type="submit">
                Zaloguj
                <i class="fa fa-arrow-circle-right marginLeft5"></i>
            </button>
        </div>
        <div class="clearfix"></div>
    </form>
</div>
<div class="copyright">
    <div>2013 &copy; Turski Adam</div>
</div>

</body>
</html>