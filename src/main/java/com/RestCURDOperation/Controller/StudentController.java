package com.RestCURDOperation.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RestCURDOperation.Entities.Student;
import com.RestCURDOperation.Service.StudentService;


@RestController
@ComponentScan
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@RequestMapping("/students")
	public List<Student> getAllStudent()
	{
		return service.getAllstudent();
	}
	
	@RequestMapping("students/{studentId}")
	public Student getStudent(@PathVariable String studentId)
	{
		
		return service.getStudent(Long.parseLong(studentId));
	}
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student)
	{
		return service.CreateSudent(student);
	}

}
