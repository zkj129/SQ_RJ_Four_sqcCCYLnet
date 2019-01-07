package zkj.tyxx.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import zkj.tyxx.dao.AdminDao;


public class LoginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		
		
		AdminDao ad=new AdminDao();
		boolean f=ad.TestLogin(name, password);
		
		
		if(f){
			HttpSession session=req.getSession();
			session.setAttribute("isLogin", true);
			resp.sendRedirect("showStudent.jsp");
		}
		else
			resp.sendRedirect("login.jsp");
	}
}
