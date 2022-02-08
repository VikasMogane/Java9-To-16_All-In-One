package com.Java9;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_API_Improvement_9 
{
// new methods are added in java 9  --> takeWhile,dropWhile,ofNullable,iterate
	
	
	public static void main(String[] args) {
//1.takeWhile
		//Stream takeWhile method takes each element that matches its predicate. It stops when it get unmatched element. 
		//It returns a subset of elements that contains all matched elements, other part of stream is discarded.
		
		List<Integer> list   
        = Stream.of(1,2,3,4,5,6,7,8,9,10).takeWhile(i -> (i % 2 == 0)).collect(Collectors.toList()); //got blank output
		
	//<p>In this example, we are getting first two elements because these are even and stops at third element. </p>  
		 List<Integer> list1   
		= Stream.of(2,2,3,4,5,6,7,8,9,10).takeWhile(i -> (i % 2 == 0)).collect(Collectors.toList()); 
		
		 
//2.dropWhile
		 
		// Stream dropWhile method returns result on the basis of order of stream elements.

		 //	1.Ordered stream: It returns a stream that contains elements after dropping the elements that match the given predicate.

		 // 2.Unordered stream: It returns a stream that contains remaining elements of this stream after dropping a subset of elements that match the given predicate
		 
		 List<Integer> list2   
	        = Stream.of(2,2,3,4,5,6,7,8,9,10).dropWhile(i -> (i % 2 == 0)).collect(Collectors.toList());  
		// output-> 25  Stream can have null values also.  
		 
//3. ofNullable Method
		 
		// Stream ofNullable method returns a sequential stream that contains a single element, if non-null. Otherwise, it returns an empty stream.

		 //It helps to handle null stream and NullPointerException.
		  Stream<Integer> val    = Stream.ofNullable(null);     
		  val.forEach(System.out::println);  
		  
//4. Stream Iterate Method
		  
		// A new overloaded method iterate is added to the Java 9 stream interface. 
	    // This method allows us to iterate stream elements till the specified condition.
		 //It takes three arguments, seed, hasNext and next.
	        Stream.iterate(1, i -> i <= 10, i -> i*3)  .forEach(System.out::println);  




	}
	
	
	
}
