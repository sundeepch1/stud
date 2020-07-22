package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicateCharacters {

	public static void findDuplicateCharacters(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}else {
				map.put(str.charAt(i), 1);
			}
		}
		
		for(Map.Entry<Character, Integer> c: map.entrySet()) {
			if(c.getValue()>1) {
				System.out.println(c.getKey() + "::" + c.getValue());
			}
		}
	}
	
	public static void main(String[] args) {
		String str = "programmingr";
		findDuplicateCharacters(str);
	}

}
