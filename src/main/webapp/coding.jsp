<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2><%= request.getAttribute("codingTitle")%></h2>
    <h3>${requestScope.codingTitle}</h3>
</body>
</html>
