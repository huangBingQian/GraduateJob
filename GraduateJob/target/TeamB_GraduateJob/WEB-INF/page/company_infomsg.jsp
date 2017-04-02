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
                a.push({name: "demand", value: demand});
                a.push({name: "func", value: func});
                Post("${pageContext.request.contextPath}" + "/test6.action", a);

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
                    <li><a class="active" href="#">招聘信息填写</a></li>
                    <li><a href="#">宣讲会发起/查看</a></li>
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

            <hr style="border-top:1px solid #222222;">
            <div class="btn-group btn-group-sm" style="float: right;margin-right: 70px;">
                <button type="button" class="btn btn-default">编辑</button>
                <button id="remove" type="button" class="btn btn-default">删除</button>
                <button id="add" type="button" class="btn btn-default">添加</button>
            </div>


            <div class="need">
                <dl>
                    <dt>
                        <input class="mycheckbox" type="checkbox" value="1">
                    <table border="1">
                        <tr>
                            <td class="td1"><label>岗位名称</label></td>
                            <td>
                                xxx
                            </td>
                        </tr>
                        <tr>
                            <td class="td1"><label>岗位数量</label></td>
                            <td>
                                xxx
                            </td>
                        </tr>
                        <tr>
                            <td class="td1" colspan="2">
                                <label>岗位要求</label>
                            </td>
                        </tr>
                        <tr>
                            <td class="td2" colspan="2">1.计算机及相关专业本科以上学历</td>
                        </tr>
                        <tr>
                            <td class="td1" colspan="2">
                                <label>岗位职能</label>
                        </tr>
                        <tr>
                            <td class="td2" colspan="2">1.根据产品设计需求，配合后台开发人员实现产品界面和功能，维护及优化前端页</td>
                        </tr>
                    </table>

                    </dt>
                    <dt>
                        <input class="mycheckbox" type="checkbox" value="2">

                    <table border="1">
                        <tr>
                            <td class="td1"><label>岗位名称</label></td>
                            <td>
                                xxx
                            </td>
                        </tr>
                        <tr>
                            <td class="td1"><label>岗位数量</label></td>
                            <td>
                                xxx
                            </td>
                        </tr>
                        <tr>
                            <td class="td1" colspan="2">
                                <label>岗位要求</label>
                            </td>
                        </tr>
                        <tr>
                            <td class="td2" colspan="2">1.计算机及相关专业本科以上学历</td>
                        </tr>
                        <tr>
                            <td class="td1" colspan="2">
                                <label>岗位职能</label>
                        </tr>
                        <tr>
                            <td class="td2" colspan="2">1.根据产品设计需求，配合后台开发人员实现产品界面和功能，维护及优化前端页</td>
                        </tr>
                    </table>

                    </dt>

                </dl>
                <button id="confer-remove" type="button" class="btn btn-danger">确定</button>

            </div>
            <div class="add-from">
                <form id="f">
                    <table border="1">
                        <tr>
                            <td class="td1"><label>岗位数量</label></td>
                            <td>
                                <input name="jobNum" style="width: 460px;padding-left: 10px" type="text" />
                            </td>
                        </tr>
                        <tr>
                        <tr>
                            <td class="td1"><label>岗位名称</label></td>
                            <td>
                                <input name="jobName" style="width: 460px;padding-left: 10px" type="text" />
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