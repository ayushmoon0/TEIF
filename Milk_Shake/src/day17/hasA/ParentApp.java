package day17.hasA;

public class ParentApp {
	public static void main(String[] args) {
	 Parent c=new Child();
	 c.disp();
		
	}

}
class Parent{
	int x=10;
	final void disp() {
	 System.out.println("this is parent");
 }
}
class Child extends Parent{
	int x=20;
//	void disp() {
//		
//		System.out.println("this is child methode");
//	}
	// we can't override final methods
	
}