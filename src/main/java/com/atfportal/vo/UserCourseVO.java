package com.atfportal.vo;

import java.util.Date;

public class UserCourseVO {
	
	private Integer courseID;
	private Integer courseIdentifier;
	private Integer organisationID;
	private String unlockKey;
	private String course;
	private String courseSummary;
	private String courseDescription;
	private String hSContact;
	private String courseLogo;
	private String courseTutorialPath;
	private String courseTestPath;
	private Boolean courseRA = false;
	private Integer passmark;
	private Integer frequency;
	private Boolean cancelled = false;
	private Date modifiedDate;
	private Date createdDate;
	private Integer testFrequency;
	private Boolean testreminders = false;
	private Integer rAFrequency;
	private Boolean rAReminder = false;
	private Integer tutorialFrequency;
	private Boolean tutorialReminder = false;
	private Integer testReminderFreq;
	private Integer rAReminderFreq;
	private Integer tutorialReminderFreq;
	private Integer maxTestreminders;
	private Integer maxRAReminders;
	private Integer maxTutorialReminders;
	private Integer rADaysBefore;
	private Integer testDaysBefore;
	private Integer tutorialDaysBefore;
	private Boolean deptSendRAIssue = false;
	private Boolean deptSendRAComplete = false;
	private Boolean deptSendTestPass = false;
	private Boolean deptSendTestFail = false;
	private Boolean deptSendRANotCompleted = false;
	private Boolean deptSendTestNotCompleted = false;
	private Boolean locSendRAIssue = false;
	private Boolean locSendRAComplete = false;
	private Boolean locSendTestPass = false;
	private Boolean locSendTestFail = false;
	private Boolean locSendRANotCompleted = false;
	private Boolean locSendTestNotCompleted = false;
	private Boolean contactSendTest = false;
	private Boolean contactSendRA = false;
	private Boolean courseActive = false;
	private Date expDate;
	private Boolean contactCourseCancelled = false;
	private Integer testResultID;
	private Date beginDate;
	private Integer riskAssessmentResultID;
	private Date completedDate;
	private Date dueDate;
	private Boolean summaryDisplay;
	private Integer currentQuestionID;
	private Integer issueCount;
	private Date signOffDate;
	private Integer tutorialResultID;
	private Date tutorialResultBeginDate;
	private Date tutorialResultCompletedDate;
	private Integer currentPage;
	private Date tutorialResultDueDate;
	private Integer score;
	private Boolean pass = false;
	private Date testResultDueDate;
	private Date testResultBegunDate;
	
	
	public Integer getCourseID() {
		return courseID;
	}
	public void setCourseID(Integer courseID) {
		this.courseID = courseID;
	}
	public Integer getCourseIdentifier() {
		return courseIdentifier;
	}
	public void setCourseIdentifier(Integer courseIdentifier) {
		this.courseIdentifier = courseIdentifier;
	}
	public Integer getOrganisationID() {
		return organisationID;
	}
	public void setOrganisationID(Integer organisationID) {
		this.organisationID = organisationID;
	}
	public String getUnlockKey() {
		return unlockKey;
	}
	public void setUnlockKey(String unlockKey) {
		this.unlockKey = unlockKey;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCourseSummary() {
		return courseSummary;
	}
	public void setCourseSummary(String courseSummary) {
		this.courseSummary = courseSummary;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	public String getHSContact() {
		return hSContact;
	}
	public void setHSContact(String hSContact) {
		this.hSContact = hSContact;
	}
	public String getCourseLogo() {
		return courseLogo;
	}
	public void setCourseLogo(String courseLogo) {
		this.courseLogo = courseLogo;
	}
	public String getCourseTutorialPath() {
		return courseTutorialPath;
	}
	public void setCourseTutorialPath(String courseTutorialPath) {
		this.courseTutorialPath = courseTutorialPath;
	}
	public String getCourseTestPath() {
		return courseTestPath;
	}
	public void setCourseTestPath(String courseTestPath) {
		this.courseTestPath = courseTestPath;
	}
	public Boolean getCourseRA() {
		return courseRA;
	}
	public void setCourseRA(Boolean courseRA) {
		this.courseRA = courseRA;
	}
	public Integer getPassmark() {
		return passmark;
	}
	public void setPassmark(Integer passmark) {
		this.passmark = passmark;
	}
	public Integer getFrequency() {
		return frequency;
	}
	public void setFrequency(Integer frequency) {
		this.frequency = frequency;
	}
	public Boolean getCancelled() {
		return cancelled;
	}
	public void setCancelled(Boolean cancelled) {
		this.cancelled = cancelled;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Integer getTestFrequency() {
		return testFrequency;
	}
	public void setTestFrequency(Integer testFrequency) {
		this.testFrequency = testFrequency;
	}
	public Boolean getTestreminders() {
		return testreminders;
	}
	public void setTestreminders(Boolean testreminders) {
		this.testreminders = testreminders;
	}
	public Integer getRAFrequency() {
		return rAFrequency;
	}
	public void setRAFrequency(Integer rAFrequency) {
		this.rAFrequency = rAFrequency;
	}
	public Boolean getRAReminder() {
		return rAReminder;
	}
	public void setRAReminder(Boolean rAReminder) {
		this.rAReminder = rAReminder;
	}
	public Integer getTutorialFrequency() {
		return tutorialFrequency;
	}
	public void setTutorialFrequency(Integer tutorialFrequency) {
		this.tutorialFrequency = tutorialFrequency;
	}
	public Boolean getTutorialReminder() {
		return tutorialReminder;
	}
	public void setTutorialReminder(Boolean tutorialReminder) {
		this.tutorialReminder = tutorialReminder;
	}
	public Integer getTestReminderFreq() {
		return testReminderFreq;
	}
	public void setTestReminderFreq(Integer testreminderFreq) {
		this.testReminderFreq = testreminderFreq;
	}
	public Integer getRAReminderFreq() {
		return rAReminderFreq;
	}
	public void setRAReminderFreq(Integer rAReminderFreq) {
		this.rAReminderFreq = rAReminderFreq;
	}
	public Integer getTutorialReminderFreq() {
		return tutorialReminderFreq;
	}
	public void setTutorialReminderFreq(Integer tutorialReminderFreq) {
		this.tutorialReminderFreq = tutorialReminderFreq;
	}
	public Integer getMaxTestreminders() {
		return maxTestreminders;
	}
	public void setMaxTestreminders(Integer maxTestreminders) {
		this.maxTestreminders = maxTestreminders;
	}
	public Integer getMaxRAReminders() {
		return maxRAReminders;
	}
	public void setMaxRAReminders(Integer maxRAReminders) {
		this.maxRAReminders = maxRAReminders;
	}
	public Integer getMaxTutorialReminders() {
		return maxTutorialReminders;
	}
	public void setMaxTutorialReminders(Integer maxTutorialReminders) {
		this.maxTutorialReminders = maxTutorialReminders;
	}
	public Integer getRADaysBefore() {
		return rADaysBefore;
	}
	public void setRADaysBefore(Integer rADaysBefore) {
		this.rADaysBefore = rADaysBefore;
	}
	public Integer getTestDaysBefore() {
		return testDaysBefore;
	}
	public void setTestDaysBefore(Integer testDaysBefore) {
		this.testDaysBefore = testDaysBefore;
	}
	public Integer getTutorialDaysBefore() {
		return tutorialDaysBefore;
	}
	public void setTutorialDaysBefore(Integer tutorialDaysBefore) {
		this.tutorialDaysBefore = tutorialDaysBefore;
	}
	public Boolean getDeptSendRAIssue() {
		return deptSendRAIssue;
	}
	public void setDeptSendRAIssue(Boolean deptSendRAIssue) {
		this.deptSendRAIssue = deptSendRAIssue;
	}
	public Boolean getDeptSendRAComplete() {
		return deptSendRAComplete;
	}
	public void setDeptSendRAComplete(Boolean deptSendRAComplete) {
		this.deptSendRAComplete = deptSendRAComplete;
	}
	public Boolean getDeptSendTestPass() {
		return deptSendTestPass;
	}
	public void setDeptSendTestPass(Boolean deptSendTestPass) {
		this.deptSendTestPass = deptSendTestPass;
	}
	public Boolean getDeptSendTestFail() {
		return deptSendTestFail;
	}
	public void setDeptSendTestFail(Boolean deptSendTestFail) {
		this.deptSendTestFail = deptSendTestFail;
	}
	public Boolean getDeptSendRANotCompleted() {
		return deptSendRANotCompleted;
	}
	public void setDeptSendRANotCompleted(Boolean deptSendRANotCompleted) {
		this.deptSendRANotCompleted = deptSendRANotCompleted;
	}
	public Boolean getDeptSendTestNotCompleted() {
		return deptSendTestNotCompleted;
	}
	public void setDeptSendTestNotCompleted(Boolean deptSendTestNotCompleted) {
		this.deptSendTestNotCompleted = deptSendTestNotCompleted;
	}
	public Boolean getLocSendRAIssue() {
		return locSendRAIssue;
	}
	public void setLocSendRAIssue(Boolean locSendRAIssue) {
		this.locSendRAIssue = locSendRAIssue;
	}
	public Boolean getLocSendRAComplete() {
		return locSendRAComplete;
	}
	public void setLocSendRAComplete(Boolean locSendRAComplete) {
		this.locSendRAComplete = locSendRAComplete;
	}
	public Boolean getLocSendTestPass() {
		return locSendTestPass;
	}
	public void setLocSendTestPass(Boolean locSendTestPass) {
		this.locSendTestPass = locSendTestPass;
	}
	public Boolean getLocSendTestFail() {
		return locSendTestFail;
	}
	public void setLocSendTestFail(Boolean locSendTestFail) {
		this.locSendTestFail = locSendTestFail;
	}
	public Boolean getLocSendRANotCompleted() {
		return locSendRANotCompleted;
	}
	public void setLocSendRANotCompleted(Boolean locSendRANotCompleted) {
		this.locSendRANotCompleted = locSendRANotCompleted;
	}
	public Boolean getLocSendTestNotCompleted() {
		return locSendTestNotCompleted;
	}
	public void setLocSendTestNotCompleted(Boolean locSendTestNotCompleted) {
		this.locSendTestNotCompleted = locSendTestNotCompleted;
	}
	public Boolean getContactSendTest() {
		return contactSendTest;
	}
	public void setContactSendTest(Boolean contactSendTest) {
		this.contactSendTest = contactSendTest;
	}
	public Boolean getContactSendRA() {
		return contactSendRA;
	}
	public void setContactSendRA(Boolean contactSendRA) {
		this.contactSendRA = contactSendRA;
	}
	public Boolean getCourseActive() {
		return courseActive;
	}
	public void setCourseActive(Boolean courseActive) {
		this.courseActive = courseActive;
	}
	public Date getExpDate() {
		return expDate;
	}
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}
	public Boolean getContactCourseCancelled() {
		return contactCourseCancelled;
	}
	public void setContactCourseCancelled(Boolean contactCourseCancelled) {
		if(contactCourseCancelled !=null)
		this.contactCourseCancelled = contactCourseCancelled;
	}
	public Integer getTestResultID() {
		return testResultID;
	}
	public void setTestResultID(Integer testResultID) {
		this.testResultID = testResultID;
	}
	public Date getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}
	public Integer getRiskAssessmentResultID() {
		return riskAssessmentResultID;
	}
	public void setRiskAssessmentResultID(Integer riskAssessmentResultID) {
		this.riskAssessmentResultID = riskAssessmentResultID;
	}
	public Date getCompletedDate() {
		return completedDate;
	}
	public void setCompletedDate(Date completedDate) {
		this.completedDate = completedDate;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public Boolean getSummaryDisplay() {
		return summaryDisplay;
	}
	public void setSummaryDisplay(Boolean summaryDisplay) {
		this.summaryDisplay = summaryDisplay;
	}
	public Integer getCurrentQuestionID() {
		return currentQuestionID;
	}
	public void setCurrentQuestionID(Integer currentQuestionID) {
		this.currentQuestionID = currentQuestionID;
	}
	public Integer getIssueCount() {
		return issueCount;
	}
	public void setIssueCount(Integer issueCount) {
		this.issueCount = issueCount;
	}
	public Date getSignOffDate() {
		return signOffDate;
	}
	public void setSignOffDate(Date signOffDate) {
		this.signOffDate = signOffDate;
	}
	public Integer getTutorialResultID() {
		return tutorialResultID;
	}
	public void setTutorialResultID(Integer tutorialResultID) {
		this.tutorialResultID = tutorialResultID;
	}
	public Date getTutorialResultBeginDate() {
		return tutorialResultBeginDate;
	}
	public void setTutorialResultBeginDate(Date tutorialResultBeginDate) {
		this.tutorialResultBeginDate = tutorialResultBeginDate;
	}
	public Date getTutorialResultCompletedDate() {
		return tutorialResultCompletedDate;
	}
	public void setTutorialResultCompletedDate(Date tutorialResultCompletedDate) {
		this.tutorialResultCompletedDate = tutorialResultCompletedDate;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Date getTutorialResultDueDate() {
		return tutorialResultDueDate;
	}
	public void setTutorialResultDueDate(Date tutorialResultDueDate) {
		this.tutorialResultDueDate = tutorialResultDueDate;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public Boolean getPass() {
		return pass;
	}
	public void setPass(Boolean pass) {
		this.pass = pass;
	}
	public Date getTestResultDueDate() {
		return testResultDueDate;
	}
	public void setTestResultDueDate(Date testResultDueDate) {
		this.testResultDueDate = testResultDueDate;
	}
	public Date getTestResultBegunDate() {
		return testResultBegunDate;
	}
	public void setTestResultBegunDate(Date testResultBegunDate) {
		this.testResultBegunDate = testResultBegunDate;
	}
	public Date getTestResultCompletedDate() {
		return testResultCompletedDate;
	}
	public void setTestResultCompletedDate(Date testResultCompletedDate) {
		this.testResultCompletedDate = testResultCompletedDate;
	}
	public Integer getCurrentQuestion() {
		return currentQuestion;
	}
	public void setCurrentQuestion(Integer currentQuestion) {
		this.currentQuestion = currentQuestion;
	}
	public String getCoursePath() {
		return coursePath;
	}
	public void setCoursePath(String coursePath) {
		this.coursePath = coursePath;
	}
	private Date testResultCompletedDate;
	private Integer currentQuestion;
	private String coursePath;


}
