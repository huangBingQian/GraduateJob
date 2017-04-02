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

    <title>查询反馈情况</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/collegePublicCss.css">
    <link rel="stylesheet" href="css/collegefeedback.css">


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
                    <li><a href="#">首页</a></li>
                    <li><a href="#">个人中心</a></li>
                </ul>
                <ul class="quit">
                    <li><a href="${pageContext.request.contextPath}/logout.action">退出</a></li>

                </ul>

            </div>
        </div>
    </div>
</nav>

<div class="container page-middle">
    <div class="row">
        <div class="left">
            <div class="clearfix">
                <img src="image/jobicon.png">
                <span class="company-name">某老师</span>
                <a href="#" class="company-website"></a>
                <ul class="left-menu">
                    <li><a href="${pageContext.request.contextPath}/job_intention_view.action">查看就业意向</a></li>
                    <li><a href="#">审核个人简历</a></li>
                    <li><a class="active"  href="#">查看反馈情况</a></li>
                    <li><a href="${pageContext.request.contextPath}/collegemeetingjoin.action">查看宣讲会参与情况</a></li>
                    <li><a href="#">开展就业指导工作</a></li>
                    <li><a href="${pageContext.request.contextPath}/ever_leave_school.action">判断学生可否离校</a></li>
                    <li><a href="#">查看毕业生基本信息</a></li>
                </ul>

            </div>
        </div>
        <div class="content" style="background-color: #ffffff;">
            
            <div class="address">
                <div class="addd">
                    <label>您当前的位置：</label>
                    <a hraf="#">首页</a>
                    <label>><label>
                    <a hraf="#">查看反馈情况</a>
                </div>
            </div>

            <div class="condition">
                <div class="first">
                    <div class="tittt" style="padding-left:20px;">
                        <h2>基本信息</h2>
                    </div>
                </div>
                <div class="second">
                    <div class="clno">
                        <label>班级</label>
                        <a hraf="#">13042311</a>
                        <a hraf="#">13042311</a>
                        <a hraf="#">13042311</a>
                        <a hraf="#">13042311</a>
                        <a hraf="#">13042311</a>
                        <a hraf="#" claa="more">更多</a>
                    </div>
                    <div class="tech" style="padding-top:20px;">
                        <label>专业</label>
                        <a hraf="#">计算机科学与技术</a>
                        <a hraf="#">网络工程</a>
                        <a hraf="#">物联网</a>
                        <a hraf="#">软件工程</a>
                        <a hraf="#" class="more">更多</a>
                    </div>
                    <div class="time" style="padding-top:20px;">
                        <label>提交时间</label>
                        <select style="width:80px;">
                                    <option>年</option>
                                    <option>2014</option>
                                    <option>2015</option>
                                    <option>2016</option>
                        </select>
                        <select style="width:70px;">
                                    <option>月</option>
                                    <option>01</option>
                                    <option>02</option>
                                    <option>03</option>
                        </select>
                        <select style="width:80px;">
                                    <option>日</option>
                                    <option>1</option>
                                    <option>2</option>
                                    <option>3</option>
                        </select>
                        <button type="submit">确定</button>
                    </div>
                </div>
                <div class="third">
                    <div class="third-line">
                        <label>搜索</label>
                                <select style="width:120px;">
                                    <option>班级</option>
                                    <option>14052311</option>
                                    <option>14052312</option>
                                    <option>14052313</option>
                                </select>
                        <input type="text" name="username" placeholder="学号"/>
                        <button type="submit">查看</button>
                    </div>
                </div>
            </div>

            <div class="message">
                <table class="msgtable">
                    <tr>
                        <td><label>班级</label></td>
                        <td><label>学号</label></td>
                        <td><label>姓名</label></td>
                        <td><label>专业</label></td>
                        <td><label>提交时间</label></td>
                        <td>详细信息</td>
                    </tr>
                    <tr>
                        <td>13052313</td>
                        <td>13055321</td>
                        <td>张三</td>
                        <td>计算机科学与技术</td>
                        <td>2016-4-17</td>
                        <td>
                            <div class="button-c">
                                <button type="submit"><a href="${pageContext.request.contextPath}/collegefeedmessage.action">查看</a></button>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td>13052313</td>
                        <td>13055321</td>
                        <td>李二</td>
                        <td>计算机科学与技术</td>
                        <td>2016-4-17</td>
                        <td>
                            <div class="button-c">
                                <button type="submit" ><a href="${pageContext.request.contextPath}/collegefeedmessage.action">查看</a></button>
                            </div>
                        </td>
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