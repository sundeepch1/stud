package com.string;

import java.util.HashSet;
import java.util.Set;

public class FindNumberOfUniqueCharactersInGivenString {

	public static int findNumberOfUniqueCharactersInGivenString(String s) {
		if(s==null || s.length()==0)
			return 0;
		
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		
		return set.size();
	}
	
	public static void main(String[] args) {
		String s="sedddeess";
		System.out.println(findNumberOfUniqueCharactersInGivenString(s));
	}

}
