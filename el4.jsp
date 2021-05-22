
<%@ page import="CookieDemo523.User" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%--
  Created by IntelliJ IDEA.
  User: leigeliang
  Date: 2021/5/22
  Time: 18:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el获取值</title>
</head>
<body>
<%
    User user = new User();
    user.setName("雷葛亮");
    user.setAge(23);
    Map map = new HashMap();
    map.put("a","A");
    map.put("b","B");
    map.put("c","C");
    map.put("user",user);
    request.setAttribute("map",map);
%>
<h3>el获取Map集合</h3>
${requestScope.map.a}<br>
${requestScope.map["a"]}<br>
${requestScope.map.user.name}<br>
${requestScope.map.user.age}<br>


<h4>empty运算符</h4>
<%
    String str = "a";
    request.setAttribute("str",str);
%>
${not empty str}

</body>
</html>
