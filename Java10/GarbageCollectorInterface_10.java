package com.Java10;

public class GarbageCollectorInterface_10 {

	
	//JEP 307 - Parallel Full GC for G1
	//	Java 9 introduced G1 (Garbage First) garbage collector. 
	//	G1 avoids full garbage collection but in case of concurrent threads look for collection and memory is not revived fast enough,
	//	user experience is impacted. With Java 10, now G1 will use a fall back Full Garbage Collection.
	
	
	//Before Java 10, GC (Garbage Collector) implementation components were scattered within code base and were not replaceable easily. 
	//Imprtant --- With Java 10, Garbage-Collector interface is introduced so that alternative GC implementations can be plugged in
}
