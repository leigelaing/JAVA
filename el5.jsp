<%--
  Created by IntelliJ IDEA.
  User: leigeliang
  Date: 2021/5/22
  Time: 20:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el隐式对象</title>
</head>
<body>

 ${pageContext.request}
 <h4>在jsp目录动态获取虚拟目录</h4>
 ${pageContext.request.contextPath}
  <%
    response.sendRedirect(request.getContextPath()+"");
  %>
</body>
</html>
