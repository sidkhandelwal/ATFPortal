<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!doctype html>
<html class="no-js" id="ng-app" ng-app="atfportal">
<head>
        <title><spring:message  code="project.title" /></title>
        <link href="<c:url value='/resources/css/bootstrap.min.css'  />" rel="stylesheet"/>
        <link href="<c:url value='/resources/css/bootstrap-responsive.min.css'  />" rel="stylesheet"/>
        <link href="<c:url value='/resources/css/project_style.css'  />" rel="stylesheet"/>
         <link href='http://fonts.googleapis.com/css?family=Yanone+Kaffeesatz:400,300' rel='stylesheet' type='text/css'>
        <link href="<c:url value='/resources/css/styles.css'  />" rel="stylesheet"/>
        <script src="<c:url value='/resources/js/jquery-1.9.1.min.js' />"></script>
        <script src="<c:url value='/resources/js/angular.min.js' />"></script>
        <script src="<c:url value='/resources/js/ui-bootstrap-tpls-0.11.0.min.js' />"></script>
        
        <script src="<c:url value='/resources/js/nav.js' />"></script>
        
       <script src= "http://angular-ui.github.io/bootstrap/ui-bootstrap-tpls-0.3.0.min.js" ></script>
        
    </head>
    

            <tiles:insertAttribute name="body" />
       
   
</html>