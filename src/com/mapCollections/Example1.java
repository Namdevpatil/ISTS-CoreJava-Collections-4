package com.mapCollections;

import java.util.HashMap;
import java.util.Map;

public class Example1 {

	public static void main(String[] args) {

		/**
		 * Write a java program to print product details using Map collections
		 */

		Map<Integer, String> products = new HashMap<Integer, String>();

		//added data
		products.put(2029, "Iphone 15 pro");
		products.put(2990, "Samsung A29 pro");
		products.put(1122, "Vivo v23");
		products.put(3099, "xyz");	

		System.out.println(products);

		System.out.println("-----------------------------");

		System.out.println(products.get(2089));

		System.out.println("-----------------------------");

		System.out.println(products.containsKey(2029));
		
		System.out.println("-----------------------------");

		System.out.println(products.isEmpty());
		
		System.out.println("-----------------------------");
		
		Map<Integer, String> products1 = new HashMap<Integer, String>();
		products1.put(7788, "qwerty");
		
		System.out.println(products1);
		
		System.out.println("----------------------------------------------------------------------------");
		
		products1.putAll(products);
		System.out.println(products1);

	}

}
