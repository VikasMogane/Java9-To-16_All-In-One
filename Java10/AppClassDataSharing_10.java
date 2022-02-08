package com.Java10;

public class AppClassDataSharing_10 {

//	When JVM starts it loads the classes in memory as a preliminary step.
//	In case there are multiple jars having multiple classes, an evident lags appears for the first request. 
//	In serverless architecture, such a lag can delay the boot time which is a critical operation in such an architecture.
//	Application class-data sharing concept helps in reducing the start up time of an application.
//	Java has an existing CDS (Class-Data Sharing) feature. With Application class-data sharing, 
//Imp -->	Java 10 allows to put application classes in a shared archive. 
//Imp -->	This reduces the application startup and footprint by sharing a common class meta data across multiple java processes.
	
	
	//Application Class data sharing is a 3 step process.

//1. Create a list of Classes to archive  - Create a list welcome.lst of a class Greeting.java lying in welcome.jar using Java Launcher.
		// $java -Xshare:off -XX:+UseAppCDS -XX:DumpLoadedClassList=welcome.lst -cp welcome.jar Greeting
	
//2. Create AppCDS archive   - Archive a list of classes to be used for Application class data sharing.
		// $java -Xshare:dump -XX:+UseAppCDS -XX:SharedClassListFile=welcome.lst -XX:SharedArchiveFile=welcome.jsa -cp welcome.jar
	
//3. Use AppCDS archive  -  Use AppCDS archive while using java launcher.
		// $java -Xshare:on -XX:+UseAppCDS -XX:SharedArchiveFile=welcome.jsa -cp welcome.jar Greeting

	
	


}
