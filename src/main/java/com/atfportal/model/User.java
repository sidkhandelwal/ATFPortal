package com.atfportal.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbContact")
public class User {



  // @Enumerated(EnumType.STRING)
  //  @Column(name = "user_role")
    //private Role role;
    
    
	@Id @Column(name = "intContactID")
	private Integer userID;
	
	@Column(name = "intOrganisationID")
	private Integer orgID;
	
	@Column(name = "intLocationID")
	private Integer locationID;
	
	@Column(name = "intDepartmentID")
	private Integer dapartmentID;
	
	@Column(name = "strEmployeeNumber")
	private String userName;
	
	@Column(name = "strFirstName")
	private String firstName;
	
	@Column(name = "strSurname")
	private String lastName;
	
	@Column(name = "strTitle")
	private String title;
	
	@Column(name = "strEmail")
	private String email;
	
	@Column(name = "strNotes")
	private String notes;
	
	@Column(name = "strPassword")
	private String password;
	
	@Column(name = "datLastLogin")
	private Date lastLoginDate;
	
	@Column(name = "datCreated")
	private Date creationDate;
	
	@Column(name = "datModified")
	private Date modifiedDate;
	
	@Column(name = "blnCancelled")
	private Boolean state;
	
	@Column(name = "UL_strPhone")
	private String phoneNbr;
	
	
	
	@Column(name = "UL_strExtension")
	private String extension;
	
	@Column(name = "UL_datDOB")
	private Date dateOfBirth;
	
	@Column(name = "UL_strPayroll")
	private String payroll;
	
	@Column(name = "UL_strJobTitle")
	private String jobTitle;

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public Integer getOrgID() {
		return orgID;
	}

	public void setOrgID(Integer orgID) {
		this.orgID = orgID;
	}

	public Integer getLocationID() {
		return locationID;
	}

	public void setLocationID(Integer locationID) {
		this.locationID = locationID;
	}

	public Integer getDapartmentID() {
		return dapartmentID;
	}

	public void setDapartmentID(Integer dapartmentID) {
		this.dapartmentID = dapartmentID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Boolean getState() {
		return state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

	public String getPhoneNbr() {
		return phoneNbr;
	}

	public void setPhoneNbr(String phoneNbr) {
		this.phoneNbr = phoneNbr;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPayroll() {
		return payroll;
	}

	public void setPayroll(String payroll) {
		this.payroll = payroll;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

    
    
    
    
    
    
    

    
}