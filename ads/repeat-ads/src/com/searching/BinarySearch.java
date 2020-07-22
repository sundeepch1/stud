package com.searching;

public class BinarySearch {

	public static boolean searchMethod(int[] a, int target) {
		int min = 0;
		int max = a.length;
		int guess = 0;

		while (min < max) {
			guess = (min + max) / 2;

			if (a[guess] == target) {
				return true;
			} else if (a[guess] < target) {
				min = guess + 1;
			} else {
				max = guess - 1;
			}
		}

		return false;
	}

	public static boolean binarySearchRecursively(int[] a, int min, int max, int target) {
		if(min<max) {
			int mid = (min+max)/2;
			
			if(a[mid]== target)
				return true;
			if(a[mid]<target)
				return binarySearchRecursively(a, mid+1, max, target);
			return binarySearchRecursively(a, min, mid-1, target);
		}
		
		return false;
	}

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		System.out.println("Result :: " + binarySearchRecursively(a, 0, a.length-1, 110));
	}
}
