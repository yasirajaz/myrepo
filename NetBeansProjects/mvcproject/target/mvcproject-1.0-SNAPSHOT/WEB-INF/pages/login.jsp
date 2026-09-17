<%-- 
    Document   : login
    Created on : 16 Sept 2026, 10:56:46 pm
    Author     : ubuntu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login Page</h1>
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
            <td></td>
            <td>
                <input type="submit" value="Login">
            </td>
        </tr>
    </table>
    </body>
</html>
