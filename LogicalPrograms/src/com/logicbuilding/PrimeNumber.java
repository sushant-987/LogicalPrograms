package com.logicbuilding;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 29;
		boolean isPrime = true;

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}

		System.out.println(num + " is" + (isPrime ? " a prime number." : "not a prime number."));

	}

}
