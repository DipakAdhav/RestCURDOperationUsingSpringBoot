package com.RestCURDOperation.Service;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.RestCURDOperation.Entities.Student;


public interface StudentService {

	
	public List<Student> getAllstudent();
	
	public Student getStudent(long studentId);
	
	public Student CreateSudent(Student student);
	
	public Student UpdateStudenr();
	
	public void  DeleteStudent(long stidentId);
	
	
}