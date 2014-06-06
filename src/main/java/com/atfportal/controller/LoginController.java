package com.atfportal.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.atfportal.model.Organisation;
import com.atfportal.service.OrganisationService;
import com.atfportal.vo.OrganisationVO;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	OrganisationService organisationService;

	@RequestMapping(method = { RequestMethod.GET, RequestMethod.POST,
			RequestMethod.DELETE, RequestMethod.PUT })
	public ModelAndView doGet(HttpServletRequest request, HttpSession session) {

		Organisation org = (Organisation) session.getAttribute("organisation");

		if (org == null) {
			Cookie[] cookies = request.getCookies();
			String oid = null;
			if (cookies != null)
				for (Cookie cookie : cookies) {
					String name = cookie.getName();
					if (StringUtils.isNotBlank(name) && name.equals("oid")) {
						oid = cookie.getValue();
					}
				}

			if (oid != null) {
				org = organisationService.findByOrgSeqNbr(oid);
				session.setAttribute("organisation", org);
			}
		}

		String imagePath = "default.jpg";
		String orgName = "";

		if (org != null) {

			if (StringUtils.isNotBlank(org.getLogoImagePath()))
				imagePath = org.getLogoImagePath();

			if (StringUtils.isNotBlank(org.getOrgName()))
				orgName = org.getOrgName();

		}
		OrganisationVO vo = new OrganisationVO(imagePath, orgName);
		return new ModelAndView("login", "orgData", vo);

	}

}
