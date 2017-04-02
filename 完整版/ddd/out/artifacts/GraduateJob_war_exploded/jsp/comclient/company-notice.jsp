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

    <title>面试/offer管理</title>

    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/CompanayPublicCss.css">
    <link rel="stylesheet" href="css/company-notice.css">

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
                    <li><a class="active" href="${pageContext.request.contextPath}/company_notice.action">通知消息</a></li>
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
                    <li><a href="${pageContext.request.contextPath}/company_resume_view.action">面试/offer情况管理</a></li>
                </ul>

            </div>
        </div>
        <div class="content">
            <div class="main_right">
                <p class="read">未读</p>
                <hr>
                <c:forEach items="${notices}" var="notice">
                <table>
                <tr>
                	<td class="one">From:</td>
                	<td class="two"><p><b>${notice.noticeFrom}</b></p></td>
                	<td class="three">&nbsp;</td>
                </tr>
                <tr>
                	<td class="one">&nbsp;</td>
                    <td class="two"><p>${notice.noticeTitle}</p></td>
                	<td class="three">
                        <div class="btn-group">
                          <button type="button" class="btn btn-default" ><a href="${pageContext.request.contextPath}/company_notice_detail.action?noticeid=${notice.noticeid}">查看</button>
                        </div>
                    </td>
                </tr>
                <tr>
                	<td class="one">Time:</td>
                	<td class="two">${notice.noticeTime}</td>
                    <td class="three">&nbsp;</td>
                </tr>
                </table>
                </c:forEach>
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
