package com.training.studentservice.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.studentservice.model.Student;
import com.training.studentservice.repository.studentRepo;

@RestController //combination of @Controller+@ResponseBody
@RequestMapping("/studapi")
public class StudentController {
	@Autowired
	studentRepo repository;
	@GetMapping("/stud")
//	@ResponseBody
//	instead of using ResponseBody just add Rest infront of controller
//	public String getStud() {
//		return "Hi there!!";
//	}
	
	
	
	public List<Student> getStud(){
//		List<Student> studList= new ArrayList<>();
//		studList.add(new Student("Rohith",21,"S"));
//		studList.add(new Student("Sumanth",21,"O"));
//		studList.add(new Student("Rohi",21,"S"));
//		studList.add(new Student("Hero",22,"A"));
//		studList.add(new Student("Zero",23,"B"));
//		
//		return studList;
		return repository.findAll();
	}
	
	@PostMapping("/post")
	public void post(@RequestBody Student stud) {
		repository.save(stud);
	}
	
	@GetMapping("/stud/{id}")
	public Student getStud(@PathVariable("id") long id) {
		Optional<Student> stud= repository.findById(id);
//		if(stud.isPresent()) {
//			return Student.get();
//		}
//		else {
//			return null;
//		}
		if(stud.isPresent()) {
			return stud.get();
		}
		else {
			return null;
		}
	}
	
	@PutMapping("/stud/{id}")
	public void updateUser(@PathVariable("id") long id,@RequestBody Student stud) {
		Optional<Student> oldData = repository.findById(id);
		if(oldData.isPresent()) {
			Student std = oldData.get();
			std.setAge(stud.getAge());
			std.setGrade(stud.getGrade());
			std.setStudName(stud.getStudName());
			repository.save(std);
		}
		else {
			System.out.println("No Data Found");
		}
	}
	
}
