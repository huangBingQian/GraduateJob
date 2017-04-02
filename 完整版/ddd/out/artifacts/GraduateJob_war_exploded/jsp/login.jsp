<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">
    <title>Signin Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${pageContext.request.contextPath}/css/stu-login.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="http://cdn.bootcss.com/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<div class="container">
    <div class="row">
        <form class="form-signin" role="form" action="${pageContext.request.contextPath}/login.action">
            <img class="logo" src="${pageContext.request.contextPath}/image/logo-white.png" />
            <input type="text" class="form-control" name="userId" placeholder="账号" required autofocus>
            <input type="password" class="form-control" name="password" placeholder="密码" required>
            <div class="checkbox">
                <label>
                    <input type="checkbox" value="remember-me"> <span class="checkbox-text">记住我</span>
                </label>
            </div>
            <button class="btn btn-lg btn-default btn-block login-button" type="submit">登录</button>
            <div class="col-sm-offset-4 col-sm-8">
                <a href="${pageContext.request.contextPath}/jsp/companylogin.jsp" ><h4 style="color: black">公司登陆</h4></a>
            </div>
        </form>

    </div>

</div> <!-- /container -->


</body>
</html>
    