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
        <form class="form-horizontal" role="form" method="post" action="${pageContext.request.contextPath}/addjob.action">
            <div class="form-group">
                <label for="input1" class="col-sm-2 control-label">jobname</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="input1" placeholder="jobname" name="jobname" >
                </div>
            </div>
            <div class="form-group">
                <label for="input2" class="col-sm-2 control-label">jobnumber</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="input2" placeholder="jobnumber" name="jobnumber" >
                </div>
            </div>
            <div class="form-group">
                <label for="input3" class="col-sm-2 control-label">jobdemand</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="input3" placeholder="jobdemand" name="jobdemand" >
                </div>
            </div>
            <div class="form-group">
                <label for="input4" class="col-sm-2 control-label">jobfunction</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="input4" placeholder="jobfunction" name="jobfunction" >
                </div>
            </div>
            <div class="form-group">
                <label for="input5" class="col-sm-2 control-label">jobsalary</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="input5" placeholder="jobsalary" name="jobsalary" >
                </div>
            </div>
            <div class="form-group">
                <label for="input6" class="col-sm-2 control-label">jobaddress</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="input6" placeholder="jobaddress" name="jobaddress" >
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
        <caption>JobsTable.</caption>
        <thead>
        <tr>
            <th>jobid</th>
            <th>jobname</th>
            <th>jobnumber</th>
            <th>jobdemand</th>
            <th>jobfunction</th>
            <th>jobsalary</th>
            <th>jobaddress</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${jobs}" var="job">
            <tr>
                <th>${job.jobid}</th>
                <th>${job.jobname}</th>
                <th>${job.jobnumber}</th>
                <th>${job.jobdemand}</th>
                <th>${job.jobfunction}</th>
                <th>${job.jobsalary}</th>
                <th>${job.jobaddress}</th>
                <td ><a href="${pageContext.request.contextPath}/deletejob.action?jobid=${job.jobid}">删除</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
