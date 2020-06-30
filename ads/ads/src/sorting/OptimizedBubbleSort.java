package sorting;

public class OptimizedBubbleSort {

	public static void main(String[] args) {

		int arr[] = { 11, 17, 18, 26, 23 };

		bubbleSort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void bubbleSort(int[] arr) {
		int temp;
		int flag;
		for (int i = 0; i < arr.length; i++) {
			flag = 0;
			for (int j = 0; j < arr.length - i - 1; j++) {
				System.out.println(i);
				System.out.println(j);
				System.out.println(arr[j]);
				System.out.println(arr[j + 1]);
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

					flag = 1;
				}
			}

			if (flag == 0) {
				break;
			}
		}
	}

}
