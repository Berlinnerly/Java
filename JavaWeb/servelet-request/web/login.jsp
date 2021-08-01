<%--
  Created by IntelliJ IDEA.
  User: Berlin
  Date: 2021/1/3
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="ser07">
    姓名：<input type="text" name="username"> <span id="msg"><%=request.getAttribute("msg")%></span>
    <br>
    <button>登录</button>

</form>
</body>
</html>
