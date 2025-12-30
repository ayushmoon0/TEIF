package day16.polymorphism;

public class ParentDemo {
	Animal disp() {
		Animal a =new Animal();
		return a;
	}
	public static void main(String[] args) {
		ParentDemo p=new ParentDemo();
		System.out.println(p.disp());
	}
}

class Child1 extends ParentDemo{
	Dog disp() {
		Dog d = new Dog();
		return d;
	}
}

class Animal{
	
}

class Dog extends Animal{
	void sound() {
		System.out.println("Dog barks");
	}
}