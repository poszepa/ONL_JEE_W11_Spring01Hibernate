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
<form:form method="POST" action="/publishers/edit" modelAttribute="publisher">
    <form:hidden path="id" value="${publisher.id}"></form:hidden>
    Title: <form:input path="name" value="${publisher.name}"/>
    <form:errors path="name"></form:errors></br>
    NIP: <form:input path="nip" value="${publisher.nip}"/>
    <form:errors path="nip"></form:errors></br>
    REGON : <form:input path="regon" value="${publisher.regon}"/>
    <form:errors path="regon"></form:errors></br>
    <input type="submit">
</form:form>
</body>
</html>