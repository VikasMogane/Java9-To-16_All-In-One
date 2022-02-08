package com.Java9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;


//Java 9 Collection library includes static factory methods for List, Set and Map interface. 
//These methods are useful to create small number of collection.


public class ListFactoryMethod_9 {

	public static void main(String[] args) {
		
		//----------------------------------------Before java 9-----------------------
		List<String> list = new ArrayList<>();
		list.add("A");	list.add("A");	list.add("A");	list.add("A");
		//for(String s:list) {System.out.println(s);}
		
		//-----------------------------------In java 9----------------------------
		
		List<String> list1 = List.of("A","A","A","A");
		for(String s:list1) {System.out.println(s);}

		//provides set method
        Set<String> set = Set.of("Java","JavaFX","Spring","Hibernate","JSP");  
        Map<Integer,String> map = Map.of(101,"JavaFX",102,"Hibernate",103,"Spring MVC");  
        
        
      //  ---best map exercises---
        Map.Entry<Integer, String> e1 = Map.entry(101, "Java");  
        Map.Entry<Integer, String> e2 = Map.entry(102, "Spring");  
        // Creating Map using map entries  
        Map<Integer, String> map1 = Map.ofEntries(e1,e2); 


		
	}
}
