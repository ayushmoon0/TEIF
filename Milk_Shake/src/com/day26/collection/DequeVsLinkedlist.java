package com.day26.collection;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class DequeVsLinkedlist {

	public static void main(String[] args) {
		
//		ArrayDeque ad=new ArrayDeque();
//		long t1=System.currentTimeMillis();
//		for(int i=0;i<100000000;i++) {
//			ad.push(i);
//		}
//		long t2=System.currentTimeMillis();
		LinkedList ll=new LinkedList();
		long t3=System.currentTimeMillis();
		for(int i=0;i<10000000;i++) {
			ll.push(i);
		}
		long t4=System.currentTimeMillis();
		
//		System.out.println(t2-t1);
		System.out.println(t4-t3);
	}

}
