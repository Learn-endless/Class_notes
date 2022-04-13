package edu.wdu.servlet; /**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 19833
 * Data: 2022-04-12
 * Time: 16:52
 */

import edu.wdu.dao.SubjectDao;
import edu.wdu.pojo.Subject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/toModifySubject")
public class ToModifySubjectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String id = request.getParameter("id");
        if(!id.equals("")){
            //找到这个id的subject对象
            Subject subject = SubjectDao.getId(id);
            //存放到 session 中
            HttpSession session = request.getSession();
            session.setAttribute("subject",subject);
            //重定向
            response.sendRedirect("subjectModify.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
