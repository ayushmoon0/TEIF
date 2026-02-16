package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Students {
	@Id
	int id;
	@Column
	String name;
	@Column
	int age;
	@Column
	int marks;
	@Column
	String email;
	@Column
	String phone_No;
	public Students(int id, String name, int age, int marks, String email, String phone_No) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.email = email;
		this.phone_No = phone_No;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_No() {
		return phone_No;
	}
	public void setPhone_No(String phone_No) {
		this.phone_No = phone_No;
	}
	
}
