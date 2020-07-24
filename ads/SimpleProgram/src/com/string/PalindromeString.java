package com.string;

public class PalindromeString {

	public static String checkPalindrome(String str) {
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return "Not Palindrome";
			}
		}
		return "Palindrome";
	}

	public static void main(String[] args) {
		String str = "LEVELe";

		System.out.println(checkPalindrome(str));
	}

}
