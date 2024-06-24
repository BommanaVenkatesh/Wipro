package com.junit;

public class Date {

	int intDay, intMonth, intYear; 
	Date(int intDay, int intMonth, int intYear) { 
	this.intDay = intDay; 
	this.intMonth = intMonth; 
	this.intYear = intYear; 
	}
	public int getIntDay() {
		return intDay;
	}
	public void setIntDay(int intDay) {
		this.intDay = intDay;
	}
	public int getIntMonth() {
		return intMonth;
	}
	public void setIntMonth(int intMonth) {
		this.intMonth = intMonth;
	}
	public int getIntYear() {
		return intYear;
	}
	public void setIntYear(int intYear) {
		this.intYear = intYear;
	}
	@Override
	public String toString() {
		return "Date [intDay=" + intDay + ", intMonth=" + intMonth + ", intYear=" + intYear + "]";
	} 
	

}
