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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.atfportal.model.User;
import com.atfportal.service.ContactService;
import com.atfportal.service.CourseService;
import com.atfportal.vo.ContactListVO;
import com.atfportal.vo.UserCourseListVO;

@Controller
@RequestMapping(value = "/protected/courses")
public class CoursesController {

    private static final String DEFAULT_PAGE_DISPLAYED_TO_USER = "0";

    @Autowired
    private ContactService contactService;

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
    public ResponseEntity<?> listAll(@RequestParam int page, @RequestParam String menu, Locale locale, HttpSession session) {
    	User user = (User)session.getAttribute("user");
    	
        return createListAllResponse(page, locale,user,menu);
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<?> search(@PathVariable("name") String name,
                                    @RequestParam(required = false, defaultValue = DEFAULT_PAGE_DISPLAYED_TO_USER) int page,
                                    Locale locale) {
        return search(name, page, locale, null);
    }

    private ResponseEntity<?> search(String name, int page, Locale locale, String actionMessageKey) {
        ContactListVO contactListVO = contactService.findByNameLike(page, maxResults, name);

        if (!StringUtils.isEmpty(actionMessageKey)) {
            addActionMessageToVO(contactListVO, locale, actionMessageKey, null);
        }

        Object[] args = {name};

        addSearchMessageToVO(contactListVO, locale, "message.search.for.active", args);

        return new ResponseEntity<ContactListVO>(contactListVO, HttpStatus.OK);
    }

    private UserCourseListVO<?> listAll(int page, User user , String menu) {
    	UserCourseListVO<?> vo = null;	
    	if( "assigned".equals(menu))
    		vo = courseService.findAllAssignedCourse(page,user);
    	else if ("library".equals(menu))
    		vo = courseService.findAllUnAssignedCourse(page,user);
    	else
    		vo = courseService.findAllOfflineCoursesAssignedToUser(page, user);
    	
    	return vo;
    }

    private ResponseEntity<UserCourseListVO<?>> returnListToUser(UserCourseListVO<?> userCourseListVO) {
        return new ResponseEntity<UserCourseListVO<?>>(userCourseListVO, HttpStatus.OK);
    }

    private ResponseEntity<?> createListAllResponse(int page, Locale locale, User user,  String menu) {
        return createListAllResponse(page, locale, null, user, menu);
    }

    private ResponseEntity<?> createListAllResponse(int page, Locale locale, String messageKey, User user,  String menu) {
    	UserCourseListVO<?> userCourseListVO = listAll(page, user,  menu);
        return returnListToUser(userCourseListVO);
    }

    private ContactListVO addActionMessageToVO(ContactListVO contactListVO, Locale locale, String actionMessageKey, Object[] args) {
        if (StringUtils.isEmpty(actionMessageKey)) {
            return contactListVO;
        }

        contactListVO.setActionMessage(messageSource.getMessage(actionMessageKey, args, null, locale));

        return contactListVO;
    }

    private ContactListVO addSearchMessageToVO(ContactListVO contactListVO, Locale locale, String actionMessageKey, Object[] args) {
        if (StringUtils.isEmpty(actionMessageKey)) {
            return contactListVO;
        }

        contactListVO.setSearchMessage(messageSource.getMessage(actionMessageKey, args, null, locale));

        return contactListVO;
    }

    private boolean isSearchActivated(String searchFor) {
        return !StringUtils.isEmpty(searchFor);
    }
}