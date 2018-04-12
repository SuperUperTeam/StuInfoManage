<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>用户登录</title>

        <!-- CSS -->
        <!-- <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500"> -->
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/font-awesome/css/login/font-awesome.min.css">
		<link rel="stylesheet" href="assets/css/login/form-elements.css">
        <link rel="stylesheet" href="assets/css/login/style.css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!-- Favicon and touch icons -->
        <link rel="shortcut icon" href="assets/ico/favicon.png">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="assets/ico/apple-touch-icon-57-precomposed.png">
		<style>
			.col-center-block {
				float: none;
				display: block;
				margin-left: auto;
				margin-right: auto;
			}
		</style>
    </head>

    <body>

		<!-- Top menu -->
		<nav class="navbar navbar-inverse navbar-no-bg" role="navigation">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#top-navbar-1">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="index.html">Bootstrap Registration Form Template</a>
				</div>
				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse" id="top-navbar-1">
					<ul class="nav navbar-nav navbar-right">
						<li>
							<span class="li-text">
								欢迎使用信息关系后台系统，请填写登录信息
							</span> 
							<!--<a href="#"><strong>links</strong></a> -->
							<!--<span class="li-text">-->
								<!--here, or some icons: -->
							<!--</span> -->
							<!--<span class="li-social">-->
								<!--<a href="#"><i class="fa fa-facebook"></i></a> -->
								<!--<a href="#"><i class="fa fa-twitter"></i></a> -->
								<!--<a href="#"><i class="fa fa-envelope"></i></a> -->
								<!--<a href="#"><i class="fa fa-skype"></i></a>-->
							<!--</span>-->
						</li>
					</ul>
				</div>
			</div>
		</nav>

        <!-- Top content -->
        <div class="top-content">
        	
            <div class="inner-bg">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-8 col-sm-offset-2 text" style="padding: 25px">
                            <h1><strong>登录</strong> 信息管理系统</h1>
                            <div class="description">
                            	<p>
									期待是一种半清醒半疯狂的燃烧，使焦灼的灵魂幻觉自己生活在未来。<br/>
	                            	<strong>别特么瞎想了，敲代码吧</strong>
                            	</p>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                    	<!--<div class="col-sm-6 phone">-->
                    		<!--<img src="assets/img/iphone.png" alt="">-->
                    	<!--</div>-->
                        <div class="col-sm-5 form-box  col-center-block" style="padding-top: 10px">
                        	<div class="form-top">
                        		<div class="form-top-left">
                        			<h3><strong>用户登陆</strong></h3>
                            		<p>请输入你的登陆信息:</p>
                        		</div>
                        		<div class="form-top-right">
                        			<i class="fa fa-pencil"></i>
                        		</div>
                            </div>
                            <div class="form-bottom">
			                    <form role="form" action="" method="post" class="registration-form">
			                    	<div class="form-group">
			                    		<!--<label class="sr-only" for="form-first-name">First name</label>-->
			                        	<input type="text" name="form-first-name" placeholder="UserName..." class="form-first-name form-control" id="form-first-name">
			                        </div>
			                        <div class="form-group">
			                        	<!--<label class="sr-only" for="form-last-name">Last name</label>-->
			                        	<input type="password" name="form-last-name" placeholder="Password..." class="form-last-name form-control" id="form-last-name">
			                        </div>
			                        <!--<div class="form-group">-->
			                        	<!--&lt;!&ndash;<label class="sr-only" for="form-email">Email</label>&ndash;&gt;-->
			                        	<!--&lt;!&ndash;<input type="text" name="form-email" placeholder="Email..." class="form-email form-control" id="form-email">&ndash;&gt;-->
			                        <!--</div>-->
			                        <button type="submit" class="btn">登陆</button>
			                    </form>
		                    </div>
                        </div>
                    </div>
                </div>
            </div>
            
        </div>


        <!-- Javascript -->
        <script src="assets/js/jquery-1.11.1.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="assets/js/login/jquery.backstretch.min.js"></script>
        <script src="assets/js/login/retina-1.1.0.min.js"></script>
        <script src="assets/js/login/scripts.js"></script>
        
        <!--[if lt IE 10]>
            <script src="assets/js/placeholder.js"></script>
        <![endif]-->

    </body>

</html>