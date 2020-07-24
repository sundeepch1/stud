package com.string;

public class LengthOfString {

	public static void main(String[] args) {
		String str = "ABC Tech";
		
		str = str.concat("\0");
		char []c = str.toCharArray();
		int i;
		for( i=0;c[i]!='\0';i++) {}
		System.out.println("Length :: " + i);
	}

}
