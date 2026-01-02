package com.day18.abstraction;

public class BirdApp {

	public static void main(String[] args) {
		duty(new VegSparrow());
		duty(new NonVegSparrow());
	}
	static void duty(Bird b) {
		b.eat();
		b.fly();

	}
}
abstract class Bird{
	abstract void eat();
	abstract void fly() ;
}
abstract class Sparrow extends Bird{
	void fly() {
		System.out.println("sparrow is flying");
	}
}
class VegSparrow extends Sparrow{
	void eat() {
		System.out.println("veg sparrow eat grains");
	}
}
class NonVegSparrow extends Sparrow{
	void eat() {
		System.out.println("nonveg sparrow eat worms");
	}
}