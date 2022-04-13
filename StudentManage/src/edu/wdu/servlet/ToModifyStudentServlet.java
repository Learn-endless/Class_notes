package edu.wdu.servlet; /**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 19833
 * Data: 2022-04-12
 * Time: 19:51
 */

import edu.wdu.dao.StudentDao;
import edu.wdu.pojo.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/toModifyStudent")
public class ToModifyStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String idStr = request.getParameter("id");
        if(!idStr.equals("0") && !idStr.equals("")){
            //获取这个学生对象
            Student student = StudentDao.getId(idStr);
            HttpSession session = request.getSession();
            session.setAttribute("student",student);
            response.sendRedirect("studentModify.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
