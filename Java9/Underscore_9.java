package com.Java9;

public class Underscore_9 {

	
//	In earlier versions of Java, underscore can be used as identifier and to create variable name also. 
//But in Java 9 release, underscore is a keyword and can't be used as an identifier or variable name.

	
// in java 7
	   int _ = 10; // creating variable  
       System.out.println(_);    //o/p -7
       
//in java 8 --> If we compile the same program in Java 8, it will compile but throws a warning message.( same program)
       
       //warning: '_' used as an identifier
		//int _ = 10;
		    ^
		//(use of '_' as an identifier might not be supported in releases after Java SE 8)
		    
//in java 9 --> If we compile the same program in Java 8, it will compile but throws a warning message.( same program)
		    
		    
		   // UnderScoreExample.java:3: error: as of release 9, '_' is a keyword, and may not be used as an identifier
			//int _ = 10;



       
       
       

}
