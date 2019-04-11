package com.arr.algos;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedParentheses {

	static Map<Character, Character> map = new HashMap<Character, Character>();

	static {
		map.put('{', '}');
		map.put('(', ')');
		map.put('[', ']');
	}

	public static void main(String[] args) {

		System.out.println(check("{(([])[])[]]}"));
	}

	private static boolean check(String sample) {
		if (sample == null || sample.length() == 1) {
			return false;
		}
		Stack<Character> stack = new Stack<Character>();
		char[] chars = sample.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (map.keySet().contains(chars[i])) {
				stack.push(chars[i]);
			} else if (stack.isEmpty()) {
				return false;
			} else if (chars[i] == map.get(stack.peek())) {
				stack.pop();
			} else {
				return false;
			}
		}

		if (stack.isEmpty()) {
			return true;
		}

		return false;
	}

}
