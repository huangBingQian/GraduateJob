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

    <title>简历信息</title>

    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/publicCss.css">
    <link href="css/employment.css" rel="stylesheet" type="text/css">


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
                        <div class="popover bottom user-info" id="aaa">
                            <div class="arrow"></div>
                            <div>
                                <div class="title">
                                    <ul>
                                        <li><span class="user-logo"><img class="" src=""></span></li>
                                        <li>
                                            <span class="user-info">
                                            <span>${sessionScope.graduate.graduatename }</span>
                                            <span><a href="${pageContext.request.contextPath}/jsp/login.jsp">注销</a></span>
                                        </span>

                                        </li>
                                    </ul>
                                </div>
                                <p>您有${noticeAmount }条通知</p>
                            </div>
                    </div>

                </ul>

            </div>
        </div>
    </div>
</nav>

<div class="container page-middle">
    <div class="row">
        <div class="left">
            <div class="clearfix">
                <img src="${pageContext.request.contextPath}/updata/stulogo/${sessionScope.graduate.stuLogo}" width="122px" height="122px" style alt="" />
                <span class="company-name">${sessionScope.graduate.graduatename }</span>
                <a href="#" class="company-website"></a>
                <ul class="left-menu">
                    <li><a href="${pageContext.request.contextPath}/message.action">个人主页</a></li>
                    <li><a href="${pageContext.request.contextPath}/resume.action">简历信息</a></li>
                    <li><a href="${pageContext.request.contextPath}/employment.action">就业中心</a></li>
                    <li><a href="${pageContext.request.contextPath}/notice.action">通知中心</a></li>
                </ul>

            </div>
        </div>
        <div class="content">
            <div class="main_right">
                <div class="resume">
                    <h3 style="font-family:楷体; margin-left:10px;">我投过的简历</h3>
                    <hr>
                    <table  cellspacing="0" cellpadding="0">
                        <c:forEach items="${exCompanyJobs }" var="exCompanyJob">
                        <tr>
                            <td class="one"><img src="${pageContext.request.contextPath}/updata/logo/${exCompanyJob.company.logo}" width="200px" height="100%" alt=""/></td>
                            <td class="two"><div>
                                <p style="font-size:17px;">${exCompanyJob.company.companyname}</p>
                                <p><a href="#" style="color:blue; text-decoration:none;">${exCompanyJob.jobs.jobname}</a></p>
                                <p style="margin-top:8px;">${exCompanyJob.company.companycharacter}</p>
                            </div></td>
                            <td class="three"><p style="font-size:22px; color:red;"><a href="#" style="color:red; text-decoration:none;">${exCompanyJob.jobs.jobsalary }</a></p></td>
                            <%--待修改--%>
                            <td class="four"><p><a href="${pageContext.request.contextPath}/deleteresume.action?jobid=${exCompanyJob.jobs.jobid}" style="text-decoration:none; color:blue;">删除</a></p></td>
                        </tr>
                        </c:forEach>
                    </table>
                </div>
                <div class="interview">
                    <h3 style="font-family:楷体; margin-left:10px;">我的面试</h3>
                    <hr>
                    <table  cellspacing="0" cellpadding="0">
                        <c:forEach items="${interviewJobs }" var="interviewJob">
                        <tr>
                            <td class="one">
                                <p style="font-size:17px;">${interviewJob.company.companyname}</p>
                                <p><a href="#" style="color:blue; text-decoration:none;">岗位：${interviewJob.jobs.jobname}</a></p>
                            </td>
                            <td class="two"><div>
                                <p>${interviewJob.handInResume.interviewdate}</p>
                            </div></td>
                            <td class="three"><p style="font-size:20px;"><a href="#" style="text-decoration:none; color:red;">待增加字段</a></p></td>
                            <td class="four"><p><a href="${pageContext.request.contextPath}/stu_job_detail.action?jobid=${interviewJob.jobs.jobid}&companyid=${interviewJob.company.companyid}" style="text-decoration:none; color:blue;">详情</a></p></td>
                        </tr>
                        </c:forEach>
                    </table>
                </div>
                <div class="offer">
                    <h3 style="font-family:楷体; margin-left:10px;">我的offer</h3>
                    <hr>
                    <table  cellspacing="0" cellpadding="0">
                        <c:forEach items="${OfferJobs }" var="OfferJob">
                        <tr style="margin-right:0px; padding-right:0px;">
                            <td style="width:100%; margin-right:0px;">
                                <p style="font-size:17px; margin-left:30px;">恭喜您！</p>
                                <br>
                                <p style="margin-left:80px;"><a href="#" style="text-decoration:none; color:red;">${OfferJob.company.companyname}</a>邀请您作为一名<a href="#" style="text-decoration:none; color:blue;">${OfferJob.jobs.jobname}</a>加入</p>
                                <br>
                                <p><a href="#" style="text-decoration:none; color:blue; float:right;">详情</a></p>
                            </td>
                        </tr>
                        </c:forEach>
                    </table>
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