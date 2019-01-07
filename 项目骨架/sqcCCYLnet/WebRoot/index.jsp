<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
    <link rel="stylesheet" type="text/css" href="${path}/plugins/bootstrap/css/bootstrap.css"/>
    <link rel="stylesheet" type="text/css" href="${path}/plugins/bootstrap/css/index.css" />
  </head>    
  
  <body>
    
    <div class="container-fluid">
			<div class="row">
				<nav class="navbar navbar-default" role="navigation">
				<img src="imags/one.png" width=100% height="120px"/>
				    <div class="container-fluid"> 
				    <div class="navbar-header">
				        <button type="button" class="navbar-toggle" data-toggle="collapse"
				                data-target="#example-navbar-collapse">
				            <span class="sr-only">切换导航</span>
				            <span class="icon-bar"></span>
				            <span class="icon-bar"></span>
				            <span class="icon-bar"></span>
				        </button>
				        <a class="navbar-brand" href="#"><B>宿迁学院共青团</B></a>
				    </div>
				    <div class="collapse navbar-collapse" id="example-navbar-collapse">
				        <ul class="nav navbar-nav navbar-right">
				            <li><a href="news.jsp"><B>新闻资讯</B></a></li>
				            <li><a href="finestory.jsp"><B>优秀事迹</B></a></li>
				            <li><a href="RandPnotice.jsp"><B>奖惩公告</B></a></li>
				            <li><a href="Partyschool.jsp"><B>党校简介</B></a></li>
				             <li><a href="train.jsp"><B>干部培训</B></a></li>
				            <li><a href="login.jsp"><B>团员信息管理</B></a></li>
				            <li class="dropdown">
				            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
				                    <B>资源下载 </B><b class="caret"></b>
				            </a>
				                <ul class="dropdown-menu">
				                    <li><a href="link.jsp">友情链接</a></li>
				                    <li><a href="Filedownload.jsp">文件下载</a></li>
				                </ul>
				            </li>
				        </ul>
				    </div>
				    
				    </div>
				</nav>	
			</div>
			<div class="row">
				<div id="myCarousel" class="carousel slide">
					<!-- 轮播（Carousel）指标 -->
					<ol class="carousel-indicators">
						<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
						<li data-target="#myCarousel" data-slide-to="1"></li>
						<li data-target="#myCarousel" data-slide-to="2"></li>
					</ol>
					<!-- 轮播（Carousel）项目 -->
					<div class="carousel-inner">
						<div class="item active">
							<img src="imags/two.png" alt="First slide" width=2060px >
						</div>
						<div class="item">
							<img src="imags/three.png" alt="Third slide">
						</div>
						<div class="item">
							<img src="imags/four.png" alt="Second slide">
						</div>
					</div>
					<!-- 轮播（Carousel）导航 -->
					<a class="carousel-control left" href="#myCarousel" data-slide="prev"> <span _ngcontent-c3="" aria-hidden="true" class="glyphicon glyphicon-chevron-right"></span></a>
					<a class="carousel-control right" href="#myCarousel" data-slide="next">&rsaquo;</a>
				</div>
			</div>
			
		</div>
		
		
		<!--引入jquery文件-->
		<script src="${path}/plugins/jquery/jquery.min.js" type="text/javascript"></script>
		<!--引入bootstrap.js-->
		<script type="text/javascript" src="${path}/plugins/bootstrap/js/bootstrap.js" ></script>
		<script>
			$(function(){
				$('#myCarousel').carousel({
				    interval: 2000
				})
			})
		</script>
  </body>
</html>
