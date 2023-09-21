package com.training.studentservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long stud_id;
	@Column(name = "studName")
	private String studName;
	@Column(name = "age")
	private int age;
	@Column(name = "stud_grade")
	private String grade;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String studName, int age, String grade) {
		super();
		this.studName = studName;
		this.age = age;
		this.grade = grade;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	

}
