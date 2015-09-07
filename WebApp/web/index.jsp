<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2015/9/4
  Time: 0:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Accept-Charset" charset="UTF-8">
    <meta http-equiv="Cache-Control" content="no-cache">
    <meta http-equiv="content-type" content="text/html;charset=utf-8">
    <meta http-equiv="content-type" content="text/html;charset=utf-8">
    <title>First WebApp</title>
</head>
<body>
<h1>hello world!</h1>

<form action="LoginServlet" method="post">
    <%--<button type="submit" value="确认" name="确认"></button>--%>
    <input type="submit" value="登陆">
</form>
<a href="CountServlet">进入访问的页面</a><br/>
<a href="ClassServlet">进入访问ClassServlet的页面</a><br/>
<a href="stateCode">进入访问StateCodeServlet的页面</a><br/>
<a href="s1">进入访问StateCodeServlet的页面</a><br/>
<a href="s2">进入访问StateCodeServlet的页面</a><br/>
<a href="t1">进入访问test的页面</a><br/>
<a href="t2">进入访问test的页面</a><br/>
<a href="t3">进入访问test的页面</a><br/>
<a href="t4">进入访问test的页面</a><br/>
</body>
</html>
