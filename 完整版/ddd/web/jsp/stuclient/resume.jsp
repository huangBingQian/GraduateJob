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

    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/reset.css">    
    <link rel="stylesheet" href="css/stu-jianli.css">
    <style type="text/css">
@import url("css/message.css");



</style>


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
                <div class="left_top" align="center">
                    <img src="${pageContext.request.contextPath}/updata/stulogo/${sessionScope.graduate.stuLogo}" width="122px" height="122px" style alt="" />
                    <label style="color:blue;">${sessionScope.graduate.graduatename }</label>
            </div>
                <ul class="left-menu">
                    <li><a href="${pageContext.request.contextPath}/message.action">个人主页</a></li>
                    <li><a href="${pageContext.request.contextPath}/resume.action">简历信息</a></li>
                    <li><a href="${pageContext.request.contextPath}/employment.action">就业中心</a></li>
                    <li><a href="${pageContext.request.contextPath}/notice.action">通知中心</a></li>
                </ul>
            </div>
        </div>
        <div class="content">
            <div class="resume">
                <h3 style="color:blue">简历管理</h3>
                <hr></hr>
            </div>
            <div class="ps_message">
                <div class="msg">
                    <label>姓名：</label>
                    <label class="msg_msg">${sessionScope.graduate.graduatename}</label>
                </div>
                <div class="msg">
                    <label>年龄：</label>
                    <label class="msg_msg">${sessionScope.graduate.age}</label>
                </div>
                <div class="msg">
                    <label>性别：</label>
                    <label class="msg_msg">${sessionScope.graduate.sex}</label>
                </div>
                <div class="msg">
                    <label>专业：</label>
                    <label class="msg_msg">${sessionScope.graduate.major}</label>
                </div>
                <div class="msg">
                    <label>手机号码：</label>
                    <label class="msg_msg">${sessionScope.graduate.graduatephone}</label>
                </div>
                <div class="msg">
                    <label>邮箱：</label>
                    <label class="msg_msg">${sessionScope.graduate.graduateemail}</label>
                </div>
                <div class="msg">
                    <label>掌握技能：</label>
                    <textarea id="TextArea1" cols="5" rows="2">${sessionScope.graduate.masterskill}</textarea>
                </div>
                <div class="msg">
                    <label>实践经验：</label>
                    <textarea id="TextArea1" cols="5" rows="2">${sessionScope.graduate.practicalexperience}</textarea>
                </div>
                    <div class="upload">
                        <div class="upload1">
                            <label>上传个性化简历：</label>
                        </div>
                        <div class="upload2">
                            <form enctype="multipart/form-data" method="post" action="https://www.baidu.com"> 
                                <input type="file" name="jianli" style="outline:none;">
                                <input type="submit" value="上传" class="upload2" style="height:25px;"/>
                                <div class="download">
                                <button><a href="${pageContext.request.contextPath}/updata/resume/${sessionScope.graduate.resumeFile}" style="height:18px;">点击下载</a></button>
                                </div>
                            </form>
                        </div>
                    </div> 
            </div>
                <hr></hr>
                <div class="interest">
                <h3 style="font-family:楷体;color:blue;">我投过的简历</h3>
                <table  cellspacing="0" cellpadding="0" class="huawei" style="width:100%; margin-top:20px;">
                    <c:forEach items="${exCompanyJobs}" var="exCompanyJob">
                    <tr>
                        <td><img src="${pageContext.request.contextPath}/updata/logo/${exCompanyJob.company.logo}" width="160px" height="80px" alt=""/> </td>
                        <td><div>
                            <p style="font-size:17px; margin-left:10px;">${exCompanyJob.company.companyname}</p>
                            <br>
                            <p style="margin-left:10px;"><a href="#" style="color:blue; text-decoration:none;">岗位：${exCompanyJob.jobs.jobname}</a></p>
                            <p style="margin-top:8px; margin-left:10px;">${exCompanyJob.company.companycharacter}</p>
                        </div></td>
                        <td><p style="text-align:right; font-size:22px; color:red;"><a href="#" style="color:red; text-decoration:none;">${exCompanyJob.jobs.jobsalary}</a></p></td>
                        <td><label style="text-decoration:none; color:blue; margin-left:80px;">${exCompanyJob.message}</label></td>
                    </tr>
                    </c:forEach>
                </table>
            </div>
                <div class="interest">
                <h3 style="font-family:楷体;color:blue;margin-top:20px;">我得到的offer</h3>
                <table  cellspacing="0" cellpadding="0" class="huawei" style="width:100%; margin-top:20px;">
                    <c:forEach items="${OfferJobs}" var="OfferJob">
                    <tr>
                        <td><img src="${pageContext.request.contextPath}/updata/logo/${OfferJob.company.logo}" width="160px" height="80px" alt=""/> </td>
                        <td><div>
                            <p style="font-size:17px; margin-left:10px;">${exCompanyJob.company.companyname}</p>
                            <br>
                            <p style="margin-left:10px;"><a href="#" style="color:blue; text-decoration:none;">岗位：${exCompanyJob.jobs.jobname}</a></p>
                            <p style="margin-top:8px; margin-left:10px;">${exCompanyJob.company.companycharacter}</p>
                        </div></td>
                        <td><p style="text-align:right; font-size:22px; color:red;"><a href="#" style="color:red; text-decoration:none;">${exCompanyJob.jobs.jobsalary}</a></p></td>
                        <td><p><a href="#" style="text-decoration:none; color:blue; margin-left:80px;">${exCompanyJob.message}</a></p></td>
                    </tr>
                    </c:forEach>
                </table>
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