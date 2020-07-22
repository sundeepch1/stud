package com.string;

import java.util.ArrayList;
import java.util.List;

public class FindAllPalindromicSubStringsOfAGivenString {

	static int resultStart;
	static int resultLength;

	private static List<String> findAllSubStrings(String s) {
		List<String> str = new ArrayList<>();
		int strLength = s.length();

		if (strLength < 2) {
			str.add(s);
			return str;
		}

		for (int start = 0; start < s.length(); start++) {
			expandRange(s, start, start, str);
			expandRange(s, start, start + 1, str);
		}
		return str;
	}

	private static void expandRange(String str, int begin, int end, List<String> list) {
		while (begin >= 0 && end < str.length() && str.charAt(begin) == str.charAt(end)) {
			list.add(str.substring(begin, end+1));
			begin--;
			end++;
		}
	}

	public static void main(String[] args) {

		String s = "hellolle";
		List<String> sts = findAllSubStrings(s);
		for (String string : sts) {
			System.out.print(string + "\t");
		}
	}
}
