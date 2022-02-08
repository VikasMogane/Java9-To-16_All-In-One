package com.Java10;

public class TimeBasedReleaseVersioning_10 {

	//From Java 10 onwards, Oracle has introduced a strict time based release versioning model for Java releases.
	//Now Java will have a major release after every six months. Java 10 was released in Mar,2018 and moving onwards, 
	//all major versions are planned to release in Mar and Sep months of coming years. 
	//Releases are further categoried into three broad categories.
	//1 Feature Release    2.Update Release     3.Long Term Support(LTS) Release 
	public static void main(String[] args) {
		//$FEATURE.$INTERIM.$UPDATE.$PATCH
		
		Runtime.Version version = Runtime.version();
		
		  System.out.printf(" feature: %s%n interim: %s%n update: %s%n patch: %s%n",
			         version.feature(), 
			         version.interim(), 
			         version.update(), 
			         version.patch());
	}
}
