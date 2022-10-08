package org.greatlearning.model;

//subclass AdminDepartment will inherit super class SuperDepartment
class AdminDepartment extends SuperDepartment {

	public String departmentName() {
		//System.out.println("Admin Department");
		return "Admin Department";
	}

	public String getTodaysWork() {
		return "Complete your document submission";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}
}
