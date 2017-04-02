<%--
  Created by IntelliJ IDEA.
  User: yxaw
  Date: 2016/11/16
  Time: 12:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin</title>
    <!-- Bootstrap core CSS -->
    <link href="http://cdn.bootcss.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">
    <script src="http://cdn.bootcss.com/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <h1>企业端</h1>
        <a href="${pageContext.request.contextPath}/companycharacterlist.action"><h3>企业性质表(companyCharacterid)</h3></a>
        <a href="${pageContext.request.contextPath}/industrylist.action"><h3>所属行业表(industryListid)</h3></a>
        <a href="${pageContext.request.contextPath}/company.action"><h3>公司表(companyid)</h3></a>
        <a href="${pageContext.request.contextPath}/contact.action"><h3>(contactid,companyid)关系表</h3></a>
        <a href="${pageContext.request.contextPath}/inform.action"><h3>公司联系人表(contactid)</h3></a>
        <a href="${pageContext.request.contextPath}/job.action"><h3>岗位表(jobid)</h3></a>
        <a href="${pageContext.request.contextPath}/divide.action"><h3>(conpanyid,jobid)关系表</h3></a>
        <a href="${pageContext.request.contextPath}/talk.action"><h3>宣讲会表(talkid)</h3></a>
        <a href="${pageContext.request.contextPath}/join.action"><h3>(talkid,companyid)关系表</h3></a>
        <a href="${pageContext.request.contextPath}/talkjob.action"><h3>(talkid,jobid)关系表</h3></a>
        <h2>学生端</h2>
        <a href="${pageContext.request.contextPath}/graduate.action"><h3>graduate</h3></a>
        <a href="${pageContext.request.contextPath}/adminnotice.action"><h3>notice</h3></a>
        <a href="${pageContext.request.contextPath}/handinresume.action"><h3>hand_in_resume</h3></a>
    </div>
</div>
</body>
</html>
