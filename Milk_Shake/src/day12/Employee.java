package day12;

class Employee1 {
	int emp_id;
	String name;
	int Salary;
	
	public Employee1() {
		this(101,"Arsh",20);
		System.out.println("0 param constructor is called..");
	}
	public Employee1(int emp_id) {
//		this(101,"Arsh",20);
		System.out.println("1 param constructor is called..");
	}
	public Employee1(int emp_id, String name) {
		this(101);
		System.out.println("2 param constructor is called..");
	}
	public Employee1(int emp_id, String name, int Salary) {
		this(101,"Arsh");
		System.out.println("3 param constructor is called..");
	}
}

public class Employee{
	public static void main(String[] args) {
		Employee1 e = new Employee1();
	}
}