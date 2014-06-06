package com.atfportal.repository;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.atfportal.model.User;
import com.atfportal.vo.UserCourseListVO;
import com.atfportal.vo.UserCourseVO;

@Repository
public class AssignedCourseRepository {

	@PersistenceContext
	private EntityManager em;

	public UserCourseListVO<UserCourseVO> getAssignedCourses(User user) {

		
		

		Query query = em
				.createNativeQuery("SELECT tbCourse.*,tbContactCourse.datCourseExpiry as ExpDate,tbContactCourse.blnCancelled "
						+ "as blnContactCourseCancelled, tbTestResult.intTestResultID, tbRiskAssessmentResult.datBegun, tbRiskAssessmentResult.intRiskAssessmentResultID,"
						+ "tbRiskAssessmentResult.datCompleted, tbRiskAssessmentResult.datDue, tbRiskAssessmentResult.blnSummaryDisplay, "
						+ "tbRiskAssessmentResult.intCurrentQuestionID, tbRiskAssessmentResult.intIssueCount, tbRiskAssessmentResult.datSignOff, "
						+ " tbTutorialResult.intTutorialResultID, tbTutorialResult.datBegun AS datTutorialResultBegun, "
						+ "tbTutorialResult.datCompleted AS datTutorialResultCompleted,  tbTutorialResult.intCurrentPage, "
						+ "tbTutorialResult.datDue AS datTutorialResultDue, tbTestResult.intScore,  "
						+ "tbTestResult.blnPass, tbTestResult.datDue AS datTestResultDue, tbTestResult.datBegun AS datTestResultBegun, "
						+ "tbTestResult.datCompleted AS datTestResultCompleted, tbTestResult.intCurrentQuestion,"
						+ "ul_coursem.strCourseTutorialPath path FROM tbCourse LEFT OUTER JOIN tbContactCourse  "
						+ "ON tbCourse.intCourseID = tbContactCourse.intCourseID  AND tbContactCourse.intContactID = ? "
						+ "LEFT OUTER JOIN tbRiskAssessmentResult ON tbContactCourse.intRiskAssessmentResultID = tbRiskAssessmentResult.intRiskAssessmentResultID "
						+ "AND tbRiskAssessmentResult.blnCancelled = 0 LEFT OUTER JOIN tbTestResult ON tbContactCourse.intTestResultID = tbTestResult.intTestResultID "
						+ " AND tbTestResult.blnCancelled = 0 LEFT OUTER JOIN tbTutorialResult ON "
						+ "tbContactCourse.intTutorialResultID = tbTutorialResult.intTutorialResultID AND tbTutorialResult.blnCancelled = 0"
						+ " INNER JOIN ul_coursem ON ul_coursem.strcourse=tbCourse.strcourse where tbCourse.intorganisationid =? and"
						+ " tbCourse.blnCourseActive=1 ORDER BY tbCourse.strCourse ASC");
		query.setParameter(1, new Integer(user.getUserID()));
		query.setParameter(2, new Integer(user.getOrgID()));
		List l = query.getResultList();

		UserCourseListVO<UserCourseVO> list = new UserCourseListVO<UserCourseVO>();
		for(Object row:l) {
			UserCourseVO vo = new UserCourseVO();
			Object[] data = (Object[]) row;
			vo.setCourseID((Integer)data[0]);
			vo.setCourseIdentifier((Integer)data[1]);
			vo.setOrganisationID((Integer)data[2]);
			vo.setUnlockKey((String)data[3]);
			vo.setCourse((String)data[4]);
			vo.setCourseSummary((String)data[5]);
			vo.setCourseDescription((String)data[6]);
			vo.setHSContact((String)data[7]);
			vo.setCourseLogo((String)data[8]);
			vo.setCourseTutorialPath((String)data[9]);
			vo.setCourseTestPath((String)data[10]);
			vo.setCourseRA((Boolean)data[11]);
			vo.setPassmark((Integer)data[12]);
			vo.setFrequency((Integer)data[13]);
			vo.setCancelled((Boolean)data[14]);
			vo.setModifiedDate((Date)data[15]);
			vo.setCreatedDate((Date)data[16]);
			vo.setTestFrequency((Integer)data[17]);
			vo.setTestreminders((Boolean)data[18]);
			vo.setRAFrequency((Integer)data[19]);
			vo.setRAReminder((Boolean)data[20]);
			vo.setTutorialFrequency((Integer)data[21]);
			vo.setTutorialReminder((Boolean)data[22]);
			vo.setTestReminderFreq((Integer)data[23]);
			vo.setRAReminderFreq((Integer)data[24]);
			vo.setTutorialReminderFreq((Integer)data[25]);
			vo.setMaxTestreminders((Integer)data[26]);
			vo.setMaxRAReminders((Integer)data[27]);
			vo.setMaxTutorialReminders((Integer)data[28]);
			vo.setRADaysBefore((Integer)data[29]);
			vo.setTestDaysBefore((Integer)data[30]);
			vo.setTutorialDaysBefore((Integer)data[31]);
			vo.setDeptSendRAIssue((Boolean)data[32]);
			vo.setDeptSendRAComplete((Boolean)data[33]);
			vo.setDeptSendTestPass((Boolean)data[34]);
			vo.setDeptSendTestFail((Boolean)data[35]);
			vo.setDeptSendRANotCompleted((Boolean)data[36]);
			vo.setDeptSendTestNotCompleted((Boolean)data[37]);
			vo.setLocSendRAIssue((Boolean)data[38]);
			vo.setLocSendRAComplete((Boolean)data[39]);
			vo.setLocSendTestPass((Boolean)data[40]);
			vo.setLocSendTestFail((Boolean)data[41]);
			vo.setLocSendRANotCompleted((Boolean)data[42]);
			vo.setLocSendTestNotCompleted((Boolean)data[43]);
			vo.setContactSendTest((Boolean)data[44]);
			vo.setContactSendRA((Boolean)data[45]);
			vo.setCourseActive((Boolean)data[46]);
			vo.setExpDate((Date)data[47]);
			vo.setContactCourseCancelled((Boolean)data[48]);
			vo.setTestResultID((Integer)data[49]);
			vo.setBeginDate((Date)data[50]);
			vo.setRiskAssessmentResultID((Integer)data[51]);
			vo.setCompletedDate((Date)data[52]);
			vo.setDueDate((Date)data[53]);
			vo.setSummaryDisplay((Boolean)data[54]);
			vo.setCurrentQuestionID((Integer)data[55]);
			vo.setIssueCount((Integer)data[56]);
			vo.setSignOffDate((Date)data[57]);
			vo.setTutorialResultID((Integer)data[58]);
			vo.setTutorialResultBeginDate((Date)data[59]);
			vo.setTutorialResultCompletedDate((Date)data[60]);
			vo.setCurrentPage((Integer)data[61]);
			vo.setTutorialResultDueDate((Date)data[62]);
			vo.setScore((Integer)data[63]);
			vo.setPass((Boolean)data[64]);
			vo.setTestResultDueDate((Date)data[65]);
			vo.setTestResultBegunDate((Date)data[66]);
			vo.setTestResultCompletedDate((Date)data[67]);
			vo.setCurrentQuestion((Integer)data[68]);
			vo.setCoursePath((String)data[69]);
			
			list.addCourse(vo);

		}
		
		return list;
	}

}
