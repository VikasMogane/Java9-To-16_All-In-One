package com.Java9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//Java introduced try-with-resource feature in Java 7 that helps to close resource automatically after being used.
//In other words, we can say that we don't need to close resources (file, connection, network etc) explicitly, try-with-resource close that automatically by using AutoClosable interface.

//---Important ----In Java 7, try-with-resources has a limitation that requires resource to declare locally within its block.



// In Java 7 because we can't put resource declared outside the try-with-resource.
//If we do like the following code in Java 7, compiler generates an error message.

public class TryWithResources_9 {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		 FileOutputStream fileStream=new FileOutputStream("javatpoint.txt");  // this file will give error in java 7 because we declared that outside the  try
	        try(fileStream){  
	             String greeting = "Welcome to javaTpoint.";      
	                byte b[] = greeting.getBytes();       
	                fileStream.write(b);      
	                System.out.println("File written");           
	        }catch(Exception e) {  
	            System.out.println(e);  
	        }         
	}
}
