package day15.inheritance.rule1;

public class Rule2 {
	public static void main(String[] args) {
		Child1 c1= new Child1();
		System.out.println(c1.a);
		System.out.println(c.b);
		c.disp();
	}
}

class Parent1 {
	private int a=10;
	int b=20;
	void disp() {
		System.out.println(a);
		System.out.println(b);
		
	}

}

class Child1 extends Parent{
	
}