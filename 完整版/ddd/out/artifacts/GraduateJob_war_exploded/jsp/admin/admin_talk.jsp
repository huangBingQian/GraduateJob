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
        <form class="form-horizontal" role="form" method="post" action="${pageContext.request.contextPath}/addtalk.action">
            <div class="form-group">
                <label for="input1" class="col-sm-2 control-label">jobname</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="input1" placeholder="jobname" name="jobname" >
                </div>
            </div>
            <div class="form-group">
                <label for="input2" class="col-sm-2 control-label">theme</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="input2" placeholder="theme" name="theme" >
                </div>
            </div>
            <div class="form-group">
                <label for="input3" class="col-sm-2 control-label">expectnumber</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="input3" placeholder="expectnumber" name="expectnumber" >
                </div>
            </div>
            <div class="form-group">
                <label for="input4" class="col-sm-2 control-label">expecttime</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="input4" placeholder="expecttime" name="expecttime" >
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
        <caption>TalkTable.</caption>
        <thead>
        <tr>
            <th>talkid</th>
            <th>theme</th>
            <th>expectnumber</th>
            <th>expecttime</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${talks}" var="talk">
            <tr>
                <th>${talk.talkid} </th>
                <th>${talk.theme} </th>
                <th>${talk.expectnumber}</th>
                <th>${talk.expecttime}</th>
                <td ><a href="${pageContext.request.contextPath}/deletetalk.action?talkid=${talk.talkid}">删除</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
