package problem3;

import java.util.*;

class Test extends NameComparator{

	public static void main(String[] args) {
		Vector<Employee> v = new Vector<Employee>();
		v.add(new Employee("M", 19, "222", new Date(), 125000));
	    v.add(new Employee("P", 29, "111", new Date(), 250000));
	    v.add(new Employee("Z", 39, "333", new Date(), 560000));
	    NameComparator nc = new NameComparator();
	    Collections.sort(v, nc);
	    for (Employee e : v) {
	    	System.out.println(e.getName());
	    }
	    DateComparator dc = new DateComparator();
	    Collections.sort(v, dc);
	    for (Employee e : v) {
	    	System.out.println(e.getHireDate());
	    }
		/*
		NameComparator ns = new NameComparator();1
		Vector<Manager> managers = new Vector<Manager>();
		Vector<Employee> emp = new Vector<Employee>();
		Date date = new Date();
		managers.add(new Manager("a", 25, "4560d", date, 158.3, emp, 69.3));
		managers.add(new Manager("a", 25, "4560d", date, 298, emp, 25.2)); // -1
		managers.add(new Manager("a", 25, "4560d", date, 158.3, emp, 88)); // 1
		managers.add(new Manager("a", 25, "4560d", date, 158.3, emp, 69.3)); // 0
		
		NameComparator nc = new NameComparator();
		System.out.println(managers.get(0).compareTo(managers.get(2)));

		System.out.println(ns.compare(managers.get(0), managers.get(2)));
		*/
		
	}
}