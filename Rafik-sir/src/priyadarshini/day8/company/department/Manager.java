package priyadarshini.day8.company.department;

import priyadarshini.day8.company.employee.Employee;

public class Manager extends Employee {
	void accessEmployeeData() {
		System.out.println("EmpId: "+empId);
		System.out.println("Salary: "+salary);
//		System.out.println("Department Name: "+departmentName);
//		System.out.println("Employee Password: "+empPassword);
		
		showEmployeeDetails();
	}
	public static void main(String[] args) {
		Manager m1 = new Manager();
		m1.accessEmployeeData();
	}
}
