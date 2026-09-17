<%-- 
    Document   : sessdemo1
    Created on : 1 Sept 2026, 11:57:16 pm
    Author     : ubuntu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="false" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            session.setAttribute("name","zaid"); 
        %>
    </body>
</html>
