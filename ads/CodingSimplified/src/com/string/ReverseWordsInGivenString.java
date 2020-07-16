package com.string;

public class ReverseWordsInGivenString {
	public static String reverseString(String s) {
		String tempStr = "";
		String finalStr = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
 				finalStr = " " + tempStr + finalStr;
				tempStr = "";
			} else {
				tempStr = tempStr + s.charAt(i);
			}
		}
		return tempStr + finalStr;
	}
	
	public static StringBuilder reverseStringBuilder(String s) {
		StringBuilder tempStr = new StringBuilder();
		StringBuilder finalStr = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
 				finalStr.insert(0, tempStr).insert(0, " ");
				tempStr.setLength(0);
			} else {
				tempStr.append(s.charAt(i));
			}
		}
		return finalStr.insert(0, tempStr);
	}

	public static void main(String[] args) {
		String s = "Sundeep Kumar Chaurasiya";
		System.out.println(reverseString(s));
		System.out.println(reverseStringBuilder(s));
	}

}
