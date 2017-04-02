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

                <form class="form-horizontal" role="form" method="post" action="${pageContext.request.contextPath}/addcomchar.action">
                    <div class="form-group">
                        <label for="input1" class="col-sm-2 control-label">企业性质名称</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="input1" placeholder="CompanyId" name="companycharacter" >
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
                <caption>CompanyCharacterListTable.</caption>
                <thead>
                <tr>
                    <th>CompanyCharacterId</th>
                    <th>CompanyCharacter</th>
                    <th>操作</th>
                </tr>
                </thead>
        <tbody>
        <c:forEach items="${companyCharacterlist}" var="CompanyCharacterListItem">
            <tr>
                <td >${CompanyCharacterListItem.companycharacterid}</td>
                <td >${CompanyCharacterListItem.companycharacter }</td>
                <td ><a href="${pageContext.request.contextPath}/deletecomchar.action?companycharacterid=${CompanyCharacterListItem.companycharacterid}">删除</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
