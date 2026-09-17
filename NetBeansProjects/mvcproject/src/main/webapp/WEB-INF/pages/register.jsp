<%-- 
    Document   : register
    Created on : 16 Sept 2026, 7:55:06 am
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
        <h1>Register User</h1>
    <form action="${pageContext.request.contextPath}/fc/models/Register" method="post">

    <table>
        <tr>
            <td>Email:</td>
            <td><input type="email" name="email"></td>
        </tr>

        <tr>
            <td>Password:</td>
            <td><input type="password" name="password"></td>
        </tr>

        <tr>
            <td>First Name:</td>
            <td><input type="text" name="firstname"></td>
        </tr>

        <tr>
            <td>Last Name:</td>
            <td><input type="text" name="lastname"></td>
        </tr>
        

        <tr>
            <td>DOB:</td>
            <td><input type="date" name="dob"></td>
        </tr>
        <tr>
            <td>Gender:</td>
            <td>
                <input type="radio" name="gender" value="Male"> Male
                <input type="radio" name="gender" value="Female"> Female
            </td>
        </tr>
        

        <tr>
            <td></td>
            <td>
                <input type="submit" value="Register">
            </td>
        </tr>
    </table>

    </form>
    </body>
    
</html>
