package sorting;

public class MergeSort {

	public static void main(String[] args) {

		int arr[] = { 32, 45, 67, 2, 7 };
		mergeSort(arr, 0, arr.length - 1);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

	private static void mergeSort(int[] arr, int p, int r) {
		int q;

		if (p < r) {
			q = (p + r) / 2;
			System.out.println("p = " + p);
			System.out.println("q = " + q);
			System.out.println("r = " + r);
			mergeSort(arr, p, q);
			mergeSort(arr, q + 1, r);
			merge(arr, p, q, r);
		}
	}

	private static void merge(int[] arr, int p, int q, int r) {
		int b[] = new int[arr.length];
		int i, j, k;
		k = 0;
		i = p;
		j = q + 1;
		while(i<=q && j<=r) {
			System.out.println("arr === i === " + arr[i]);
			System.out.println("arr === j === " + arr[j]);
			if(arr[i] < arr[j]) {
				b[k++] = arr[i++];
			}else {
				b[k++] = arr[j++];
			}
		}
		
		while(i<=q) {
			System.out.println("arr === i second === " + arr[i]);
			b[k++] = arr[i++];
		}
		
		while(j<=r) {
			System.out.println("arr === j second=== " + arr[i]);
			b[k++] = arr[j++];
		}
		
		for (int k2 = r; k2 >= p; k2--) {
			arr[k2] = b[--k];
		}
	}

}
