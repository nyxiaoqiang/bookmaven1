<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<!-- 告诉浏览器不要缩放 -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>我的第一个web项目</title>
<link href="bs/css/darkly/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<style type="text/css">
	.container-fluid{
		width:40%;
		position: absolute;
		left:50%;
		top:50%;
		margin-left: -270px;
		margin-top: -113px;
	}
</style>
</head>
<body>
<div class="container-fluid well" ><!-- well有一种凹进去的效果 -->
	<div class="row">
		<div class="col-md-12">
			<form class="form-horizontal" role="form" method="post" action="login">
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-2 control-label">
						账号
					</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="inputname" name="name" />
					</div>
				</div>
				<div class="form-group"> 
					<label for="inputPassword3" class="col-sm-2 control-label">
						密码
					</label>
					<div class="col-sm-10">
						<input type="password" class="form-control" id="inputpwd" name="pwd"/>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						 
						<button type="submit" class="btn btn-default">
							登录
						</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</div>
	<script type="text/javascript" src="bs/js/jquery.min.js"></script>
	<script type="text/javascript" src="bs/js/bootstrap.min.js"></script>
</body>
</html>