package com.setCollections;

import java.util.HashSet;
import java.util.Set;

public class Example1 {

	public static void main(String[] args) {
		
		Set<Integer> setOfValues = new HashSet<Integer>();
		
		setOfValues.add(1223);
		setOfValues.add(9902);
		setOfValues.add(1223);
		setOfValues.add(2233);
		setOfValues.add(4411);
		
		System.out.println(setOfValues);
		

	}

}
