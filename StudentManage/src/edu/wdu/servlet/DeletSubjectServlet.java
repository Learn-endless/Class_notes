package edu.wdu.servlet; /**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 19833
 * Data: 2022-04-12
 * Time: 17:15
 */

import edu.wdu.dao.SubjectDao;
import edu.wdu.pojo.Subject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/deletSubject")
public class DeletSubjectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String id = request.getParameter("id");
        if(!id.equals("")){
            SubjectDao.deletSubject(id);
            ArrayList<Subject> subjects = SubjectDao.getSubjects();
            HttpSession session = request.getSession();
            session.setAttribute("subjects",subjects);
            response.sendRedirect("subjectList.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
