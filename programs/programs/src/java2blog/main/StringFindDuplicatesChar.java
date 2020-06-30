package java2blog.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringFindDuplicatesChar {

	public static void main(String[] args) {
		System.out.println("enter string");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		Map<Character, Integer> charMap = new HashMap<>();
		
		for(int i=0; i<word.length();i++) {
			Character c = word.charAt(i);
			
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			}else
				charMap.put(c, 1);
		}
		
		for(Character c: charMap.keySet()) {
			if(charMap.get(c) > 1)
				System.out.println("duplicate character : " + c + " ====== " + " count : " + charMap.get(c));
		}
	}

}
