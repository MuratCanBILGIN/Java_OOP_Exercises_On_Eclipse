package test;

import java.security.cert.X509Certificate;

public class IntegerSet {
	
	//private int[] x = new int[101];
	
	private boolean[] set;
	
	
	
	
	
	//Constructor
	public IntegerSet()
	{
		set = new boolean[101];
	}
	
	
	
	
	
	
	
	//Methods
	public static IntegerSet union(IntegerSet set1, IntegerSet set2)
	{
		IntegerSet set3 = new IntegerSet();
		
		for(int i= 0; i < 101; i++)
		{
			if( set1.set[i] == true || set2.set[i] == true)
			{
				set3.set[i] = true;
			}
		}
		
		return set3;
	}
	
	
	public static IntegerSet intersections(IntegerSet set1, IntegerSet set2)
	{
		IntegerSet set3 = new IntegerSet();
		
		for(int i = 0; i < 101; i++)
		{
			if(set1.set[i] == true && set2.set[i] == true)
			{
				set3.set[i] = true;
			}
		}
		
		return set3;
	}
	
	
	public void insertElement(int k)
	{
		set[k] = true;
	}
	
	public void deleteMethod(int m)
	{
		set[m] = false;
	}
	
	
	
	public String toSetString()
	{
		String x = "-----Set----- \n";
		
		for(int i = 0; i < 101; i++)
		{
			if(set[i] == true)
			{
				x = x + "{" + i + "}" + ", ";
			}else 
			{
				x = x + "---" + ", ";
			}
		}
		
		return x;
	}
	
	
	public static void isEqualTo(IntegerSet set1, IntegerSet set2)
	{
		boolean controller = true;
		
		for(int i = 0; i < 101; i++)
		{
			if(set1.set[i] != set2.set[i])
			{
				controller = false;
				System.out.printf("Two sets are not equal!");
				break;
			}
		}
		
		if (controller == true)
		{
			System.out.println("Two sets are equal!");	
		}
	}
}


	