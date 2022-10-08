package org.greatlearning.model;

public class Main {

	public static void main(String[] arg) {

		SuperDepartment admin = new AdminDepartment();
		admin.print();

		SuperDepartment hr = new HrDepartment();
		hr.print();

		SuperDepartment tech = new TechDepartment();
		tech.print();

	}

}
