package day15.inheritance.rule1;

public class ParentApp {
	public static void main(String[] args) {
		Child c= new Child();
		System.out.println(c.a);
		c.disp();
	}
}

class Parent {
	int a=10;
	int b=20;
	void disp() {
		System.out.println(a);
		System.out.println(b);

	}

}

class Child extends Parent{
	
}