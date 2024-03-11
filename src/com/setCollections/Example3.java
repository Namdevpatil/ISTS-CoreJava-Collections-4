package com.setCollections;

import java.util.LinkedHashSet;
import java.util.Set;

public class Example3 {

	public static void main(String[] args) {
		
		Set<Integer> setOfValues = new LinkedHashSet<Integer>();
		
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
