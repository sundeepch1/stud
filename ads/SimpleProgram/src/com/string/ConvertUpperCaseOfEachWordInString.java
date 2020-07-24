package com.string;

public class ConvertUpperCaseOfEachWordInString {
	public static void upperCaseEachWord() {

	}

	public static void main(String... strings) {
		String str = "sundeep kumar chaurasiya";

		char a[] = str.toCharArray();
		//a[0] = (char) (a[0]-32);
		for (int i = 1; i < a.length; i++) {
			if (a[i] != ' ' && (i == 0 || a[i - 1] == ' ')) {
				a[i] = (char) (a[i]-32);
			}
			
//			if (a[i] == ' ' || i==0) {
//				a[i+1] = (char) (a[i+1]-32);
//			}
		}
		System.out.println("Result = " + String.copyValueOf(a));
	}
}
