package edu.wdu.servlet; /**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 19833
 * Data: 2022-04-12
 * Time: 17:05
 */

import edu.wdu.dao.SubjectDao;
import edu.wdu.pojo.Subject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/updateSubject")
public class UpdateSubjectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String credit = request.getParameter("credit");
        if(!id.equals("") && !name.equals("") && !credit.equals("")){
            //修改数据
            SubjectDao.updateSubject(id,name,credit);
            //更新 subjects
            ArrayList<Subject> subjects = SubjectDao.getSubjects();
            //更新 session 中的内容
            HttpSession session = request.getSession();
            session.setAttribute("subjects",subjects);
            //重定向
            response.sendRedirect("subjectList.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
