	package priyadarshini.day8.Assign2;

	import java.util.Arrays;
	import java.util.List;

	public class assignment3 {
	public static void main(String[] args) {
		List<Integer> salaries = Arrays.asList(20000, 30000, 40000, 50000);
		
		int total = salaries.stream().filter(s -> s > 30000)
				.map(s -> s + (s * 10 / 100))
				.reduce(0, Integer::sum) ;
		
		System.out.println("total payroll after bonus = " + total);
	}
	}
