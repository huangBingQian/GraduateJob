<%--
  Created by IntelliJ IDEA.
  User: yxaw
  Date: 2016/11/16
  Time: 12:01
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <title>Adm1111in</title>
    <!-- Bootstrap core CSS -->
    <link href="http://cdn.bootcss.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">
    <script src="http://cdn.bootcss.com/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
</head>
<body>


<div class="container">
    <div class="row">


        <form class="form-horizontal" role="form" method="post" action="${pageContext.request.contextPath}/addgraduate.action" enctype="multipart/form-data">
            <div class="form-group">
                <label for="input1" class="col-sm-2 control-label">学号</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="input1" placeholder="graduateid" name="graduateid" >
                </div>
            </div>
            <div class="form-group">
                <label for="input2" class="col-sm-2 control-label">密码</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="input2" placeholder="stupassword" name="stupassword">
                </div>
            </div>
            <div class="form-group">
                <label for="input3" class="col-sm-2 control-label">班级</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="input3" placeholder="classid" name="classid">
                </div>
            </div>
            <div class="form-group">
                <label for="Companyplace" class="col-sm-2 control-label">名字</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="Companyplace" placeholder="graduatename" name="graduatename">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">性别</label>
                <div class="col-sm-10">
                    <select class="form-control" name="sex">
                            <option>男</option>
                            <option>女</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label for="age" class="col-sm-2 control-label">年龄</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="age" placeholder="age" name="age">
                </div>
            </div>
            <div class="form-group">
                <label for="graduatephone" class="col-sm-2 control-label">手机</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="graduatephone" placeholder="graduatephone" name="graduatephone">
                </div>
            </div>
            <div class="form-group">
                <label  class="col-sm-2 control-label">学院</label>
                <div class="col-sm-10">
                        <select class="form-control" name="institute">
                            <option>计算机学院</option>
                            <option>数字媒体学院</option>
                            <option>美术学院</option>
                            <option>通信学院</option>
                            <option>其余</option>
                        </select>
                </div>
            </div>
            <div class="form-group">
                <label  class="col-sm-2 control-label">专业</label>
                <div class="col-sm-10">
                    <select class="form-control" name="major">
                        <option>计算机科学与技术</option>
                        <option>网络工程</option>
                        <option>信息安全</option>
                        <option>数字与媒体技术</option>
                        <option>电路与电子学</option>
                        <option>其余</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">成绩</label>
                <div class="col-sm-10">
                    <select class="form-control" name="grade">
                        <option>30%</option>
                        <option>30%~50%</option>
                        <option>50%~70%</option>
                        <option>70%~100%</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">毕业年份</label>
                <div class="col-sm-10">
                    <select class="form-control" name="graduateyear">
                        <option>2011</option>
                        <option>2012</option>
                        <option>2013</option>
                        <option>2014</option>
                        <option>2015</option>
                        <option>2016</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label for="graduateemail" class="col-sm-2 control-label">邮箱</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="graduateemail" placeholder="graduateemail" name="graduateemail">
                </div>
            </div>
            <div class="form-group">
                <label for="masterskill" class="col-sm-2 control-label">掌握技能</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="masterskill" placeholder="masterskill" name="masterskill">
                </div>
            </div>
            <div class="form-group">
                <label for="practicalexperience" class="col-sm-2 control-label">实践经验</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="practicalexperience" placeholder="practicalexperience" name="practicalexperience">
                </div>
            </div>
            <div class="form-group">
                <label for="website" class="col-sm-2 control-label">座右铭</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="website" placeholder="motto" name="motto">
                </div>
            </div>
            <div class="form-group">
                <label for="logo" class="col-sm-2 control-label">照片上传</label>
                <div class="col-sm-10">
                    <input type="file" class="form-control" id="logo" placeholder="logo" name="logo">
                </div>
            </div>
            <div class="form-group">
                <label for="file" class="col-sm-2 control-label">个性简历上传</label>
                <div class="col-sm-10">
                    <input type="file" class="form-control" id="file" placeholder="resumefile" name="resumefile">
                </div>
            </div>
            <%--<div class="form-group">--%>
                <%--<label class="col-sm-2 control-label">Companycharacter</label>--%>
                <%--<div class="col-sm-10">--%>
                    <%--<select class="form-control" name="Companycharacter">--%>
                        <%--<c:forEach items="${companycharacterlists}" var="companycharacterlist">--%>
                            <%--<option>${companycharacterlist.companycharacter}</option>--%>
                        <%--</c:forEach>--%>
                    <%--</select>--%>
                <%--</div>--%>
            <%--</div>--%>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-default">Submit</button>
                </div>
            </div>
        </form>
    </div>
    <table class="table table-striped">
        <caption>CompanyTable.</caption>
        <thead>
        <tr>
            <th>stulogo</th>
            <th>graduateid</th>
            <th>stupassword</th>
            <th>graduatename</th>
            <th>mojor</th>
            <th>institute</th>
            <th>grade</th>
            <th>graduateyear</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${graduates}" var="graduate">
            <tr>
                <td><img src="${pageContext.request.contextPath}/updata/stulogo/${graduate.stuLogo} " style="max-height:50px"alt=""></td>
                <th>${graduate.graduateid}</th>
                <th>${graduate.stupassword}</th>
                <th>${graduate.graduatename}</th>
                <th>${graduate.major}</th>
                <th>${graduate.institute}</th>
                <th>${graduate.grade}</th>
                <th>${graduate.graduateyear}</th>
                <td ><a href="${pageContext.request.contextPath}/deletegraduate.action?graduateid=${graduate.graduateid}">删除</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
