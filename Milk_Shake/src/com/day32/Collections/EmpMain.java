package com.day32.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmpMain {
	public static void main(String[] args) {
		Employee e=new Employee(101, "Ayush", 210);
		Employee e1=new Employee(102, "Rupesh", 200);
		Employee e2=new Employee(103, "Anurag", 250);
		Employee e3=new Employee(105, "Arsh", 120);
		Employee e4=new Employee(104, "Arshad", 150);
		ArrayList al=new ArrayList();
		al.add(e1);
		al.add(e);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		Collections.sort(al);
		System.out.println(al);
	}
}

class SortComplexObject implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		if(((Employee)(o1)).id>((Employee)(o2)).id) {
			return 1;
		}
		return -1;
	}
	
}
