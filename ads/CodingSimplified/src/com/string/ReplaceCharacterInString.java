package com.string;

public class ReplaceCharacterInString {

	public static void main(String[] args) {
		String s = "Sundeep Kumar Chaurasiya";
		char[] a = s.toCharArray();
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] == 'a') {
				a[i]='z';
			}
		}
		
		System.out.println(a);
	}

}
