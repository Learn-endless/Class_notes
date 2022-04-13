package edu.wdu.servlet; /**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 19833
 * Data: 2022-04-12
 * Time: 20:29
 */

import edu.wdu.dao.StudentDao;
import edu.wdu.pojo.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/deletStudent")
public class DeletStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String idStr = request.getParameter("id");
        if(!idStr.equals("")){
            StudentDao.deletStudent(idStr);
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
