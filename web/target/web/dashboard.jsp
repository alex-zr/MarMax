<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    Hello, user:
    <%
        String login = (String) request.getAttribute("login");
        out.println(login);
    %>
    !!
</body>
</html>
