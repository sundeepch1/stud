package convert.list.to.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToHashMapStudent {

	public static void main(String[] args) {

		List<Student> lt = new ArrayList<>();

		lt.add(new Student(1, "Geeks"));
		lt.add(new Student(2, "For"));
		lt.add(new Student(3, "Geeks"));

		//Map<Integer, Student> map = new HashMap<>();
		Map<Integer, Student> map = lt.stream()
			      .collect(Collectors.toMap(Student::getId, a -> a));

		//for(Student s: lt) map.put(s.getId().toString(), s);
		map.forEach((x, y) -> {
			System.out.println(x + "         " + y.getName());
		});
	}

}
