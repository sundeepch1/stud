package sorting;

public class CountingSort {

	public static void main(String[] args) {

		int A[] = { 1, 4, 7, 3, 4, 5, 6, 3, 4, 8, 6, 4, 4 };
		int B[] = new int[A.length];

		int max = 0;
		for (int i = 0; i < A.length; i++) {
			if (max < A[i])
				max = A[i];
		}

		countSort(A, B, max);

		for (int i = 0; i < B.length; i++) {
			System.out.println(B[i] + "\t");
		}
	}

	private static void countSort(int[] A, int[] B, int max) {
		int count[] = new int[max + 1];

		for (int i = 0; i < A.length; i++) {
			// count the occurrence of elements u of A
			// & increment count[u] where u=A[i]
			// t = A[i];
			count[A[i]]++;
		}
		for (int i = 1; i <= max; i++) {
			// Updating elements of count array
			count[i] = count[i] + count[i - 1];
		}
		for (int i = 0; i < A.length; i++) {
			// Add elements of array A to array B
			// t = A[i];
			B[count[A[i]]-1] = A[i];
			// Decrement the count value by 1
			count[A[i]] = --count[A[i]];
		}
	}

}
