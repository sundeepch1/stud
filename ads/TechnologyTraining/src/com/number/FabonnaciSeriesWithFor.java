package com.number;

public class FabonnaciSeriesWithFor {

	public static void main(String[] args) {
		int num = 10;

		int first = 0;
		int second = 1;
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum = first + second;
			first = second;
			second = sum;
			System.out.print(sum + "\t");

		}
	}

}
