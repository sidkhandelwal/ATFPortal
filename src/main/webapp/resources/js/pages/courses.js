var app = angular.module('atfportal', [ 'ui.bootstrap']);


function contactsController($scope, $http , $dialog , $location, $window) {
    $scope.pageToGet = 0;

    $scope.state = 'busy';

    $scope.lastAction = '';

    $scope.url = "/atfportal/protected/courses/";

    $scope.errorOnSubmit = false;
    $scope.errorIllegalAccess = false;
    $scope.displayMessageToUser = false;
    $scope.displayValidationError = false;
    $scope.displaySearchMessage = false;
    $scope.displaySearchButton = false;
    $scope.displayCreateContactButton = false;

    $scope.contact = {}

    $scope.searchFor = ""
    $scope.menuItem = 'assigned';
    	
    	
    $scope.getContactList = function () {
        var url = $scope.url;
        $scope.lastAction = 'list';

        $scope.startDialogAjaxRequest();

        var config = {params: {page: $scope.pageToGet, menu : $scope.menuItem}};

        $http.get(url, config)
            .success(function (data) {
                $scope.finishAjaxCallOnSuccess(data,  false);
            })
            .error(function () {
                $scope.state = 'error';
                $scope.displayCreateContactButton = false;
            });
    }

    $scope.populateTable = function (data) {
    	$scope.page = {source: data.courses, currentPage: $scope.pageToGet, pagesCount: data.pagesCount, totalCourses : data.totalCourses};
    	console.log(data);
    	
    	if (data.pagesCount >0) {
            $scope.state = 'list';

            $scope.page = {source: data.courses, currentPage: $scope.pageToGet, pagesCount: data.pagesCount, totalCourses : data.totalCourses};
          //  console.log (data.courses);
            if($scope.page.pagesCount <= $scope.page.currentPage){
                $scope.pageToGet = $scope.page.pagesCount - 1;
                $scope.page.currentPage = $scope.page.pagesCount - 1;
            }

            $scope.displayCreateContactButton = true;
            $scope.displaySearchButton = true;
        } else {
            $scope.state = 'noresult';
            $scope.displayCreateContactButton = true;

            if(!$scope.searchFor){
                $scope.displaySearchButton = false;
            }
        }

        if (data.actionMessage || data.searchMessage) {
            $scope.displayMessageToUser = $scope.lastAction != 'search';

            $scope.page.actionMessage = data.actionMessage;
            $scope.page.searchMessage = data.searchMessage;
        } else {
            $scope.displayMessageToUser = false;
        }
    }

   

    $scope.exit = function (modalId) {
      

        $scope.contact = {};
        $scope.errorOnSubmit = false;
        $scope.errorIllegalAccess = false;
        $scope.displayValidationError = false;
    }

    $scope.finishAjaxCallOnSuccess = function (data, isPagination) {
        $scope.populateTable(data);
         $scope.lastAction = '';
    }

    $scope.startDialogAjaxRequest = function () {
        $scope.displayValidationError = false;
         $scope.previousState = $scope.state;
        $scope.state = 'busy';
    }

    $scope.handleErrorInDialogs = function (status) {
      
        $scope.state = $scope.previousState;

        // illegal access
        if(status == 403){
            $scope.errorIllegalAccess = true;
            return;
        }

        $scope.errorOnSubmit = true;
        $scope.lastAction = '';
    }
    
    $scope.resetSearch = function(){
        $scope.searchFor = "";
        $scope.pageToGet = 0;
        $scope.getContactList();
        $scope.displaySearchMessage = false;
    }
    
    $scope.changePage = function (page) {
        $scope.pageToGet = page;

        if($scope.searchFor){
            $scope.searchContact($scope.searchFor, true);
        } else{
            $scope.getContactList();
        }
    };    
    

    $scope.completionStatus = function (tutorialResultID, completedDate) {
    	//	console.log(tutorialResultID , completedDate);
    if(tutorialResultID != null) {
    	if(completedDate==null) { return 'Not Started';}
    	if(completedDate!='') { 
    		return 'Completed';
    		}
    	else { return 'Partially Completed';}
    }
    };
    
    
    $scope.changeMenu = function (menu) {
    console.log("Menu:" + menu);
    	$scope.menuItem = menu;
    	$scope.pageToGet = 0;
    	$scope.getContactList();	
    };
    
    $scope.riskAssessment = function (riskAssessmentResultID, courseRA, completedDate) {
    if($scope.menuItem != 'assigned') { return 'none';}	
    if(riskAssessmentResultID != null && courseRA == true) {
    	if(completedDate==null) { return 'none';}
    	if(completedDate!='') { 
    		return 'risk';
    		}
    	else { return 'none';}
    }
    };
    
    $scope.logoff = function(){
        
    	var msg = $window.confirm('Do you want to logout?');
    	if (msg==true)
    	  {
    		window.location.href = "../logout";
    	  }
    	else
    	  {
    	  //x="You pressed Cancel!";
    	  }
    	
    	/*
    	var msgbox = $dialog.messageBox('Logout', 'Do you want to logout?', [{label:'Yes, I\'m sure', result: 'yes'},{label:'Nope', result: 'no'}]);
        msgbox.open().then(function(result){
            if(result === 'yes') {
            	window.location.href = "../logout";
              console.log("deleting item ");
            }
        });*/
    };
    
    
    $scope.launch = function(courseLoc) {
    	cosole.log("88888888" + courseLoc );
    	window.location(courseLoc);
    };
    
    $scope.getContactList();
}
