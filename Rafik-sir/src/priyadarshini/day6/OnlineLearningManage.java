package priyadarshini.day6;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

public class OnlineLearningManage {
	public static void main(String[] args) {
		List<String> courses = new ArrayList<>();
		courses.add("Python");
		courses.add("Jeva");
		courses.add("Spring");
		
		Set<String> students = new HashSet<>();
		students.add("Appul");
		students.add("Vipul");
		
		Set<String> recentCourses = new LinkedHashSet<>();
		recentCourses.add("History");
		recentCourses.add("Bhugol");
		
		Queue<String> doubts = new PriorityQueue<>();
		doubts.add("Premium Student Doubt");
		doubts.add("Normal Student Doubt");
		
		Deque<String> history = new ArrayDeque<>();
		history.push("Enrolled Java");
		history.add("Enrolled Python");
		
		Map<String, String> enrollment = new HashMap<>();
		enrollment.put("Appul", "Java");
		enrollment.put("Vipul", "Python");
		
		Map<String, String> schedule = new TreeMap<>();
		schedule.put("2025-09-01", "Java Live");
		schedule.put("2024-09-04", "Python Live");
		
		Iterator<String> itr = students.iterator();
		while(itr.hasNext()) {
			if(itr.next().equals("Appul")) {
				itr.remove();
			}
		}
		
		
		ListIterator<String> litr = courses.listIterator();
		while(litr.hasNext()) {
			if(litr.next().equals("Spring")) {
				litr.set("Spring Boot");
			}
		}
		
		System.out.println("Courses: "+courses);
		System.out.println("Students: "+students);
		System.out.println("Enrollments: "+enrollment);
		System.out.println("Schedule: "+schedule);
		System.out.println("RecentCourses: "+recentCourses);
	}
}
