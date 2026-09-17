<%-- 
    Document   : index
    Created on : 16 Sept 2026, 7:49:51 am
    Author     : ubuntu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <h2>Welcome</h2>

        <a href="register">
        Sign Up
        </a>

        <br><br>

        <a href="${pageContext.request.contextPath}/fc/view/login">
        Sign In
        </a>
    </body>
</html>
