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

    <title>企业首页</title>

    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/CompanayPublicCss.css">
    <link href="css/company-home.css" rel="stylesheet" type="text/css">
<script src="js/piechart.js"></script> 

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
                <%--数据库读取:公司图片,公司名字,公司网址,每个页面都有--%>
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
                <div class="information">
                  <p>企业信息</p>
                  <hr />
                <table>
                <tr>
                    <td><p><b>企业名称</b></p></td>
                    <td><p>${sessionScope.company.companyname}</p></td>
                </tr>
                <tr>
                    <td><p><b>企业性质</b></p></td>
                    <td><p>${sessionScope.company.companycharacter}</p></td>
                </tr>
                </table>
                <table>
                <tr>
                    <td><p><b>企业地址</b></p></td>
                    <td><p>${sessionScope.company.companyplace}</p></td>
                </tr>
                <tr>
                    <td><p><b>所属行业</b></p></td>
                    <td><p>${sessionScope.company.industry}</p></td>
                </tr>
                </table>
                </div>
                <div class="statistic">
                <p>招聘情况统计</p>
                <hr />
                    <div class="piechart">
                    <p>简历查看统计</p>
                    <canvas id="canvas_circle_01" width="280" height="140">
                    </canvas>
                    </div>
                    <div class="piechart">
                    <p>面试通知统计</p>
                    <canvas id="canvas_circle_02" width="280" height="140">
                    </canvas>
                    </div>
                </div>
                <div class="statistic">
                <p>各职位招聘情况统计</p>
                <hr />
                <div>
                    <div>
                        <div class="progress">
                            <div class="progress-bar" role="progressbar" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100" style="width: 50%;">
                            5
                            </div>
                            <p style="text-align:center">5</p>
                        </div>
                        <div class="job">
                        <p>java工程师</p>
                        </div>
                    </div>
                    <div>
                    <div class="progress">
                            <div class="progress-bar" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width: 70%;">
                            7
                            </div>
                            <p style="text-align:center">3</p>
                        </div>
                        <div class="job">
                        <p>web前端工程师</p>
                        </div>
                    </div>
                    <div>
                    <div class="progress">
                            <div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%;">
                            6
                            </div>
                            <p style="text-align:center">4</p>
                        </div>
                        <div class="job">
                        <p>UI设计师</p>
                        </div>
                    </div>
                    <div>
                    <div class="progress">
                            <div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%;">
                            6
                            </div>
                            <p style="text-align:center">4</p>
                        </div>
                        <div class="job">
                        <p>安卓工程师</p>
                        </div>
                    </div>
                    <div>
                    <div class="progress">
                            <div class="progress-bar" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%;">
                            4
                            </div>
                            <p style="text-align:center">6</p>
                        </div>
                        <div class="job">
                        <p>IOS工程师</p>
                        </div>
                    </div>
                </div>
                </div>
                <div class="information">
                <p>企业招聘进程</p>
                <hr />
                <div class="recruit_process">
                    <p>企业参与招聘会次数<a href="#">1</a>次</p>
                    <p>企业开展招聘会次数<a href="#">2</a>次</p>
                    <p>企业接收到学生简历数量<a href="#">21</a>次</p>
                    <p>参与企业面试人数<a href="#">12</a>人</p>
                    <p>企业招收到的人数<a href="#">8</a>次</p>
                </div>
                </div>
                <div class="information">
                <p>杭州电子科技大学往年招聘情况统计</p>
                <hr />
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