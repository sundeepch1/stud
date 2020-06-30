package java2blog.main;

import java.util.Scanner;

public class Palindrome {
	public static void main(String... args) {
		System.out.println("Enter a number");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;

		while (temp > 0) {
			int r = temp % 10;
			sum = sum * 10 + r;
			temp = temp / 10;
		}

		if (num == sum) {
			System.out.println("palindrome number ");
		} else {
			System.out.println("not palindrome number ");
		}
	}
}
