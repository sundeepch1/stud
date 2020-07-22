package com.string;

public class CountNumberOfWordInAGivenString {

	public static void main(String[] args) {
		String str = "   s und   eep        kum   ar     chau ras iay     ";

		char[] a = str.toCharArray();
		int count = 0;
		int letters = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] != ' ') {
				letters++;
			} else if (a[i] == ' ' && letters > 0) {
				count ++;
				letters = 0;
			}
		}
		
		System.out.println("Words :: " + count);
	}

}
