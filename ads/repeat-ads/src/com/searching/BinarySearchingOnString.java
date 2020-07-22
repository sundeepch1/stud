package com.searching;

public class BinarySearchingOnString {

	public static String searchOnString(String[] str, String s) {
		int min = 0;
		int max = str.length;
		int guess;

		while (min < max) {
			guess = (min + max) / 2;

			int com = s.compareTo(str[guess]);

			if (com == 0) {
				return str[guess];
			} else if (com > 0) {
				min = guess + 1;
			} else {
				max = guess - 1;
			}
		}

		return null;
	}

	public static void main(String[] args) {
		String[] str = { "appple", "book", "car", "dog", "elephant","fan", "fish", "girl", "gun","hen" };
		System.out.println("Result :: " + searchOnString(str, "hen"));
	}
}
