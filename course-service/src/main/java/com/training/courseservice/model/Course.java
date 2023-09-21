package com.training.courseservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import lombok.Data;

@Entity
//@Data
public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long courseId;
	
	private String courseName;
	private String courseDesc;
	private int duration;
	public Course() {
		// TODO Auto-generated constructor stub
	}
	public Course(String courseName, String courseDesc, int duration) {
		super();
		this.courseName = courseName;
		this.courseDesc = courseDesc;
		this.duration = duration;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDesc() {
		return courseDesc;
	}
	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	

}
