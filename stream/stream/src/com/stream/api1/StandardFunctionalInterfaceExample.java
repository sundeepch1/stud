package com.stream.api1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.stream.api.Person;

public class StandardFunctionalInterfaceExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("z", "y", 23), new Person("x", "w", 23),
				new Person("v", "u", 23), new Person("t", "s", 23), new Person("r", "q", 23));

		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});

		Collections.sort(people, (p1, p2) -> {
			return p1.getLastName().compareTo(p2.getLastName());
		});

		printPerson(people, p -> p.getFirstName().startsWith("z"), p-> System.out.println(p));

		for (Person person : people) {
			System.out.println(person);
		}
	}

	public static void printPerson(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person person : people) {
			if (predicate.test(person)) {
				consumer.accept(person);
			}
		}
	}

}
