package com.atfportal.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.atfportal.model.User;
import com.atfportal.model.UserOfflineCourses;
import com.atfportal.repository.AssignedCourseRepository;
import com.atfportal.repository.UserOfflineCourseRepository;
import com.atfportal.util.SecurityUtil;
import com.atfportal.vo.UserCourseListVO;
import com.atfportal.vo.UserCourseVO;
import com.atfportal.vo.UnlockKey;

@Service
@Transactional
public class CourseService {

	
	
    @Autowired
    private AssignedCourseRepository assignedCourseRepository;
    @Autowired
    UserOfflineCourseRepository userOfflineCourseRepository; 
    

    @Value("5")
    private int maxResults;
    
    public UserCourseListVO<UserCourseVO> findAllAssignedCourse(int page,User user) {
    	
    	UserCourseListVO<UserCourseVO> vo = assignedCourseRepository.getAssignedCourses(user);
    	
    	List<UserCourseVO> courses = vo.getCourses();
    	
    	List<UserCourseVO> assignCourses = new ArrayList<UserCourseVO>();
    	
    	
    	for(UserCourseVO course: courses) {
    			if(StringUtils.isNotBlank(course.getUnlockKey()))
				try {
					UnlockKey unlockKey = SecurityUtil.decryption(course.getUnlockKey());
					if (unlockKey.getExpiryDate().after(new Date()) && course.getContactCourseCancelled() != true) {
							assignCourses.add(course);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    	}
    //	vo.setCourses(assignCourses);
    	
    	int totalCourse = assignCourses.size();
    	vo.setTotalCourses(totalCourse);
    	vo.setPagesCount((int)Math.ceil((float)totalCourse/maxResults));
    	if(totalCourse > (page+1)*maxResults)
    		vo.setCourses(assignCourses.subList(page*maxResults, (page+1)*maxResults));
    	else
    		vo.setCourses(assignCourses.subList(page*maxResults, totalCourse));
   	
    	
    	return vo;
    }
    
  public UserCourseListVO<UserCourseVO> findAllUnAssignedCourse(int page,User user) {
    	
    	UserCourseListVO<UserCourseVO> vo = assignedCourseRepository.getAssignedCourses(user);
    	
    	List<UserCourseVO> courses = vo.getCourses();
    	
    	List<UserCourseVO> unAssignCourses = new ArrayList<UserCourseVO>();
    	
    	
    	for(UserCourseVO course: courses) {
			if(StringUtils.isNotBlank(course.getUnlockKey()))
			try {
				UnlockKey unlockKey = SecurityUtil.decryption(course.getUnlockKey());
				if ( course.getContactCourseCancelled() != false || unlockKey.getExpiryDate().before(new Date())) {
					unAssignCourses.add(course);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
 //   	vo.setCourses(unAssignCourses);
    	
       	int totalCourse = unAssignCourses.size();
    	vo.setTotalCourses(totalCourse);
    	vo.setPagesCount((int)Math.ceil((float)totalCourse/maxResults));
    	if(totalCourse > (page+1)*maxResults)
    		vo.setCourses(unAssignCourses.subList(page*maxResults, (page+1)*maxResults));
    	else
    		vo.setCourses(unAssignCourses.subList(page*maxResults, totalCourse));
   	
     	
    	
    	return vo;
    }   
  
  
  
  public UserCourseListVO<UserOfflineCourses> findAllOfflineCoursesAssignedToUser(int page, User user) {
	  
	  UserCourseListVO<UserOfflineCourses> vo = new UserCourseListVO<UserOfflineCourses>();
	  
	  List<UserOfflineCourses> courses = userOfflineCourseRepository.findByUserID(user.getUserID());
	  
	  	int totalCourse = courses.size();
	  	vo.setTotalCourses(totalCourse);
	  	vo.setPagesCount((int)Math.ceil((float)totalCourse/maxResults));
	  	if(totalCourse > (page+1)*maxResults)
	  		vo.setCourses(courses.subList(page*maxResults, (page+1)*maxResults));
	  	else
	  		vo.setCourses(courses.subList(page*maxResults, totalCourse));
	  
	  return vo;
  }
}
