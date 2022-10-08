package org.greatlearning.model;

//subclass HrDepartment will inherit super class SuperDepartment
public class HrDepartment extends SuperDepartment {
	public String departmentName() {
		return "HR Department";
	}

	public String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String doActivity() {
		return "team Lunch";
	}
	public void print() {
		System.out.println("Welcome to "+this.departmentName()+"\n"+this.doActivity()+"\n"+this.getTodaysWork()+"\n"+this.getWorkDeadline()+"\n"+isTodayAHoliday()+"\n");
	}
}
