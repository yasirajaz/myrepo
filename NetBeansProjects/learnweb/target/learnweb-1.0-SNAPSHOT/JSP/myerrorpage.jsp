<%-- 
    Document   : myerrorpage
    Created on : 3 Sept 2026, 6:58:52 am
    Author     : ubuntu
extends changes the extends of servlet when translation takes place,right click on file then servlet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<%@page extends="jakarta.servlet.http.HttpServlet" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>This shows the error page via isErrorPage and errorPage</h2>
    </body>
</html>
