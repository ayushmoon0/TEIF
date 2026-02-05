package com.day32.Collections;

import java.util.ArrayList; 
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EmployeeApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Employee e = new Employee(101,"Rupesh",200);
         Employee e1 = new Employee(104,"Rakesh",210);
         Employee e2 = new Employee(105,"Ramesh",250);
         Employee e3 = new Employee(102,"Bhupesh",230);
         Employee e4 = new Employee(103,"Mukesh",20);
//         
         ArrayList al =new ArrayList();
         al.add(e);
         al.add(e1);
         al.add(e2);
         al.add(e3);
         al.add(e4);
         SortComplexObject sr=new SortComplexObject();
         Collections.sort(al, sr);
         System.out.println(al);
       
//         System.out.println(e);     //e.toString()
	}
}
class SortingComplexdata implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
      if(((Employee)(o1)).id>((Employee)(o2)).id) {
    	  return 1;
      }
      else {
    	  return -1;
	}
		
	}
	
}
class Employee// implements Comparable
{
	int id;
	String name;
	int salary;
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public String toString(){
		return id+" "+name+" "+salary;
	}
//	@Override
//	public int compareTo(Object o) {
//		if(((this.name).compareTo(((Employee)(o)).name))>0) {
//			return 1;
//		}
//		else {
//			return -1;
//		}
//	}	
}