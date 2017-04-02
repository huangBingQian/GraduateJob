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

    <title>判断学生可否离校</title>

    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/collegePublicCss.css">
    <link rel="stylesheet" href="css/ever-leave-school.css">
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
                <img src="image/head.jpg" height="400" alt="" />
                <span class="company-name">某老师</span>
                <a href="#" class="company-website"></a>
                <ul class="left-menu">
                    <li><a href="${pageContext.request.contextPath}/job_intention_view.action">查看就业意向</a></li>
                    <li><a href="#">审核个人简历</a></li>
                    <li><a href="${pageContext.request.contextPath}/collegefeedback.action">查看反馈情况</a></li>
                    <li><a href="${pageContext.request.contextPath}/collegemeetingjoin.action">查看宣讲会参与情况</a></li>
                    <li><a href="#">开展就业指导工作</a></li>
                    <li><a class="active" href="#">判断学生可否离校</a></li>
                    <li><a href="#">查看毕业生基本信息</a></li>
                </ul>

            </div>
        </div>
        <div class="content">
            <div class="top">您当前的位置：首页&gt;判断学生可否离校
            </div>
            <h3>个人简历审核</h3>
            <hr>
            <div class="head">
                <ol class="breadcrumb">
                  <li class="active">班级</li>
                  <li><a href="#">14052311</a></li>
                  <li><a href="#">14052312</a></li>
                  <li><a href="#">14052313</a></li>
                  <li><a href="#">14052314</a></li>
                  <li><a href="#">14052315</a></li>
                  <li><a href="#">14052316</a></li>
                  <li><a href="#">更多</a></li>
                </ol>
                <ol class="breadcrumb">
                  <li class="active">专业</li>
                  <li><a href="#">计算机科学与技术</a></li>
                  <li><a href="#">软件工程</a></li>
                  <li><a href="#">网络工程</a></li>
                  <li><a href="#">物联网</a></li>
                  <li><a href="#">更多</a></li>
                </ol>
                <ol class="breadcrumb">
                  <li class="active">状态</li>
                  <li><a href="#">不可离校</a></li>
                  <li><a href="#">可离校</a></li>
                  <li><a href="#">未审核</a></li>
                </ol>
                <ol class="breadcrumb">
                  <li class="active time">提交时间</li>
                    <div class="btn-group time">
                        <div class="btn-group">
                            <select class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                                <option>2014</option>
                                <option>2015</option>
                                <option>2016</option>
                                <option>2017</option>
                                <option>2018</option>
                            </select>
                         </div> 
                        <div class="btn-group">
                            <select class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                                <option>1</option>
                                <option>2</option>
                                <option>3</option>
                                <option>4</option>
                                <option>5</option>
                                <option>6</option>
                                <option>7</option>
                                <option>8</option>
                                <option>9</option>
                                <option>10</option>
                                <option>11</option>
                                <option>12</option>
                            </select>
                         </div> 
                        <div class="btn-group">
                            <select class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                                <option>1</option>
                                <option>2</option>
                                <option>3</option>
                                <option>4</option>
                                <option>5</option>
                                <option>6</option>
                                <option>7</option>
                                <option>8</option>
                                <option>9</option>
                                <option>10</option>
                                <option>11</option>
                                <option>12</option>
                                <option>13</option>
                                <option>14</option>
                                <option>15</option>
                                <option>16</option>
                                <option>17</option>
                                <option>18</option>
                                <option>19</option>
                                <option>20</option>
                                <option>21</option>
                                <option>22</option>
                                <option>23</option>
                                <option>24</option>
                                <option>25</option>
                                <option>26</option>
                                <option>27</option>
                                <option>28</option>
                                <option>29</option>
                                <option>30</option>
                                <option>31</option>
                            </select>
                         </div>
                        <input type="button" value="确认" class="btn btn-default">
                    </div>
                </ol>
            </div>
            <div class="search">
                <ol class="breadcrumb">
                    <li class="active time">搜索</li>
                    <div class="btn-group time">
                        <div class="btn-group">
                            <select class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                                <option>14052311</option>
                                <option>14052312</option>
                                <option>14052313</option>
                                <option>14052314</option>
                                <option>14052315</option>
                                <option>14052315</option>
                            </select>
                            <input type="text" class="btn btn-default dropdown-toggle" placeholder="学号">
                         </div> 
                        <input type="button" value="搜索" class="btn btn-default">
                    </div>
                </ol>
            </div>
            <div>
            	<table>
                	<tr>
                    	<td>班级</td>
                    	<td>学号</td>
                    	<td>姓名</td>
                    	<td>专业</td>
                    	<td>提交时间</td>
                    	<td>学分总额</td>
                    	<td>平均绩点</td>
                    	<td>状态</td>
                    	<td>&nbsp;</td>
                    </tr>
                	<tr>
                    	<td>14052313</td>
                    	<td>14051531</td>
                    	<td>某某某</td>
                    	<td>计算机科学与技术</td>
                    	<td>2016-11-07</td>
                    	<td>66</td>
                    	<td>4.2</td>
                    	<td>可离校</td>
                    	<td>
                            <div class="btn-group">
                              <button type="button" class="btn btn-default">查看</button>
                            </div>
                        </td>
                    </tr>
                	<tr>
                    	<td>14052313</td>
                    	<td>14051531</td>
                    	<td>某某某</td>
                    	<td>计算机科学与技术</td>
                    	<td>2016-11-07</td>
                    	<td>66</td>
                    	<td>4.2</td>
                    	<td>不可离校</td>
                    	<td>
                            <div class="btn-group">
                              <button type="button" class="btn btn-default">查看</button>
                            </div>
                        </td>
                    </tr>
                	<tr>
                    	<td>14052313</td>
                    	<td>14051531</td>
                    	<td>某某某</td>
                    	<td>计算机科学与技术</td>
                    	<td>2016-11-07</td>
                    	<td>66</td>
                    	<td>4.2</td>
                    	<td>未审核</td>
                    	<td>
                            <div class="btn-group">
                              <button type="button" class="btn btn-default">查看</button>
                            </div>
                        </td>
                    </tr>
                	<tr>
                    	<td>14052313</td>
                    	<td>14051531</td>
                    	<td>某某某</td>
                    	<td>计算机科学与技术</td>
                    	<td>2016-11-07</td>
                    	<td>66</td>
                    	<td>4.2</td>
                    	<td>未审核</td>
                    	<td>
                            <div class="btn-group">
                              <button type="button" class="btn btn-default">查看</button>
                            </div>
                        </td>
                    </tr>
                	<tr>
                    	<td>14052313</td>
                    	<td>14051531</td>
                    	<td>某某某</td>
                    	<td>计算机科学与技术</td>
                    	<td>2016-11-07</td>
                    	<td>66</td>
                    	<td>4.2</td>
                    	<td>未审核</td>
                    	<td>
                            <div class="btn-group">
                              <button type="button" class="btn btn-default">查看</button>
                            </div>
                        </td>
                    </tr>
                	<tr>
                    	<td>14052313</td>
                    	<td>14051531</td>
                    	<td>某某某</td>
                    	<td>计算机科学与技术</td>
                    	<td>2016-11-07</td>
                    	<td>66</td>
                    	<td>4.2</td>
                    	<td>未审核</td>
                    	<td>
                            <div class="btn-group">
                              <button type="button" class="btn btn-default">查看</button>
                            </div>
                        </td>
                    </tr>
                	<tr>
                    	<td>14052313</td>
                    	<td>14051531</td>
                    	<td>某某某</td>
                    	<td>计算机科学与技术</td>
                    	<td>2016-11-07</td>
                    	<td>66</td>
                    	<td>4.2</td>
                    	<td>未审核</td>
                    	<td>
                            <div class="btn-group">
                              <button type="button" class="btn btn-default">查看</button>
                            </div>
                        </td>
                    </tr>
                	<tr>
                    	<td>14052313</td>
                    	<td>14051531</td>
                    	<td>某某某</td>
                    	<td>计算机科学与技术</td>
                    	<td>2016-11-07</td>
                    	<td>66</td>
                    	<td>4.2</td>
                    	<td>未审核</td>
                    	<td>
                            <div class="btn-group">
                              <button type="button" class="btn btn-default">查看</button>
                            </div>
                        </td>
                    </tr>
                	<tr>
                    	<td>14052313</td>
                    	<td>14051531</td>
                    	<td>某某某</td>
                    	<td>计算机科学与技术</td>
                    	<td>2016-11-07</td>
                    	<td>66</td>
                    	<td>4.2</td>
                    	<td>未审核</td>
                    	<td>
                            <div class="btn-group">
                              <button type="button" class="btn btn-default">查看</button>
                            </div>
                        </td>
                    </tr>
                </table>
            </div>
            <nav>
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

<div class="container-fluid page-end">

    <p class="text-center">版权申明</p>
</div>
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>