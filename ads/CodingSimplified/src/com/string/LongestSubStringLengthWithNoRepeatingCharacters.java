package com.string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringLengthWithNoRepeatingCharacters {

	public static int longestSubStringLengthWithNoRepeatingCharacters(String str) {
		int start, end;
		start=end=0;
		int maxLength = 0;
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		while(end<str.length()) {
			char currentChar = str.charAt(end);
			
			if(map.containsKey(currentChar)) {
				start = Math.max(start, map.get(currentChar)+1);
			}
			
			map.put(currentChar,end);
			maxLength = Math.max(end-start+1, maxLength);
			end++;
		}
		return maxLength;
	}
	
	public static void main(String[] args) {
		String str = "bcdcbababd";
		System.out.println(longestSubStringLengthWithNoRepeatingCharacters(str));

	}

}
