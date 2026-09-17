o<%-- 
    Document   : A.jsp
    Created on : 28 Aug 2026, 8:59:25 am
    Author     : ubuntu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%@include file="header.jspf" %>
        <%@include file="left.jspf" %>
        <h2> response of A.jsp </h2><!-- comment -->
        <%@include file="bottom.jspf" %>
    </body>
</html>
