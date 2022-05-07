<%--
  Created by IntelliJ IDEA.
  User: koszkuld
  Date: 24/04/2022
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

    <form:form method="POST" action="/bookForm/add" modelAttribute="book">
        Title: <form:input path="title"/>
            <form:errors path="title"></form:errors></br>
        Rating: <form:input path="rating"/>
            <form:errors path="rating"></form:errors></br>
        Description: <form:input path="description"/>
            <form:errors path="description"></form:errors></br>

        Publishers:
        <form:select path="publisher.id" itemValue="id"
                     itemLabel="name" items="${publishers}"/>
            <form:errors path="publisher.id"></form:errors></br>

        <form:select path="authors" itemValue="id"
                     itemLabel="fullName" items="${authors}"/>
            <form:errors path="authors"></form:errors></br>

        Pages: <form:input path="pages"/>
        <form:errors path="pages"></form:errors></br>
        <input type="submit">
    </form:form>

</body>
</html>
