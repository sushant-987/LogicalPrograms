package com.logicbuilding;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "radar";
		String reversed = new StringBuilder().toString();
		System.out.println(str + " is " + (str.equals(reversed) ? "a palindrome." : "not a palindrome."));

	}

}
