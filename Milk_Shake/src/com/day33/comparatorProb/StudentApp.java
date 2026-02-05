package com.day33.comparatorProb;

import java.util.HashMap; 
import java.util.LinkedHashMap;

public class StudentApp {
	public static void main(String[] args) {
		Student s1=new Student("Ayush", 20, "Male", 1234567890, 99, 8, "ayush@gmail.com", "Hingna",6.1,80,'B');
		Student s2=new Student("Arsh", 21, "Male", 1234527891, 99, 8, "arsh@gmail.com", "Gondia",5.8,75,'A');
		Student s3=new Student("Rupesh", 22, "Male", 1237967880, 99, 8, "rupa@gmail.com", "Nagpur",5.7,82,'B');
		HashMap hm=new HashMap();
		hm.put(101, s1);
		hm.put(102, s2);
		hm.put(103, s3);
		System.out.println(hm);
		LinkedHashMap lhm=new LinkedHashMap();
		lhm.put(12, s1);
		lhm.put(13, s2);
		lhm.put(14, s3);
	}
}

class Student{
	String name;
	int age;
	String gender;
	long phoneNo;
	int marks;
	int sem;
	String mail;
	String address;
	double height;
	double weight;
	char bloodGr;
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", phoneNo=" + phoneNo + ", marks="
				+ marks + ", sem=" + sem + ", mail=" + mail + ", address=" + address + ", height=" + height
				+ ", weight=" + weight + ", bloodGr=" + bloodGr + "]\n";
	}
	public Student(String name, int age, String gender, long phoneNo, int marks, int sem, String mail, String address,
			double height, double weight, char bloodGr) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phoneNo = phoneNo;
		this.marks = marks;
		this.sem = sem;
		this.mail = mail;
		this.address = address;
		this.height = height;
		this.weight = weight;
		this.bloodGr = bloodGr;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public char getBloodGr() {
		return bloodGr;
	}
	public void setBloodGr(char bloodGr) {
		this.bloodGr = bloodGr;
	}
	
}