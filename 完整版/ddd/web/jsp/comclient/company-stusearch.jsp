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
    <title>学生搜索</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/CompanayPublicCss.css">
    <link rel="stylesheet" href="css/company_stusearch.css">

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
                    <li><a  href="${pageContext.request.contextPath}/company_home.action">首页</a></li>
                    <li><a  href="${pageContext.request.contextPath}/company_notice.action">通知消息</a></li>
                    <li><a class="active" href="${pageContext.request.contextPath}/company_stusearch.action">学生搜索</a></li>
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
                    <li><a href="${pageContext.request.contextPath}/company_baseInfo.action">基本信息填写</a></li>
                    <li><a href="${pageContext.request.contextPath}/company_infomsg.action">招聘信息填写</a></li>
                    <li><a href="${pageContext.request.contextPath}/company_infoarr.action">宣讲会发起/查看</a></li>
                    <li><a href="${pageContext.request.contextPath}/company_stumesgcheek.action">招聘会参与</a></li>
                    <li><a href="${pageContext.request.contextPath}/company_resume_view.action">面试/offer情况管理</a></li>
                </ul>
            </div>
        </div>
        <div class="content">
            <div class="selrev">
                <div class="selceted">
                    <label>已选条件</label>
                    <div class="revdel">
                        <label>2016</label>
                        <button type="submit">删除</button>
                    </div>
                    <div class="revdel">
                        <label>计算机学院</label>
                        <button type="submit">删除</button>
                    </div>
                    <div class="revdel">
                        <label>前50%</label>
                        <button type="submit">删除</button>
                    </div>
                </div>
                <div class="selcet">
                    <label>毕业年份</label>
                    <p>2016</p>
                    <p>2017</p>
                    <p>2018</p>
                </div>
                <div class="selcet">
                    <label>学院</label>
                    <p>计算机学院</p>
                    <p>会计学院</p>
                    <p>外国语学院</p>
                    <p>电子学院</p>
                    <p><a hraf="#"> 更多>> </a></p>
                </div>
                <div class="selcet">
                    <label>成绩分布</label>
                    <p>前30%</p>
                    <p>前50%</p>
                    <p>30%-50%</p>
                    <p>50%-70%</p>
                    <p>70%以后</p>
                </div>
                <div class="selcet">
                    <label>专业</label>
                    <p>计算机科学与技术</p>
                    <p>网络工程</p>
                    <p>物联网</p>
                    <p>海洋工程与技术</p>
                    <p><a hraf="#">更多>> </a></p>
                </div>
            </div>
            <hr class="hr1"/>
            <div class="selresult">
                <table class="stumessage">
                    <tr>
                        <td><label>姓名</label></td>
                        <td><label>学院</label></td>
                        <td><label>成绩</label></td>
                        <td><label>毕业年份</label></td>
                        <td><label>专业</label></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>张三</td>
                        <td>计算机学院</td>
                        <td>前30%</td>
                        <td>2016</td>
                        <td>计算机科学与技术</td>
                        <td><a hraf="#">详细信息</a></td>
                    </tr>
                    <tr>
                        <td>张三四</td>
                        <td>软件工程学院</td>
                        <td>30%-50%</td>
                        <td>2016</td>
                        <td>物联网</td>
                        <td><a hraf="#">详细信息</a></td>
                    </tr>
                </table>
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