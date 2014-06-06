package com.atfportal.repository;

import org.springframework.data.repository.CrudRepository;

import com.atfportal.model.Organisation;
import com.atfportal.model.User;

public interface OrganisationRepository extends CrudRepository<Organisation, Integer> {
	Organisation findByOrgSeqNbr(String orgSeqNbr);

	
}
