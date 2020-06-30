package java2blog.main;

import java.util.Scanner;

public class StringRotation {
	public static void main(String... args) {
		System.out.println("enter string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String rotation = sc.nextLine();
		System.out.println("Yes = " + isRotation(str, rotation));
	}
	
	public static boolean isRotation(String str, String rotation) {
		String str2 = str + str;
 
		if (str2.contains(rotation)) {
			return true;
		}
		return false;
 
	}
}
