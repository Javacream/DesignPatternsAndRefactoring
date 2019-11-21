package org.javacream.hide_delegate;

public class Person {
	private Department department;

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public Person getManager(){
		return getDepartment().getManager();
	}
}
