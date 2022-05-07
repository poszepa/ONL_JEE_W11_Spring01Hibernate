<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Editjsp</title>
</head>
<body>

<form:form method="POST" action="/bookForm/edit" modelAttribute="book">
    <form:hidden path="id" value="${book.id}"></form:hidden>
    Title: <form:input path="title" value="${book.title}"/>
    <form:errors path="title"></form:errors></br>
    Rating: <form:input path="rating" value="${book.rating}"/>
    <form:errors path="rating"></form:errors></br>
    Description: <form:input path="description" value="${book.description}"/>
    <form:errors path="description"></form:errors></br>

    Publishers:
    <form:select path="publisher.id" itemValue="id"
                 itemLabel="name" items="${publishers}"/>
    <form:errors path="publisher.id"></form:errors></br>

    <form:select path="authors" itemValue="id"
                 itemLabel="fullName" items="${authors}"/>
    <form:errors path="authors"></form:errors></br>

    Pages: <form:input path="pages" value="${book.pages}"/>
    <form:errors path="pages"></form:errors></br>
    <input type="submit">
</form:form>

</body>
</html>