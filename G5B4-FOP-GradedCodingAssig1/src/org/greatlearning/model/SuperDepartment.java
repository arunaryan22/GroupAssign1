package org.greatlearning.model;


abstract class SuperDepartment {

//Method to accept from user and return department name
	abstract String departmentName();
		
	abstract String getTodaysWork();
	abstract String getWorkDeadline();
	public String isTodayAHoliday(){
		return "Today is not a Holiday";
	}
	
	
	
}
	

