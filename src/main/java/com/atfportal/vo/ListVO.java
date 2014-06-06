package com.atfportal.vo;

import java.util.ArrayList;
import java.util.List;

public class ListVO{

	private int pagesCount;
    private long totalCourses;
	private String actionMessage;
    private String searchMessage;
    
    
    
	public int getPagesCount() {
		return pagesCount;
	}
	public void setPagesCount(int pagesCount) {
		this.pagesCount = pagesCount;
	}
	public long getTotalCourses() {
		return totalCourses;
	}
	public void setTotalCourses(long totalCourses) {
		this.totalCourses = totalCourses;
	}
	public String getActionMessage() {
		return actionMessage;
	}
	public void setActionMessage(String actionMessage) {
		this.actionMessage = actionMessage;
	}
	public String getSearchMessage() {
		return searchMessage;
	}
	public void setSearchMessage(String searchMessage) {
		this.searchMessage = searchMessage;
	}
    
    
    
	
}
