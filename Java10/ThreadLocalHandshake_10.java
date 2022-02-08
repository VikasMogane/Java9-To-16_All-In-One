package com.Java10;

public class ThreadLocalHandshake_10 {

// In JDK 10, a new option is introduced for JVM as -XX:ThreadLocalHandshakes. This options works only for x64 and SPARC based machines.
//This option is available to improve VM performance. It allows to make a callback on application threads 
//without making a global VM safepoint. Thus allows JVM to stop an individual thread without stopping all threads.
	
// As this options is not available to all platforms, other platforms will fall back to normal safepoints.






}
