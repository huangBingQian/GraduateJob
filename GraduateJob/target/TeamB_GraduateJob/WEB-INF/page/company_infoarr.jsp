<%--
  Created by IntelliJ IDEA.
  User: 黄炳乾
  Date: 2016/12/16
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>宣讲会发起/查看</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="./css/bootstrap.min.css">
    <link rel="stylesheet" href="./css/reset.css">
    <link rel="stylesheet" href="./css/company_Infoarr.css">
    <link rel="stylesheet" href="./css/CompanayPublicCss.css">


    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="http://cdn.bootcss.com/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <script src="js/jquery-3.1.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/PostUtile.js"></script>
    <script type="text/javascript">
        $(document).ready(function() {
            $("#add").click(function () {
                $("#job-list").append($("#form-template").html())
            })

            $("#submitForm").click(function () {
                var $jobNames = $("[name='jobName']");
                var $jobNums = $("[name='jobNum']");
                var $demands = $("[name='demand']");
                var $funcs = $("[name='func']");
                var fromToSubmit = new Array();

                for (var i=0; i < $jobNames.length - 1; i++)
                {
                    item = new Object();
                    item.jobName = $jobNames[i].value
                    item.jobNum = $jobNums[i].value
                    item.demand = $demands[i].textContent
                    item.func = $funcs[i].textContent
                    fromToSubmit.push(item)
                }
                var json = JSON.stringify(fromToSubmit)
                var arr = $("#f").serializeArray();
                arr.push({name: "form", value: json})
                Post("${pageContext.request.contextPath}" + "/test5.action", arr)
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
                <img alt="Brand" src="./image/logo.png">

            </div>
            <div class="navbar-collapse collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li><a href="#">首页</a></li>
                    <li><a href="#">企业主页</a></li>
                    <li><a href="#">通知消息</a></li>
                    <li><a href="#">学生搜索</a></li>
                </ul>
                <ul class="user">
                    <li class="user-logo" style="background-image: url()"></li>
                    <li>
                        <span class="name">xxx</span>
                        <span class="badge">
                                <img src="./image/icon-news.png">
                                <span class="msg-number">x </span>
                            </span>
                    </li>

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
                <span class="company-name">网易</span>
                <a href="#" class="company-website">www.163.com</a>
                <ul class="left-menu">
                    <li><a href="#">基本信息填写</a></li>
                    <li><a href="#">招聘信息填写</a></li>
                    <li><a class="active" href="#">宣讲会发起/查看</a></li>
                    <li><a href="#">招聘会参与</a></li>
                    <li><a href="#">面试/offer情况</a></li>
                </ul>

            </div>
        </div>

        <div class="content">
            <div class="head">
                <div class="row">
                    <div class="line">
                        <label>公司名称&nbsp;&nbsp;</label>
                        <label>搜狐公司</label>
                    </div>

                    <div class="line" style="margin-left:-100px;">
                        <label>公司地址&nbsp;&nbsp;</label>
                        <label>江干区下沙文泽路59号</label>
                    </div>
                </div>

                <div class="row">
                    <div class="line">
                        <label>公司性质&nbsp;&nbsp;</label>
                        <label>外资企业</label>
                    </div>

                    <div class="line" style="margin-left:-100px;">
                        <label>所属行业&nbsp;&nbsp;</label>
                        <label>IT</label>
                    </div>
                </div>
            </div>
            <form id="f">
                <hr style="border-top:1px solid #222222;">
                <div class="metmsg">
                    <div class="number">
                        <label>宣讲会主题</label>
                        <input name="theme" class="numberinput" type="text" style="width:300px;margin-left:10px;"  />
                    </div>
                </div>

                <div class="metmsg">
                    <div class="number">
                        <label>宣讲会预计人数</label>
                        <input name="numOfPeople" class="numberinput" type="text" style="width:300px;margin-left:10px;"  />
                    </div>
                </div>

                <div class="metmsg">
                    <div class="number">
                        <label>宣讲会预计时间</label>
                        <input name="time" class="numberinput" type="text" style="width:300px;margin-left:10px;"  />
                    </div>
                </div>

                <div class="metmsg">
                    <div class="number">
                        <label>岗位数量</label>
                        <input name="numOfJob" class="numberinput" type="text" style="width:40px;margin-left:10px;"  />
                    </div>
                </div>
            </form>

            <div class="need">
                    <div class="btn-group">
                        <button id="add" type="button" class="btn btn-default">添加</button>
                        <button type="button" class="btn btn-default">修改</button>
                        <button type="button" class="btn btn-danger">删除</button>
                    </div>
                    <dl id="job-list">
                        <dt>
                        <table border="1">
                            <tr class="double">
                                <td class="td1">
                                    <label>岗位名称</label>
                                    <input name="jobName" style="padding-left: 5px" type="text" />
                                </td>
                                <td>
                                    <label>岗位数量</label>
                                    <input name="jobNum" style="padding-left: 5px" type="text" />
                                </td>
                            </tr>
                            <tr>
                                <td class="td1" colspan="2">
                                    <label>岗位要求</label>
                                </td>
                            </tr>
                            <tr>
                                <td class="td2" colspan="2">
                                    <div name="demand" class="edit-area" contenteditable="true">

                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td class="td1" colspan="2">
                                    <label>岗位职能</label>
                                </td>
                            </tr>
                            <tr>
                                <td class="td2" colspan="2">
                                    <div name="func" class="edit-area" contenteditable="true">

                                    </div>
                                </td>
                            </tr>
                        </table>

                        </dt>
                    </dl>
                    <button style="margin-top: 10px" id="submitForm">提交</button>
                </div>
        </div>

    </div>
</div>
<div class="container-fluid page-end">

    <p class="text-center">版权申明</p>
</div>
<dt>
<div id="form-template">
    <table border="1">
        <tr class="double">
            <td class="td1">
                <label>岗位名称</label>
                <input name="jobName" style="padding-left: 5px" type="text" />
            </td>
            <td>
                <label>岗位数量</label>
                <input name="jobNum" style="padding-left: 5px" type="text" />
            </td>
        </tr>
        <tr>
            <td class="td1" colspan="2">
                <label>岗位要求</label>
            </td>
        </tr>
        <tr>
            <td class="td2" colspan="2">
                <div name="demand" class="edit-area" contenteditable="true">

                </div>
            </td>
        </tr>
        <tr>
            <td class="td1" colspan="2">
                <label>岗位职能</label>
            </td>
        </tr>
        <tr>
            <td class="td2" colspan="2">
                <div name="func" class="edit-area" contenteditable="true">

                </div>
            </td>
        </tr>
    </table>

</div>

</dt>

</body>
</html>