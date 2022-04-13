<%@ page import="edu.wdu.pojo.Subject" %><%--
  Created by IntelliJ IDEA.
  User: 19833
  Date: 2022/4/12
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>课程修改页</title>
</head>
<body>
<%
    Subject subject = (Subject)session.getAttribute("subject");
%>
<form action="updateSubject" method="post">
    <input type="hidden" name="id" value="<%=subject.getId()%>">
    名称:<input type="text" name="name" value="<%=subject.getName()%>"><br>
    学分:<input type="text" name="credit" value="<%=subject.getCredit()%>"><br>
    <input type="submit" name="修改">
</form>
</body>
</html>
