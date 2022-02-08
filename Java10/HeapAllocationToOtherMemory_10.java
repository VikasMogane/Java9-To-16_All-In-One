package com.Java10;

public class HeapAllocationToOtherMemory_10 {

	
//JEP 316 - Heap Allocation on Alternative Memory Devices
	// With this enhancement in Java 10, now user can specify an alternative memory device, like NV-DIMM to HotSpot VM to allocation 
	// the java heap space. User need to pass a path to the file system using a new option -XX:AllocateHeapAt.
	
	
		//-----    XX:AllocateHeapAt=~/etc/heap
	
	
	//This option takes file path and do a memory mapping to achieve the desired result. Other heap flags like -Xmx, -Xms continue to work.

}
