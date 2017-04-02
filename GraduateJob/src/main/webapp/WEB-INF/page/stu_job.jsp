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

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="./css/bootstrap.min.css">
    <link rel="stylesheet" href="./css/reset.css">
    <link rel="stylesheet" href="./css/stu-job.css">

    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
    <script src="./js/bootstrap.min.js"></script>
    <script src="./js/jquerySession.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="http://cdn.bootcss.com/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>

    <![endif]-->
    <script type="text/javascript">
        $(document).ready(function() {
            page = <%=session.getAttribute("page") %>;
            var pagenub = '#page' + page;
            $(pagenub).addClass("active");
            $("#job").css({
                "color": "#074fc9",
                "font-weight": "600"
            });

            $("#goBack").attr("href" ,function () {
                  if(page <= 1){
                      $("#goBack").parent('li').attr("disabled","disabled");
                      $("#goBack").parent('li').addClass("disabled");
                      return "#";
                  }else {
                      return "${pageContext.request.contextPath}"+"/test2.action?page=" + (page-1);
                  }
            });
            $("#moveForward").attr("href" ,function () {
                var pageNub = <%=session.getAttribute("pageNub")%>;
                if(page >= pageNub){
                    $("#moveForward").parent('li').attr("disabled","disabled");
                    $("#moveForward").parent('li').addClass("disabled");
                    return "#";
                }else {
                    return "${pageContext.request.contextPath}"+"/test2.action?page=" + (page+1);
                }
            });
            var character = getUrlParam("type");
            if(character == null){
                $("#all").addClass("active");
            }else {
                $("#"+character).addClass("active");
            }

        });

        function getUrlParam (name) {
            var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); 
            var r = window.location.search.substr(1).match(reg); 
            if (r != null) return decodeURI(r[2]); return null;
        }

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
                    <img alt="Brand" src="./image/logo.png">

                </div>
                <div class="navbar-collapse collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li><a id="home" href="${pageContext.request.contextPath}/test3.action">首页</a></li>
                        <li><a id="job" id="job" href="${pageContext.request.contextPath}/test2.action">职位</a></li>
                        <li><a id="self" href="${pageContext.request.contextPath}/notice.action">个人中心</a></li>
                    </ul>
                    <ul class="user">
                        <li class="user-logo" style="background-image: url(${sessionScope.stu.picture })"></li>
                        <li>
                            <span class="name">${sessionScope.userName }</span>
                            <span class="badge">
                                <img src="./image/icon-news.png">
                                <span class="msg-number">${sessionScope.noticeAmount }</span>
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
                                            <span>${sessionScope.userName}</span>
                                            <span>注销</span>
                                        </span>

                                        </li>
                                    </ul>
                                </div>

                                <p>您有${sessionScope.noticeAmount }条通知</p>
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
                        <ul>
                            <li><a id="all" href="${pageContext.request.contextPath}/test2.action?type=all">全部</a> </li>
                            <li><a id="IT" href="${pageContext.request.contextPath}/test2.action?type=IT" >IT</a> </li>
                            <li><a id="房产" href="${pageContext.request.contextPath}/test2.action?type=房产">房产</a> </li>
                            <li><a id="医疗" href="${pageContext.request.contextPath}/test2.action?type=医疗">医疗</a> </li>
                            <li><a id="化工" href="${pageContext.request.contextPath}/test2.action?type=化工">化工</a> </li>
                        </ul>
                    </div>
                </div>
                <div class="clearfix">
                    <span>性质</span>
                    <div>
                        <ul>
                            <li><a href="" class="active">全部</a> </li>
                            <li><a href="">外商独资</a> </li>
                            <li><a href="">合资</a> </li>
                            <li><a href="">合资</a> </li>
                            <li><a href="">合资</a> </li>
                            <li><a href="">合资</a> </li>
                            <li><a href="">合资</a> </li>
                            <li><a href="">合资</a> </li>
                            <li><a href="">合资</a> </li>
                            <li><a href="">合资</a> </li>
                            <li><a href="">合资</a> </li>
                            <li><a href="">合资</a> </li>
                            <li><a href="">合资</a> </li>
                        </ul>
                    </div>
                </div>
                <div class="clearfix">
                    <span>性质</span>
                    <div>
                        <ul>
                            <li><a href="" class="active">全部</a> </li>
                            <li><a href="">外商独资</a> </li>
                            <li><a href="">合资</a> </li>
                            <li><a href="">合资</a> </li>
                            <li><a href="">合资</a> </li>
                            <li><a href="">合资</a> </li>
                            <li><a href="">合资</a> </li>
                            <li><a href="">合资</a> </li>
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
                    <c:forEach items="${jobList}" var="job">
                        <li>
                        <span class="job-name">
                            <input type="checkbox" class="checkbox">
                            <a href="#">${job.jobname}</a>

                        </span>
                            <a class="company-name" href="#">${job.companyname}</a>
                            <span class="workplace">${job.workplace}</span>
                            <span class="pay">${job.pay}</span>
                        </li>
                    </c:forEach>
                </ul>
            </div>
            <nav class="fenye">
                <ul class="pagination">
                    <li><a id="goBack" href="#">&laquo;</a></li>
                    <c:forEach var="i" begin="1" end="${pageNub}" step="1">
                        <li id="page${i}" ><a href="${pageContext.request.contextPath}/test2.action?page=${i}" >${i}</a></li>
                    </c:forEach>
                    <li><a id="moveForward" href="#">&raquo;</a></li>
                </ul>
            </nav>

        </div>
    </div>
    <div class="container-fluid page-end">

        <p class="text-center">版权申明</p>
    </div>
</body>
</html>
