package com.Java9;

abstract class ABCD<T>
{
	abstract T show(T a, T b);
}

public class AnonymousInnerClasses_9 {
	
	//Java 9 introduced a new feature that allows us to use diamond operator with anonymous classes.
	//Using the diamond with anonymous classes was not allowed in Java 7.
	
	public static void main(String[] args)
	{
		
		ABCD<String> a = new ABCD<>()  // before java 9 if 2nd diamond operator is empty <> then it will give error
		{
			String show(String a, String b)
			{
				return a+b;
				
			}
		};
		
		String result = a.show("Java","3");

	}

}
