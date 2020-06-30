package java2blog.main;

import java.util.Scanner;

public class LenghtOfString {

	public static void main(String[] args) {
		System.out.println("enter string");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		System.out.println("lenght = " + getLengthOfString(word));

	}

	public static int getLengthOfString(String str) {
		int i = 0;
		try {
			for (i = 0;; i++) {
				str.charAt(i);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return i;
	}

	public static int getLengthOfStringWithCharArray(String str) {
		int length = 0;
		char[] strCharArray = str.toCharArray();
		for (char c : strCharArray) {
			length++;
		}
		return length;
	}

}
