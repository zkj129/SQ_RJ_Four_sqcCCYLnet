package zkj.tyxx.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zkj.tyxx.dao.StudentDao;
import zkj.tyxx.entity.Student;

public class addStudentServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		req.setCharacterEncoding("utf-8");
		//int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String sex=req.getParameter("sex");
		String num=req.getParameter("num");
		String dep=req.getParameter("dep");
		String jtime=req.getParameter("jtime");
		String place=req.getParameter("place");
		String bir=req.getParameter("bir");
		String tel=req.getParameter("tel");
		Student stu=new Student(name, sex, num, dep,jtime,place,bir,tel);
		StudentDao sd=new StudentDao();
		sd.save(stu);
		resp.sendRedirect("showStudent.jsp");
	}

}
