package zkt.tyxx.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class CreatePathLisenter implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		//获取项目的名称
		String path = arg0.getServletContext().getContextPath();
		arg0.getServletContext().setAttribute("path", path);
		
	}

}
