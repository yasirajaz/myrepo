<%-- 
    Document   : attributedemo
    Created on : 2 Sept 2026, 7:20:43 am
    Author     : ubuntu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page info="this is my first page" %>
<%@page import="java.util.ArrayList,java.util.HashMap" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%--<%= getServletInfo() %>--%>
        <%  ArrayList<String> list=new ArrayList<>();
            list.add("lucknow");
            list.add("kanpur");
            for(String s:list){
                out.println("<h1>"+s+"</h1>");
            }
        %>
    </body>
</html>
