package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		// with @Override, we can grab overriding functionality
		// from the subclass where the constructor is, but no lower
		
		// Bird gives us the variables and methods
		// (unless any methods are overridden in Eagle)
		// Eagle gives us the constructor
		// this constructor prints "I'm an eeeeeagle"
		Bird something = new Eagle();
		
		// because makeNoise() is overridden in Eagle, we get that functionality
		// this prints "i am the emblem of ravenclaw"
		System.out.println(something.makeNoise());
		
		// you can't override variables at any access level!
		// this prints 2, not 4
		System.out.println(something.wings);
		
		// (try messing around with these - 
		// comment/uncomment stuff or make new objects
		// and test what methods are called
		// or what variables are accessed)
		
		
	}

}
