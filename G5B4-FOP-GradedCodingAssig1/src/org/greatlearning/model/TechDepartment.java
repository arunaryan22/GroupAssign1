package org.greatlearning.model;


//subclass TechDepartment will inherit super class SuperDepartment
public class TechDepartment extends SuperDepartment {
	public String departmentName() {
		return "Tech Department";
	}

	public String getTodaysWork() {
		return "Complete Coding of Module 1";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String getTechStackInformation() {
		return "Core Java";
	}
	public void print() {
		System.out.println("Welcome to "+this.departmentName()+"\n"+this.getTodaysWork()+"\n"+this.getWorkDeadline()+"\n"+this.getTechStackInformation()+"\n"+isTodayAHoliday()+"\n");
	}
}
