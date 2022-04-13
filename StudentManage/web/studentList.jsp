<%@ page import="java.util.ArrayList" %>
<%@ page import="edu.wdu.pojo.Student" %><%--
  Created by IntelliJ IDEA.
  User: 19833
  Date: 2022/4/12
  Time: 19:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生管理页面</title>
</head>
<body>
<%
    ArrayList<Student> students = (ArrayList<Student>) session.getAttribute("students");
    StringBuilder s = new StringBuilder();
    if(students != null){
        for(Student n:students){
            s.append(
                    "<tr>" +
                            "<td>"+n.getId()+"</td>" +
                            "<td>"+n.getName()+"</td>" +
                            "<td>"+n.getSex()+"</td>" +
                            "<td>"+n.getSubject().getName()+"</td>" +
                            "<td><a href='"+"toModifyStudent?id="+n.getId()+"'>修改</a>&nbsp;&nbsp;&nbsp;<a href='"+"deletStudent?id="+n.getId()+"'>删除</a></td>" +
                    "</tr>"
            );
        }
    }
%>
<a href="index.html">首页</a>&nbsp;&nbsp;&nbsp;<a href="studentAdd.jsp">新增学生</a><br/>
<table style="width:100%;text-align:center">
    <tr>
        <th>编号</th>
        <th>名称</th>
        <th>性别</th>
        <th>课程</th>
        <th>操作</th>
    </tr>
    <%=s.toString()%>
</table>
</body>
</html>
