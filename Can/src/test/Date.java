package test;

public class Date {
	//Instance Variables
	private int day;
	private int month;
	private int year;
	
	//Constructor
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	//methods
	public void displayDate() {
		System.out.print(this.day+ "/" +this.month+ "/"+ this.year);
	}
	
	//get,set methods
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
}
