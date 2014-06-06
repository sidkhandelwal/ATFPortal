package com.atfportal.vo;

import java.util.Date;

public class UnlockKey {

	private int courseID;
	private Date expiryDate;
	private String domain;
	private int NumberOfUsers;
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public int getNumberOfUsers() {
		return NumberOfUsers;
	}
	public void setNumberOfUsers(int numberOfUsers) {
		NumberOfUsers = numberOfUsers;
	}
	
	
	
	
	
}
