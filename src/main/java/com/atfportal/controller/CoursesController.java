package com.atfportal.controller;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.atfportal.model.User;
import com.atfportal.service.CourseService;
import com.atfportal.vo.UserCourseListVO;

@Controller
@RequestMapping(value = "/protected/courses")
public class CoursesController {

    private static final String DEFAULT_PAGE_DISPLAYED_TO_USER = "0";

  

    @Autowired
    private MessageSource messageSource;
    
    @Autowired
    private CourseService  courseService;

    @Value("5")
    private int maxResults;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView welcome() {
        return new ModelAndView("coursesList");
    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<?> listAll( @RequestParam String menu, Locale locale, HttpSession session) {
    	User user = (User)session.getAttribute("user");
    	
        return createListAllResponse( locale,user,menu);
    }

   
    

    private UserCourseListVO<?> listAll( User user , String menu) {
    	UserCourseListVO<?> vo = null;	
    	if( "assigned".equals(menu))
    		vo = courseService.findAllAssignedCourse(user);
    	else if ("library".equals(menu))
    		vo = courseService.findAllUnAssignedCourse(user);
    	else
    		vo = courseService.findAllOfflineCoursesAssignedToUser(user);
    	
    	return vo;
    }

    private ResponseEntity<UserCourseListVO<?>> returnListToUser(UserCourseListVO<?> userCourseListVO) {
        return new ResponseEntity<UserCourseListVO<?>>(userCourseListVO, HttpStatus.OK);
    }

    private ResponseEntity<?> createListAllResponse( Locale locale, User user,  String menu) {
        return createListAllResponse(locale, null, user, menu);
    }

    private ResponseEntity<?> createListAllResponse( Locale locale, String messageKey, User user,  String menu) {
    	UserCourseListVO<?> userCourseListVO = listAll( user,  menu);
        return returnListToUser(userCourseListVO);
    }

   

    private boolean isSearchActivated(String searchFor) {
        return !StringUtils.isEmpty(searchFor);
    }
}