package priyadarshini;


class Student{
	int rollNo;
	String name;
	Student(int rollNo, String name){
		this.rollNo=rollNo;
		this.name=name;
	}
	void display() {
		System.out.print("Roll No.: "+rollNo+" \nName: "+name);
	}
	
}
public class Test {
	public static void main(String[] args) {
		Student s1 = new Student(101,"Sakshi");
		s1.display();
	}
}
