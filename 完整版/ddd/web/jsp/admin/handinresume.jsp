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
        <%--xx.ation&&表格--%>
        <form class="form-horizontal" role="form" method="post" action="${pageContext.request.contextPath}/addhandinresume.action">
            <div class="form-group">
                <label for="input1" class="col-sm-2 control-label">graduateid</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="input1" placeholder="graduateid" name="graduateid" >
                </div>
            </div>
            <div class="form-group">
                <label for="input2" class="col-sm-2 control-label">jobid</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="input2" placeholder="jobid" name="jobid" >
                </div>
            </div>
            <div class="form-group">
                <label for="resumeState" class="col-sm-2 control-label">resumeState</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="resumeState" placeholder="resumeState" name="resumeState" >
                </div>
            </div>
            <div class="form-group">
                <label for="isView" class="col-sm-2 control-label">isView</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="isView" placeholder="isView" name="isView" >
                </div>
            </div>
            <div class="form-group">
                <label for="senddate" class="col-sm-2 control-label">senddate</label>
                <div class="col-sm-10">
                    <input type="date" class="form-control" id="senddate" placeholder="senddate" name="senddate" >
                </div>
            </div>
            <div class="form-group">
                <label for="interviewdate" class="col-sm-2 control-label">senddate</label>
                <div class="col-sm-10">
                    <input type="date" class="form-control" id="interviewdate" placeholder="interviewdate" name="interviewdate" >
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-default">添加</button>
                </div>
            </div>
        </form>
    </div>
    <%--XXtable,表格,delete--%>
    <table class="table table-striped">
        <caption>HandinresmeTable.</caption>
        <thead>
        <tr>
            <th>graduateid</th>
            <th>jobid</th>
            <th>resumeState</th>
            <th>isView</th>
            <th>senddate</th>
            <th>interviewdate</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${handInResumes}" var="handinresume">
            <tr>
                <td >${handinresume.graduateid}</td>
                <td >${handinresume.jobid }</td>
                <td >${handinresume.resumeState}</td>
                <td >${handinresume.isView}</td>
                <td >${handinresume.senddate}</td>
                <td >${handinresume.interviewdate}</td>
                <td ><a href="${pageContext.request.contextPath}/deletehandinresume.action?graduateid=${handinresume.graduateid}&jobid=${handinresume.jobid}">删除</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
