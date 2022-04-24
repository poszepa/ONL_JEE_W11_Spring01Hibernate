<%--
  Created by IntelliJ IDEA.
  User: koszkuld
  Date: 24/04/2022
  Time: 11:24
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

    <form method="post" action="person">
        Login: <input type="text" name="login"> </br>
        Email: <input type="email" name="email"> </br>
        Password: <input type="password" name="password"> </br>
        <input type="submit">
    </form>

</body>
</html>
