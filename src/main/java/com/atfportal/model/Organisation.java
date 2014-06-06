package com.atfportal.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="tbOrganisation")
public class Organisation {
	@Id @Column(name="intOrganisationID")
	private Integer orgID;
	
	 @Column(name="strOrganisation")
    private String orgName;
    private Integer intEmailType;
    private String strEmployeeNumberDescription;
    private String strEmailDomain;
    
    @Column(name="blnCancelled")
    private Boolean state;
    private Date datCreated;
    private Date datModified;
    private Date datNextReminderMailing;
    private Integer intReminderMailingInteval;
    private Boolean blnReminderMailing;
    private String strLocationDescription;
    private String strDepartmentDescription;
    private Integer UL_intAdminId;
    private Date UL_datExpire;
    private Boolean UL_blnLive;
    private String UL_strCourseType;
    private Boolean UL_blnReseller;
    private Integer UL_intResellerId;
    private String UL_Status;
    
    @Column(name="UL_sequentialId")
    private String orgSeqNbr;
    
    @Column(name="UL_strLogo")
    private String logoImagePath;
    
    private String UL_DOBDescription;
    private Boolean UL_DOBMandatory;
    private String UL_PayrollDescription;
    private Boolean UL_PayrollMandatory;
    private String UL_JobtitleDescription;
    private Boolean UL_JobtitleMandatory;
    private Boolean UL_emailId;
    private String UL_emailIdDescription;
    private String UL_DocMgnt;
	public Integer getOrgID() {
		return orgID;
	}
	public void setOrgID(Integer orgID) {
		this.orgID = orgID;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public Integer getIntEmailType() {
		return intEmailType;
	}
	public void setIntEmailType(Integer intEmailType) {
		this.intEmailType = intEmailType;
	}
	public String getStrEmployeeNumberDescription() {
		return strEmployeeNumberDescription;
	}
	public void setStrEmployeeNumberDescription(String strEmployeeNumberDescription) {
		this.strEmployeeNumberDescription = strEmployeeNumberDescription;
	}
	public String getStrEmailDomain() {
		return strEmailDomain;
	}
	public void setStrEmailDomain(String strEmailDomain) {
		this.strEmailDomain = strEmailDomain;
	}
	public Boolean getState() {
		return state;
	}
	public void setState(Boolean state) {
		this.state = state;
	}
	public Date getDatCreated() {
		return datCreated;
	}
	public void setDatCreated(Date datCreated) {
		this.datCreated = datCreated;
	}
	public Date getDatModified() {
		return datModified;
	}
	public void setDatModified(Date datModified) {
		this.datModified = datModified;
	}
	public Date getDatNextReminderMailing() {
		return datNextReminderMailing;
	}
	public void setDatNextReminderMailing(Date datNextReminderMailing) {
		this.datNextReminderMailing = datNextReminderMailing;
	}
	public Integer getIntReminderMailingInteval() {
		return intReminderMailingInteval;
	}
	public void setIntReminderMailingInteval(Integer intReminderMailingInteval) {
		this.intReminderMailingInteval = intReminderMailingInteval;
	}
	public Boolean getBlnReminderMailing() {
		return blnReminderMailing;
	}
	public void setBlnReminderMailing(Boolean blnReminderMailing) {
		this.blnReminderMailing = blnReminderMailing;
	}
	public String getStrLocationDescription() {
		return strLocationDescription;
	}
	public void setStrLocationDescription(String strLocationDescription) {
		this.strLocationDescription = strLocationDescription;
	}
	public String getStrDepartmentDescription() {
		return strDepartmentDescription;
	}
	public void setStrDepartmentDescription(String strDepartmentDescription) {
		this.strDepartmentDescription = strDepartmentDescription;
	}
	public Integer getUL_intAdminId() {
		return UL_intAdminId;
	}
	public void setUL_intAdminId(Integer uL_intAdminId) {
		UL_intAdminId = uL_intAdminId;
	}
	public Date getUL_datExpire() {
		return UL_datExpire;
	}
	public void setUL_datExpire(Date uL_datExpire) {
		UL_datExpire = uL_datExpire;
	}
	public Boolean getUL_blnLive() {
		return UL_blnLive;
	}
	public void setUL_blnLive(Boolean uL_blnLive) {
		UL_blnLive = uL_blnLive;
	}
	public String getUL_strCourseType() {
		return UL_strCourseType;
	}
	public void setUL_strCourseType(String uL_strCourseType) {
		UL_strCourseType = uL_strCourseType;
	}
	public Boolean getUL_blnReseller() {
		return UL_blnReseller;
	}
	public void setUL_blnReseller(Boolean uL_blnReseller) {
		UL_blnReseller = uL_blnReseller;
	}
	public Integer getUL_intResellerId() {
		return UL_intResellerId;
	}
	public void setUL_intResellerId(Integer uL_intResellerId) {
		UL_intResellerId = uL_intResellerId;
	}
	public String getUL_Status() {
		return UL_Status;
	}
	public void setUL_Status(String uL_Status) {
		UL_Status = uL_Status;
	}
	public String getOrgSeqNbr() {
		return orgSeqNbr;
	}
	public void setOrgSeqNbr(String orgSeqNbr) {
		this.orgSeqNbr = orgSeqNbr;
	}
	public String getLogoImagePath() {
		return logoImagePath;
	}
	public void setLogoImagePath(String logoImagePath) {
		this.logoImagePath = logoImagePath;
	}
	public String getUL_DOBDescription() {
		return UL_DOBDescription;
	}
	public void setUL_DOBDescription(String uL_DOBDescription) {
		UL_DOBDescription = uL_DOBDescription;
	}
	public Boolean getUL_DOBMandatory() {
		return UL_DOBMandatory;
	}
	public void setUL_DOBMandatory(Boolean uL_DOBMandatory) {
		UL_DOBMandatory = uL_DOBMandatory;
	}
	public String getUL_PayrollDescription() {
		return UL_PayrollDescription;
	}
	public void setUL_PayrollDescription(String uL_PayrollDescription) {
		UL_PayrollDescription = uL_PayrollDescription;
	}
	public Boolean getUL_PayrollMandatory() {
		return UL_PayrollMandatory;
	}
	public void setUL_PayrollMandatory(Boolean uL_PayrollMandatory) {
		UL_PayrollMandatory = uL_PayrollMandatory;
	}
	public String getUL_JobtitleDescription() {
		return UL_JobtitleDescription;
	}
	public void setUL_JobtitleDescription(String uL_JobtitleDescription) {
		UL_JobtitleDescription = uL_JobtitleDescription;
	}
	public Boolean getUL_JobtitleMandatory() {
		return UL_JobtitleMandatory;
	}
	public void setUL_JobtitleMandatory(Boolean uL_JobtitleMandatory) {
		UL_JobtitleMandatory = uL_JobtitleMandatory;
	}
	public Boolean getUL_emailId() {
		return UL_emailId;
	}
	public void setUL_emailId(Boolean uL_emailId) {
		UL_emailId = uL_emailId;
	}
	public String getUL_emailIdDescription() {
		return UL_emailIdDescription;
	}
	public void setUL_emailIdDescription(String uL_emailIdDescription) {
		UL_emailIdDescription = uL_emailIdDescription;
	}
	public String getUL_DocMgnt() {
		return UL_DocMgnt;
	}
	public void setUL_DocMgnt(String uL_DocMgnt) {
		UL_DocMgnt = uL_DocMgnt;
	}
	
    	
	
}
