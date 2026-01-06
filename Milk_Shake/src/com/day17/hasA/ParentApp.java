package com.day17.hasA;

public class ParentApp {
	public static void main(String[] args) {
	 Parent c=new Child(); 
	 c.disp();
		
	}

}
abstract class Parent{
//final abstract class Parent{
	int x=10;

	abstract void disp();
}
class Child extends Parent{
	int x=20;
	void disp() {
		
		System.out.println("this is child methode");
	}
	// we can't override final methods
	
}