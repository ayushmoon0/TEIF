package priyadarshini.day5;

import java.util.ArrayList;
import java.util.List;

class Student{
	int id;
	String name;
	int marks;
	Student(int id, String name, int marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	void display() {
		// TODO Auto-generated method stub
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Marks: "+marks);
	}
}
public class StudentManagement {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(101,"ayush",90));
		students.add(new Student(102,"monish",80));
		students.add(new Student(103,"pajwal",70));
		students.add(new Student(104,"harsh",60));
		
		
		for(Student s : students) {
			s.display();
			System.out.println();
		}
	}
}
