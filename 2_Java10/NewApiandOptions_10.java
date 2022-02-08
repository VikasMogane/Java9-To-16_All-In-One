package com.Java10;

import java.util.List;
import java.util.stream.Collectors;

public class NewApiandOptions_10 {

	
	public static void main(String[] args) {
		//new Api Contains Program
		var ids = List.of(1, 2, 3, 4, 5); 
	      try {
	         // get an unmodifiable list
	         List<Integer> copyOfIds = List.copyOf(ids);
	         copyOfIds.add(6);	
	      } catch(UnsupportedOperationException e){
	         System.out.println("Collection is not modifiable.");
	      }
	      try{
	         // get an unmodifiable list
	         List<Integer> evenNumbers = ids.stream()
	            .filter(i -> i % 2 == 0)
	            .collect(Collectors.toUnmodifiableList());;
	         evenNumbers.add(6);	
	      }catch(UnsupportedOperationException e){
	         System.out.println("Collection is not modifiable.");
	      }
		
	}
	
// 1. Optional.orElseThrow() Method
	
	//A new method orElseThrow() is available in java.util.Optional class which is now a preferred alternative for get() method.
	
//2. APIs to create Unmodifiable Collections
		//A new method copyOf() is available in List, Set and Map interfaces which can create new collection instances from existing one.
		//Collector class has new methods toUnmodifiableList(), toUnmodifiableSet(), and toUnmodifiableMap() to get elements of a stream
		//into an unmodifiable collection.	
	
//3.Disable JRE Last Usage Tracking
	//A new flag is introduced jdk.disableLastUsageTracking which disables JRE last usage tracking for a running VM.
	
//4.Hashed Password
	//The plain text passwords available in the jmxremote.password file are now being over-written with their SHA3-512 hash by the JMX agent.
	
//5.javadoc Support for Multiple Stylesheets
	//A new option is available to javadoc command as --add-stylesheet. This option supports use of multiple stylesheets in generated documentation.

//6 .javadoc Support for Overridding methods
		//A new option is available to javadoc command as --overridden-methods=value. As many classes override inherited methods
		//but do not change the specification. The --overridden-methods=value option allows to group these methods with other 
		//inherited methods, instead of documenting them again separately.
	
//7. javadoc Support for Summary
	//A new inline tag, {@summary ...}, is available to specify the text to be used as the summary of the API description. 
	 //By default, the summary of an API description is inferred from the first sentence.
	
	


	





	

}
