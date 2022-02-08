package com.Java9;

public class ProcessApiImprovement_9
{

	//Process API Improvement
	// java 9 has improved its process api --> manage  & Control operating system processes.
	
	public static void main(String[] args) {
		
		//public static interface ProcessHandle.Info  

		
		ProcessHandle currentProcess = ProcessHandle.current();
		System.out.println("Process Id: "+currentProcess.pid());    // Process id   
        System.out.println("Direct children: "+ currentProcess.children()); // Direct children of the process  
        System.out.println("Class name: "+currentProcess.getClass());       // Class name  
        System.out.println("All processes: "+ProcessHandle.allProcesses()); // All current processes   
        System.out.println("Process info: "+currentProcess.info());         // Process info  
        System.out.println("Is process alive: "+currentProcess.isAlive());   
        System.out.println("Process's parent "+currentProcess.parent());  // Parent of the process 
	}
}
