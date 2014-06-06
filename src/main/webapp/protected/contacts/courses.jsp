
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<body class="inner" ng-controller="contactsController">
	<div id="wrapper">
		<header class="clearfix">
			<h1 id="logo">
				<span>Web Portal </span>
			</h1>

			<div class="icoNav">
				<span>${user.title}&nbsp;${user.firstName}&nbsp;${user.lastName}</span> 
					<a class="user" title="USER"> User</a> 
					<a class="help" title="HELP"> Help></a> 
					<a class="logout" title="LOGOUT"  ng-click="logoff()" > logout</a>
					
			</div>
		</header>
		<nav id="navigation">
			<a href="#" class="nav-btn">Menu<span class="arr"></span></a>
			<ul ng-init=" menuItem='assigned'">
				<li ng:click="changeMenu('assigned')"
					ng:class="{'active' : menuItem=='assigned' }"><a href="">Assigned
						Courses</a><span> </span></li>
				<li ng:click="changeMenu('library')"
					ng:class="{'active' : menuItem=='library' }"><a href="">Course
						Library</a><span> </span></li>
				<li ng:click="changeMenu('offline')"
					ng:class="{'active' : menuItem=='offline' }"><a href="">Offline
						Training</a><span> </span></li>
			</ul>
		</nav>
		<div id="main">

			<div
				ng-class="{'text-center': page.totalCourses >5, 'none': page.totalCourses <=5}"
				class="none">
				<button href="#" class="btn btn-inverse"
					ng-class="{'btn-inverse': page.currentPage != 0, 'disabled': page.currentPage == 0}"
					ng-disabled="page.currentPage == 0" ng-click="changePage(0)"
					title='<spring:message code="pagination.first"/>'>
					<spring:message code="pagination.first" />
				</button>
				<button href="#" class="btn btn-inverse"
					ng-class="{'btn-inverse': page.currentPage != 0, 'disabled': page.currentPage == 0}"
					ng-disabled="page.currentPage == 0" class="btn btn-inverse"
					ng-click="changePage(page.currentPage - 1)"
					title='<spring:message code="pagination.back"/>'>&lt;</button>
				<span>{{page.currentPage + 1}} <spring:message
						code="pagination.of" /> {{page.pagesCount}}
				</span>
				<button href="#" class="btn btn-inverse"
					ng-class="{'btn-inverse': page.pagesCount - 1 != page.currentPage, 'disabled': page.pagesCount - 1 == page.currentPage}"
					ng-click="changePage(page.currentPage + 1)"
					ng-disabled="page.pagesCount - 1 == page.currentPage"
					title='<spring:message code="pagination.next"/>'>&gt;</button>
				<button href="#" class="btn btn-inverse"
					ng-class="{'btn-inverse': page.pagesCount - 1 != page.currentPage, 'disabled': page.pagesCount - 1 == page.currentPage}"
					ng-disabled="page.pagesCount - 1 == page.currentPage"
					ng-click="changePage(page.pagesCount - 1)"
					title='<spring:message code="pagination.last"/>'>
					<spring:message code="pagination.last" />
				</button>
			</div>



				<div class="imgsection">
					<a onclick="window.open('../Courses/SCORM/Legionella_Awareness_Audio/index.html')"
						><span
						class="imgtop"> </span><img
						src="../Courses/SCORM/{{course.courseTutorialPath}}/{{course.courseLogo}}" 
						width="168" height="160" alt="" class="imgbottom"></a>
				</div>


			<div class="row" ng-repeat="course in page.source"
				ng-show="menuItem=='assigned' || menuItem=='library'">
				<div class="imgsection">
					<a onclick="window.open('../Courses/SCORM/{{course.courseTutorialPath}}/index.html')"
						><span
						class="imgtop"> </span><img
						src="../Courses/SCORM/{{course.courseTutorialPath}}/{{course.courseLogo}}" 
						width="168" height="160" alt="" class="imgbottom"></a>
				</div>
				<div class="coursetxt">
					<h3>
						{{course.course}} <span>{{completionStatus(course.tutorialResultID,course.completedDate)}}</span>
					</h3>
					<h4>{{course.courseSummary}}</h4>
					<p>{{course.courseDescription}}</p>
					<div class="btm-link">
						<a href="#"
							ng-class="">Risk
							Assessment </a> <a href="#" class="history">View history </a> <a
							href="#" class="print"> Email Certificate </a>
					</div>
				</div>
			</div>

			<div class="panel panel-default" ng-show="menuItem=='offline'">
				<div class="panel-heading">Offline Courses</div>
				<div class="panel-body">
					<p></p>
				</div>
				<!-- Table -->
				<table class="table">
					<thead>
						<tr>
							<th>Course Title</th>
							<th>Date Attended</th>
							<th>Trainer Name</th>
							<th>Course Location</th>
						</tr>
					</thead>
					<tbody ng-repeat="course in page.source">
						<tr>
							<td>{{course.offlineCourse.title}}</td>
							<td>{{course.attendedDate}}</td>
							<td>{{course.teacherName}}</td>
							<td>{{course.location}}</td>
						</tr>

					</tbody>
				</table>
			</div>
		</div>

	</div>
	<footer>
		<div class="foot">
			<div class="footlogo">
				<img src="<c:url value='/resources/images/atf.png'/>" width="140"
					height="83" alt="">
			</div>
			<div class="copy">Copyrights AT&F Solution Ltd</div>
		</div>
	</footer>
</body>

<script src="<c:url value="/resources/js/pages/courses.js" />"></script>
<script src="<c:url value="/resources/js/module.js" />"></script>