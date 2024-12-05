package com.logicbuilding;

public class Factorial {

	public static int factorial(int n) {
		// TODO Auto-generated method stub
		return (n == 0) ? 1 : n * factorial(n - 1);

	}

	public static void main(String[] args) {
		int num = 5;
		System.out.println("Factorial of " + num + " is " + factorial(num));
	}

}
