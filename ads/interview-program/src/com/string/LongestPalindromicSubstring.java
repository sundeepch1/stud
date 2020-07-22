package com.string;

public class LongestPalindromicSubstring {
	static int resultStart;
	static int resultLength;

	public static String longestPalindrome(String s) {
		int strLength = s.length();

		if (strLength < 2)
			return s;

		for (int start = 0; start < strLength - 1; start++) {
			expandRange(s, start, start);
			expandRange(s, start, start + 1);
		}
		return s.substring(resultStart, resultStart + resultLength);
	}

	private static void expandRange(String str, int begin, int end) {
		while (begin >= 0 && end < str.length() && str.charAt(begin) == str.charAt(end)) {
			begin--;
			end++;
		}
		if (resultLength < end - begin - 1) {
			resultStart = begin + 1;
			resultLength = end - begin - 1;
		}
	}

// Driver program to test above function 
	public static void main(String[] args) {

		String str = "forgeeksskeegfor";
		System.out.println("Result :: " + longestPalindrome("amaddam"));
	}
}