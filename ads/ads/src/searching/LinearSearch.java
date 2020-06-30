package searching;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
//		System.out.println("Enter numebr");
//		Scanner sc = new Scanner(System.in);
//		
//		int size = sc.nextInt();
		int num[] = {22, 10, 95, 100, 45, 10, 15, 35, 56, 78};
		int index = linearSearch(num, 78);
		
		if(index==-1) {
			System.out.println("No");
		}else {
			System.out.println("Yes = " + num[index]);
		}
	}
	
	static int linearSearch(int num[], int element) {
		
		for (int i = 0; i < num.length; i++) {
			if(num[i] == element)
				return i;
		}
		
		return -1;
	}

}
