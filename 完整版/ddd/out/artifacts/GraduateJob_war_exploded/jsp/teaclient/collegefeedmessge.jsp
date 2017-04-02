<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

    <title>反馈情况页面</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/collegePublicCss.css">
    <link rel="stylesheet" href="css/collegefeedmessage.css">


    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="http://cdn.bootcss.com/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]--></head>
<body>
<nav class="navbar navbar-default navbar-fixed-top GJ-navbar" role="navigation">
    <div class="container">
        <div class="row">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <img alt="Brand" src="image/logo.png">

            </div>
            <div class="navbar-collapse collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li><a href="#">首页</a></li>
                    <li><a href="#">个人中心</a></li>
                </ul>
                <ul class="quit">
                    <li><a href="${pageContext.request.contextPath}/logout.action">退出</a></li>

                </ul>

            </div>
        </div>
    </div>
</nav>

<div class="container page-middle">
    <div class="row">
        <div class="left">
            <div class="clearfix">
                <img src="image/jobicon.png">
                <span class="company-name">某老师</span>
                <a href="#" class="company-website"></a>
                <ul class="left-menu">
                    <li><a href="${pageContext.request.contextPath}/job_intention_view.action">查看就业意向</a></li>
                    <li><a href="#">审核个人简历</a></li>
                    <li><a class="active"  href="#">查看反馈情况</a></li>
                    <li><a href="${pageContext.request.contextPath}/collegemeetingjoin.action">查看宣讲会参与情况</a></li>
                    <li><a href="#">开展就业指导工作</a></li>
                    <li><a href="${pageContext.request.contextPath}/ever_leave_school.action">判断学生可否离校</a></li>
                    <li><a href="#">查看毕业生基本信息</a></li>
                </ul>

            </div>
        </div>
        <div class="content" style="background-color: #ffffff;">
            
            <div class="address">
                <div class="addd">
                    <label>您当前的位置：</label>
                    <a hraf="#">首页</a>
                    <label>><label>
                    <a hraf="#">查询反馈情况</a>
                    <label>><label>
                    <a hraf="#">反馈情况</a>
                </div>
            </div>

            <div class="condition">
                <div class="first">
                    <div class="tittt" style="padding-left:20px;">
                        <h2>基本信息</h2>
                    </div>
                </div>
            </div>

            <div class="message">
                    <img src="image/jobcon.png" style="width:140px;height:190px;">
                    <table class="permsg">
                        <tr>
                            <td class="td1"><label>姓名:</label></td>
                            <td class="td2">张三</td>
                            <td class="td1"><label>户口地:</label></td>
                            <td class="td2"> 湖南 长沙</td>
                        </tr>
                        <tr>
                            <td class="td1"><label>现居地:</label></td>
                            <td class="td2">浙江 杭州</td>
                            <td class="td1"><label>出生日期:</label></td>
                            <td class="td2">1989-9-15</td>
                        </tr>
                    </table>
                    <a hraf="#"  class="msg">查看详细信息>></a>
            </div>
            <div class="backmsg">
                <label>反馈信息:</label>
                <p>该公司是一个颇为优秀的公司</p>
            </div>
        </div>
    </div>
</div>

<div class="container-fluid page-end">

    <p class="text-center">版权申明</p>
</div>
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>