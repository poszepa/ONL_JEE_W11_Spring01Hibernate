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
    <c:forEach items="${errors}" var="error">
            <h1>${error.getPropertyPath()} : ${error.getMessage()}</h1><br>
    </c:forEach>
</body>
</html>