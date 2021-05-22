<%--
  Created by IntelliJ IDEA.
  User: leigeliang
  Date: 2021/5/22
  Time: 18:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el获取域中的数据</title>
</head>
<body>
<%
   //在域中存储数据
    request.setAttribute("name","门一博");
    session.setAttribute("age","23");
    session.setAttribute("name","李四");
%>
<h3>e获取值</h3>
${requestScope.name}
${sessionScope.age}
${sessionScope.haha}
${sessionScope.name}
</body>
</html>
