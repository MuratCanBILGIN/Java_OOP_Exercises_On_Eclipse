package test;

public class Rational
{
	private int numerator;
	private int denominator;
	
	
	
	
	
	
	public Rational()
	{
		this.numerator = 1;
		this.denominator = 1;
	}
	
	public Rational( int numerator, int denominator)
	{
		int common = gcd(numerator, denominator);
		
		this.numerator = numerator / common;
		this.denominator = denominator / common;
	}
	
	
	
	
	
	
	
	
	private int gcd(int x, int y)
	{
		
		int smallNumber;
		int result = 1;
		
		if(x >= y)
		{
			smallNumber = y;
		}else
		{
			smallNumber = x;
		}
		
		for(int i = smallNumber; i > 0 ;i--)
		{
			if(x  % i == 0 && y % i == 0)
			{
				result = i;
				break;
			}
		}
		
		return result;
	}
	
	
	
	public static int lcm(int x, int y)
	{
		
		int bigNumber;
		int smallNumber;
		int result;
		
		if(x >= y)
		{
			bigNumber = x;
			smallNumber = y;
		}else
		{
			bigNumber = y;
			smallNumber = x;
		}
		
		for(int i = bigNumber;;i++)
		{
			if(i % x == 0 && i % y == 0)
			{
				result = i;
				break;
			}
		}
		
		return result;
	}
	
	
	
	
	public int big(int x, int y)
	{
		int bigNumber;
		int smallNumber;
		
		if(x >= y)
		{
			bigNumber = x;
			smallNumber = y;
		}else
		{
			bigNumber = y;
			smallNumber = x;
		}
		
		return bigNumber;
	}
	
	public int small(int x, int y)
	{
		int bigNumber;
		int smallNumber;
		
		if(x >= y)
		{
			bigNumber = x;
			smallNumber = y;
		}else
		{
			bigNumber = y;
			smallNumber = x;
		}
		
		return smallNumber;
	}
	
	
	
	
	
	public static Rational addTwoRationalNumbers(Rational x, Rational y)
	{
		
		int common = lcm(x.getDenominator(),y.getDenominator());
		
		int factorX = common / x.getDenominator();
		int factorY = common / y.getDenominator();
		
		int newNumerator = (x.getNumerator()*factorX)+(y.getNumerator()*factorY);
		
		
		return new Rational(newNumerator,common);
	}
	
	
	public static Rational subtractTwoRationalNumbers(Rational x, Rational y)
	{
		
		int common = lcm(x.getDenominator(),y.getDenominator());
		
		int factorX = common / x.getDenominator();
		int factorY = common / y.getDenominator();
		
		int newNumerator = (x.getNumerator()*factorX)-(y.getNumerator()*factorY);
		
		
		return new Rational(newNumerator,common);
	}
	
	
	public static Rational multiplyTwoRationalNumbers(Rational x, Rational y)
	{
		int newNumerator = x.getNumerator() * y.getNumerator();
		int newDenominator = x.getDenominator() * y.getDenominator();
		
		return new Rational(newNumerator, newDenominator);
	}
	
	public static Rational divideTwoRationalNumbers(Rational x, Rational y)
	{
		int newNumerator = x.getNumerator() * y.getDenominator();
		int newDenominator = x.getDenominator() * y.getNumerator();
		
		return new Rational(newNumerator, newDenominator);
	}
	
	
	public String printRational()
	{
		String str = (getNumerator() + "/" + getDenominator());
		return str;
	}
	
	
	/*public double printDecimal(Rational x, int presicion)
	{
		int beforeDotNumber = (Integer) null;
		int beforeNumberModulo = (Integer)null;
		int newNumber = (Integer)null;
		int[] afterDotNumber = new int[255];
		
		if(x.getNumerator() > x.getDenominator())
		{
			beforeDotNumber = x.getNumerator() / x.getDenominator();
			// = beforeNumberModulo;
			beforeNumberModulo = x.getNumerator() % x.getDenominator();
			newNumber = beforeNumberModulo;
		}
		
		if(x.getNumerator() <= x.getDenominator() || beforeDotNumber != (Integer)null)
		{
			
			for(int i = 1; i <= presicion; i++)
			{
				afterDotNumber[i] = 
			}
		}
	}*/
	
	
	public double printDecimal(Rational x, int presicion)
	{
		int numerator = x.getNumerator();
	    int denominator = x.getDenominator();
		
		int 	remainder = numerator % denominator;
		int beforeDotNumber = 0;
		int[] afterDotNumber = new int[presicion];
		String sayi;
		Double dondurulecekSayi;
		
		if(numerator == denominator)
		{
			return 1.0;
		}
		
		if(numerator > denominator)
		{
			beforeDotNumber = numerator / denominator;
		}
		
		
		//int i = 0;
		//while(i<presicion) yapay zeka tavsiyesi aynı sonucu veriyor, makine halisünasyonla panik yaratıyor
		for(int i = 0; i < presicion; i++)
		{
					
			int counter = 0;
					
			while(remainder < denominator && i < presicion)
			{
			remainder = remainder * 10;
					
			if(counter != 0)
			{
			afterDotNumber[i] = 0;
			i++;
			}
			
			counter++;
			}
					
		if(i < presicion)
		{
		afterDotNumber[i] = remainder / denominator;
		remainder = remainder % denominator;
		//i++;
		}
	}
		
	sayi = beforeDotNumber + ".";
		
	for(int i = 0; i < presicion; i++)
	{
		sayi = sayi + afterDotNumber[i];
	}
		
	dondurulecekSayi = Double.valueOf(sayi);
		
	return dondurulecekSayi;
	}
	
	
	
	
	public int getNumerator()
	{
		return this.numerator;
	}
	
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	
	public int getDenominator()
	{
		return this.denominator;
	}
	
	public void setDenominator(int denominator)
	{
		this.denominator = denominator;
	}
}
