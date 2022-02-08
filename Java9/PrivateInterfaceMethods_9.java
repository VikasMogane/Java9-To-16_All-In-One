package com.Java9;



	//In Java 9, we can create private methods inside an interface. 
	//Interface allows us to declare private methods that help to share common code between non-abstract methods.


interface test
{
	default void say()
	{
		saySomething();
	}
	private void saySomething()    // private methods are allowed in java 9 interface 
	{
		System.out.println("inside say something");
	}
}

public class PrivateInterfaceMethods_9  implements test
{
	
	public static void main(String[] args) 
	{
		test t = new PrivateInterfaceMethods_9();
		t.say();
	}

}
