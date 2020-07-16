package com.string;

import java.util.Stack;

public class ReverseTheGivenString {

	public static String reverseString(String str) {
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			s = str.charAt(i) + s;
		}

		return s;
	}

	public static String reverseString1(String str) {
		int start = 0;
		int end = str.length() - 1;
		char[] a = str.toCharArray();

		while (start < end) {
			char c = a[start];
			a[start] = a[end];
			a[end] = c;
			start++;
			end--;
		}
		
		//return a;
		return String.copyValueOf(a);
	}
	
	public static void reverseWithStack(String str) {
		Stack<Character> st = new Stack<>();
		
		for (int i = 0; i < str.length(); i++) {
			st.push(str.charAt(i));
		}
		
		while(!st.isEmpty()) {
			System.out.print(st.pop());
		}
	}

	public static void main(String[] args) {
		String s = "sundeep";
		
		System.out.println(reverseString(s));

		System.out.println(reverseString1(s));
		reverseWithStack(s);
	}
}
