package com.atfportal.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;



@Entity
@Table(name = "UL_tbOCourseContact")
public class UserOfflineCourses {
	@Id @Column(name = "intRecordId")
	private Integer recordId;
	
	@Column(name = "intContactID")
	private Integer userID;
	
	@Column(name = "datAttended")
	private Date attendedDate;
	
	@Column(name = "strTeacherName")
	private String teacherName;
	
	@Column(name = "strLocation")
	private String location;
	
	@Column(name = "strComments")
	private String 	comments;
	
	@Column(name = "datCreated")
	private Date  createdDate;
	
	@Column(name = "datModified")
	private Date	modifiedDate;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="intOCourseId" , nullable=false)
	@Fetch(FetchMode.JOIN)
	private OfflineCourses offlineCourse;
	
	
	
	public Integer getRecordId() {
		return recordId;
	}
	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public String getAttendedDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(attendedDate);
	
	}
	public void setAttendedDate(Date attendedDate) {
		this.attendedDate = attendedDate;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public OfflineCourses getOfflineCourse() {
		return offlineCourse;
	}
	public void setOfflineCourse(OfflineCourses offlineCourse) {
		this.offlineCourse = offlineCourse;
	}
	
	
	
	
	
	

}
