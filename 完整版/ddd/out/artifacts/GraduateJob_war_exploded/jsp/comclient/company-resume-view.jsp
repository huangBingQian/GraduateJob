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

    <title>简历查看</title>

    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/CompanayPublicCss.css">
    <link href="css/company-resume-view.css" rel="stylesheet" type="text/css">

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
                    <li><a class="active" href="${pageContext.request.contextPath}/company_home.action">首页</a></li>
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
                    <li><a href="${pageContext.request.contextPath}/company_baseInfo.action">基本信息填写</a></li>
                    <li><a href="${pageContext.request.contextPath}/company_infomsg.action">招聘信息填写</a></li>
                    <li><a href="${pageContext.request.contextPath}/company_infoarr.action">宣讲会发起/查看</a></li>
                    <li><a href="${pageContext.request.contextPath}/company_stumesgcheek.action">招聘会参与</a></li>
                    <li><a class="active" href="${pageContext.request.contextPath}/company_resume_view.action">面试/offer情况管理</a></li>
                </ul>

            </div>
        </div>
        <div class="content">
            <div class="main_right">
				<div class="right_head">
                	<div class="right_head_main press">
                    	<button type="button" class="btn btn-default" style="border-left:0;">全选</button>
                    </div>
                	<div class="right_head_main blank"></div>
                	<div class="right_head_main press">                    	<button type="button" class="btn btn-default">删除</button>
</div>
                	<div class="right_head_main blank"></div>
                	<div class="right_head_main press">                    	<button type="button" class="btn btn-default">面试通知</button>
</div>
                	<div class="right_head_main blank"></div>
                	<div class="right_head_main press">                    	<button type="button" class="btn btn-default" style="border-right:0;">offer发送</button>
</div>
                </div>
                <c:forEach items="${exCompanyJobs}" var="exCompanyJob">
                <div class="main">
                    <div class="main_top"></div>
                    <div class="main_main">
                        <div class="right-left">
                            <table>
                                <tr>
                                    <td class="one">
                                    	<input type="checkbox" />
                                    </td>
                                    <th rowspan="6"><img src="${pageContext.request.contextPath}/updata/stulogo/${exCompanyJob.graduate.stuLogo}" width="100%" height="100%" alt="" /></th>
                                    <td class="two">所投岗位</td>
                                    <td class="three">${exCompanyJob.jobs.jobname}</td>
                                    <td class="four"><b>毕业年份</b></td>
                                </tr>
                                <tr>
                                    <td class="one"></td>
                                    <td class="two">姓名</td>
                                    <td class="three">${exCompanyJob.graduate.graduatename}</td>
                                    <td class="four">${exCompanyJob.graduate.graduateyear}</td>
                                </tr>
                                <tr>
                                    <td class="one"></td>
                                    <td class="two">学院</td>
                                    <td class="three">${exCompanyJob.graduate.institute}</td>
                                    <td class="four">邮箱</td>
                                </tr>
                                <tr>
                                    <td class="one"></td>
                                    <td class="two">专业</td>
                                    <td class="three">${exCompanyJob.graduate.major}</td>
                                    <td class="four"><b>${exCompanyJob.graduate.graduateemail}</b></td>
                                </tr>
                                <tr>
                                    <td class="one"></td>
                                    <td class="two">成绩</td>
                                    <td class="three">${exCompanyJob.graduate.grade}</td>
                                    <td class="four"></td>
                                </tr>
                                <tr>
                                    <td class="one"></td>
                                    <td class="two">查看情况</td>
                                    <td class="three"><a href="${pageContext.request.contextPath}/company_resume_details.action?jobid=${exCompanyJob.jobs.jobid}&graduateid=${exCompanyJob.graduate.graduateid}">${exCompanyJob.message}</a></td>
                                    <td class="four date">${exCompanyJob.handInResume.senddate}</td>
                                </tr>
                            </table>
                        </div>
                        <div class="right-right">
                        <button type="button" class="btn btn-default"><a href="${pageContext.request.contextPath}/company_interview_notice.action?jobid=${exCompanyJob.jobs.jobid}&graduateid=${exCompanyJob.graduate.graduateid}">面试通知</a></button>
                        <button type="button" class="btn btn-default"><a href="${pageContext.request.contextPath}/company_offer_notice.action?jobid=${exCompanyJob.jobs.jobid}&graduateid=${exCompanyJob.graduate.graduateid}">offer发送</a></button>
                        <button type="button" class="btn btn-default">删除</button>
                        </div>
                    </div>
                </div>
                </c:forEach>
                <nav class="right-bottom">
                  <ul class="pagination">
                    <li><a href="#">&laquo;</a></li>
                    <li><a href="#">1</a></li>
                    <li><a href="#">2</a></li>
                    <li><a href="#">3</a></li>
                    <li><a href="#">4</a></li>
                    <li><a href="#">5</a></li>
                    <li><a href="#">&raquo;</a></li>
                  </ul>
                </nav>
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