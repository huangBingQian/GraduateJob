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

    <!-- <title>Jumbotron Template for Bootstrap</title>  -->
    <title>学生信息查看</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/CompanayPublicCss.css">
    <link rel="stylesheet" href="css/company_stumesgcheek.css">



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
                    <li><a href="${pageContext.request.contextPath}/company_home.action">首页</a></li>
                    <li><a href="${pageContext.request.contextPath}/company_home.action">企业主页</a></li>
                    <li><a href="${pageContext.request.contextPath}/company_notice.action">通知消息</a></li>
                    <li><a href="${pageContext.request.contextPath}/company_stusearch.action">学生搜索</a></li>
                </ul>
            </div>
        </div>
    </div>
</nav>

<div class="container page-middle">
    <div class="row">
        <div class="left">
            <div class="clearfix">
                <img src="${pageContext.request.contextPath}/updata/logo/${company.logo}">
                <span class="company-name">${sessionScope.userName}</span>
                <a href="${sessionScope.company.website}" class="company-website">${sessionScope.company.website}</a>

                <ul class="left-menu">
                    <li><a class="active" href="#">基本信息填写</a></li>
                    <li><a href="${pageContext.request.contextPath}/company_infomsg.action">招聘信息填写</a></li>
                    <li><a href="${pageContext.request.contextPath}/company_infoarr.action">宣讲会发起/查看</a></li>
                    <li><a class="active" href="#">招聘会参与</a></li>
                    <li><a href="${pageContext.request.contextPath}/company_resume_view.action">面试/offer情况</a></li>
                </ul>
            </div>
        </div>
        <div class="content" style="padding:20px">
            <div class="fixmessage">
                <div class="stu_photo">
                    <img src="image/stu_photo.png" style="width:150px;height:200px;">
                </div>
                <div class="basic_msg">
                    <div class="mesg">
                        <label>姓名：</label>
                        <p>张三</p>
                    </div>
                    <div class="mesg">
                        <label>学历：</label>
                        <p>本科</p>
                    </div>
                    <div class="mesg">
                        <label>专业：</label>
                        <p>计算机科学与技术</p>
                    </div>
                    <div class="mesg">
                        <label>学院：</label>
                        <p>计算机学院</p>
                    </div>
                    <div class="mesg">
                        <label>政治面貌：</label>
                        <p>党员</p>
                    </div>
                    <div class="mesg">
                        <label>手机：</label>
                        <p>15988362534</p>
                    </div>
                </div>
                <div class="left_msg">
                    <div class="mesg">
                        <label>意向岗位：</label>
                        <p>Java工程师</p>
                    </div>
                    <div class="mesg">
                        <label>意向薪资：</label>
                        <p>5000~8000</p>
                    </div>
                    <div class="mesg">
                        <label>意向地点：</label>
                        <p>杭州</p>
                    </div>
                    <div class="mesg">
                        <label>福利：</label>
                        <p>五险一金、餐饮补贴、路费补贴</p>
                    </div>
                </div>

                <div class="resume_msg">
                    <div class="mesg">
                        <label>投递简历数：</label>
                        <p>20</p>
                    </div>
                    <div class="mesg">
                        <label>收到offer数：</label>
                        <p>2</p>
                    </div>
                    <div class="mesg">
                        <label>参与面试数：</label>
                        <p>20</p>
                    </div>
                    <div class="mesg">
                        <label>收到面试数：</label>
                        <p>20</p>
                    </div>
                </div>
            </div>
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