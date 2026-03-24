package test;

public class ComplexNumbers {
	
	//complex number = realPart + imaginaryPart * i 
	//i =sqrt(-1)
	
	private double realPart;
	private double imaginaryPart;
	//private final double i = Math.sqrt(-1);
	
	
	
	
	
	
	public ComplexNumbers()
	{
		this.realPart = 0;
		this.imaginaryPart = 0;
	}
	
	public ComplexNumbers(double realPart, double imaginaryPart)
	{
		this.imaginaryPart = imaginaryPart;
		this.realPart = realPart;
	}
	
	
	
	
	
	
	/*public void addTwoComplexNumbers(ComplexNumbers number1, ComplexNumbers number2)
	{
		double realPart =  (number1.realPart + number2.realPart);
		
		double imaginaryPart = (number1.imaginaryPart + number2.imaginaryPart);
		
		System.out.printf("%+.f %+.f i\n",realPart,imaginaryPart);
	}
	
	public void subtractTwoComplexNumbers(ComplexNumbers number1, ComplexNumbers number2)
	{
		double realPart =  (number1.realPart - number2.realPart);
		
		double imaginaryPart = (number1.imaginaryPart - number2.imaginaryPart);
		
		System.out.printf("%+.f %+.f i\n",realPart,imaginaryPart);
	}
	
	public void printComplexNumbers(double a, double b)
	{
		a = this.realPart;
		b = this.imaginaryPart;
		
		System.out.printf("%+.f + %+.f i\n",a,b);
	}
	
	*/
	
	
	
	public static ComplexNumbers addTwoComplexNumbers(ComplexNumbers number1, ComplexNumbers number2)
	{
		double realPart =  (number1.realPart + number2.realPart);
		
		double imaginaryPart = (number1.imaginaryPart + number2.imaginaryPart);
		
		return new ComplexNumbers(realPart, imaginaryPart);
	}
	
	public static ComplexNumbers subtractTwoComplexNumbers(ComplexNumbers number1, ComplexNumbers number2)
	{
		double realPart =  (number1.realPart - number2.realPart);
		
		double imaginaryPart = (number1.imaginaryPart - number2.imaginaryPart);
		
		return new ComplexNumbers(realPart, imaginaryPart);
	}
	
	public String toString()
	{
		return String.format("(%.1f %+.1fi)", realPart, imaginaryPart);
	}
	
	
	
	
	public double getRealPart()
	{
		return realPart;
	}
	
	public void setRealPart(double realPart)
	{
		this.realPart = realPart;
	}
	
	
	public double getImaginaryPart()
	{
		return imaginaryPart;
	}
	
	public void setImaginaryPart(double imaginaryPart)
	{
		this.imaginaryPart = imaginaryPart;
	}
}
