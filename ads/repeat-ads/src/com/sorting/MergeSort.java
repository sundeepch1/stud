package com.sorting;

public class MergeSort {

	public static void mergeSort(int arr[], int l, int r) {
		int m;
		if (l < r) {
			m = (l + r) / 2;

			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);
			merge(arr, l, m, r);
		}
	}

	private static void merge(int[] arr, int l, int m, int r) {
		
		int b[] = new int[arr.length];
		int i,j,k;
		k=0;
		i=l;
		j=m+1;
		
		while(i<=m && j<=r) {
			if(arr[i]<arr[j]) {
				b[k++]= arr[i++];
			}else {
				b[k++] = arr[j++];
			}
		}
		
		while(i<=m) {
			b[k++]= arr[i++];
		}
		
		while(j<=r) {
			b[k++]= arr[j++];
		}
		
		for (int k2 = r; k2 >= l; k2--) {
			arr[k2] = b[--k];
		}

	}

	public static void main(String[] args) {
		int[] a = { 100, 90, 80, 70, 60, 50, 40, 30, 20, 10 };
		mergeSort(a, 0, a.length-1);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}
}
