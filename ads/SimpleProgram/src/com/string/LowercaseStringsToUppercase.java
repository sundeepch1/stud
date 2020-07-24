package com.string;

public class LowercaseStringsToUppercase {

	public static void main(String[] args) {
		String str = "sundeep";
		char a[] = new char[str.length()];
		
		for(int i=0; i<str.length();i++) {
			a[i] = (char) (str.charAt(i)-32);
		}
		
		System.out.println(String.copyValueOf(a));
	}

}
