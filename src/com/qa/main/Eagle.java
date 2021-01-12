package com.qa.main;

public class Eagle extends Bird {

	public int wings = 4;
	public int eyes;
	
	public Eagle() {
		System.out.println("I'm an eeeeeagle");
	}
	
	@Override
	public String makeNoise() {
		return "i am the emblem of ravenclaw";
	}
	
	public String swoop() {
		return "i'm doing a swoop";
	}
	
}


