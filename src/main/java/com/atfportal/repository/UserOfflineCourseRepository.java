package com.atfportal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.atfportal.model.Organisation;
import com.atfportal.model.User;
import com.atfportal.model.UserOfflineCourses;

public interface UserOfflineCourseRepository extends JpaRepository<UserOfflineCourses, Integer> {
	
	//@Query("select course,offline from  UserOfflineCourses course left join course.offlineCourse offline where course.userID = :userID")
	List<UserOfflineCourses> findByUserID(@Param("userID") Integer userID);

	
}
