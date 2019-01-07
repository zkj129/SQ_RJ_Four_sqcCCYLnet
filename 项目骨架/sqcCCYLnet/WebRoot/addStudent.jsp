<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="zkj.tyxx.dao.StudentDao" %>
<jsp:useBean id="stu" class="zkj.tyxx.entity.Student">
<jsp:setProperty name="stu" property="*"/>
</jsp:useBean>
<%
StudentDao studao=new StudentDao();
studao.save(stu);
response.sendRedirect("showStudent.jsp");
 %>
