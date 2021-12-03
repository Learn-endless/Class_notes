package com.learn.servlet;
import com.learn.bean.User;
import com.learn.service.UserService;
import com.learn.service.UserServiceImpl;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * 添加用户
 */
public class AddServlet extends HttpServlet {
    UserService userService1 = new UserServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String telephone = req.getParameter("telephone");
        //调用add保存用户
        userService1.add(new User(null, username, password, name, email, telephone));
        //跳转到用户列表页面,此方法有表单重复提交
        //req.getRequestDispatcher("/UserServlet").forward(req, resp);
        //无重复添加
        resp.sendRedirect("UserServlet");
    }
}




