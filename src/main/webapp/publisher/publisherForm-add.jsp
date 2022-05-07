<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form method="POST" action="/publishers/add" modelAttribute="publisher">
    Title: <form:input path="name"/>
    <form:errors path="name"></form:errors></br>
    NIP: <form:input path="nip"/>
    <form:errors path="nip"></form:errors></br>
    REGON : <form:input path="regon"/>
    <form:errors path="regon"></form:errors></br>
    <input type="submit">
</form:form>
</body>
</html>