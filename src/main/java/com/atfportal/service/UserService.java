package com.atfportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atfportal.model.User;
import com.atfportal.repository.UserRepository;

@Service
public class UserService {

	
    @Autowired
    private UserRepository userRepository;

    Integer orgID;
	
    
    public User findByEmail(String email){
        return userRepository.findByEmail(email);
    }

	public User findByUserNameAndOrgID(String username, Integer oid) {
		 return userRepository.findByUserNameAndOrgID(username,oid);
	}

	public Integer getOrgID() {
		return orgID;
	}

	public void setOrgID(Integer orgID) {
		this.orgID = orgID;
	}


	
	
}
