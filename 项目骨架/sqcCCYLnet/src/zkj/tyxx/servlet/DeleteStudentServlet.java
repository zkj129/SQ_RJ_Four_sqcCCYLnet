package zkj.tyxx.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zkj.tyxx.dao.StudentDao;

public class DeleteStudentServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("id"));
		
		StudentDao sd=new StudentDao();
		sd.deleteById(id);
		
		resp.sendRedirect("showStudent.jsp");
	}
}
