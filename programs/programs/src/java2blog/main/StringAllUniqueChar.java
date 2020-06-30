package java2blog.main;

import java.util.HashSet;
import java.util.Scanner;

public class StringAllUniqueChar {

	public static void main(String[] args) {
		System.out.println("enter string");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		System.out.println("Yes = " + hasAllUniqueChars2(word));
	}
	
	public static boolean hasAllUniqueChars2(String word) {

		boolean charMap[] = new boolean[26];
		
		for(int i = 0; i< word.length(); i++) {
			int index =(int)word.toUpperCase().charAt(i) - 64;
			
			if(!charMap[index])
				charMap[index] = true;
			else
				return false;
		}
		return true;
	}
	
	public static boolean hasAllUniqueChars1(String word) {

		for(int i = 0; i< word.length(); i++) {
			char c =word.charAt(i);
			if(word.indexOf(c) != word.lastIndexOf(c))
				return false;
		}
		return true;
	}


	public static boolean hasAllUniqueChars(String word) {

		HashSet<Character> alphaSet = new HashSet<>();

		for(int i = 0; i< word.length(); i++) {
			Character c = word.charAt(i);
			
			if(!alphaSet.add(c))
				return false;
		}
		
		return true;
	}

}
