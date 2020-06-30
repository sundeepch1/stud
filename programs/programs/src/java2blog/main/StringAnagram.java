package java2blog.main;

import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String word = sc.nextLine();
		String anagram = sc.nextLine();

		System.out.println("java2blog and aj2vabgol are anagrams :" + isAnagram(word, anagram));

	}

	public static boolean isAnagram(String word, String anagram) {
		if (word.length() != anagram.length())
			return false;

		int[] count = new int[256];
		for (int i = 0; i < word.length(); i++) {
			count[word.charAt(i)]++;
			count[anagram.charAt(i)]--;
		}

		for (int i = 0; i < 256; i++) {
			if (count[i] != 0)
				return false;
		}
		return true;

	}

	public static boolean isAnagramUsingStringMethods(String word, String anagram) {
		if (word.length() != anagram.length())
			return false;

		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			int index = anagram.indexOf(c);

			if (index != -1)
				anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
			else
				return false;
		}

		return anagram.isEmpty();
	}
}
