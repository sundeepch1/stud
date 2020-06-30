package java2blog.main;

import java.util.*;

public class ReverseString {

	public static void main(String[] args) {

		System.out.println("Your String");

		Scanner sc = new Scanner(System.in);
		String o = sc.nextLine();

		// style 1
		/*
		 * for (int i = o.length() - 1; i >= 0; i--) { r = r + o.charAt(i); }
		 * System.out.println(r);
		 */

		// style 2
		ReverseString rs = new ReverseString();
		String reverse = rs.recursiveReverse(o);
		System.out.println("Reverse string is:" + reverse);
	}

	public String recursiveReverse(String o) {
		if (o.length() == 1)
			return o;
		else
			return o.charAt(o.length() - 1) + recursiveReverse(o.substring(0, o.length() - 1));

	}
}
