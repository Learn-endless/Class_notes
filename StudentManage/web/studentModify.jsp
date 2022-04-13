<%@ page import="edu.wdu.pojo.Student" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="edu.wdu.pojo.Subject" %><%--
  Created by IntelliJ IDEA.
  User: 19833
  Date: 2022/4/12
  Time: 19:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生修改页</title>
</head>
<body>
<%
    Student student = (Student) session.getAttribute("student");

    ArrayList<Subject> subjects = (ArrayList<Subject>) session.getAttribute("subjects");
    StringBuilder s = new StringBuilder();
    if(subjects != null){
        for(Subject n:subjects){
            s.append(
                    "<option value='"+n.getId()+"'"+(student.getSubject().getId() == n.getId()? "selected":"")+">"+n.getName()+"</option>"
            );
        }
    }
%>
<form action="updateStudent" method="post">
    <input type="hidden" name="id" value="<%=student.getId()%>">
    姓名:<input type="text" name="name" value="<%=student.getName()%>"><br>
    性别:
    <select name="gender">
        <option value='0'>请选择性别</option>
        <option value='男' <%=(student.getSex().equals("男")?"selected":"")%>>男</option>
        <option value='女' <%=(student.getSex().equals("女")?"selected":"")%>>女</option>
    </select><br>
    课程:
    <select name="subject">
        <option value='0'>请选择课程</option>
        <%=s.toString()%>
    </select><br>
    <input type="submit" value="修改">
</form>
</body>
</html>
