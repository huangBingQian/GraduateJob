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
        <form class="form-horizontal" role="form" method="post" action="${pageContext.request.contextPath}/addnotice.action">
            <div class="form-group">
                <label for="input1" class="col-sm-2 control-label">graduateid</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="input1" placeholder="graduateid" name="graduateid" >
                </div>
            </div>
            <div class="form-group">
                <label for="input2" class="col-sm-2 control-label">companyid</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="input2" placeholder="companyid" name="companyid" >
                </div>
            </div>
            <div class="form-group">
                <label for="input3" class="col-sm-2 control-label">noticeTitle</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="input3" placeholder="noticeTitle" name="noticeTitle" >
                </div>
            </div>
            <div class="form-group">
                <label for="input4" class="col-sm-2 control-label">noticeFrom</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="input4" placeholder="noticeFrom" name="noticeFrom" >
                </div>
            </div>
            <div class="form-group">
                <label for="noticeContext" class="col-sm-2 control-label">noticeContext</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="noticeContext" placeholder="noticeContext" name="noticeContext" >
                </div>
            </div>
            <div class="form-group">
                <label for="noticeTime" class="col-sm-2 control-label">noticeTime</label>
                <div class="col-sm-10">
                    <input type="date" class="form-control" id="noticeTime" placeholder="noticeTime" name="noticeTime" >
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
        <caption>NoticeTable.</caption>
        <thead>
        <tr>
            <th>noticeid</th>
            <th>companyid</th>
            <th>graduateid</th>
            <th>noticeTitle</th>
            <th>noticeFrom</th>
            <th>noticeContext</th>
            <th>noticeTime</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${notices}" var="notice">
            <tr>
                <th>${notice.noticeid} </th>
                <th>${notice.companyid} </th>
                <th>${notice.graduateid}</th>
                <th>${notice.noticeTitle}</th>
                <th>${notice.noticeFrom}</th>
                <th>${notice.noticeContext}</th>
                <th>${notice.noticeTime}</th>
                <td ><a href="${pageContext.request.contextPath}/deletenotice.action?noticeid=${notice.noticeid}">删除</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
