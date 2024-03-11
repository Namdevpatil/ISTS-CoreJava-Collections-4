package com.mapCollections;

import java.util.HashMap;
import java.util.Map;

public class Example3 {

	public static void main(String[] args) {
		
		/**
		 * Write a java program to print product details using Map collections
		 */
		
		Map<Integer, String> products = new HashMap<Integer, String>();
		
		
		//update data from the collection
		products.put(2029, "Iphone 15 pro");
		products.put(2990, "Samsung A29 pro");
		products.put(1122, "Vivo v23");
		products.put(3099, "xyz");	

		System.out.println(products);
		
		System.out.println("--------------------------------------------------------");
		
		products.put(3099, "OPPO S23");	
		
		System.out.println(products);
		
	}

}
