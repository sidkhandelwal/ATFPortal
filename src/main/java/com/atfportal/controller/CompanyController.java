package com.atfportal.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.atfportal.model.Organisation;
import com.atfportal.service.OrganisationService;
import com.atfportal.service.UserService;

@Controller

public class CompanyController {

	@Autowired
	OrganisationService organisationService;

	
    @RequestMapping(value = "/public/company", method = RequestMethod.GET)
    public ModelAndView companyPage() {
        return new ModelAndView("company");
    }
    
    
    @RequestMapping(value = "/public/company", method =RequestMethod.POST)
    public String loginPage(HttpServletRequest req,HttpServletResponse res, HttpSession session) {
    	
    	
    	String orgSeqNbr = req.getParameter("oid");
    	Organisation organisation = organisationService.findByOrgSeqNbr(orgSeqNbr);
    	if(organisation == null)
    		throw new BadCredentialsException("Wroing Organisation ID");
    	
    	Cookie orgID = new Cookie("oid", orgSeqNbr);
    	orgID.setMaxAge(60*60*24*7);
    	orgID.setHttpOnly(true);
    	orgID.setPath("/");
    	res.addCookie(orgID);
    	
    	session.setAttribute("organisation", organisation);
        return "redirect:/login";
    }
    
    
	@ExceptionHandler(BadCredentialsException.class)
	public ModelAndView handleCustomException(BadCredentialsException ex) {
		
		return new ModelAndView("company" ,"error" , ex.getMessage());
	}
    
    
    
}
