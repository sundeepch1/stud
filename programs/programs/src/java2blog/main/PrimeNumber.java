package java2blog.main;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 2; i <= num; i++) {
			if(primaNumber(i))
				System.out.print(i + "  ");
		}
	}

	public static boolean primaNumber(int num) {
		boolean flag = true;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
			}
		}

		return flag;
	}

}
