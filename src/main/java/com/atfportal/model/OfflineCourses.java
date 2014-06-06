package com.atfportal.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "UL_tbOCourseM")
public class OfflineCourses {
	@Id @Column(name = "intOCourseId")
	private Integer offlineCourseId;
	
	@Column(name = "intOrganisationId")
	private Integer organisationId;
	
	@Column(name = "strTitle")
	private String title;

	@Column(name = "strSummary")
	private String summary;
	
	@Column(name = "blnCancelled")
	private Boolean cancelled;
	
	@Column(name = "datCreated")
	private Date createdDate;
	
	@Column(name = "datModified")
	private Date modifiedDate;
	

	public Integer getOfflineCourseId() {
		return offlineCourseId;
	}

	public void setOfflineCourseId(Integer offlineCourseId) {
		this.offlineCourseId = offlineCourseId;
	}

	public Integer getOrganisationId() {
		return organisationId;
	}

	public void setOrganisationId(Integer organisationId) {
		this.organisationId = organisationId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Boolean getCancelled() {
		return cancelled;
	}

	public void setCancelled(Boolean cancelled) {
		this.cancelled = cancelled;
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
	
	
	
	

}
