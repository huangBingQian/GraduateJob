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
<script src="js/PostUtile.js"></script>

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
            if(id == "oka"){
                a.push({name: "main", value: $("#input5").text()}, {name: "type", value: id});
                Post("${pageContext.request.contextPath}/company_baseInfo_updatecompany.action", a);
            }
            if(id == "okb"){
                a.push({name: "type", value: id});
                Post("${pageContext.request.contextPath}/company_baseInfo_updatainform.action", a);
            }
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
                    <li><a href="${pageContext.request.contextPath}/company_home.action">首页</a></li>
                    <li><a href="${pageContext.request.contextPath}/company_home.action">企业主页</a></li>
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
                <img src="${pageContext.request.contextPath}/updata/logo/${sessionScope.company.logo}">
                <span class="company-name">${sessionScope.company.companyname}</span>
                <a href="${sessionScope.company.website}" class="company-website">${sessionScope.company.website}</a>
                <ul class="left-menu">
                    <li><a class="active" href="#">基本信息填写</a></li>
                    <li><a href="${pageContext.request.contextPath}/company_infomsg.action">招聘信息填写</a></li>
                    <li><a href="${pageContext.request.contextPath}/company_infoarr.action">宣讲会发起/查看</a></li>
                    <li><a href="${pageContext.request.contextPath}/company_stumesgcheek.action">招聘会参与</a></li>
                    <li><a href="${pageContext.request.contextPath}/company_resume_view.action">面试/offer情况</a></li>
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
                        <label class="col-sm-4 control-label">${sessionScope.company.companyname}</label>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">企业地址:</label>
                        <label class="col-sm-4 control-label">${sessionScope.company.companyplace}</label>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">企业性质:</label>
                        <label class="col-sm-4 control-label">${sessionScope.company.companycharacter}</label>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">所属行业:</label>
                        <label class="col-sm-4 control-label">${sessionScope.company.industry}</label>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">企业详情:</label>

                        <div class="company-info">
                            ${sessionScope.company.main}
                        </div>
                    </div>
                </div>
                <div style="display: none" id="edita">
                    <div class="form-group">
                        <label class="col-sm-3 control-label">企业名称:</label>
                        <input type="email" class="form-control" name="companyname" id="input1" value="${sessionScope.company.companyname}">
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">企业地址:</label>
                        <input type="email" class="form-control" name="companyplace" id="input2" value="${sessionScope.company.companyplace}">
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">企业性质:</label>
                        <select id="input3" name="companycharacter" class="form-control">
                            <c:forEach items="${companycharacterlists}" var="companycharacterlist">
                                <c:choose>
                                    <c:when  test="${sessionScope.company.companycharacter eq companycharacterlist.companycharacter}">
                                        <option selected>${companycharacterlist.companycharacter}</option >
                                    </c:when>
                                    <c:otherwise>
                                        <option>${companycharacterlist.companycharacter}</option>
                                    </c:otherwise>
                                </c:choose>
                            </c:forEach>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="input4" class="col-sm-3 control-label">所属行业:</label>
                        <select id="input4" name="industry" class="form-control">

                            <c:forEach items="${industrylists}" var="industrylist">
                                <c:choose>
                                    <c:when test="${sessionScope.company.industry == industrylist.industry}">
                                        <option selected>${industrylist.industry}</option >
                                    </c:when>
                                    <c:otherwise>
                                        <option>${industrylist.industry}</option>
                                    </c:otherwise>
                                </c:choose >
                            </c:forEach>
                        </select>
                    </div>
                    <div class="form-group">
                        <label   class="col-sm-3 control-label">企业详情:</label>

                        <div id="input5" class="form-control edit-area" contenteditable="true">
                            ${sessionScope.company.main}
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
                        <input type="email" name="contactname" class="form-control" id="input6" value="${inform.contactname}">
                    </div>
                    <div class="form-group">
                        <label for="input7" class="col-sm-3 control-label">邮箱:</label>
                        <input type="email" name="contactemail" class="form-control" id="input7" value="${inform.contactemail}">
                    </div>
                    <div class="form-group">
                        <label for="input8" class="col-sm-3 control-label">Q Q:</label>
                        <input type="email" name="qq" class="form-control" id="input8" value="${inform.qq}">
                    </div>
                    <div class="form-group">
                        <label for="input9" class="col-sm-3 control-label">手机:</label>
                        <input type="email" name="phonenumber" class="form-control" id="input9" value="${inform.phonenumber}">
                    </div>
                    <div class="form-group">
                        <label for="input10" class="col-sm-3 control-label">座机:</label>
                        <input type="email" name="machinenumber" class="form-control" id="input10" value="${inform.machinenumber}">
                    </div>
                    <div class="form-group">
                        <label for="input11" class="col-sm-3 control-label">地址:</label>
                        <input type="email" name="address" class="form-control" id="input11" value="${inform.address}">
                    </div>
                </div>
                    <div id="infob" class="info">
                        <div class="form-group">
                            <label class="col-sm-3 control-label">姓名:</label>
                            <label class="col-sm-4 control-label">${inform.contactname}</label>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">邮箱:</label>
                            <label class="col-sm-4 control-label">${inform.contactemail}</label>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">Q Q:</label>
                            <label class="col-sm-4 control-label">${inform.qq}</label>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">手机:</label>
                            <label class="col-sm-4 control-label">${inform.phonenumber}</label>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">座机:</label>
                            <label class="col-sm-4 control-label">${inform.machinenumber}</label>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">地址:</label>
                            <label class="col-sm-4 control-label">${inform.address}</label>
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