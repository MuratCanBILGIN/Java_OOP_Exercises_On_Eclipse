package test;

import java.awt.event.InputMethodListener;
import java.awt.font.TextHitInfo;
import java.security.PrivateKey;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class EnhancedRectangleClass {
	
	private double x1;
	private double y1;
	private double x2;
	private double y2;
	private double x3;
	private double y3;
	private double x4;
	private double y4;
	boolean isItARectangle;
	
	
	
	
	
	
	
	
	
	public EnhancedRectangleClass(double x1, double y1, double x2, double y2,
			double x3, double y3, double x4, double y4)
	{
		setMethod(x1,y1,x2,y2,x3,y3,x4,y4);
	}
	
	
	
	
	
	
	
	
	
	private void setMethod(double x1, double y1, double x2, double y2,
			double x3, double y3, double x4, double y4)
	{
		
		 if((y1 == y2) && (y3 == y4) && (x1 == x3) && (x2 == x4))
		 {
			 isItARectangle = true;
		 }else
		 {
			 isItARectangle = false;
		 }
		
		if(x1 >= 0 && x1 <= 20)
		{
			this.x1 = x1;
		}
		
		if(y1 >= 0 && y1 <= 20)
		{
			this.y1 = y1;
		}
		
		if(x2 >= 0 && x2 <= 20)
		{
			this.x2 = x2;
		}
		
		if(y2 >= 0 && y2 <= 20)
		{
			this.y2 = y2;
		}
		
		if(x3 >= 0 && x3 <= 20)
		{
			this.x3 = x3;
		}
		
		if(y3 >= 0 && y3 <= 20)
		{
			this.y3 = y3;
		}
		
		if(x4 >= 0 && x4 <= 20)
		{
			this.x4 = x4;
		}
		
		if(y4 >= 0 && y4 <= 20)
		{
			this.y4 = y4;
		}
	
		
		
	}
	
	public double length()
	{
		if(isItARectangle = true)
		{
			if((x2-x1 >= y3-y1))
			{
				return x2-x1;
			}
			else {
				{
					return Math.abs(y3-y1);
				}
			}
		}
		else {
			return 0.0;
		}
	}
	
	public double width()
	{
		if(isItARectangle == true)
		{
			if((x2-x1 >= y3-y1))
			{
				return y3-y1;
			}
			else {
				{
					return x2-x1;
				}
			}
		}
		else {
			return 0.0;
		}
	}
	
	public double perimeter()
	{
		if(isItARectangle == true)
		{
			return 2*(y3 - y1) + 2*(x2-x1); 
		}	
		else {
			return 0.0;
		}
	}
	
	public double area()
	{
		if (isItARectangle)
		{
			return (y3-y1)*(x2-x1);
		}
		else {
			return 0.0;
		}
	}
	
	public boolean isSquare()
	{
		if(isItARectangle == true && ((x2-x1) == (y3-y1)))
				{
					return true;
				}else {
					{
						return false;
					}
				}
	}
	
}
