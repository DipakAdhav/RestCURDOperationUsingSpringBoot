package com.RestCURDOperation.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "students")
public class Student {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

	long id;
	
	 @Column(nullable = false)
	String name;
	 
	 @Column(nullable = false)
	String mobile;
	 
	 @Column(nullable = false)
	String email;
	 
	 @Column(nullable = false)
	float percentage;
	 
	 
	

	public Student() {
		
	}


	public Student(long id, String name, String mobile, String email, float percentage) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.percentage = percentage;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public float getPercentage() {
		return percentage;
	}


	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobile=" + mobile + ", email=" + email + ", percentage="
				+ percentage + "]";
	}
	
	
	
	

}
