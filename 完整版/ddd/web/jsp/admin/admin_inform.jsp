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
        <form class="form-horizontal" role="form" method="post" action="${pageContext.request.contextPath}/addinform.action">
            <div class="form-group">
                <label for="input1" class="col-sm-2 control-label">contactname</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="input1" placeholder="contactname" name="contactname" >
                </div>
            </div>
            <div class="form-group">
                <label for="input2" class="col-sm-2 control-label">contactemail</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="input2" placeholder="contactemail" name="contactemail" >
                </div>
            </div>
            <div class="form-group">
                <label for="input3" class="col-sm-2 control-label">phonenumber</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="input3" placeholder="phonenumber" name="phonenumber" >
                </div>
            </div>
            <div class="form-group">
                <label for="input4" class="col-sm-2 control-label">machinenumber</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="input4" placeholder="machinenumber" name="machinenumber" >
                </div>
            </div>
            <div class="form-group">
                <label for="input5" class="col-sm-2 control-label">qq</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="input5" placeholder="qq" name="qq" >
                </div>
            </div>
            <div class="form-group">
                <label for="input6" class="col-sm-2 control-label">address</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="input6" placeholder="address" name="address" >
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
        <caption>ContactTable.</caption>
        <thead>
        <tr>
            <th>contactid</th>
            <th>contactname</th>
            <th>contactemail</th>
            <th>machinenumber</th>
            <th>phonenumber</th>
            <th>qq</th>
            <th>address</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${informs}" var="inform">
            <tr>
                <th>${inform.contactid}</th>
                <th>${inform.contactname}</th>
                <th>${inform.contactemail}</th>
                <th>${inform.machinenumber}</th>
                <th>${inform.phonenumber}</th>
                <th>${inform.qq}</th>
                <th>${inform.address}</th>
                <td ><a href="${pageContext.request.contextPath}/deleteinform.action?contactid=${inform.contactid}">删除</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
