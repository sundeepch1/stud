package interview.marks;

import java.util.HashMap;
import java.util.Map;

public class Marks {
	
	public static int totalMarks(String optios[], Map<String, String> markOptions) {
		int total = 0 ;
		for (String string : optios) {
			total += Integer.parseInt(markOptions.get(string));
		}
		return total;
	}
	
	public static void main(String ...strings) {
		//For options
		Map<String, String> marks = new HashMap<>();
		marks.put("a", "5");
		marks.put("b", "6");
		marks.put("c", "-5");
		marks.put("d", "-6");
		//Random option selection
		String options[] = {"a", "b","c","d","a"};
		int total = totalMarks(options, marks);
		
		System.out.println("Your Total Marks = " + total);
	}
	
}
