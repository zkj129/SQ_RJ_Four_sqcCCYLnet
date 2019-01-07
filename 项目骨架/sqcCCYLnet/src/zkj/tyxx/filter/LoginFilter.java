package zkj.tyxx.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebFilter(urlPatterns="/permission/*")
public class LoginFilter implements Filter {
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest req=(HttpServletRequest)arg0;
		HttpServletResponse resp=(HttpServletResponse)arg1;
		
		String path=req.getRequestURI();		
		if(path.indexOf("login.jsp")>-1||path.indexOf("loginServlet.do")>-1||path.indexOf(".jpg")>0){
			
			arg2.doFilter(arg0, arg1);
		}else{
			
			HttpSession s=req.getSession();
			Object isLogin=s.getAttribute("isLogin");
			if(isLogin!=null&&(Boolean)isLogin)
				arg2.doFilter(arg0, arg1);
			else
				resp.sendRedirect("login.jsp");
		}	
	}
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
