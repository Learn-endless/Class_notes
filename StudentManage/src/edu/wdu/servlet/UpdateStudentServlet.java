package edu.wdu.servlet; /**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 19833
 * Data: 2022-04-12
 * Time: 20:17
 */

import edu.wdu.dao.StudentDao;
import edu.wdu.pojo.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/updateStudent")
public class UpdateStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String idStr = request.getParameter("id");
        String name = request.getParameter("name");
        String sex = request.getParameter("gender");
        String subjectIdStr = request.getParameter("subject");
        if(!name.equals("") && !sex.equals("0") && !subjectIdStr.equals("0")){
            StudentDao.updateStudent(idStr,name,sex,subjectIdStr);
            ArrayList<Student> students = StudentDao.getStudents();
            HttpSession session = request.getSession();
            session.setAttribute("students",students);
            response.sendRedirect("studentList.jsp");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
