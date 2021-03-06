package com.atfportal.controller;



import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/protected/test")
public class TestController {

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<String> userCourseRquest(@RequestParam String action , @RequestParam String module,
    		@RequestParam(required = false) String value , @RequestParam(required = false) String name
    		) throws IOException {
      

    	HttpHeaders responseHeaders = new HttpHeaders();
    	  responseHeaders.set("Content-type", "text/xml");
    	
    	/*switch(action) {
    	 
    	 case "LMSInitialize" : 
    		return  getUserCourseDetails(module);
    	  
    	 case "poll" : 
    		 return poll();    		 
    		 
    	 
    	 }*/
    	
    	  
    	  
    	return new ResponseEntity<String>(
    			 
    	        "<?xml version='1.0' encoding='UTF-8'?><data success='1' cmi.core.lesson_status='pass' cmi.core.student_name='sid' cmi.suspend_data='false'></data>",responseHeaders, 
    	        HttpStatus.OK);
    	
    	
    }
    
    
   
    public ResponseEntity<String> save(  ) throws IOException {
    	HttpHeaders responseHeaders = new HttpHeaders();
  	  	responseHeaders.set("Content-type", "text/xml");
    	return new ResponseEntity<String>(
    	        "<?xml version='1.0' encoding='UTF-8'?><data success='1' ></data>",responseHeaders, 
    	        HttpStatus.OK);
    	
    }
    

	private ResponseEntity<String> poll() {
	  	HttpHeaders responseHeaders = new HttpHeaders();
  	  	responseHeaders.set("Content-type", "text/xml");
    	return new ResponseEntity<String>(
    	        "<?xml version='1.0' encoding='UTF-8'?><data success='1' ></data>",responseHeaders, 
    	        HttpStatus.OK);
  
		
	}

	

	private ResponseEntity<String> getUserCourseDetails(String module) {
	 	HttpHeaders responseHeaders = new HttpHeaders();
  	  responseHeaders.set("Content-type", "text/xml");
  	  
   	return new ResponseEntity<String>(
			 
	        "<?xml version='1.0' encoding='UTF-8'?><data success='1' cmi.core.lesson_status='pass' cmi.core.student_name='sid' cmi.suspend_data='false'></data>",responseHeaders, 
	        HttpStatus.OK);

 
		
	}
}
