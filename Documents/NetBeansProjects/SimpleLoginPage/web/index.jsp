<%-- 
    Document   : index
    Created on : 26.Ara.2017, 04:12:23
    Author     : Yavuz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login Page</title>
</head>
<body><br><br><br>
    <center><h1>Login</h1></center>
    <br><br>
    <form action="Controller" method="POST">  
        <table align="center">
            <tr>
                <th align="right">UserName</th>
                <td><input type="text" name="txtUserName" placeholder="UserName"></td>
            </tr>
             <tr>
                <th align="right">Password</th>
                <td><input type="password" name="txtPassword" placeholder="Password"></td>
            </tr>
            <tr>
                <td colspan="2" align="right"><input type="submit" value="LOGIN" class="btn btn-primary"></td>
            </tr>
        </table>
    </form>
</body>
</html>
