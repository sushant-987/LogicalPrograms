package com.logicbuilding;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int a = 0, b = 1;
		System.out.println("Fibonacci series: " + a + " " + b);
		for (int i = 2; i < n; i++) {
			int next = a + b;
			System.out.println(" " + next);
			a = b;
			b = next;
		}

	}

}
