package com.mapCollections;

import java.util.Map;
import java.util.TreeMap;

public class Example8 {

	public static void main(String[] args) {
		
		
		Map<Integer, String> products = new TreeMap<Integer, String>();
		
		
		//add null keys and values data to the TreeMap collection
		products.put(2029, "Iphone 15 pro");		
		products.put(2233, null);
		products.put(2990, "Samsung A29 pro");
		products.put(1122, "Vivo v23");
		products.put(3099, "xyz");	
		products.put(2255, "OPPO A33 Pro");

		System.out.println(products);
		
		System.out.println("--------------------------------------------------------");
		
		products.put(1234, "Vivo D78 Pro");
		
		products.put(3399, null);
		
		products.put(3099, "abc");
		
		for(Map.Entry<Integer, String> product: products.entrySet())
		{
			System.out.println(product.getKey()+"  =>  "+product.getValue());
		}
		
	}

}
