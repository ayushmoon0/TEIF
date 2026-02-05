package com.day33.comparatorProb;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionInbuiltMethods {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(75);
		al.add(175);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(Collections.binarySearch(al, 150));
		System.out.println(Collections.binarySearch(al, 999));
		Collections.rotate(al, 2);
		System.out.println(al);
		System.out.println(Collections.min(al));
		System.out.println(Collections.max(al));
		System.out.println(Collections.frequency(al, 75));
		System.out.println(Collections.replaceAll(al, 75, 99));
		System.out.println(al);
		Collections.shuffle(al);
		System.out.println(al);
	}

}
