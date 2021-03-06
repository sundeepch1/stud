package sorting;

import java.util.Iterator;

public class SelectionSort {

	public static void main(String[] args) {
		int array[] = {5, 1, 6, 2, 4, 3};
		// calling insertion sort function to sort the array
		selectionSort(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
	}

	private static void selectionSort(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			int index = getSmallestValueIndex(array, i);
			int temp = array[index];
			array[index] = array[i];
			array[i] = temp;
		}
	}

	private static int getSmallestValueIndex(int array[], int i) {
		int target = array[i];
		int index = i;
		for (int j = i+1; j < array.length; j++) {
			if (array[j] < target) {
				target = array[j];
				index = j;
			}
		}
		return index;
	}

}
