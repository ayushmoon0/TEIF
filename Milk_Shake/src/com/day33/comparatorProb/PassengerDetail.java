package com.day33.comparatorProb;

import java.util.Comparator;

public class PassengerDetail {
	public static void main(String[] args) {
		
	}
}


class SortComplexObject1 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		int res=(((PassengerDetails)(o1)).name).compareTo(((PassengerDetails1(o2)).name));
	
	}
	
}

class PassengerDetails1{
	
}