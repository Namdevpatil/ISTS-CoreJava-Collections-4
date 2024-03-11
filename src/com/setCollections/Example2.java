package com.setCollections;

import java.util.HashSet;
import java.util.Set;

public class Example2 {

	public static void main(String[] args) {
		
		Set<Integer> setOfValues = new HashSet<Integer>();
		
		setOfValues.add(1223);
		setOfValues.add(9902);
		setOfValues.add(null);
		setOfValues.add(1223);
		setOfValues.add(2233);
		setOfValues.add(4411);
		setOfValues.add(null);
		
		System.out.println(setOfValues);
		

	}

}
