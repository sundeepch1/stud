package com.searching;

import java.util.Arrays;
import java.util.List;

public class BinarySearchOnStudent {

	public static Student searchStudent(List<Student> s, int target) {
		int min = 0;
		int max = s.size();
		int guess;

		while (min < max) {
			guess = (min + max) / 2;

			if (s.get(min) != null && s.get(min).getId() == target) {
				return s.get(min);
			} else if (s.get(min) != null && s.get(min).getId() > target) {
				max = guess - 1;
			} else {
				min = guess + 1;
			}
		}

		return null;
	}

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student(100, "sundeep", 23), new Student(101, "muna", 27),
				new Student(102, "rahul", 26), new Student(103, "bikash", 25), new Student(104, "deep", 24));

		System.out.println(searchStudent(students,104));
	}

}
