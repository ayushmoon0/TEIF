package com.day27.collections;

public class StudentApp {
	public static void main(String[] args) {
		Student st1=new Student("Ayush", 20, "Male");
		Student st2=new Student("Manish", 20, "Male");
		Student st3=new Student("Arsh", 20, "Male");
		Student[] arr= {st1, st2, st3};
		
		for(Student s:arr) {
			System.out.print(s.getName()+" ");
			System.out.print(s.getAge()+" ");
			System.out.println(s.getGender());
			System.out.println("-----------------");
		}
	}		
}

class Student{
	String name;
	int age;
	String  gender;
	public Student(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
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
	
}