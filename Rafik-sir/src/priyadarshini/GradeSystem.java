package priyadarshini;

import java.util.Scanner;

public class GradeSystem {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Marks: ");
		int marks = input.nextInt();
		
		if(marks>100 || marks <0) {
			System.out.println("Enter valid Input: "+marks);
		}
		else if(marks>=90) {
			System.out.println("Grade: A");
		}
		else if(marks>=75) {
			System.out.println("Grade: B");
		}
		else if(marks>=60) {
			System.out.println("Grade: C");
		}
		else if(marks<60) {
			System.out.println("Grade: A");
		}
		else {
			System.out.println("Fail");
		}
		input.close();
	}
}
