package java2blog.main;

import java.util.Scanner;

public class FindLargestSmallestNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter array size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] num= new int[size];
		for(int i=0; i<size;i++) {
			num[i] = sc.nextInt();
		}
		
		int smallest = num[0];
		int largest = num[0];
		
		for(int n : num) {
			if(n>largest)
				largest = n;
			else if(n<smallest)
				smallest = n;
		}
		
		System.out.println("smallest = " + smallest);
		System.out.println("largest = " + largest);
	}

}
