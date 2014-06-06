package com.atfportal.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.atfportal.model.Organisation;
import com.atfportal.model.User;
import com.atfportal.service.UserService;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {
 
    @Autowired
    private UserService userService;
 
   
	@Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = (String) authentication.getCredentials();
        
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        HttpSession session = ((ServletRequestAttributes) requestAttributes).getRequest().getSession();
        	
        Organisation org = (Organisation)session.getAttribute("organisation");
        if (org == null) {
            throw new BadCredentialsException("Organisation information is  missing.");
        }
        
        Integer oid = org.getOrgID();
        User user = userService.findByUserNameAndOrgID(username, oid);
 
        if (user == null) {
            throw new BadCredentialsException("Username not found.");
        }
 
        if (!password.equals(user.getPassword())) {
            throw new BadCredentialsException("Wrong password.");
        }
        final List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        
        authorities.add(new SimpleGrantedAuthority(("user_role")));
        
   //     Collection<? extends GrantedAuthority> authorities = user.getRole();
    //    authentication.setAuthenticated(true);
        return new UsernamePasswordAuthenticationToken(username, password,authorities);
    }
 
    @Override
    public boolean supports(Class<?> arg0) {
        return true;
    }
}

