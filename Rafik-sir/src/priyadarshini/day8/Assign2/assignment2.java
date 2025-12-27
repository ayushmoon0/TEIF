package priyadarshini.day8.Assign2;

import java.util.Arrays;
import java.util.List;
//import java.util.stream.Stream;


public class assignment2 {

    public static void main(String[] args) {

        List<Integer> marks = Arrays.asList(30, 45, 60, 35, 80);

        int total = marks.stream()
                .filter(m -> m >= 40)      // passed students
                .map(m -> m + 5)           // grace marks
                .reduce(0, Integer::sum);  // sum

        System.out.println("Total Marks of Passed Students = " + total);
    }
}
