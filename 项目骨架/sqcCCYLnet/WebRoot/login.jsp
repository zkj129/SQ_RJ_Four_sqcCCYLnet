<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
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
	<link rel="stylesheet" type="text/css" href="${path}/plugins/bootstrap/css/login.css" />
		<style type="text/css">
			#login{
				/*设置边框的大小,线条,颜色*/
				border: 1px solid #999;
				/*设置div的宽度*/
				width: 28%;
				/**div居中显示**/
				margin: auto;
				/**margin padding关于css中的盒子模型中的内容**/
				padding: 20px;
				/**距离相邻元素上边的距离是50px**/
				margin-top: 50px;
				/*设置边框为圆角*/
				border-radius: 20px;
				
				/*设置边框的阴影部分*/
				box-shadow: 2px 2px 4px #000;
			}
			
			#login_text{
				/*设置字体颜色*/
				color: white;
				/*设置字体阴影*/
				text-shadow: 2px 2px 0px #000;
				/*设置字体的大小*/
				font-size: 30px;
			}
			#xx{
			   color:white;
			}
		</style>
  </head>
  
  <body style="background:url(imags/back1.jpg);background-size:cover;">
  <form action="loginServlet.do" method="post">
  
		<br><br><br><br>
  <div class="container-fluid">
			<div class="row">
				<div id="login">
					<form class="form-horizontal" role="form">
						<fieldset>
							<legend><h3 id="login_text">用户登录入口</h3></legend>
							<div class="row">
							<div class="form-group has-feedback">
								<label for="firstname" class="col-sm-3 control-label" id="xx">用户名</label>
								<div class="col-md-6">
									<input type="text" class="form-control" id="firstname" placeholder="请输入名字" name="name">
									<span class="glyphicon glyphicon-user form-control-feedback"></span>
								</div>
							</div>
							</div>
							<br><br>
							<div class="row">
							<div class="form-group has-feedback">
								<label for="lastname" class="col-sm-3 control-label"id="xx">密码</label>
								<div class="col-md-6">
									<input type="password" class="form-control" id="lastname" placeholder="请输入密码" name="password">
									<span class="glyphicon glyphicon-lock form-control-feedback"></span>
								</div>
							</div>
							</div>
							
							<div class="form-group">
								<div class="col-sm-offset-2 col-sm-10">
									<div class="checkbox">
										<label>
	         								 <input type="checkbox" >请记住我 </label>
									</div>
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-offset-2 col-sm-10">
									<button type="submit" class="btn btn-default">登录</button>
								</div>
							</div>
						</fieldset>
					</form>
				</div>
			</div>
		</div>

		<!--引入jquery文件-->
		<script src="../plugins/jquery/jquery.min.js" type="text/javascript"></script>
		<!--引入bootstrap.js-->
		<script type="text/javascript" src="../plugins/bootstrap/js/bootstrap.js"></script>
  </form>
  </body>
</html>
