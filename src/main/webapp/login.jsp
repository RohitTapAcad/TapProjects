<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
    <form:form action="logincontroller" modelAttribute="emp">
        Name: <form:input type="text" path="name"/> <br/>
        Password: <form:input path="password"/> <br/>
        Email: <form:input type="text" path="email"/> <br/>
        <input type="submit"/>
    </form:form>
</body>
</html>
