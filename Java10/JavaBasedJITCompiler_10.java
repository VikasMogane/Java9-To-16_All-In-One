package com.Java10;

public class JavaBasedJITCompiler_10 {

//Imp  --  Now Java 10 has option to enable an experimental Java based JIT compiler, Graal to be used instead of standard JIT compiler.
//Imp  --  Graal is using JVMCI, JVM Compiler Interface which was introduced in Java 9. Graal is available in Java 9 as well. 
//Imp  --  With Java 10, we can enable Graal to test and debug the experimental JVM compiler.
	
	// syntax
	// java -XX:+UnlockExperimentalVMOptions -XX:+UseJVMCICompiler
	
//Graal compiler is a complete rewrite of C++ based earlier compiler and is targeted for Linux/x64 based platform. 
	
	//------------------Risks----------------------
	
	//As Graal is experimental and is subject to testing effort considering various Hotspots and jdk tests with various flag options. 
	//It may fail some benchmarks for performance as compared to standard JIT Ahead of Time compilers.

}
