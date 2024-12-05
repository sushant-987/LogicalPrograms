package com.logicbuilding;

import java.util.Stack;

public class BalancedParenthesis {

	public static boolean isValid(String str) {
		// TODO Auto-generated method stub
		Stack<Character> stack = new Stack<Character>();
		for(char c : str.toCharArray()) {
			if(c == '(')stack.push(c);
			else if(c == ')') {
				if(stack.isEmpty()) return false;
				stack.pop();
			}
		}
		
		return stack.isEmpty();

	}
	
	public static void main(String[] args) {
		
		String expression = "(())";
		System.out.println("Is Balanced " + isValid(expression));
	}

}
