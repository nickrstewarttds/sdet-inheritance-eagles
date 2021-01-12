package com.qa.main;

public class BaldEagle extends Eagle {

	public BaldEagle() { 
		System.out.println("I'm a bald eagle I swear");
	}
	
//	@Override
//	public String makeNoise() {
//		return "i'm the smallest of the eagles, cool";
//	}
	
	@Override
	public String swoop() {
		return "this works!";
	}
	
	public String beAmerican() {
		return "bringing freedom to you!";
	}
	
}
