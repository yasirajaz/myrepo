<%-- 
    Document   : mypage
    Created on : 1 Sept 2026, 11:49:42 pm
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
        <%--<%
            String s=request.getParameter("name");
            out.print("<h1>"+s+"</h1>");
        %>--%>
        <%= config.getInitParameter("city") %>
                
    </body>
</html>
