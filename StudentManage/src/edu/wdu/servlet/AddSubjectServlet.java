package edu.wdu.servlet; /**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 19833
 * Data: 2022-04-12
 * Time: 16:43
 */

import edu.wdu.dao.SubjectDao;
import edu.wdu.pojo.Subject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/addSubject")
public class AddSubjectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String name = request.getParameter("name");
        String creditStr = request.getParameter("credit");
        if(!name.equals("") && !creditStr.equals("")){
            SubjectDao.addSubject(name,creditStr);
            //更新课程列表
            ArrayList<Subject> subjects = SubjectDao.getSubjects();
            //更新 session 中的值
            HttpSession session = request.getSession();
            session.setAttribute("subjects",subjects);
            //重定向课程首页
            response.sendRedirect("subjectList.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
