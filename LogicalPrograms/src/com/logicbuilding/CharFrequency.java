package com.logicbuilding;

import java.util.HashMap;

public class CharFrequency {

	public static void main(String[] args) {
		// Input string
		String str = "Java";

		// Create a HashMap to store character frequencies
		HashMap<Character, Integer> freqMap = new HashMap<>();

		// Loop through each character in the string
		for (char c : str.toCharArray()) {
			// Update frequency count
			freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
		}

		// Print the frequency map
		System.out.println(freqMap);
	}
}
