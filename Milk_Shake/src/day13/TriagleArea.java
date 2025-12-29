package day13;

class Demo{
	static double v = 0.5;
	int base;
	int height;
	public Demo(int base, int height) {
		this.base=base;
		this.height=height;
	}
	double disp() {
		return v*base*height;
	}
}
public class TriagleArea {
	public static void main(String[] args) {
		Demo d = new Demo(4,5);
		System.out.println("Area: "+d.disp());
	}
}
