<%--
  Created by IntelliJ IDEA.
  User: phamlinh
  Date: 30/9/24
  Time: 07:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SIGN IN</title>
</head>
<body>
<h2>SIGN IN</h2>
<form action="<%=request.getContextPath()%>/sign-in" method="post">
  <input type="text" placeholder="username" name="user-name">
  <input type="text" placeholder="password" name="password">
  <input type="submit" value="SUBMIT">
</form>
<p style="color:red;">
    <%= request.getAttribute("errorMessage") != null ? request.getAttribute("errorMessage") : "" %>
</p>
</body>
</html>
