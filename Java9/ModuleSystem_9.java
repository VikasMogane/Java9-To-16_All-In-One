package com.Java9;

public class ModuleSystem_9 {
	
	//Java 9 Module System

	
	//Java Module System is a major change in Java 9 version. 
	//Java added this feature to collect Java packages and code into a single unit called module.

	//***Important  ------ In earlier versions of Java, there was no concept of module to create modular Java applications, that why size 
	 //of application increased and difficult to move around.
	//Even JDK itself was too heavy in size, in Java 8, rt.jar file size is around 64MB.
	
	
	//To deal with situation, Java 9 restructured JDK into set of modules so that we can use only required module for our project.

	//Apart from JDK, Java also allows us to create our own modules so that we can develop module based application.

	class Hello{  
	    public static void main(String[] args){  
	        System.out.println("Hello from the Java module");  
	    }  
	}  
	
	//complile module 1st step- javac -d mods --module-source-path src/ --module com.javatpoint  
	//Run module 2nd step -java --module-path mods/ --module com.javatpoint/com.javatpoint.Hello  
	
	//To see the compiled module descriptor use the following command.
	javap mods/com.javatpoint/module-info.class  

	
	//This command will show the following code to the console.


	Compiled from "module-info.java"  
	module com.javatpoint {  
	  requires java.base;  
	}  
	
	//---important------------
	//See, we created an empty module but it contains a java.base module. Why? 
	//Because all Java modules are linked to java.base module and it is default module.




}
