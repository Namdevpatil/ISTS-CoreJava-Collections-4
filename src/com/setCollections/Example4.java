package com.setCollections;

import java.util.Set;
import java.util.TreeSet;

public class Example4 {

	public static void main(String[] args) {
		
		Set<Integer> setOfValues = new TreeSet<Integer>();
		
		setOfValues.add(1223);
		setOfValues.add(9902);
		setOfValues.add(1223);
		setOfValues.add(2233);
		setOfValues.add(4411);
		setOfValues.add(2567);
		
		System.out.println(setOfValues);
		

	}

}
