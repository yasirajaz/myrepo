<%-- 
    Document   : coredemo
    Created on : 4 Sept 2026, 2:40:46 pm
    Author     : ubuntu
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <c:set var="name" scope="session" value="mohan lal"/>
        <c:remove var="name" scope="session"/> <%--  this will remove set --%>
        <c:out value="${sessionScope.name}" /><br>
        <c:out value="this is my page"/>
        
        <%-- for other directory we have to write absolute path htt://localhost....
        <c:redirect url="/myerrorpage.jsp" />   --%>
        
        <c:set var="age" scope="request" value="12" />
        <c:if test="${requestScope.age eq 30}" >
            <h1> test correct</h1>
        </c:if>
            
        <c:choose>
            <c:when test="${requestScope.age eq 18}" >
                <h2> can not vote</h2>
            </c:when>
            <c:when test="${requestScope.age gt 18}" >
                <h2> can vote</h2>
            </c:when>
            <c:otherwise >
                <h2> no result</h2>
            </c:otherwise>
        </c:choose>
    </body>
</html>
