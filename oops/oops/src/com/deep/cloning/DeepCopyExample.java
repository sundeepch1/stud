package com.deep.cloning;

public class DeepCopyExample {

	public static void main(String[] args) {
		// Creating original Employee object
		Company cmp = new Company("Google", "Bengaluru");
		Employee originalEmployee = new Employee("John", 25, cmp);
		System.out.println(originalEmployee.name + " " + originalEmployee.age + " "
				+ originalEmployee.company.companyName + " " + originalEmployee.company.location);

		// Creating deep copy of original Employee object
		try {
			Employee employeeCopy = (Employee) originalEmployee.clone();

			/*
			 * changing the companyName field in referenced field of clone object
			 */
			employeeCopy.company.companyName = "Facebook";

			System.out.println("After changing company name of copy object:");
			System.out.println("Original object:");
			System.out.println(originalEmployee.name + " " + originalEmployee.age + " "
					+ originalEmployee.company.companyName + " " + originalEmployee.company.location);
			System.out.println("Clone object (Deep copy):");
			System.out.println(employeeCopy.name + " " + employeeCopy.age + " " + employeeCopy.company.companyName + " "
					+ employeeCopy.company.location);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}

class Employee implements Cloneable {
	String name;
	int age;
	Company company;

	public Employee(String name, int age, Company company) {
		super();
		this.name = name;
		this.age = age;
		this.company = company;
	}

	// Default clone() method
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee employee = (Employee) super.clone();
//		Company company = new Company(this.company.companyName, this.company.location);
//		employee.company = company;
		employee.company = (Company) company.clone();
		return employee;
	}

}

class Company implements Cloneable {
	String companyName;
	String location;

	public Company(String companyName, String location) {
		super();
		this.companyName = companyName;
		this.location = location;
	}

	// Default clone() method
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
