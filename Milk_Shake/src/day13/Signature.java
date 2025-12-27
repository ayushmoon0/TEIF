package day13;

public class Signature {
public static void main(String[] args) {
		System.out.println("Hello");
		Signature.main("ayush",1);
		Signature.main();
		int[] a = {2,34,4};
		Signature.main(a);
	}
public static void main(String b, int a) {
	System.out.println(b+" "+a);
}

public static void main() {
	System.out.println("Main with no args: ");
}
public static void main(int[] a) {
	System.out.println(a[0]);
}
}
