package searching;

public class JumpSearch {
	public static void main(String ...strings) {
		int values[] = { 13, 21, 54, 81, 90, 95, 105, 109, 115, 120, 122, 125, 130, 140 };
		int target = 81;
		int result = jumpSearch(values, target);

		if (result == -1) {
			System.out.println("No");
		} else {
			System.out.println("Yes = " + values[result]);
		}
	}

	private static int jumpSearch(int[] values, int target) {
		
		int i = 0;
		int total = values.length;
		int block = (int) Math.sqrt(total); 
		
		while(values[block] <= target && block<total) {
			i = block;
			block += block;
			
			if(block > total -1)
				return -1;
		}
		
		for (int j = i; j < block; j++) {
			if(values[j] == target)
				return j;
		}
		
		return -1;
	}
}
