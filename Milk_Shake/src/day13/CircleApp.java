package day13;
class Circle{
	static double pi=3.14;
	int r;
//	double pi;
	
	public Circle(int r) {
		this.r=r;
//		this.pi=pi;
				
	}
	double disp() {
		return r*r*pi;
	}
}

public class CircleApp {
	public static void main(String[] args) {
		Circle c = new Circle(4);
		System.out.println(c.disp());
	}
}
