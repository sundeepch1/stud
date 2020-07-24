package com.string;

public class CopyString {

	public static void main(String[] args) {
		String str = "ABC Tech";
		char a[] = new char[str.length()];
		
		for(int i=0; i<str.length();i++) {
			a[str.length() - i - 1] = str.charAt(i);
		}
		
		System.out.println("Required :: " + String.copyValueOf(a));
	}

}
