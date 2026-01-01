package day17.hasA;

public class StudentApp1 {
	public static void main(String[] args) {
		Student1 s = new Student1();
		System.out.println("*********************");
		Bike1 b4=new Bike1("Honda",100000);
		s.hasA(b4);
		System.out.println("*********************");
		Book b5=new Book("One Piece", 1155);
		s.hasA(b5);
		System.out.println("*********************");
		System.out.println("---Brain---");
		System.out.println(s.b1.getCells());
		System.out.println(s.b1.getWeight());
		System.out.println("*********************");
		System.out.println("---Heart---");
		System.out.println(s.h1.getJob());
		System.out.println(s.h1.getWeight());
	}
}

class Student1{
	Brain b1=new Brain(10000,500);
	Heart h1=new Heart("Pumping", 50);
	void hasA(Bike1 b2) {
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

class Heart1{
	String job;
	int weight;
	public Heart1(String job, int weight) {
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


class Bike1{
	String brand;
	int price;
	public Bike1(String brand, int price) {
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