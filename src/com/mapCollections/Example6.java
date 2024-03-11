package com.mapCollections;

import java.util.HashMap;
import java.util.Map;

public class Example6 {

	public static void main(String[] args) {
		
		
		Map<Integer, String> products = new HashMap<Integer, String>();
		
		
		//add null keys and values data to the HashMap collection
		products.put(2029, "Iphone 15 pro");		
		products.put(2233, null);
		products.put(2990, "Samsung A29 pro");
		products.put(1122, "Vivo v23");
		products.put(3099, "xyz");	
		products.put(null, "OPPO A33 Pro");

		System.out.println(products);
		
		System.out.println("--------------------------------------------------------");
		
		products.put(null, "Vivo D78 Pro");
		
		products.put(3399, null);
		
		for(Map.Entry<Integer, String> product: products.entrySet())
		{
			System.out.println(product.getKey()+"  =>  "+product.getValue());
		}
		
	}

}
