package sorting;

public class InsertionSort {

	public static void main(String[] args) {
		
		int array[] = {5, 1, 6, 2, 4, 3};
		// calling insertion sort function to sort the array
		insertionSort(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
	}

	private static void insertionSort(int[] array) {
		
		int j;
		int temp;
		for (int i = 1; i < array.length; i++) {
			j = i;
			
			while (j>0 && (array[j-1])>array[j]) {
				temp = array[j-1];
				array[j-1] = array[j];
				array[j] = temp;
				j--;
			}
		}
	}

}
