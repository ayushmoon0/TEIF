package com.day32.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SimpleObjectReverseSort {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		System.out.println(al);
		Comparator c=Collections.reverseOrder();
		Collections.sort(al, c);
		System.out.println(al);
	}

}
