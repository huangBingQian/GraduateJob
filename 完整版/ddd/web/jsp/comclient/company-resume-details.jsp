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

    <title>简历详情</title>

    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/CompanayPublicCss.css">
    <link href="css/company-resume-details.css" rel="stylesheet" type="text/css">

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
                <div class="basic">
                    <div class="right_head"><p><b>基本信息</b></p></div>
                    <table>
                    <tr>
                        <th rowspan="4"><img src="${pageContext.request.contextPath}/updata/stulogo/${exCompanyJob.graduate.stuLogo}" height="100%" width="100%" alt="" /></th>
                        <td><p style="float:right; margin-right:15px;"><b>姓名：</b></p></td>
                        <td><p>${exCompanyJob.graduate.graduatename}</p></td>
                    </tr>
                    <tr>
                        <td><p style="float:right; margin-right:15px;"><b>现居地：</b></p></td>
                        <td><p>浙江</p><p>杭州</p></td>
                    </tr>
                    <tr>
                        <td><p style="float:right; margin-right:15px;"><b>户口地：</b></p></td>
                        <td><p>湖南</p><p>长沙</p></td>
                    </tr>
                    <tr>
                        <td><p style="float:right; margin-right:15px;"><b>出生日期：</b></p></td>
                        <td><p>1997-9-15</p></td>
                    </tr>
                    </table>
                </div>
                <div class="contact">
                    <div class="right_head"><p><b>联系方式</b></p></div>
                    <table>
                    <tr>
                        <td><p><b>手机：</b></p></td>
                        <td><p>${exCompanyJob.graduate.graduatephone}</p></td>
                    </tr>
                    <tr>
                        <td><p><b>邮箱：</b></p></td>
                        <td><p>${exCompanyJob.graduate.graduateemail}</p></td>
                    </tr>
                    <tr>
                        <td><p style="float:right;"><b>QQ：</b></p></td>
                        <td><p>691357966</p></td>
                    </tr>
                    </table>
                </div>
                <div class="edu_background">
                    <div class="right_head"><p><b>教育经历</b></p></div>
                    <table>
                    <tr>
                        <td><p><b>毕业学校</b></p></td>
                        <td><p><b>就读时间</b></p></td>
                        <td><p><b>学历</b></p></td>
                        <td><p><b>专业</b></p></td>
                    </tr>
                    <tr>
                        <td><p>杭州电子科技大学</p></td>
                        <td><p>2013-9至2017-7</p></td>
                        <td><p>本科</p></td>
                        <td><p>计算机科学与技术</p></td>
                    </tr>
                    </table>
                </div>
                <div class="languagable">
                    <div class="right_head"><p><b>语言能力</b></p></div>
                    <table>
                    <tr>
                        <td><p><b>语言</b></p></td>
                        <td><p><b>听说</b></p></td>
                        <td><p><b>读写</b></p></td>
                        <td><p><b>等级考试</b></p></td>
                    </tr>
                    <tr>
                        <td><p>英语</p></td>
                        <td><p>优秀</p></td>
                        <td><p>良好</p></td>
                        <td style="width:220px;"><p>大学英语四级考试(444分)</p></td>
                    </tr>
                    </table>
                </div>
                <div class="certificate">
                    <div class="right_head"><p><b>证书</b></p></div>
                    <table>
                    <tr>
                        <td><p>大学英语四级</p></td>
                        <td><p>计算机二级</p></td>
                        <td><p>&nbsp;</p></td>
                        <td><p>&nbsp;</p></td>
                    </tr>
                    </table>
                </div>
                <div class="skill">
                    <div class="right_head"><p><b>证书</b></p></div>
                    <table>
                    <tr>
                        <td><p>java</p></td>
                        <td><p>C++</p></td>
                        <td><p>&nbsp;</p></td>
                        <td><p>&nbsp;</p></td>
                    </tr>
                    </table>
                </div>
                <div class="honor">
                    <div class="right_head"><p><b>荣誉成就</b></p></div>
                    <table>
                    <tr>
                        <td><p><b>奖项名称</b></p></td>
                        <td><p><b>获得时间</b></p></td>
                        <td><p><b>主办方</b></p></td>
                    </tr>
                    <tr>
                        <td><p>奖学金</p></td>
                        <td><p>2014-1</p></td>
                        <td><p>杭州电子科技大学</p></td>
                    </tr>
                    </table>
                </div>
                <div class="practice">
                    <div class="right_head"><p><b>实习经历</b></p></div>
                    <table>
                    <tr>
                        <td><p><b>工作公司</b></p></td>
                        <td><p><b>工作时间</b></p></td>
                        <td><p><b>岗位名称</b></p></td>
                    </tr>
                    <tr>
                        <td><p>搜狐公司</p></td>
                        <td><p>2016-4至2016-4</p></td>
                        <td><p>java工程师</p></td>
                    </tr>
                    </table>
                </div>
                <div class="project">
                    <div class="right_head"><p><b>项目经验</b></p></div>
                    <table>
                    <tr>
                        <td><p><b>项目名称</b></p></td>
                        <td><p><b>项目时间</b></p></td>
                        <td><p><b>担任角色</b></p></td>
                    </tr>
                    <tr>
                        <td><p>网站开发</p></td>
                        <td><p>2016-3至2016-4</p></td>
                        <td><p>前端制作</p></td>
                    </tr>
                    </table>
                </div>
                <div class="job_hunting_exp">
                    <div class="right_head"><p><b>求职经历</b></p></div>
                    <table>
                    <tr>
                        <td><p><b>公司名称</b></p></td>
                        <td><p><b>岗位名称</b></p></td>
                        <td><p><b>类型</b></p></td>
                        <td><p><b>时间</b></p></td>
                    </tr>
                    <tr>
                        <td><p>搜狐公司</p></td>
                        <td><p>java工程师实习生</p></td>
                        <td><p>参加面试</p></td>
                        <td><p>2016-3</p></td>
                    </tr>
                    <tr>
                        <td><p>网易公司</p></td>
                        <td><p>java工程师</p></td>
                        <td><p>获得offer</p></td>
                        <td><p>2016-1</p></td>
                    </tr>
                    </table>
                </div>
                <div class="job_purpose">
                    <div class="right_head"><p><b>就业意向</b></p></div>
                    <table>
                    <tr>
                        <td><p><b>意向岗位</b></p></td>
                        <td><p><b>意向薪资</b></p></td>
                        <td><p><b>意向地点</b></p></td>
                        <td><p><b>意向福利</b></p></td>
                    </tr>
                    <tr>
                        <td><p>java工程师</p></td>
                        <td><p>6000~8000/月</p></td>
                        <td><p>杭州</p></td>
                        <td><p>五险一金，双休</p></td>
                    </tr>
                    </table>
                </div>
                <div class="other">
                    <div class="right_head"><p><b>其他</b></p></div>
                    <table>
                    <tr>
                        <td><p><b></b></p></td>
                        <td><p><b></b></p></td>
                        <td><p><b></b></p></td>
                        <td><p><b></b></p></td>
                    </tr>
                    <tr>
                        <td><p></p></td>
                        <td><p></p></td>
                        <td><p></p></td>
                        <td><p></p></td>
                    </tr>
                    </table>
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