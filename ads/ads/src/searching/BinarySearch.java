package searching;

public class BinarySearch {

	public static void main(String[] args) {

		int values[] = { 13, 21, 54, 81, 90, 95, 105, 109, 115, 120 };
		int target = 120;
		int result = binarySearch(values, target);

		if (result == -1) {
			System.out.println("No");
		} else {
			System.out.println("Yes = " + values[result]);
		}

	}

	private static int binarySearch(int[] values, int target) {

		int min = 0;
		int max = values.length - 1;
		int guess; // this will hold the index of middle elements
		int step = 0; // to find out in how many steps we completed the search

		while (min <= max) {

			guess = (max + min) / 2;
			 // we made the first guess, incrementing step by 1
	        step++;

			if (values[guess] == target) {
				 System.out.println("Number of steps required for search = " + step);
				return guess;
			} else if (values[guess] > target) {
				max = guess - 1;
			} else {
				min = guess + 1;
			}
		}
		return 0;
	}

}
