package com.Java9;

import java.util.ArrayList;
import java.util.List;

public class SafeVarargsAnnotation_9 
{
	//annotation which applies on a method or constructor that takes varargs parameters.\
	//In Java7 -->applicable for Final methodd , Static methods , Constructors
	//In Java9 --> can also be used with private instance methods also.
	
	
	//Important -- The @SafeVarargs annotation can be applied only to methods that cannot be overridden. 
	 //Applying to the other methods will throw a compile time error.

	
	@SafeVarargs    // used java9 here
    private void display(List<String>... products) { // Not using @SaveVarargs  It produces warning messages at compile time, but compiles without errors.


        for (List<String> product : products) {  
            System.out.println(product);  
        }  
    }  
    public static void main(String[] args) {  
    	SafeVarargsAnnotation_9 p = new SafeVarargsAnnotation_9();  
        List<String> list = new ArrayList<String>();  
        list.add("Laptop");  
        list.add("Tablet");  
        p.display(list);  
    }   
    
	

}
