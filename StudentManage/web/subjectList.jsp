<%@ page import="java.util.ArrayList" %>
<%@ page import="edu.wdu.pojo.Subject" %><%--
  Created by IntelliJ IDEA.
  User: 19833
  Date: 2022/4/12
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>课程页面</title>
</head>
<body>
<%
    ArrayList<Subject>subjects = (ArrayList<Subject>) session.getAttribute("subjects");
    StringBuilder s = new StringBuilder();
    if(subjects != null){
        for(Subject subject : subjects){
            s.append(
                    "<tr>" +
                            "<td>"+subject.getId()+"</td>" +
                            "<td>"+subject.getName()+"</td>" +
                            "<td>"+subject.getCredit()+"</td>" +
                            "<td><a href='"+"toModifySubject?id="+subject.getId()+"'>修改</a>&nbsp;&nbsp;&nbsp;<a href='"+"deletSubject?id="+subject.getId()+"'>删除</a></td>" +
                            "</tr>"
            );
        }
    }
%>
<a href="index.html">首页</a>&nbsp;&nbsp;&nbsp;<a href="addSubject.jsp">新增课程</a><br>
<table style="width:100%;text-align:center">
    <tr>
        <th>编号</th>
        <th>名称</th>
        <th>学分</th>
        <th>操作</th>
    </tr>
    <%=s.toString()%>
</table>
</body>
</html>
