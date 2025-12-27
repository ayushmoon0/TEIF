package priyadarshini;

class A{
	A(){
		System.out.println("A constructor");
	}
}
class Animal{
	String color = "Black";
	Animal(){
		System.out.println("Super Constructor");
	}
}

class Dog extends Animal{
	String color = "Red";
	Dog(){
		super();
	}
	void showColor() {
		
		System.out.println(color);
		System.out.println(super.color);
	}
}
public class Test1 extends A {
	static{
		System.out.println("Static Block");
	}
	{
		System.out.println("Instance initilizer Block");
	}
	Test1(){
		System.out.println("Subclass Constructor");
	}
	public static void main(String[] args) {
		Test1 a = new Test1();
		
	}
}
