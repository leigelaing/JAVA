<%@ page import="CookieDemo523.User" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: leigeliang
  Date: 2021/5/22
  Time: 18:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el获取数据</title>
</head>
<body>
<%
  User user = new User();
  user.setName("雷葛亮");
  user.setAge(23);
  user.setBirthday(new Date());
 request.setAttribute("u",user);
%>
<h3>el获取对象中的值</h3>
${requestScope.u}
<%--打印出来时地址值与实际需要不符
  解决办法：
      通过的是对象的属性来获取：
        * setter或getter方法，去掉set或者get，将剩余部分，首字母变为小写。
        例如：setName  -->   name
--%>
${requestScope.u.name}<br>
${requestScope.u.age}<br>
${requestScope.u.birthday.year}<br>
${u.bitStr}<br>
</body>
</html>
