package com.hashmap;

import java.util.ArrayList;
import java.util.Iterator;

public class HashMapClear {

	public static void main(String[] args) {
		ArrayList<Integer> integers = new ArrayList<>();
		integers.add(1);
		integers.add(2);
	 	integers.add(3);
		Iterator<Integer> itr = integers.iterator();
		while (itr.hasNext()) {
		    Integer a = itr.next();
		    integers.remove(a);
		}

	}

}

class Employee{
	int id;
	public Employee(int id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
