<%--
  Created by IntelliJ IDEA.
  User: yxaw
  Date: 2016/12/11
  Time: 13:24
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <title>industrylist</title>
    <!-- Bootstrap core CSS -->
    <link href="http://cdn.bootcss.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">
    <script src="http://cdn.bootcss.com/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <form class="form-horizontal" role="form" method="post" action="${pageContext.request.contextPath}/addindustrylist.action">
            <div class="form-group">
                <label for="input1" class="col-sm-2 control-label">行业名称</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="input1" placeholder="industry" name="industry" >
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-default">添加</button>
                </div>
            </div>
        </form>
    </div>
    <table class="table table-striped">
        <caption>IndustryListTable.</caption>
        <thead>
        <tr>
            <th>IndustryListId</th>
            <th>IndustryList</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${industrylist}" var="industrylistitem">
            <tr>
                <td >${industrylistitem.industryid}</td>
                <td >${industrylistitem.industry }</td>
                <td ><a href="${pageContext.request.contextPath}/deleteindustrylist.action?industrylistid=${industrylistitem.industryid}">删除</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
