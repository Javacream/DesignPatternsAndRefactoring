package org.javacream.extract_superclass;

import java.util.Enumeration;
import java.util.Vector;

public class Department extends Party{
	private Vector<Employee> staff = new Vector<Employee>();

	public Department(String name) {
		super(name);
	}

	public int getTotalAnnualCost() {
		Enumeration<Employee> e = getStaff();
		int result = 0;
		while (e.hasMoreElements()) {
			Employee each = e.nextElement();
			result += each.getAnnualCost();
		}
		return result;
	}

	public int getHeadCount() {
		return staff.size();
	}

	public Enumeration<Employee> getStaff() {
		return staff.elements();
	}

	public void addStaff(Employee arg) {
		staff.addElement(arg);
	}


}
