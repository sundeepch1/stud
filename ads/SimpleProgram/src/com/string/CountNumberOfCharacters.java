package com.string;

public class CountNumberOfCharacters {

	public static void main(String... strings) {
		String str = "sw2e7adwdjw732jcsuefj//''jucde";

		int vowcnt = 0;
		int conscnt = 0;
		int splcnt = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)>= 'a' && str.charAt(i)<='z') {
				if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
					vowcnt++;
				}else {
					conscnt++;
				}
			}else {
				splcnt++;
			}
		}
		
		System.out.println("V :: " + vowcnt);
		System.out.println("C :: " +conscnt);
		System.out.println("S :: " +splcnt);
	}
}
