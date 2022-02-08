package com.Java9;


//It is an interactive Java Shell tool, it allows us to execute Java code from the shell and shows output immediately.
//JShell is a REPL (Read Evaluate Print Loop) tool and run from the command line.


public class JavaShellTool_9 {
	
	//Jshell has reduced all the efforts that are required to run a Java program and test a business logic.

	//If we don't use Jshell, creating of Java program involves the following steps.

	//Open editor and write program
	//Save the program
	//Compile the program
	//Edit if any compile time error
	//Run the program
	//Edit if any runtime error
	//Repeat the process

	
	//Adding two integers in Jshell

	//		jshell> 2+3  
	//      $1 ==> 5  
	//      |  created scratch variable $1 : int  
	//      jshell>  
	
	
	//-----------Package Imports

/*	jshell> /import  
	|    import java.io.*  
	|    import java.math.*  
	|    import java.net.*  
	|    import java.nio.file.*  
	|    import java.util.*  
	|    import java.util.concurrent.*  
	|    import java.util.function.*  
	|    import java.util.prefs.*  
	|    import java.util.regex.*  
	|    import java.util.stream.*  
	|    import java.sql.*    */
	
	//-----------Command /vars to show variables.

	/* jshell> /vars  
	|    int $1 = 5  
	|    int $2 = 5  
	|    int $4 = 25   */
	
	//--------------jshell> /list  
	  
	 /*  1 : 2+3  
	   2 : 10-5  
	   3 : $1  
	   4 : 2+(5*4+(2+1))  
	   5 : void show(){  
	       System.out.println("This is show method");  
	       }  
	   6 : show();  
	   7 : class Hello{  
	       void show(){  
	       System.out.println("This is show method");  
	       }  
	       }  
	   8 : new Hello().show();  
	  9 : import java.sql.*;  */

}
