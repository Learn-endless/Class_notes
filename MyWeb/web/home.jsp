<%--
  Created by IntelliJ IDEA.
  User: 19833
  Date: 2021/12/2
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
    <link type="text/css" rel="stylesheet" href="login_success_css.css">
    <style>
        form {
            margin-top: 200px;
            margin-left: 300px;
        }
        .but{
            width: 200px;
            min-height: 20px;
            display: block;
            background-color: #4a77d4;
            border: 1px solid #3762bc;
            color: #fff;
            padding: 9px 14px;
            font-size: 15px;
            line-height: normal;
            border-radius: 5px;
            margin-left: 364px;
            margin-top: 60px;
        }
    </style>
</head>
<body>
<form action="AddServlet" method="post">
    <table>
        <tr>
            <th scope="col" abbr="Dual 1.8">用户名</th>
            <th scope="col" abbr="Dual 2">密码</th>
            <th scope="col" abbr="Dual 2">姓名</th>
            <th scope="col" abbr="Dual 2">邮箱</th>
            <th scope="col" abbr="Dual 2">电话</th>
        </tr>
        <tr>
            <td><label>
                <input type="text" name="username">
            </label></td>
            <td><label>
                <input type="text" name="password">
            </label></td>
            <td><label>
                <input type="text" name="name">
            </label></td>
            <td><label>
                <input type="text" name="email">
            </label></td>
            <td><label>
                <input type="text" name="telephone">
            </label></td>
        </tr>
    </table>
    <input type="submit" value="提交" class="but">
</form>
</body>
</html>

