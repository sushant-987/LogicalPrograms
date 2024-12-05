package com.logicbuilding;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 20, 4, 45, 99 };
		int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				secondLargest = num;
			}
		}

		System.out.println("Second Largest: " + secondLargest);

	}

}
