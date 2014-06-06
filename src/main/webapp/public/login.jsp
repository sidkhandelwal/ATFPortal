<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<head>
        <title><spring:message  code="project.title" /></title>
        <link href='http://fonts.googleapis.com/css?family=Yanone+Kaffeesatz:400,300' rel='stylesheet' type='text/css'>
        <script src="<c:url value='/resources/js/jquery-1.9.1.min.js' />"></script>
        <script src="<c:url value='/resources/js/angular.min.js' />"></script>
		
		<link href="<c:url value='/resources/css/styles-login.css'  />" rel="stylesheet"/>

</head>

<body>

<header>
	<section>
    	<h1 id="logo"><span>Web Portal </span></h1>
        <div class="social"><a href=""><img src="<c:url value='/resources/images/home/fb.png'/>" width="193" height="31" alt=""></a></div>
    </section> 
</header>
<div class="head">  
  <section><img src="<c:url value='/resources/images/home/head.png'/>" width="618" height="341" alt=""></section>
</div>
<div id="container">
            <section><div class="logbox"  ng-controller="loginController">
                    <form method="post" action="j_spring_security_check">
                        <div class="left">
                        <div class="login">Please login to the System: </div>
                        <div class="username-text">Username:</div>
                        <div class="password-text">Password:</div>
                        <div class="username-field">
                            <input type="text"  id="j_username"  name="j_username" placeholder="username" required />
                        </div>
                        <div class="password-field">
                            <input type="password"  id="j_password"  name="j_password" placeholder="password" required/>
                        </div>
                        <input type="checkbox" name="remember-me" id="remember-me" /><label for="remember-me">Remember me</label>
                        <input type="submit" name="submit" value="GO" class="button" />
                        <div class="forgot-usr-pwd">Forgot <a href="#">username</a> or <a href="#">password</a>?</div>
                         <span class="login-error"  >${error}</span>
                        </div>
                       
                        <div class="right"> <input type="submit" name="submit" value="GO" /> </div>
                    </form>
               </div>
            
             </section>
		</div>
 <div class="ad">
 
 	<section>  <img src="<c:url value='/resources/images/ad/${orgData.logoImgPath}'/>" width="960" height="90" alt=""> </section>
 </div>       
<div class="content">
  <section>
		
					<div class="columns">
						<div class="oneThird">
						  <div class="imgHolder"> <img src="<c:url value='/resources/images/home/ico1.png'/>" width="114" height="80" alt=""></div>
                          <h2>How we can help You</h2>
						  <p>*** This is a dynamic text area where admin would post new messages. The desktop version has prvosion to display messages setup by admin.***</p>
						</div>
                        <div class="oneThird">
							<div class="imgHolder"><img src="<c:url value='/resources/images/home/register.png'/>" width="86" height="67" alt=""></div>
                          <h2>What we Do</h2>
						  <p>WebPortal offers a range of interactive health and safety learning courses. As part of our commitment to you we only provide quality courseware along with associated risk assessment modules to help keep you up to date with legal and compliancy requirements that fall under 'staff training'. All courseware is CPD accredited and RoSPA approved.</p>
						</div>
                        <div class="oneThird">
						  <div class="imgHolder"> <img src="<c:url value='/resources/images/home/user.png'/>" width="75" height="75" alt=""></div>
                          <h2>New User Regirtation</h2>
							<p>If this is your first visit and you have not been registered,
click<a href="#"> Register.</a> Do not Register more than once. </p>
						</div>
    </div>
			</section>
 
 </div>
 
 <footer>
    	<div class="foot">
    		<div  class="footlogo"><img src="<c:url value='/resources/images/atf.png'/>" width="140" height="83" alt=""></div>
        	<div class="copy">Copyrights AT&F Solution Ltd</div>
        </div>
</footer>

<script src="<c:url value='/resources/js/pages/login.js' />"></script>

</body>