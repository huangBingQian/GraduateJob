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

    <title>招聘信息填写</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="./css/bootstrap.min.css">
    <link rel="stylesheet" href="./css/reset.css">
    <link rel="stylesheet" href="./css/company_Infomsg.css">
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
            $(".add-from").css({
                "display": "block"
            });
        });
        $("#remove").click(function () {
            $(".mycheckbox").css({
                "display": "block"
            });
            $("#confer-remove").css({
                "display": "block"
            });
        });
        $("#confer-remove").click(function () {
            var removeList = new Array();
            var $a = $(".mycheckbox")
            for (var i=0; i < $a.length; i++){
                if($a[i].checked == true){
                    removeList.push($a[i].value)
                }
                if(removeList.length == 0){
                    alert("选择要删除的对象！")
                }else{
                    var s = JSON.stringify(removeList);
                    Post(url, {name: "removeList", value: s})
                }
            }
            alert(a)
        });
        $("#submitForm").click(function () {
            var a = $("#f").serializeArray();
            var demand = $("#demand").text();
            var func = $("#func").text();
            a.push({name: "jobdemand", value: demand}, {name: "jobfunction", value: func});
            Post("${pageContext.request.contextPath}/company_addjob.action", a);
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
                     <li><a href="${pageContext.request.contextPath}/company_home.action">首页</a></li>
                    <li><a href="${pageContext.request.contextPath}/company_home.action">企业主页</a></li>
                    <li><a href="${pageContext.request.contextPath}/company_notice.action">通知消息</a></li>
                    <li><a href="${pageContext.request.contextPath}/company_stusearch.action">学生搜索</a></li>

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
                 <img src="${pageContext.request.contextPath}/updata/logo/${sessionScope.company.logo}">
                <span class="company-name">${sessionScope.company.companyname}</span>
                <a href="${sessionScope.company.website}" class="company-website">${sessionScope.company.website}</a>
                <ul class="left-menu">
                    <li><a  href="${pageContext.request.contextPath}/company_baseInfo.action">基本信息填写</a></li>
                    <li><a class="active" href="${pageContext.request.contextPath}/company_infomsg.action">招聘信息填写</a></li>
                    <li><a href="${pageContext.request.contextPath}/company_infoarr.action">宣讲会发起/查看</a></li>
                    <li><a href="${pageContext.request.contextPath}/company_stumesgcheek.action">招聘会参与</a></li>
                    <li><a href="${pageContext.request.contextPath}/company_resume_view.action">面试/offer情况</a></li>
                </ul>

            </div>
        </div>

        <div class="content">
            <div class="head">
                <div class="row">
                    <div class="line">
                    <label>公司名称&nbsp;&nbsp;</label>
                    <label>${sessionScope.company.companyname}</label>
                    </div>

                    <div class="line" style="margin-left:-100px;">
                    <label>公司地址&nbsp;&nbsp;</label>
                    <label>${sessionScope.company.companyplace}</label>
                    </div>
                </div>
               
                <div class="row">
                    <div class="line">
                    <label>公司性质&nbsp;&nbsp;</label>
                    <label>${sessionScope.company.companycharacter}</label>
                    </div>
                    
                    <div class="line" style="margin-left:-100px;">
                    <label>所属行业&nbsp;&nbsp;</label>
                    <label>${sessionScope.company.industry}</label>
                    </div>
                </div>
            </div>

            <hr style="border-top:1px solid #222222;">
            <div class="btn-group btn-group-sm" style="float: right;margin-right: 70px;">
                <button type="button" class="btn btn-default">编辑</button>
                <button id="remove" type="button" class="btn btn-default">删除</button>
                <button id="add" type="button" class="btn btn-default">添加</button>
            </div>


            <div class="need">
            <dl>
                <c:forEach items="${jobs}" var="job">
                <dt>
                <input class="mycheckbox" type="checkbox" value="1">
                <table border="1">
                    <tr>
                        <td class="td1"><label>岗位名称</label></td>
                        <td>
                            ${job.jobname}
                        </td>
                    </tr>
                    <tr>
                        <td class="td1"><label>岗位数量</label></td>
                        <td>
                            ${job.jobnumber}
                        </td>
                    </tr>
                    <tr>
                        <td class="td1" colspan="2">
                            <label>岗位要求</label>
                        </td>
                    </tr>
                    <tr>
                        <td class="td2" colspan="2">${job.jobdemand}</td>
                    </tr>
                    <tr>
                        <td class="td1" colspan="2">
                            <label>岗位职能</label>
                    </tr>
                    <tr>
                        <td class="td2" colspan="2">${job.jobfunction}</td>
                    </tr>
                </table>
                </dt>
                </c:forEach>
            </dl>
                <button id="confer-remove" type="button" class="btn btn-danger">确定</button>

            </div>
        <div class="add-from">
            <form id="f">
                <table border="1">
                    <tr>
                        <td class="td1"><label>岗位数量</label></td>
                        <td>
                            <input name="jobnumber" style="width: 460px;padding-left: 10px" type="text" />
                        </td>
                    </tr>
                    <tr>
                        <td class="td1"><label>岗位名称</label></td>
                        <td>
                            <input name="jobname" style="width: 460px;padding-left: 10px" type="text" />
                        </td>
                    </tr>
                    <tr>
                        <td class="td1"><label>岗位薪水</label></td>
                        <td>
                            <input name="jobsalary" style="width: 460px;padding-left: 10px" type="text" />
                        </td>
                    </tr>
                    <tr>
                        <td class="td1"><label>工作地点</label></td>
                        <td>
                            <input name="jobaddress" style="width: 460px;padding-left: 10px" type="text" />
                        </td>
                    </tr>
                    <tr>
                        <td class="td1" colspan="2">
                            <label>岗位要求</label>
                        </td>
                    </tr>
                    <tr>
                        <td class="td2" colspan="2">
                            <div id="demand" class="edit-area" contenteditable="true">

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
                            <div id="func" class="edit-area" contenteditable="true">

                            </div>
                        </td>
                    </tr>
                </table>
                <button type="button" id="submitForm" class="btn btn-primary">提交</button>
            </form>
        </div>

    </div>
</div></div>
<div class="container-fluid page-end">

    <p class="text-center">版权申明</p>
</div>
</body>
</html>