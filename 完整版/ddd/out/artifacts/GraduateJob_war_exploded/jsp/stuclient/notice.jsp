<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
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

    <title>通知中心</title>

    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/publicCss.css">
    <link href="css/stu-notice.css" rel="stylesheet" type="text/css">


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
                        <li><a href="${pageContext.request.contextPath}/stu_home.action">首页</a></li>    <!--3 line-->
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
                <div style="width:99.9%;margin-left:10px;">
                <h2 style="color:blue;">通知中心</h2>
                <hr style="margin-bottom:0px;">
                </div>
                <div class="inform">
                    <table  cellspacing="0" cellpadding="0">
                        <tr>
                            <td class="state">状态</td>
                            <td class="teacher">来源</td>
                            <td class="details">详情</td>
                            <td class="time">时间</td>
                        </tr>
                        <c:forEach items="${notices }" var="notice">
                        <tr>
                            <td class="state"><label><input type="checkbox" name="check" /></label></td>
                            <td class="teacher">${notice.noticeFrom }</td>
                            <td class="details"><a href="${pageContext.request.contextPath}/stu_notice_detail.action?noticeid=${notice.noticeid}" style="text-decoration:none;">${notice.noticeTitle }</a></td>
                            <td class="time"><fmt:formatDate value="${notice.noticeTime}" pattern="yyyy-MM-dd"/></td>
                        </tr>
                        </c:forEach>
                    </table>
                </div>
           <nav class="paging">
              <ul class="pagination">
                 <li><a href="${pageContext.request.contextPath}/notice.action?currentPage=1">首页</a></li>
                
                <c:if test="${requestScope.currentPage ==1 }">
                    <li><a href="#">上一页</a></li>
                </c:if>
                <c:if test="${requestScope.currentPage !=1 }">
                    <li><a href="${pageContext.request.contextPath}/notice.action?currentPage=${requestScope.currentPage -1}">上一页</a></li>
                </c:if>
                
                 <c:if test="${requestScope.currentPage == requestScope.totalPage }">
                    <li><a href="#">下一页</a></li>
                </c:if>
                <c:if test="${requestScope.currentPage != requestScope.totalPage}">
                    <li><a href="${pageContext.request.contextPath}/notice.action?currentPage=${requestScope.currentPage +1}">下一页</a></li>
                </c:if>
                
                <li><a href="${pageContext.request.contextPath}/notice.action?currentPage=${requestScope.totalPage}">尾页</a></li>
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