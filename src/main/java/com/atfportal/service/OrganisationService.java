package com.atfportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atfportal.model.Organisation;
import com.atfportal.repository.OrganisationRepository;

@Service
public class OrganisationService {

    @Autowired
    private OrganisationRepository orgRepository;


    public Organisation findByOrgSeqNbr(String orgSeqNbr){
        return orgRepository.findByOrgSeqNbr(orgSeqNbr);
    }

	public Organisation findByOrgID(Integer oid) {
		 return orgRepository.findOne(oid);
	}
}
