package com.atfportal.repository;

import org.springframework.data.repository.CrudRepository;

import com.atfportal.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByEmail(String email);

	User findByUserNameAndOrgID(String username, Integer orgid);
}
