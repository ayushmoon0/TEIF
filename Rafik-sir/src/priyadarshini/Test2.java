package priyadarshini;
//import java.io.FileReader;
class Demo{
	static void validate (int age) {
		if (age<18) {
			throw new ArithmeticException("Not eligible to Vote..");
		}
		else {
			System.out.println("Vote..");
		}
	}
}

class Test2{
	public static void main(String[] args) throws Exception {
//		FileReader fr = new FileReader("data.txt");
		int age=15;
		Demo.validate(age);
	}
}