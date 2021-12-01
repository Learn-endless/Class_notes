package com.learn.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.learn.bean.User;
import com.learn.service.UserService;
import com.learn.service.UserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

/**
 * Servlet implementation class LoginUserServlet
 */
@WebServlet("/loginUserServlet")
public class LoginUserServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.处理请求编码
        request.setCharacterEncoding("utf-8");
        //2.获取请求参数的map集合
        String code = request.getParameter("verifycode");
        Map<String, String[]> map = request.getParameterMap();

        //取出session 中的验证码
        HttpSession session2 = request.getSession();
        String code_server = (String)session2.getAttribute("CHECKCODE_SERVER");
        session2.removeAttribute("CHECKCODE_SERVER");
        //3.验证码校验
        if(!code.equalsIgnoreCase(code_server)) {
            //验证码错误的情况
            request.setAttribute("login_msg", "验证码有误");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
            return;
        }

        //4.封装数据BeanUtils.populate() 参数1：要封装数据的对象
        //参数2 存放参数值的集合

        User user = new User();
        try {
            BeanUtils.populate(user,map);
        } catch (IllegalAccessException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        //4.调用service 处理登录的逻辑
        UserService service = new UserServiceImpl();

        User loginUser = service.login(user);

        if(loginUser!=null) {
            //登录成功
            HttpSession session = request.getSession();
            session.setAttribute("user", loginUser);
            response.sendRedirect(request.getContextPath()+"/userListServlet");
        }else {
            //登陆失败，提示错误信息 转发到login.jsp
            request.setAttribute("login_msg", "用户名或密码错误");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }


    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
