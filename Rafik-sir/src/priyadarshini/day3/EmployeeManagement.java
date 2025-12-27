package priyadarshini.day3;


class Employee{
	static final String companyName="TCS";
	
	int empId;
	String name;
	double salary;
	
	Employee(int empId, String name, double salary){
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
}

class Manager extends Employee{
	String department;
	Manager(int empId, String name, double salary) {
		super(empId, name, salary);
	}	
	void display() {
		System.out.println("Company: "+companyName);
		System.out.println("ID: "+empId);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Department: "+department);
	}
}


public class EmployeeManagement {
	public static void main(String[] args) {
		Manager M1 = new Manager(101,"Rahul",80000);
		M1.display();
	}
}
