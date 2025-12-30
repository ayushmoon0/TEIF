package day15New;

public class Protect {
public static void main(String[] args) {
	Army a = new Army();
	System.out.println("<<<<<<<<<<<<<<Army>>>>>>>>>>>>>>>>>>>");
	a.job();
	a.useTank();
	a.protect();
	System.out.println();
	
	Navy b = new Navy();
	System.out.println("<<<<<<<<<<<<<<Navy>>>>>>>>>>>>>>>>>>>");
	b.job();
	b.useShips();
	b.protect();
	System.out.println();
	
	AirForce c = new AirForce();
	System.out.println("<<<<<<<<<<<<<<AirWays>>>>>>>>>>>>>>>>>>>");
	c.job();
	c.useJets();
	c.protect();
}
}


class SecurityForce{
	void job() {
		System.out.println("This is my job..");
	}
	void protect() {
		System.out.println("To protect Nation..");
	}
}
class Army extends SecurityForce{
	void useTank() {
		System.out.println("Army use Tank");
	}
	void protect() {
		System.out.println("Protect Land");
	}
}

class Navy extends SecurityForce{
	void useShips() {
	System.out.println("Navy use distroyers");
	}
	void protect() {
		System.out.println("Protect Seaways");
	}
}

class AirForce extends SecurityForce{
	void useJets() {
	System.out.println("AirForce use Jets");
	}
	void protect() {
		System.out.println("Protect Airways");
	} 
}