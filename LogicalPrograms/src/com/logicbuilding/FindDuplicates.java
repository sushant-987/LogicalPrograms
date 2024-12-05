package com.logicbuilding;

import java.util.HashSet;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 2, 3, 1, 5 };

		HashSet<Integer> set = new HashSet<Integer>();
		System.out.println("Duplicate numbers: ");
		for (int num : arr) {
			if (!set.add(num)) {
				System.out.println(num + " ");
			}
		}

	}

}
