package com.atfportal.vo;

import java.util.ArrayList;
import java.util.List;



public class UserCourseListVO<E> extends ListVO{


	    private List<E> courses = new ArrayList<E>();

		public List<E> getCourses() {
			return courses;
		}

		public void setCourses(List<E> courses) {
			this.courses = courses;
		}
	    
		public void addCourse(E course) {
			this.courses.add(course);
		}
	    
	
}
