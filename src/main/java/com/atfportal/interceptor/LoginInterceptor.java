package com.atfportal.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.atfportal.model.Organisation;
import com.atfportal.model.User;
import com.atfportal.service.UserService;

public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private UserService userService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();

        User user = (User) session.getAttribute("user");
        if(user == null){
            Authentication auth = SecurityContextHolder.getContext().getAuthentication();
            String username = auth.getName();
            
            	
            Organisation org = (Organisation)session.getAttribute("organisation");
            if (org == null) {
                throw new BadCredentialsException("Organisation information is  missing.");
            }
            
            Integer oid = org.getOrgID();
             user = userService.findByUserNameAndOrgID(username, oid);

            session.setAttribute("user", user);
        }

        return super.preHandle(request, response, handler);
    }
}
