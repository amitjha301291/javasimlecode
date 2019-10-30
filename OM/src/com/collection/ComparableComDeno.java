/**
 * 
 */
package com.collection;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author Amit Jha
 * 
 */
public class ComparableComDeno {

	public static void main(String[] args) {
		Employee e1 = new Employee("Amit", 10);
		Employee e2 = new Employee("Rakesh", 50);
		Employee e3 = new Employee("Vishnu", 15);
		Employee e4 = new Employee("Sri", 100);
		Employee e5 = new Employee("Durg", 200);
		TreeSet ts = new TreeSet(); // Defult Natural Sorting of Employee which
									// has already implemented in Employee
		// And we have implemented according to id if we are not satisfied with
		// the employee shorting we cn still implement
		// our own shortin with the help of Comperator
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		System.out.println(ts);
		TreeSet ts1 = new TreeSet(new MyComprator()); // Costamized shorting
														// with our Comprator.
		ts1.add(e1);
		ts1.add(e2);
		ts1.add(e3);
		ts1.add(e4);
		ts1.add(e5);
		System.out.println(ts1);

	}

}

class MyComprator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		Employee e1 = (Employee) obj1;
		Employee e2 = (Employee) obj2;
		String s1 = e1.name;
		String s2 = e2.name;

		return s1.compareTo(s2);
	}

}

// As Treeset will short only Homogeneous and Comparable obj.
class Employee implements Comparable {

	String name;
	int empId;

	Employee(String name, int empId) {
		this.empId = empId;
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + "]";
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}

	/**
	 * @param empId
	 *            the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int compareTo(Object obj) {
		int emp1 = this.empId;
		Employee e = (Employee) obj;
		int emp2 = e.empId;
		if (emp1 < emp2) {
			return -1;
		} else if (emp1 > emp2) {
			return +1;

		} else
			return 0;
	}

}