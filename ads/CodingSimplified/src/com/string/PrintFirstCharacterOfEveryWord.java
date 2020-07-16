package com.string;

public class PrintFirstCharacterOfEveryWord {

	public static void main(String[] args) {

		String s = "Sundeep Kumar Chaurasiya";
		char[] a = s.toCharArray();

		/*
		 * for (int i = 0; i < a.length; i++) { if (a[i] != ' ') { if (i == 0) {
		 * System.out.println(a[i]); } else if (a[i - 1] == ' ') {
		 * System.out.println(a[i]); } } }
		 */
		for (int i = 0; i < a.length; i++) {
			if (a[i] != ' ' && (i == 0 || a[i - 1] == ' ')) {
				System.out.println(a[i]);
			}
		}
	}
}
