package com.atfportal.vo;

public class OrganisationVO {
	
	private String logoImgPath;
	private String orgName;
	
	
	public OrganisationVO() {}
	
	public OrganisationVO(String logoImgPath, String orgName) {
		this.logoImgPath = logoImgPath;
		this.orgName = orgName;
	}
	
	public String getLogoImgPath() {
		return logoImgPath;
	}
	public void setLogoImgPath(String logoImgPath) {
		this.logoImgPath = logoImgPath;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	
	

}
