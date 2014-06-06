<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<head>
        <title>WebPortal::Enter company number</title>

        <link href='http://fonts.googleapis.com/css?family=Yanone+Kaffeesatz:400,300' rel='stylesheet' type='text/css'>
        <script src="<c:url value='/resources/js/jquery-1.9.1.min.js' />"></script>
        <script src="<c:url value='/resources/js/angular.min.js' />"></script>
		<link href="<c:url value='/resources/css/styles-company.css'  />" rel="stylesheet"/>
		<link href="<c:url value='/resources/css/styles-login.css'  />" rel="stylesheet"/>
		        
		
</head>


<body>

<div class="main main2" ng-controller="loginController">
	<div class="half">
    <img src="<c:url value='/resources/images/web-portal-logo.png'  />" width="338" height="61" alt=""></div>
    <div class="half">
    
    <div class="logbox2">
    
            
                    <form method="post" action="company"  name="form">
                   
                        <div class="left">
                            <div class="login">Enter company number </div> 
                            <div class="company-text">Company Number:</div>
                        <div class="company-field">
                            <input type="text" name="oid" id="oid" value="" required/>
                             <span class="error" >${error}</span>
                        </div>
                        </div>
                        <div class="right"> <input type="submit" name="submit" value="login"/> </div>
                    </form>
               </div>
    
    </div>
</div>


<script src="<c:url value='/resources/js/pages/login.js' />"></script>
</body>