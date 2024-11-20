package com.atmcard;

public class Bank {
	public static void main (String[] args) {
		AtmCard a = new AtmCard();
		
//		System.out.println(a.getatmpin());
		a.setatmpin(6969);
		System.out.println(a.getatmpin());	
	}
}
