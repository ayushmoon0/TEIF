package day17.hasA.inheritance;

public class StudentApp {
	public static void main(String[] args) {
		Student s = new Student();

		System.out.println("*********************");
		Bike b4=new Bike("Honda",100000);
		s.hasA(b4);
		System.out.println("*********************");
		Book b5=new Book("One-Piece", 1155);
		s.hasA(b5);
		System.out.println("*********************");
		System.out.println("---Brain---");
		System.out.println(s.b.getCells());
		System.out.println(s.b.getWeight());
		System.out.println("*********************");
		System.out.println("---Heart---");
		System.out.println(s.h.getJob());
		System.out.println(s.h.getWeight());
	}
}
class Human{
	Heart h=new Heart("Pump Blood",3);
	Brain b=new Brain(1000,1);
	
}

class Student extends Human{
	void hasA(Bike b2) {
		System.out.println("---Bike---");
		System.out.println(b2.getBrand());
		System.out.println(b2.getPrice());
	}
	void hasA(Book b3) {
		System.out.println("---Book---");
		System.out.println(b3.getName());
		System.out.println(b3.getPrice());
	}
}

class Heart{
	String job;
	int weight;
	public Heart(String job, int weight) {
		super();
		this.job = job;
		this.weight = weight;
	}
	public String getJob() {
		return job;
	}
	public int getWeight() {
		return weight;
	}
}
class Brain{
	int cells;
	int weight;
	public Brain(int cells, int weight) {
		super();
		this.cells = cells;
		this.weight = weight;
	}
	public int getCells() {
		return cells;
	}
	public int getWeight() {
		return weight;
	}
}

class Bike{
	String brand;
	int price;
	public Bike(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
}
class Book{
	String name;
	int price;
	public Book(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
}