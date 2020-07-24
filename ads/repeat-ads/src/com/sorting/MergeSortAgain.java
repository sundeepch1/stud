package com.sorting;

public class MergeSortAgain {
	

	private static void mergeSort(int[] a, int min, int max) {
		int mid;
		if(min<max) {
			mid=(min+max)/2;
			mergeSort(a,min, mid);
			mergeSort(a, mid+1, max);
			merge(a,min,mid,max);
		}
	}

	private static void merge(int[] a, int min, int mid, int max) {
		int b[]=new int[a.length];
		
		int i,j,k;
		i=min;
		j=mid+1;
		k=0;
		
		while(i<=mid && j<=max) {
			if(a[i]<a[j]) {
				b[k++]=a[i++];
			}else {
				b[k++]= a[j++]; 
			}
		}
		
		while(i<=mid) {
			b[k++]=a[i++];
		}
		
		while(j<=max) {
			b[k++] = a[j++];
		}
		
		for (int k2 = max; k2 >= min; k2--) {
			a[k2]=b[--k];
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
