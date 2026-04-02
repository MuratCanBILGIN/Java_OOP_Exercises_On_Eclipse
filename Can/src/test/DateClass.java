package test;

import java.time.Month;

public class DateClass {
	
	private int month;
	private int day;
	private int year;
	private String[] monthsString = {"","January", "February", "March", 
									"April", "May", "June",
									"July", "August", "September", 
									"October", "November", "December"};
	
	
	
	
	public DateClass(int month, int day, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	
	
	public DateClass(int dayOfTheYear, int year)
	{
		int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if(this.year % 4 == 0 && ((this.year % 100 != 0) ||(this.year % 400 == 0)))
		{
			daysInMonth[2] = 29;
		}
		
		int i = 1;
		
		int monthThinkering = daysInMonth[i];
		
		
		
		while(dayOfTheYear > daysInMonth[i])
		{
			
			dayOfTheYear = dayOfTheYear - daysInMonth[i];
			i++;
		}
		
		this.day = dayOfTheYear;
		this.month = i;
		this.year = year;
		
	}
	
	
	
	public DateClass(String monthName, int day, int year)
	{
		this.day = day;
		this.year = year;
		
		for(int i = 0; i < monthsString.length;i++)
		{
			if(monthsString[i].equalsIgnoreCase(monthName))
					{
				this.month = i;
				break;
					}
		}
	}
	
	
	
	public int getDay()
	{
		return this.day;
	}
	
	public int getMonth()
	{
		return this.month;
	}
	
	public int getYear()
	{
		return this.year;
	}
	
	
}
