package priyadarshini.day4;

/*
abstract class employee{
	int id;
	String name;
	double  salary;
	abstract void calculateSalary(int id, String name);
}

class FullTimeEmployee extends employee{
	double salary=40000;
	void calculateSalary(int id, String name) {
		
	}
}

class PartTimeEmloyee extends employee{
	double salary=40000;
	void calculateSalary(int id, String name) {
		
	}
	
}

public class EmployeeManagementSystem {
	
	public static void main(String[] args) {
		
	}
}
*/

/*
abstract class Employee {
    int id;
    String name;
    
    Employee(int id,String name) {
    	this.id = id;
    	this.name = name;
    }
    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee {
	
    FullTimeEmployee(int id, String name) {
		super(id, name);
	}

	void calculateSalary() {
        System.out.println("Salary: 45000");
    }
}

class PartTimeEmployee extends Employee {
    PartTimeEmployee(int id, String name) {
		super(id, name);
	}

	void calculateSalary() {
        System.out.println("Salary: 20000");
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {

//        Employee[] employees = new Employee[2];

//        employees[0] = new FullTimeEmployee();
//        employees[0].name = "Ravi";
//
//        employees[1] = new PartTimeEmployee();
//        employees[1].name = "Amit";
        
    	Employee[] employees = {
    			new FullTimeEmployee(1,"ravi"),
    			new PartTimeEmployee(2,"Amnit")
    	};
    	

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Employee: " + employees[i].name);
            employees[i].calculateSalary();
        }
    }
}

*/



