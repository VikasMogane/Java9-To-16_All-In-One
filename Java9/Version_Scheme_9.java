package com.Java9;

public class Version_Scheme_9 
{
	
	//Java version-string is a format that contains version specific information.
	//This version-string consists of major, minor, security and patch update releases.
	// version-string looks like - $MAJOR.$MINOR.$SECURITY.$PATCH  
	//majar - each major release contain new features to existing one ( eg. java 9 contain more features than java8 )
	//minor- version number shows minor update ( eg. java 9 to java 9.1)
	//security- version number contains major minor update ( bug fixes. eg. java 9 to java 9.1)
	//patch- version number contains major minor update ( bug fixes. eg. java 9 to java 9.1.5.2)

	public static void main(String[] args)
	{
		//public static final class Runtime.Version extends Object implements Comparable<Runtime.Version>  
		
		Runtime.Version version  = Runtime.version(); // Getting runtime version instance  
        System.out.println("Current version is "+version);           // Getting current Java version  
        System.out.println("Major version number "+version.major()); // Getting major version number  
        System.out.println("Minor version number "+version.minor()); // Getting minor version number  
        System.out.println("Security version number "+version.security());  // Getting security version number  
        System.out.println("Pre-released information "+version.pre());      // Getting pre-release version information  
        System.out.println("Build Number "+version.build());                // Getting Optional build number  
	    

	}

}
