package com.day17.hasA;

public class StudentApp {
	public static void main(String[] args) {
		//Student s =null;  // -->> Object has been destroyed
		Student s = new Student();
		Bike b=new Bike("Hero",100000,"Red");
		
		System.out.println(b.getBrand());
		s.hasA(b);
		System.out.println("===============");
		System.out.println(s.h.getJob() );
		System.out.println(s.h.getWeight());
		
	}
	
}


class Student{
	Heart h=new Heart("Pumping", 69);
	void hasA(Bike b){
		System.out.println(b.getBrand());
		System.out.println(b.getPrice());
		System.out.println(b.getColor());
	}
}
 
class Heart{
	String job;
	double weight;
	public Heart(String job, double weight) {
		super();
		this.job = job;
		this.weight = weight;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}


class Bike{
	String brand;
	int price;
	String color;
	public Bike(String brand, int price, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}