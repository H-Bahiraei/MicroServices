<%--
  Created by IntelliJ IDEA.
  User: h-bahiraei
  Date: 10/24/2022
  Time: 8:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hi Spring</title>
</head>
<body>

<form action="addAlien">
    <input type="text" name="aid">
    <input type="text" name="aname">
    <input type="text" name="tech">
    <input type="submit"><br>
</form>

<form action="getAlien">
    <input type="text" name="aid"> <br>
    <input type="submit"><br>
</form>
<form action="getAlienByTech">
    <input type="text" name="tech"> <br>
    <input type="submit"><br>
</form>

</body>
</html>
