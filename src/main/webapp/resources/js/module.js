var
	moduleWin = null,
	moduleInterval = null;

//alert("sadas");

API = {
	values: [],
	pollTimeout: null,

	LMSInitialize: function (parameter) {
		debug ("LMSInitialize (" + parameter + ")");
		
		var r = this.Submit ("action=LMSInitialize", true);

		var success = r && r.getAttribute ("success") == 1;
			
		alert(success);
		if (success) {
			this.values ["cmi.core.lesson_status"] = r.getAttribute ("cmi.core.lesson_status");
			this.values ["cmi.core.student_name"] = r.getAttribute ("cmi.core.student_name");
			this.values ["cmi.suspend_data"] = r.getAttribute ("cmi.suspend_data");
		}
		
		return success ? "true" : "false";
	},
	
	LMSFinish: function (parameter) {
		debug ("LMSFinish (" + parameter + ")");

		return "true";
	},
	
	LMSGetValue: function (parameter) {
		debug ("LMSGetValue (" + parameter + ") = " + this.values [parameter]);

		var result = this.values [parameter];
		
		return result == null ? "" : result;
	},
	
	LMSSetValue: function (parameter, value) {
		debug ("LMSSetValue (" + parameter + "," + value + ")");

		if (value == null)
			value = "";
			
		this.values [parameter] = value;
		
		this.Submit ("action=LMSSetValue&name=" + escape (parameter) + "&value=" + escape (value));
		
		return "true";
	},
	
	LMSCommit: function (parameter) {
		debug ("LMSCommit (" + parameter + ")");

		return "true";
	},
	
	LMSGetLastError: function() {
		debug ("LMSGetLastError()");

		return 0;
	},
	
	LMSGetErrorString: function (errornumber) {
		debug ("LMSGetErrorString (" + errornumber + ")");

		return "";
	},
	
	LMSGetDiagnostic: function (parameter) {
		debug ("LMSGetDiagnostic (" + parameter + ")");

		return "";
	},
	
	Submit: function (params, waitResponse)
	{
		params = "module=" + this.module + "&" + params;
		alert(params);
		
		try {
			http = new XMLHttpRequest();
		}
		catch (e) {
			http = new ActiveXObject("Microsoft.XMLHTTP");
		}

		if (http) {
			http.open ("POST", "/atfportal/protected/test/", ! waitResponse);

			http.setRequestHeader ("Content-type", "application/x-www-form-urlencoded");
			//http.setRequestHeader ("Content-length", params.length);

			http.send (params);

			this.Poll();
			console.log("11111" + http.responseXML);
			if (http.responseXML)
				return http.responseXML.documentElement;
		}
		return null;
	},
		
	Poll: function()
	{
		var me = this;
		
		if (this.pollTimeout)
			clearTimeout (this.pollTimeout);
		
		this.pollTimeout = setTimeout (function() {
			me.Submit ("action=poll", false);
		}, 60000);
	}		
};


function Init()
{
	API.Poll();

	moduleInterval = setInterval (function() {
		if (moduleWin && moduleWin.closed) {
			moduleWin = null;
			location.reload();
		}
	}, 250);	
}


function debug (s)
{
	alert (s);
}


function LaunchModule (url)
{
var w = 1020;
var h = 710;
var x = Math.max (0, (screen.width - w) / 2);
var y = Math.max (0, (screen.height - h) / 2);

	API.module = parseInt (url);

	moduleWin = window.open ("module.php/" + url, "BCMODULE", "left=" + x + ",top=" + y + ",width=" + w + ",height=" + h + ",location=no,menubar=no,toolbar=no,status=no,resizable=no");
}


window.onbeforeunload = function (e)
{
	if (moduleWin)
		return "This will close the active module!";
}


window.onunload = function()
{
	clearInterval (moduleInterval);
	
	if (moduleWin)
		moduleWin.close();
}

Init();
