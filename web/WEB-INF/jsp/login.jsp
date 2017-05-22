<%-- 
    Document   : login
    Created on : 26/03/2017, 19:52:14
    Author     : Felipe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login Page</h1>
        ${ola}
        <form:form method="post" commandName="loginUser">
            Username <form:input path="userName"/> <br>
            Senha <form:password path="password"/>
            <input type="submit" value="login"/>
            <a href="registration.htm">Register</a>
            
        </form:form>
    </body>
</html>
