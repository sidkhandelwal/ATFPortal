package com.atfportal.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.atfportal.model.Organisation;
import com.atfportal.service.OrganisationService;

@Controller
@RequestMapping(value = "/")
public class HomeController {

	
	
	@Autowired
	OrganisationService organisationService;	
	
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
    public String doGet(HttpServletRequest request, HttpSession session) {
    	
    	String oid = request.getParameter("oid");
    	if (oid==null) {
	    	Cookie [] cookies =  request.getCookies();
	    	
	    	if(cookies!=null)
	    	for(Cookie  cookie: cookies) {
	    		String name = cookie.getName();
	    		if(StringUtils.isNotBlank(name) && name.equals("oid")) {
	    			oid = cookie.getValue();
	    		}
	    		
	    	}
    	}

    	if(StringUtils.isBlank(oid))
    		 return "redirect:/public/company";
    	else {
    		Organisation organisation = organisationService.findByOrgSeqNbr(oid);
        	session.setAttribute("organisation", organisation);   		
    		 return "redirect:/login";
    	}
    }	
	
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT}, produces = "application/json")
    public ResponseEntity<?> doGetAjax() {
        return new ResponseEntity<Object>(HttpStatus.FORBIDDEN);
    }    
}
