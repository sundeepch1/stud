package java2blog.main;

import java.util.Arrays;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int[][] intArr = { { 1, -2, 3 }, { 0, 3 }, { 1, 2, 5 }, { 9, 2, 5 } };

		process: for (int i = 0; i < intArr.length; i++) {
			boolean allPositive = true;
			for (int j = 0; j < intArr[i].length; j++) {
				if (intArr[i][j] < 0) {
					allPositive = false;
					continue process;
				}
			}
			if (allPositive) {
				// process the array
				System.out.println("Processing the array of all positive ints. " + Arrays.toString(intArr[i]));
			}
			allPositive = true;
		}

		
		
		
//		int n1 = 0, n2 = 1, n3, i, count = 10;
//		System.out.print(n1 + " " + n2);// printing 0 and 1
//		printFibonacci(n1, n2, count-2);
//		for (i = 2; i < count; ++i)// loop starts from 2 because 0 and 1 are already printed
//		{
//			n3 = n1 + n2;
//			System.out.print(" " + n3);
//			n1 = n2;
//			n2 = n3;
//		}

	}

	static void printFibonacci(int n1, int n2, int count) {
		if (count > 0) {
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			printFibonacci(n1, n2, count - 1);
		}
	}
}
