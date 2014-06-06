package com.atfportal.model;

import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class CourseUnlockKey {

	int courseID;
	String  expiryDate;
	String domain;
	int numberOfUsers;
	String unlockKey;
	
	CourseUnlockKey(String unlockKey) {
		
		
	}
	
	public void init() {
		
		try {
		StringTokenizer st = new StringTokenizer(unlockKey, ",");
		courseID = Integer.parseInt(st.nextToken());
		expiryDate =st.nextToken();
		domain = st.nextToken();
		numberOfUsers = Integer.parseInt(st.nextToken());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	
	public boolean validate(Integer courseIdentifier) {
		return false;
		
		
	}
	
	
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public String  getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public int getNumberOfUsers() {
		return numberOfUsers;
	}
	public void setNumberOfUsers(int numberOfUsers) {
		this.numberOfUsers = numberOfUsers;
	}
	
	
	
	
	
	
}
