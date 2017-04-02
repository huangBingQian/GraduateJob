<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <style type="text/css">
    @import url("css/stu-msg.css");
</style>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Jumbotron Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/stu-msg.css">


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
                        <li><a href="${pageContext.request.contextPath}/stu_home.action">首页</a></li>
                        <li><a href="${pageContext.request.contextPath}/stu_job.action">职位</a></li>
                        <li><a href="${pageContext.request.contextPath}/notice.action">个人中心</a></li>
                </ul>
                <ul class="user">
                    <li class="user-logo" style="background-image: url(image/sp16_004.jpg)"></li>
                    <li>
                        <span class="name">${sessionScope.userName }</span>
                        <span class="badge">
                                <img src="${sessionScope.stu.picture}">
                                <span class="msg-number"> ${sessionScope.noticeAmount } </span>
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
                                            <span><a href="${pageContext.request.contextPath}/login.jsp"></span>
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
        <div class="left">
            <div class="clearfix">

                <div class="left_top" align="center">

                <img src="${sessionScope.stu.picture}" width="122px" height="122px" style alt="" />
                <label style="color:blue;">${sessionScope.userName }</label>
                
            </div>


                <ul class="left-menu">
                    <li><a href="#">个人主页</a></li>
                    <li><a href="${pageContext.request.contextPath}/resume.action">简历信息</a></li>
                    <li><a href="${pageContext.request.contextPath}/employment.action">其他信息</a></li>
                    <li><a href="${pageContext.request.contextPath}/notice.action">通知中心</a></li>
                </ul>

            </div>
        </div>

        <div class="content">
            <div class="">
            <div class="resume">
                <h3 style="font-family:楷体;">个人信息</h3>
                <hr></hr>
                <table  cellspacing="0" cellpadding="0" width="50%">
                    <tr>
                        <td style='text-align:right;'>姓名：</td>
                        <td> ${sessionScope.userName }</td>
                        <td style='text-align:right;'>学号：</td>
                        <td> ${sessionScope.userId }</td>
                    </tr>
                    <tr>
                        <td style='text-align:right;'>学院：</td>
                        <td>${sessionScope.stu.sex }</td>
                        <td style='text-align:right;'>班级：</td>
                        <td>${sessionScope.stu.classId }</td>
                    </tr>
                    <tr>
                        <td style='text-align:right;'>专业：</td>
                        <td>${sessionScope.stu.classId }</td>
                    </tr>
                </table>
            </div>

            <div class="offer">
                <h3 style="font-family:楷体;color:blue;">最近日程</h3>
                <hr></hr>
                <table cellspacing="0" cellpadding="0" width="100%" >
                    <tr>
                        <td>周一</td>
                        <td>周二</td>
                        <td>周三</td>
                        <td>周四</td>
                        <td>周五</td>
                        <td>周六</td>
                        <td>周日</td>
                    </tr>
                    <tr>
                        <td>31</td>
                        <td>参加就业指导</td>
                        <td>2</td>
                        <td>3</td>
                        <td>4</td>
                        <td>5</td>
                        <td>6</td>
                    </tr>
                    <tr>
                        <td>7</td>
                        <td>8</td>
                        <td>9</td>
                        <td>10</td>
                        <td>11</td>
                        <td>12</td>
                        <td>13</td>
                    </tr>
                    <tr>
                        <td>周一</td>
                        <td>周二</td>
                        <td>周三</td>
                        <td>周四</td>
                        <td>周五</td>
                        <td>周六</td>
                        <td>周日</td>
                    </tr>
                    <tr>
                        <td>周一</td>
                        <td>周二</td>
                        <td>周三</td>
                        <td>周四</td>
                        <td>周五</td>
                        <td>周六</td>
                        <td>周日</td>
                    </tr>
                    <tr>
                        <td>周一</td>
                        <td>周二</td>
                        <td>周三</td>
                        <td>周四</td>
                        <td>周五</td>
                        <td>周六</td>
                        <td>周日</td>
                    </tr>
                </table>
            </div>

            <div class="offer_mm">
                <hr></hr>
                <table cellspacing="0" cellpadding="0">
                    <tbody>
                    <tr>
                    <td>待办事项</td>
                    <td>时间</td>
                    <td>地点</td>
                    </tr>
                    <c:forEach items="${daiBanShiXiangList}" var="dbsx">
                        <tr>
                            <td>${dbsx.event }</td>
                            <td><fmt:formatDate value="${dbsx.date}" pattern="yyyy-MM-dd"/></td>
                            <td>${dbsx.place }</td>
                        </tr>
                    </c:forEach>
 
                    <tr>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                    </tr>
                </tbody>
                </table>
                
            </div>
            <div class="jinzhan">
                <h3 style="font-family:楷体;color:blue;">就业进展</h3>
                <hr></hr>
                <br />
                <p style="float:left;">参加就业指导次数：</p><p>3</p>
                <br />
                <p style="float:left;">参与宣讲会次数：</p><p>8</p>
                <br />
                <p style="float:left;">投递简历数：</p><p>${MyJianLiNum }</p>
                <br />
                <p style="float:left;">得到offer数：</p><p>1</p>
                <br />
            </div>
            <div class="interest">
                <h3 style="font-family:楷体;color:blue;">我感兴趣的公司和职位</h3>
                
                <table  cellspacing="0" cellpadding="0" class="huawei" style="width:100%;">
                 <c:forEach items="${requestScope.myJianLis }" var="myJianLi">
                    <tr>
                        <td><img src="${pageScope.myJianLi.companyPic}" width="160px" height="80px" alt=""/> </td>
                        <td><div>
                            <p style="font-size:17px; margin-left:10px;">${pageScope.myJianLi.companyName }</p>
                            <br>
                            <p style="margin-left:10px;"><a href="#" style="color:blue; text-decoration:none;">岗位：${pageScope.myJianLi.jobName }</a></p>
                            <p style="margin-top:8px; margin-left:10px;">世界500强企业</p>
                        </div></td>
                        <td><p style="text-align:right; font-size:22px; color:red;"><a href="#" style="color:red; text-decoration:none;">${pageScope.myJianLi.pay }</a></p></td>
                        <td><p><a href="#" style="text-decoration:none; color:blue; margin-left:80px;">删除</a></p></td>
                    </tr>
                 </c:forEach> 
                        <td>&nbsp;</td>
                        <td><div>
                            <p style="font-size:17px; margin-left:10px;">&nbsp;</p>
                            <br>
                            <p style="margin-left:10px;"><a href="#" style="color:blue; text-decoration:none;">&nbsp;</a></p>
                            <p style="margin-top:8px; margin-left:10px;">&nbsp;</p>
                        </div></td>
                        <td><p style="text-align:right; font-size:22px; color:red;"><a href="#" style="color:red; text-decoration:none;">&nbsp;</a></p></td>
                        <td><p><a href="#" style="text-decoration:none; color:blue; margin-left:80px;">&nbsp;</a></p></td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td><div>
                            <p style="font-size:17px; margin-left:10px;">&nbsp;</p>
                            <br>
                            <p style="margin-left:10px;"><a href="#" style="color:blue; text-decoration:none;">&nbsp;</a></p>
                            <p style="margin-top:8px; margin-left:10px;">&nbsp;</p>
                        </div></td>
                        <td><p style="text-align:right; font-size:22px; color:red;"><a href="#" style="color:red; text-decoration:none;">&nbsp;</a></p></td>
                        <td><p><a href="#" style="text-decoration:none; color:blue; margin-left:80px;">&nbsp;</a></p></td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td><div>
                            <p style="font-size:17px; margin-left:10px;">&nbsp;</p>
                            <br>
                            <p style="margin-left:10px;"><a href="#" style="color:blue; text-decoration:none;">&nbsp;</a></p>
                            <p style="margin-top:8px; margin-left:10px;">&nbsp;</p>
                        </div></td>
                        <td><p style="text-align:right; font-size:22px; color:red;"><a href="#" style="color:red; text-decoration:none;">&nbsp;</a></p></td>
                        <td><p><a href="#" style="text-decoration:none; color:blue; margin-left:80px;">&nbsp;</a></p></td>
                    </tr>
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