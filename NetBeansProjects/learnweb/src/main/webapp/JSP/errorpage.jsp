<%-- 
    Document   : errorpage
    Created on : 3 Sept 2026, 6:56:07 am
    Author     : ubuntu
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<%@page errorPage="myerrorpage.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            List<String> list=null;
            list.add("lucknow");
        %>
    </body>
</html>
