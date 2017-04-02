<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Jumbotron Template for Bootstrap</title>
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquerySession.js"></script>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/stu-job-detail.css">


    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="http://cdn.bootcss.com/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
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
                        <li><a href="${pageContext.request.contextPath}/stu_home.action">首页</a></li>
                        <li><a href="${pageContext.request.contextPath}/stu_job.action">职位</a></li>
                        <li><a href="${pageContext.request.contextPath}/message.action">个人中心</a></li>
                    </ul>
                    <ul class="user">
                        <li class="user-logo" style="background-image: url(/updata/stulogo/${sessionScope.graduate.stuLogo})"></li>
                        <li>
                            <span class="name">${sessionScope.graduate.graduatename }</span>
                            <span class="badge">
                                <img src="./image/icon-news.png">
                                <span class="msg-number"> ${ noticeAmount } </span>
                            </span>
                        </li>
                    </ul>

                </div>
            </div>
         </div>
    </nav>
    <div class="container page-middle">
        <div class="row">
            <div class="jd-title">
                <span class="name">${exCompanyJob.jobs.jobname}</span>
                <span class="company">${exCompanyJob.company.companyname}</span>
                <ul>
                    <li>${exCompanyJob.company.companycharacter}</li>
                    <li>${exCompanyJob.company.industry}</li>
                </ul>
            </div>
            <div class="jd-info">
                <ul>
                    <li>职位月薪:${exCompanyJob.jobs.jobsalary}</li>
                    <li>招聘人数:${exCompanyJob.jobs.jobnumber}</li>
                    <li>工作地点:${exCompanyJob.jobs.jobaddress}</li>
                </ul>
                <ul class="nav nav-tabs" role="tablist">
                    <li role="presentation" class="active"><a href="#">职位简介</a></li>
                    <li role="presentation"><a href="#">公司简介</a></li>
                </ul>
                <div id="job-info">
                    <p>任职要求：<br>
                    ${exCompanyJob.jobs.jobdemand}
                    </p>

                    <p>岗位职能: <br>${exCompanyJob.jobs.jobfunction}</p>
                    <!-- SWSStringCutEnd -->

                    <p>工作地址：</p>
                    <p>
                        江干区下沙经济技术开发区3号大街3号
                    </p>
                </div>
                <div id="company-info">

                </div>
                <button type="button" class="btn btn-primary" onclick="location='${pageContext.request.contextPath}/handin.action?jobid=${exCompanyJob.jobs.jobid}&companyid=${exCompanyJob.company.companyid}'">立即申请</button>
            </div>
        </div>
    </div>
    <div class="container-fluid page-end">

        <p class="text-center">版权申明</p>
    </div>
    <script src="js/bootstrap.min.js"></script>
</body>
</html>