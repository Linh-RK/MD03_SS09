<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Calculate" %>
</h1>
<br/>
<form action="<%=request.getContextPath()%>/display-discount" method="post">
    <p>Product Description: </p>
    <input type="text" name="description"><br>
    <p>Price:</p>
    <input type="text" name="price"><br>
    <p>Discount Percent:</p>
    <input type="text" name="discount"><br>
    <input type="submit" value="Calculate Discount"><br>
</form>
</body>
</html>