<%--
  Created by IntelliJ IDEA.
  User: PV
  Date: 08/09/2022
  Time: 4:01 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/usd">
    <label>VND: </label>
    <input type="text" name="rate" placeholder="Rate" value="22000"><br>
    <label>USD: </label>
    <input type="text" name="usd" placeholder="USD" value="0"><br>
    <input type="submit" id="submit" value="Converter">
    <p>Réult</p>
    <p>${result}</p>
</form>



</body>
</html>
