package com.day15New;

public class Protect {
public static void main(String[] args) {

	System.out.println("<<<<<<<<<<<<<<Army>>>>>>>>>>>>>>>>>>>");
	duty(new Army());
	System.out.println();
	System.out.println("<<<<<<<<<<<<<<Navy>>>>>>>>>>>>>>>>>>>");
	duty(new Navy());
	System.out.println();
	System.out.println("<<<<<<<<<<<<<<AirWays>>>>>>>>>>>>>>>>>>>");
	duty( new AirForce());
}
static void duty(SecurityForce sf) {

	sf.protect();
}
}


abstract class SecurityForce{
 abstract void protect();
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