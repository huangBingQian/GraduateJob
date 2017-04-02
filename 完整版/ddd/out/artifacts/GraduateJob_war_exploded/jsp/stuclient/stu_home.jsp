<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Jumbotron Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="./css/bootstrap.min.css">
    <link rel="stylesheet" href="./css/reset.css">
    <link rel="stylesheet" href="./css/stu-home.css">


    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="http://cdn.bootcss.com/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]--></head>
<body>
    <nav class="navbar navbar-default navbar-fixed-top GJ-navbar" role="navigation">
        <div class="container">
            <div class="row">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <img alt="Brand" src="./image/logo.png">

                </div>
                <div class="navbar-collapse collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li><a href="${pageContext.request.contextPath}/stu_home.action">首页</a></li>
                        <li><a href="${pageContext.request.contextPath}/stu_job.action">职位</a></li>
                        <li><a href="${pageContext.request.contextPath}/message.action">个人中心</a></li>
                    </ul>
                    <ul class="user">
                        <li class="user-logo" style="background-image: url(/updata/stulogo/${sessionScope.graduate.stuLogo})"></li>
                        <li>
                            <span class="name">${sessionScope.graduate.graduatename }</span>
                            <span class="badge">
                                <img src="./image/icon-news.png">
                                <span class="msg-number"> ${ noticeAmount } </span>
                            </span>
                        </li>
                        <div class="popover bottom user-info" id="aaa">
                            <div class="arrow"></div>
                            <div>
                                <div class="title">
                                    <ul>
                                        <li><span class="user-logo"><img class="" src=""></span></li>
                                        <li>
                                            <span class="user-info">
                                            <span>${sessionScope.graduate.graduatename }</span>
                                            <span><a href="${pageContext.request.contextPath}/jsp/login.jsp">注销</a></span>
                                        </span>

                                        </li>
                                    </ul>
                                </div>

                                <p>您有${noticeAmount }条通知</p>
                            </div>
                        </div>

                    </ul>

                </div>
            </div>
         </div>
    </nav>
    <div class="container page-middle">
        <div class="row">

            <!--滚动图-->
            <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                <!-- Indicators -->
                <ol class="carousel-indicators">
                    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                </ol>

                <!-- Wrapper for slides -->
                <div class="carousel-inner" role="listbox">
                    <div class="item active">
                        <img src="./image/stu_home/ShouYeGunDongTu1.jpg" alt="...">
                        <div class="carousel-caption">
                        </div>
                    </div>
                    <div class="item">
                        <img src="./image/stu_home/ShouYeGunDongTu2.jpg" alt="...">
                        <div class="carousel-caption">

                        </div>
                    </div>
                    <div class="item">
                        <img src="./image/stu_home/ShouYeGunDongTu3.jpg" alt="...">
                        <div class="carousel-caption">
                        </div>
                    </div>
                </div>

                <!-- Controls -->
                <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
                    <span class="glyphicon glyphicon-chevron-left"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
                    <span class="glyphicon glyphicon-chevron-right"></span>
                    <span class="sr-only">Next</span>
                </a>
                <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
                    <span class="glyphicon glyphicon-chevron-right"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>

            <!--通知-->
            <div class="news-block">
                <dl>
                    <dt>
                        <div>
                            <p>日历怎么弄？</p>
                            <img src="">
                            <ul>
                                <li></li>
                            </ul>
                        </div>
                    </dt>
                    <dt>
                        <div>
                            <p>就业要闻</p>
                            <img src="http://localhost:8080/pic/stu_homepic/hdu_1.jpg">
                            <ul>
                                <li>数据库取出的消息1</li>
                                <li>数据库取出的消息2</li>
                                <li>数据库取出的消息3</li>
                            </ul>
                        </div>
                    </dt>
                    <dt>
                        <div>
                            <p>就业要闻</p>
                            <img src="http://localhost:8080/pic/stu_homepic/hdu_2.jpg">
                            <ul>

                                <li>数据库取出的消息1</li>
                                <li>数据库取出的消息2</li>
                                <li>数据库取出的消息3</li>
                            </ul>
                        </div>
                    </dt>
                    <dt>
                        <div>
                            <p>就业要闻</p>
                            <img src="http://localhost:8080/pic/stu_homepic/hdu_3.jpg">
                            <ul>
                                <li>数据库取出的消息1</li>
                                <li>数据库取出的消息2</li>
                                <li>数据库取出的消息3</li>
                            </ul>
                        </div>
                    </dt>
                </dl>
            </div>

            <!--工作模块-->
            <div class="job-choice-block">
                <dl>
                    <dt>
                        <div class="job-logo" style="background-image: url('./image/IT.png')">IT·互联网</div>
                        <div class="job-logo-right">
                            <a href="#">more</a>
                            <div class="job-list">
                                <dl>
                                    <dt>
                                        <div class="job-icon">
                                            <img  src="./image/jobicon.png">
                                        </div>
                                        <div class="job-info">
                                            <div class="job-name">java web后端开发/运维</div>
                                            <div>
                                                <span class="job-price">1万-1.5万</span>
                                                <span class="work-place">北京·朝阳区</span>
                                            </div>
                                            <div class="company-name">网易</div>
                                        </div>
                                    </dt>
                                    <dt>
                                        <div class="job-icon">
                                            <img  src="./image/jobicon.png">
                                        </div>
                                        <div class="job-info">
                                            <div class="job-name">java web后端开发/运维</div>
                                            <div>
                                                <span class="job-price">1万-1.5万</span>
                                                <span class="work-place">北京·朝阳区</span>
                                            </div>
                                            <div class="company-name">网易</div>
                                        </div>
                                    </dt>
                                    <dt>
                                        <div class="job-icon">
                                            <img  src="./image/jobicon.png">
                                        </div>
                                        <div class="job-info">
                                            <div class="job-name">java web后端开发/运维</div>
                                            <div>
                                                <span class="job-price">1万-1.5万</span>
                                                <span class="work-place">北京·朝阳区</span>
                                            </div>
                                            <div class="company-name">网易</div>
                                        </div>
                                    </dt>
                                    <dt>
                                        <div class="job-icon">
                                            <img  src="./image/jobicon.png">
                                        </div>
                                        <div class="job-info">
                                            <div class="job-name">java web后端开发/运维</div>
                                            <div>
                                                <span class="job-price">1万-1.5万</span>
                                                <span class="work-place">北京·朝阳区</span>
                                            </div>
                                            <div class="company-name">网易</div>
                                        </div>
                                    </dt>
                                    <dt>
                                        <div class="job-icon">
                                            <img  src="./image/jobicon.png"/>
                                        </div>
                                        <div class="job-info">
                                            <div class="job-name">java web后端开发/运维</div>
                                            <div>
                                                <span class="job-price">1万-1.5万</span>
                                                <span class="work-place">北京·朝阳区</span>
                                            </div>
                                            <div class="company-name">网易</div>
                                        </div>
                                    </dt>
                                    <dt>
                                        <div class="job-icon">
                                            <img  src="./image/jobicon.png">
                                        </div>
                                        <div class="job-info">
                                            <div class="job-name">java web后端开发/运维</div>
                                            <div>
                                                <span class="job-price">1万-1.5万</span>
                                                <span class="work-place">北京·朝阳区</span>
                                            </div>
                                            <div class="company-name">网易</div>
                                        </div>
                                    </dt>
                                </dl>
                            </div>
                        </div>
                    </dt>
                    <dt>
                        <div class="job-logo" style="background-image: url('./image/JinRong.png')">金融</div>
                        <div class="job-logo-right">
                            <a href="#">more</a>
                            <div class="job-list">
                                <dl>
                                    <dt>
                                        <div class="job-icon">
                                            <img  src="./image/jobicon.png">
                                        </div>
                                        <div class="job-info">
                                            <div class="job-name">java web后端开发/运维</div>
                                            <div>
                                                <span class="job-price">1万-1.5万</span>
                                                <span class="work-place">北京·朝阳区</span>
                                            </div>
                                            <div class="company-name">网易</div>
                                        </div>
                                    </dt>
                                    <dt>
                                        <div class="job-icon">
                                            <img  src="./image/jobicon.png">
                                        </div>
                                        <div class="job-info">
                                            <div class="job-name">java web后端开发/运维</div>
                                            <div>
                                                <span class="job-price">1万-1.5万</span>
                                                <span class="work-place">北京·朝阳区</span>
                                            </div>
                                            <div class="company-name">网易</div>
                                        </div>
                                    </dt>
                                    <dt>
                                        <div class="job-icon">
                                            <img  src="./image/jobicon.png">
                                        </div>
                                        <div class="job-info">
                                            <div class="job-name">java web后端开发/运维</div>
                                            <div>
                                                <span class="job-price">1万-1.5万</span>
                                                <span class="work-place">北京·朝阳区</span>
                                            </div>
                                            <div class="company-name">网易</div>
                                        </div>
                                    </dt>
                                    <dt>
                                        <div class="job-icon">
                                            <img  src="./image/jobicon.png">
                                        </div>
                                        <div class="job-info">
                                            <div class="job-name">java web后端开发/运维</div>
                                            <div>
                                                <span class="job-price">1万-1.5万</span>
                                                <span class="work-place">北京·朝阳区</span>
                                            </div>
                                            <div class="company-name">网易</div>
                                        </div>
                                    </dt>
                                    <dt>
                                        <div class="job-icon">
                                            <img  src="./image/jobicon.png"/>
                                        </div>
                                        <div class="job-info">
                                            <div class="job-name">java web后端开发/运维</div>
                                            <div>
                                                <span class="job-price">1万-1.5万</span>
                                                <span class="work-place">北京·朝阳区</span>
                                            </div>
                                            <div class="company-name">网易</div>
                                        </div>
                                    </dt>
                                    <dt>
                                        <div class="job-icon">
                                            <img  src="./image/jobicon.png">
                                        </div>
                                        <div class="job-info">
                                            <div class="job-name">java web后端开发/运维</div>
                                            <div>
                                                <span class="job-price">1万-1.5万</span>
                                                <span class="work-place">北京·朝阳区</span>
                                            </div>
                                            <div class="company-name">网易</div>
                                        </div>
                                    </dt>
                                </dl>
                            </div>
                        </div>
                    </dt>
                    <dt>
                        <div class="job-logo" style="background-image: url('./image/QiChe.png')">汽车·制造</div>
                        <div class="job-logo-right">
                            <a href="#">more</a>
                            <div class="job-list">
                                <dl>
                                    <dt>
                                        <div class="job-icon">
                                            <img  src="./image/jobicon.png">
                                        </div>
                                        <div class="job-info">
                                            <div class="job-name">java web后端开发/运维</div>
                                            <div>
                                                <span class="job-price">1万-1.5万</span>
                                                <span class="work-place">北京·朝阳区</span>
                                            </div>
                                            <div class="company-name">网易</div>
                                        </div>
                                    </dt>
                                    <dt>
                                        <div class="job-icon">
                                            <img  src="./image/jobicon.png">
                                        </div>
                                        <div class="job-info">
                                            <div class="job-name">java web后端开发/运维</div>
                                            <div>
                                                <span class="job-price">1万-1.5万</span>
                                                <span class="work-place">北京·朝阳区</span>
                                            </div>
                                            <div class="company-name">网易</div>
                                        </div>
                                    </dt>
                                    <dt>
                                        <div class="job-icon">
                                            <img  src="./image/jobicon.png">
                                        </div>
                                        <div class="job-info">
                                            <div class="job-name">java web后端开发/运维</div>
                                            <div>
                                                <span class="job-price">1万-1.5万</span>
                                                <span class="work-place">北京·朝阳区</span>
                                            </div>
                                            <div class="company-name">网易</div>
                                        </div>
                                    </dt>
                                    <dt>
                                        <div class="job-icon">
                                            <img  src="./image/jobicon.png">
                                        </div>
                                        <div class="job-info">
                                            <div class="job-name">java web后端开发/运维</div>
                                            <div>
                                                <span class="job-price">1万-1.5万</span>
                                                <span class="work-place">北京·朝阳区</span>
                                            </div>
                                            <div class="company-name">网易</div>
                                        </div>
                                    </dt>
                                    <dt>
                                        <div class="job-icon">
                                            <img  src="./image/jobicon.png"/>
                                        </div>
                                        <div class="job-info">
                                            <div class="job-name">java web后端开发/运维</div>
                                            <div>
                                                <span class="job-price">1万-1.5万</span>
                                                <span class="work-place">北京·朝阳区</span>
                                            </div>
                                            <div class="company-name">网易</div>
                                        </div>
                                    </dt>
                                    <dt>
                                        <div class="job-icon">
                                            <img  src="./image/jobicon.png">
                                        </div>
                                        <div class="job-info">
                                            <div class="job-name">java web后端开发/运维</div>
                                            <div>
                                                <span class="job-price">1万-1.5万</span>
                                                <span class="work-place">北京·朝阳区</span>
                                            </div>
                                            <div class="company-name">网易</div>
                                        </div>
                                    </dt>
                                </dl>
                            </div>
                        </div>
                    </dt>
                    <dt>
                        <div class="job-logo" style="background-image: url('./image/YiLiao.png')">医疗·化工</div>
                        <div class="job-logo-right">
                            <a href="#">more</a>
                            <div class="job-list">
                                <dl>
                                    <dt>
                                        <div class="job-icon">
                                            <img  src="./image/jobicon.png">
                                        </div>
                                        <div class="job-info">
                                            <div class="job-name">java web后端开发/运维</div>
                                            <div>
                                                <span class="job-price">1万-1.5万</span>
                                                <span class="work-place">北京·朝阳区</span>
                                            </div>
                                            <div class="company-name">网易</div>
                                        </div>
                                    </dt>
                                    <dt>
                                        <div class="job-icon">
                                            <img  src="./image/jobicon.png">
                                        </div>
                                        <div class="job-info">
                                            <div class="job-name">java web后端开发/运维</div>
                                            <div>
                                                <span class="job-price">1万-1.5万</span>
                                                <span class="work-place">北京·朝阳区</span>
                                            </div>
                                            <div class="company-name">网易</div>
                                        </div>
                                    </dt>
                                    <dt>
                                        <div class="job-icon">
                                            <img  src="./image/jobicon.png">
                                        </div>
                                        <div class="job-info">
                                            <div class="job-name">java web后端开发/运维</div>
                                            <div>
                                                <span class="job-price">1万-1.5万</span>
                                                <span class="work-place">北京·朝阳区</span>
                                            </div>
                                            <div class="company-name">网易</div>
                                        </div>
                                    </dt>
                                    <dt>
                                        <div class="job-icon">
                                            <img  src="./image/jobicon.png">
                                        </div>
                                        <div class="job-info">
                                            <div class="job-name">java web后端开发/运维</div>
                                            <div>
                                                <span class="job-price">1万-1.5万</span>
                                                <span class="work-place">北京·朝阳区</span>
                                            </div>
                                            <div class="company-name">网易</div>
                                        </div>
                                    </dt>
                                    <dt>
                                        <div class="job-icon">
                                            <img  src="./image/jobicon.png"/>
                                        </div>
                                        <div class="job-info">
                                            <div class="job-name">java web后端开发/运维</div>
                                            <div>
                                                <span class="job-price">1万-1.5万</span>
                                                <span class="work-place">北京·朝阳区</span>
                                            </div>
                                            <div class="company-name">网易</div>
                                        </div>
                                    </dt>
                                    <dt>
                                        <div class="job-icon">
                                            <img  src="./image/jobicon.png">
                                        </div>
                                        <div class="job-info">
                                            <div class="job-name">java web后端开发/运维</div>
                                            <div>
                                                <span class="job-price">1万-1.5万</span>
                                                <span class="work-place">北京·朝阳区</span>
                                            </div>
                                            <div class="company-name">网易</div>
                                        </div>
                                    </dt>
                                </dl>
                            </div>
                        </div>
                    </dt>
                    <dt>
                        <div class="job-logo" style="background-image: url('./image/FangDiChan.png')">房地产</div>
                        <div class="job-logo-right">
                            <a href="#">more</a>
                            <div class="job-list">
                                <dl>
                                    <dt>
                                        <div class="job-icon">
                                            <img  src="./image/jobicon.png">
                                        </div>
                                        <div class="job-info">
                                            <div class="job-name">java web后端开发/运维</div>
                                            <div>
                                                <span class="job-price">1万-1.5万</span>
                                                <span class="work-place">北京·朝阳区</span>
                                            </div>
                                            <div class="company-name">网易</div>
                                        </div>
                                    </dt>
                                    <dt>
                                        <div class="job-icon">
                                            <img  src="./image/jobicon.png">
                                        </div>
                                        <div class="job-info">
                                            <div class="job-name">java web后端开发/运维</div>
                                            <div>
                                                <span class="job-price">1万-1.5万</span>
                                                <span class="work-place">北京·朝阳区</span>
                                            </div>
                                            <div class="company-name">网易</div>
                                        </div>
                                    </dt>
                                    <dt>
                                        <div class="job-icon">
                                            <img  src="./image/jobicon.png">
                                        </div>
                                        <div class="job-info">
                                            <div class="job-name">java web后端开发/运维</div>
                                            <div>
                                                <span class="job-price">1万-1.5万</span>
                                                <span class="work-place">北京·朝阳区</span>
                                            </div>
                                            <div class="company-name">网易</div>
                                        </div>
                                    </dt>
                                    <dt>
                                        <div class="job-icon">
                                            <img  src="./image/jobicon.png">
                                        </div>
                                        <div class="job-info">
                                            <div class="job-name">java web后端开发/运维</div>
                                            <div>
                                                <span class="job-price">1万-1.5万</span>
                                                <span class="work-place">北京·朝阳区</span>
                                            </div>
                                            <div class="company-name">网易</div>
                                        </div>
                                    </dt>
                                    <dt>
                                        <div class="job-icon">
                                            <img  src="./image/jobicon.png"/>
                                        </div>
                                        <div class="job-info">
                                            <div class="job-name">java web后端开发/运维</div>
                                            <div>
                                                <span class="job-price">1万-1.5万</span>
                                                <span class="work-place">北京·朝阳区</span>
                                            </div>
                                            <div class="company-name">网易</div>
                                        </div>
                                    </dt>
                                    <dt>
                                        <div class="job-icon">
                                            <img  src="./image/jobicon.png">
                                        </div>
                                        <div class="job-info">
                                            <div class="job-name">java web后端开发/运维</div>
                                            <div>
                                                <span class="job-price">1万-1.5万</span>
                                                <span class="work-place">北京·朝阳区</span>
                                            </div>
                                            <div class="company-name">网易</div>
                                        </div>
                                    </dt>
                                </dl>
                            </div>
                        </div>
                    </dt>
                </dl>
            </div>

       </div>
    </div>
    <div class="container-fluid page-end">

        <p class="text-center">版权申明</p>
    </div>
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>
</html>