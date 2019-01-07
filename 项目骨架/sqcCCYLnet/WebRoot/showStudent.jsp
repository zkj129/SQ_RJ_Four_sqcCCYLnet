<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="zkj.tyxx.dao.StudentDao,zkj.tyxx.entity.Student" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showStudent.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css" href="${path}/plugins/bootstrap/css/bootstrap.css" />
	<link rel="stylesheet" type="text/css" href="${path}/plugins/bootstrap/css/showstudent.css" />
	<style type="text/css">
	#inner{
	  position: absolute;
				top:12px;
	}
	
	</style>
  </head>
  
  <body style="background:url(imags/back2.jpg);background-size:cover;">
  <nav class="navbar navbar-default" role="navigation">
       <div class="container-fluid" id="outer">
         
         <div class="navbar-header" >
             <a class="navbar-brand" href="#">团员信息管理</a>
         </div>
           <div>
             <p class="navbar-text">学号：</p>
              <input type="text" name="num" id="inner"/> 
             <p class="navbar-text">姓名：</p>
              <input type="text" name="name" id="inner"/>  
           
             <p class="navbar-text">院系：</p>
             <input type="text" name="dep" id="inner"/>
           </div>
        </div>
     </nav>

  
  <div align="center">
     <form action="showStudent.jsp" method="post">
     <br><br><br><br>
    &nbsp;姓名：&nbsp;&nbsp;<input type="text" name="name"/>&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="查询"/><br>
    &nbsp;学号：&nbsp;&nbsp;<input type="text" name="num"/>&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="查询"/><br>
    &nbsp;院系：&nbsp;&nbsp;<input type="text" name="dep"/>&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="查询"/><br>
    </form>
    <br><br>
    <font size=8,color=Black><a style="display:block;text-align:center"> 团员信息</a></font><br><br>
    <table border="3" cellpadding="12" cellspacing="3">
    <tr><td>ID</td>
    <td>姓名</td>
    <td>性别</td>
    <td>学号</td>
    <td>院系</td>
    <td>入团时间</td>
    <td>籍贯</td>
    <td>出生日期</td>
     <td>电话</td>
    <td>操作</td></tr>
   <%  request.setCharacterEncoding("utf-8");
   		String name=request.getParameter("name");%>
   <% if(name!=null&&!name.equals(""))
       {
    		StudentDao sd=new StudentDao();
    		Collection <Student> stuList=sd.findByname(name);
    		Iterator <Student> it=stuList.iterator();
    		while(it.hasNext()){
    			Student stu=it.next();
    	 %>
    	<tr><td><%=stu.getId() %></td><td><%=stu.getName() %></td>
    		<td><%=stu.getSex() %></td><td><%=stu.getNum() %></td>
    		<td><%=stu.getDep() %></td><td><%=stu.getJtime() %></td>
    		<td><%=stu.getPlace() %></td><td><%=stu.getBir() %></td>
    		<td><%=stu.getTel() %></td>
    		<td><a href="findById.do?id=<%=stu.getId() %>">编辑</a>|
    		<a href="deleteStudent.do?id=<%=stu.getId() %>">删除</a>
    		</td>
    	</tr>
    	<%} %>	
    <%} %>
     <%  request.setCharacterEncoding("utf-8");
   		String num=request.getParameter("num");%>
    <% if(num!=null&&!num.equals(""))
       {
    		StudentDao sd=new StudentDao();
    		Collection <Student> stuList=sd.findBynum(num);
    		Iterator <Student> it=stuList.iterator();
    		while(it.hasNext()){
    			Student stu=it.next();
    	 %>
    	<tr><td><%=stu.getId() %></td><td><%=stu.getName() %></td>
    		<td><%=stu.getSex() %></td><td><%=stu.getNum() %></td>
    		<td><%=stu.getDep() %></td><td><%=stu.getJtime() %></td>
    		<td><%=stu.getPlace() %></td><td><%=stu.getBir() %></td>
    		<td><%=stu.getTel() %></td>
    		<td><a href="findById.do?id=<%=stu.getId() %>">编辑</a>|
    		<a href="deleteStudent.do?id=<%=stu.getId() %>">删除</a>
    		</td>
    	</tr>
    	<%} %>	
    <%} %>	
     <%  request.setCharacterEncoding("utf-8");
   		String dep=request.getParameter("dep");%>
    <% if(dep!=null&&!dep.equals(""))
       {
    		StudentDao sd=new StudentDao();
    		Collection <Student> stuList=sd.findBydep(dep);
    		Iterator <Student> it=stuList.iterator();
    		while(it.hasNext()){
    			Student stu=it.next();
    	 %>
    	<tr><td><%=stu.getId() %></td><td><%=stu.getName() %></td>
    		<td><%=stu.getSex() %></td><td><%=stu.getNum() %></td>
    		<td><%=stu.getDep() %></td><td><%=stu.getJtime() %></td>
    		<td><%=stu.getPlace() %></td><td><%=stu.getBir() %></td>
    		<td><%=stu.getTel() %></td>
    		<td><a href="findById.do?id=<%=stu.getId() %>">编辑</a>|
    		<a href="deleteStudent.do?id=<%=stu.getId() %>">删除</a>
    		</td>
    	</tr>
    	<%} %>	
    <%} %>			
    </table>
    <br><br>
    <a href="student.jsp"> <font size=5,color=Black> 增加团员信息</font></a>
    </div>
  </body>
</html>
