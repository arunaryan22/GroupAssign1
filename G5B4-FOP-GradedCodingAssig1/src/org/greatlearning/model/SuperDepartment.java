package org.greatlearning.model;

abstract class SuperDepartment {

//abstract methods declaration in parent class
	abstract String departmentName();

	abstract String getTodaysWork();

	abstract String getWorkDeadline();

	// non abstract method declaration
	public String isTodayAHoliday() {
		return "Today is not a Holiday";
	}
	public void print() {
		System.out.println("Welcome to "+this.departmentName()+"\n"+this.getTodaysWork()+"\n"+this.getWorkDeadline()+"\n"+isTodayAHoliday()+"\n");
		
	}
}

