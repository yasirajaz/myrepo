<%-- 
    Document   : sessdemo2
    Created on : 1 Sept 2026, 11:58:21 pm
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
        <%
            String s=session.getAttribute("name").toString();
            out.println(s);
        %>
    </body>
</html>
