<%@ page import="java.util.ArrayList" %>
<%@ page import="edu.wdu.pojo.Subject" %><%--
  Created by IntelliJ IDEA.
  User: 19833
  Date: 2022/4/12
  Time: 19:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增学生页</title>
</head>
<body>
<%
  ArrayList<Subject> subjects = (ArrayList<Subject>) session.getAttribute("subjects");
  StringBuilder s = new StringBuilder();
  if(subjects != null){
    for(Subject n : subjects){
      s.append(
              "<option value='"+n.getId()+"'>"+n.getName()+"</option>"
      );
    }
  }
%>
<form action="addStudent" method="post">
  姓名:<input type="text" name="name"><br>
  性别:
  <select name="gender">
    <option value='0'>请选择性别</option>
    <option value='男'>男</option>
    <option value='女'>女</option>
  </select><br>
  课程:
  <select name="subject">
    <option value='0'>请选择课程</option>
    <%=s.toString()%>
  </select><br>
  <input type="submit" value="新增">
</form>
</body>
</html>
