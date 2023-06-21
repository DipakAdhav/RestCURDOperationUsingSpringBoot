package com.RestCURDOperation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.RestCURDOperation.Entities.Student;

@Service
@ComponentScan
public class StudentServiceRepo implements StudentService{

	@Autowired
	StudentService repo;
	
	@Override
	public Student getStudent(long studentId) {
		
		return null;
	}

	@Override
	public Student CreateSudent(Student student) {
		 
		return null;
	}

	@Override
	public Student UpdateStudenr() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void DeleteStudent(long stidentId) {
		// TODO Auto-generated method stub
		
	}


	

}
