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

    <title>Jumbotron Template for Bootstrap</title>
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
    <script src="js/jquery-3.1.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/PostUtile.js"></script>
    <script src="js/jquerySession.js"></script>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/stu-job.css">


    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="http://cdn.bootcss.com/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <script type="text/javascript">
        
//            session里必须有minPageNum和maxPageNum
//            如果$.session.getxxx方法用不了的话换java的<%=session.getAttribute("xxx")%>
        $(document).ready(function() {
            var requstList = new Array();
            var page = $.session.get('page');
            var character = $.session.get('character');
            var industry = $.session.get('industry');
            if(character != null){
                requstList[0] = {name: "character", value: character}
            }
            if(industry != null){
                requstList[1] = {name: "industry", value: industry}
            }
            if(page == null){
                page = 1
                requstList[2] = {name: "page", value: page}
            }


            $("#character a").click(function () {
                var s = $(this).text();
                if(s != "全部"){
                    requstList[0] = {name: "character", value: s}
                    Post(url, requstList)
                }
            });
            $("#industry a").click(function () {
                var s = $(this).text();
                if(s != "全部"){
                    requstList[1] = {name: "industry", value: s}
                    Post(url, requstList)
                }
            });
            var minPagNum = $.session.get('minPagNum');
            var maxPagNum = $.session.get('maxPagNum');
            if(page <= minPagNum){
                $("#goBack").parent('li').attr("disabled","disabled");
                $("#goBack").parent('li').addClass("disabled");
            }

            if(page >= maxPagNum){
                $("#moveForward").parent('li').attr("disabled","disabled");
                $("#moveForward").parent('li').addClass("disabled");
            }

            $("#goBack").click(function () {
                if(page > minPagNum) {
                    page = page - 1
                    requstList[2] = {name: "page", value: page}
                    Post(url, requstList)

                }
            })
            $("#moveForward").click(function () {
                if(page < maxPagNum) {
                    page = page + 1
                    requstList[2] = {name: "page", value: page}
                    Post(url, requstList)
                }
            })


        });

    </script>

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
            <!--选择表-->
            <div class="choices">
                <div class="clearfix">
                    <span>性质</span>
                    <div>
                        <ul id="character">
                            <li><a  class="active">全部</a> </li>
                            <c:forEach items="${companycharacterlists }" var="companycharacterlist">
                                <li><a href="">${companycharacterlist.companycharacter}</a> </li>
                            </c:forEach>
                        </ul>
                    </div>
                </div>
                <div class="clearfix">
                    <span>行业</span>
                    <div>
                        <ul id="industry">
                            <li><a href="" class="active">全部</a> </li>
                            <c:forEach items="${industrylists }" var="industrylist">
                                <li><a href="">${industrylist.industry}</a> </li>
                            </c:forEach>
                        </ul>
                    </div>
                </div>
            </div>
            <!--职位表-->
            <div class="job-list">
                <div class="hd">
                    <input id="choseAll" type="checkbox" class="checkbox">
                    <span>全选</span>
                    <button type="button" class="btn btn-primary">投递选中职位</button>
                </div>
                <div class="atrribute">
                    <span class="job-name">职位名</span>
                    <span class="company-name">公司名</span>
                    <span class="workplace">工作地点</span>
                    <span class="pay">薪资</span>
                </div>
                <ul>
                    <c:forEach items="${exCompanyJobs }" var="exCompanyJob">
                    <li>
                        <span class="job-name">
                            <input type="checkbox" class="checkbox">
                            <a href="${pageContext.request.contextPath}/stu_job_detail.action?jobid=${exCompanyJob.jobs.jobid}&companyid=${exCompanyJob.company.companyid}">${exCompanyJob.jobs.jobname}</a>

                        </span>
                        <a class="company-name" href="#">${exCompanyJob.company.companyname}</a>
                        <span class="workplace">${exCompanyJob.jobs.jobaddress}</span>
                        <span class="pay">${exCompanyJob.jobs.jobsalary}</span>
                    </li>
                    </c:forEach>
                </ul>
            </div>
            <nav class="fenye">
                <ul class="pagination">
                    <li><a id="goBack" href="#">&laquo;</a></li>
                    <li><a href="#">1</a></li>
                    <li><a href="#">2</a></li>
                    <li><a href="#">3</a></li>
                    <li><a href="#">4</a></li>
                    <li><a href="#">5</a></li>
                    <li><a id="moveForward" href="#">&raquo;</a></li>
                </ul>
            </nav>

        </div>
    </div>
    <div class="container-fluid page-end">

        <p class="text-center">版权申明</p>
    </div>
    <script src="js/bootstrap.min.js"></script>
</body>
</html>