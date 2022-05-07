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
        <c:forEach items="${publishers}" var="publisher">
            ${publisher.id} ${publisher.name} ${publisher.nip} ${publisher.regon} <br>
        </c:forEach>
</body>
</html>