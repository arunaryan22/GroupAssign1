package org.greatlearning.model;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] arg) {
		
		SuperDepartment superDepartment;
		superDepartment=new AdminDepartment();
		
		System.out.println("Wecome to "+superDepartment.departmentName()+"\n"+superDepartment.getTodaysWork());
		

	}

}
