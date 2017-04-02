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


        <form class="form-horizontal" role="form" method="post" action="${pageContext.request.contextPath}/addcompany.action" enctype="multipart/form-data">
            <div class="form-group">
                <label for="input1" class="col-sm-2 control-label">CompanyId</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="input1" placeholder="CompanyId" name="Companyid" >
                </div>
            </div>
            <div class="form-group">
                <label for="input2" class="col-sm-2 control-label">CompanyPassword</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="input2" placeholder="CompanyPassword" name="Companypassword">
                </div>
            </div>
            <div class="form-group">
                <label for="input3" class="col-sm-2 control-label">CompanyName</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="input3" placeholder="CompanyName" name="Companyname">
                </div>
            </div>
            <div class="form-group">
                <label for="Companyplace" class="col-sm-2 control-label">CompanyPlace</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="Companyplace" placeholder="CompanyPlace" name="Companyplace">
                </div>
            </div>
            <div class="form-group">
                <label for="website" class="col-sm-2 control-label">website</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="website" placeholder="website" name="website">
                </div>
            </div>
            <div class="form-group">
                <label for="main" class="col-sm-2 control-label">main</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="main" placeholder="main" name="main">
                </div>
            </div>
            <div class="form-group">
                <label for="main" class="col-sm-2 control-label">Logo上传</label>
                <div class="col-sm-10">
                    <input type="file" class="form-control" id="logo" placeholder="logo" name="logo">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">Industry</label>
                <div class="col-sm-10">
                        <select class="form-control" name="Industry">
                            <c:forEach items="${industrylists}" var="industrylist">
                                <option>${industrylist.industry}</option>
                            </c:forEach>
                        </select>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">Companycharacter</label>
                <div class="col-sm-10">
                    <select class="form-control" name="Companycharacter">
                        <c:forEach items="${companycharacterlists}" var="companycharacterlist">
                            <option>${companycharacterlist.companycharacter}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>
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
            <th>Logo</th>
            <th>Companyid</th>
            <th>Companypassword</th>
            <th>Companyname</th>
            <th>Companyplace</th>
            <th>Website</th>
            <th>Industry</th>
            <th>Companycharacter</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${companies}" var="company">
            <tr>
                <td><img src="${pageContext.request.contextPath}/updata/logo/${company.logo} " style="max-height:50px"alt="${company.companyname}"></td>
                <td>${company.companyid}</td>
                <td>${company.companypassword }</td>
                <td>${company.companyname}</td>
                <td>${company.companyplace}</td>
                <td>${company.website}</td>
                <td>${company.industry}</td>
                <td>${company.companycharacter}</td>
                <td ><a href="${pageContext.request.contextPath}/deletecompany.action?Companyid=${company.companyid}">删除</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
