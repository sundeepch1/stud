package com.pelindrome;

import java.util.HashMap;
import java.util.Map;

public class PalindromeByRearrangingFromGivenString {

	private static String createPalindrome(String string) {
		Map<Character, Integer> map = new HashMap<>();
		char[] chars = string.toCharArray();

		for (char ch : chars) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		int count = 0;
		char midChar = 0;
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() % 2 != 0) {
				count++;
				midChar = entry.getKey();
			}
		}

		String firstStr = "";
		String secondStr = "";
		String midStr = "";
		if (count > 1 || count == 1 && string.length() % 2 == 0) {
			return "PALINDROME IS NOT POSSIBLE";
		} else {

			for (Map.Entry<Character, Integer> entry : map.entrySet()) {
				int val = entry.getValue();
				while (val > 1 && entry.getKey() != midChar) {
					val = val / 2;
					firstStr = firstStr + entry.getKey();
					secondStr = entry.getKey() + secondStr;
				}

				while (val > 0 && entry.getKey() == midChar) {
					val = val / 2;
					midStr = midStr.isEmpty() ? midChar + "" : midChar + midStr + midChar;
				}
			}
			return firstStr + midStr + secondStr;
		}
	}

	public static void main(String[] args) {

		String result = createPalindrome("aabb");
		System.out.println("Your String = " + result);
	}
}
