package com.day29.iterator;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class SimpleObject {
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		System.out.println(ts);
		
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		ArrayDeque ad=new ArrayDeque();
		ad.add(100);
		ad.add(50);
		ad.add(150);
		ad.add(25);
		ad.add(75);
		ad.add(125);
		ad.add(175);
		System.out.println(ad);
		ArrayList al1=new ArrayList();
		al1.addAll(ad);
		Collections.sort(al1);
		System.out.println(al1);
		
	}
}
