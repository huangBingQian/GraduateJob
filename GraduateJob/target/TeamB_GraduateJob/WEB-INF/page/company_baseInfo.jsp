<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>基本信息填写</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="./css/bootstrap.min.css">
    <link rel="stylesheet" href="./css/reset.css">
    <link rel="stylesheet" href="./css/company_baseInfo.css">
    <link rel="stylesheet" href="./css/CompanayPublicCss.css">


    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="http://cdn.bootcss.com/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]--></head>
<script src="js/jquery-3.1.1.min.js"></script>
<script src="js/"></script>

<script type="text/javascript">
    $(document).ready(function(){
        $(".lab .glyphicon-pencil").click(function () {
            $(this).css({
                "display": "none"
            });
            var eid = $(this).attr("id");
            $("#info" + eid).css({"display": "none"});

            $("#ok" + eid).css({"display": "block"});
            $("#edit" + eid).css({"display": "block"})
        });
        $(".lab .glyphicon-ok").click(function () {
            var id = $(this).attr("id");
            var a = $("#form" + id).serializeArray();
            a.push({name: "infoDetail", value: $("#input5").text()}, {name: "type", value: id});
            Post("${pageContext.request.contextPath}" + "/test4.action", a);
        });

    });

</script>
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
                    <li><a class="active" href="#">基本信息填写</a></li>
                    <li><a href="#">招聘信息填写</a></li>
                    <li><a href="#">宣讲会发起/查看</a></li>
                    <li><a href="#">招聘会参与</a></li>
                    <li><a href="#">面试/offer情况</a></li>
                </ul>

            </div>
        </div>
        <div class="content">
            <form class="form-horizontal" id="formoka" role="form">
                <div class="lab">
                    企业信息
                    <span style="display: none" id="oka" class="glyphicon glyphicon-ok"></span>
                    <span id="a" class="glyphicon glyphicon-pencil"></span>
                </div>
                <div id="infoa" class="info">
                    <div class="form-group">
                        <label for="input1" class="col-sm-3 control-label">企业名称:</label>
                        <label class="col-sm-4 control-label">某某某</label>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">企业地址:</label>
                        <label class="col-sm-4 control-label">某某某</label>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">企业性质:</label>
                        <label class="col-sm-4 control-label">某某某</label>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">所属行业:</label>
                        <label class="col-sm-4 control-label">某某某</label>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">企业详情:</label>

                        <div class="company-info">
                            xxx
                        </div>
                    </div>

                </div>
                <div style="display: none" id="edita">
                    <div class="form-group">
                        <label class="col-sm-3 control-label">企业名称:</label>
                        <input type="email" class="form-control" name="name" id="input1" placeholder="某某某">
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">企业地址:</label>
                        <input type="email" class="form-control" name="place" id="input2" placeholder="哪哪哪">
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">企业性质:</label>
                        <input type="email" class="form-control" name="attr" id="input3" placeholder="啥啥啥">
                    </div>
                    <div class="form-group">
                        <label for="input4" class="col-sm-3 control-label">所属行业:</label>
                        <select id="input4" name="trade" class="form-control">
                            <option>aaa</option>
                            <option>bbb</option>
                            <option>ccc</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="input5" class="col-sm-3 control-label">企业详情:</label>

                        <div id="input5" class="form-control edit-area" contenteditable="true">

                        </div>
                    </div>
                </div>
            </form>
            <form class="form-horizontal" id="formokb"  role="form">

                <div class="lab">企业联系人信息
                    <span style="display: none" id="okb" class="glyphicon glyphicon-ok"></span>
                    <span id="b" class="glyphicon glyphicon-pencil"></span>
                </div>
                <div style="display: none" id="editb">
                    <div class="form-group">
                        <label for="input6" class="col-sm-3 control-label">姓名:</label>
                        <input type="email" class="form-control" id="input6" placeholder="name">
                    </div>
                    <div class="form-group">
                        <label for="input7" class="col-sm-3 control-label">邮箱:</label>
                        <input type="email" class="form-control" id="input7" placeholder="name">
                    </div>
                    <div class="form-group">
                        <label for="input8" class="col-sm-3 control-label">Q Q:</label>
                        <input type="email" class="form-control" id="input8" placeholder="name">
                    </div>
                    <div class="form-group">
                        <label for="input8" class="col-sm-3 control-label">Tell:</label>
                        <input type="email" class="form-control" id="input9" placeholder="name">
                    </div>
                </div>
                <div id="infob" class="info">
                    <div class="form-group">
                        <label class="col-sm-3 control-label">姓名:</label>
                        <label class="col-sm-4 control-label">某某某</label>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">邮箱:</label>
                        <label class="col-sm-4 control-label">某某某</label>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">Q Q:</label>
                        <label class="col-sm-4 control-label">某某某</label>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">Tell:</label>
                        <label class="col-sm-4 control-label">某某某</label>
                    </div>
                </div>

            </form>


        </div>
    </div>
</div>
<div class="container-fluid page-end">

    <p class="text-center">版权申明</p>
</div>
<script src="js/bootstrap.min.js"></script>
</body>
</html>