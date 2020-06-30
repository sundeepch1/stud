package java2blog.main;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		System.out.println("Enter array size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] num = new int[size];

		for (int i = 0; i < size; i++) {
			num[i] = sc.nextInt();
		}

		System.out.println("missing number = " + missingNumber(num));

	}

	public static int missingNumber(int arr[]) {
		int n = arr.length + 1;
		int sum = n * (n + 1) / 2;
		int restSum = 0;
		for (int i = 0; i < arr.length; i++) {
			restSum += arr[i];
		}
		int missingNumber = sum - restSum;
		return missingNumber;
	}

}
