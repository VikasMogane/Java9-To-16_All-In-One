package com.Java10;
import java.util.HashMap;
import java.util.Map;

//JEP 286 − Local Variable Type Inference

public class LocalVariableTypeInference_10 {

//  No type inference in case of member variable, method parameters, return values.
//  Local variable should be initialized at time of declaration otherwise compiler will not be infer and will throw error.
//  Local variable inference is available inside initialization block of loop statements.
//  No runtime overhead. As compiler infers the type based on value provided, there is no performance loss.
//  No dynamic type change. Once type of local variable is inferred it cannot be changed.
//  Complex boilerplate code can be reduced using local variable type inference.
	
	public static void main(String[] args) {
	// old way of declaring local variable
	String s ="Hello World";
	
	//new way of declaring local variable
	var s1 ="Hello world";
	
	
	Map<Integer, String> mapNames = new HashMap();
	var mapNames1 = new HashMap<Integer, String>();
	}
	
}
