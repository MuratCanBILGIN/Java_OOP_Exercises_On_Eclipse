package test;

public class Invoice
{
	
	//Variables
	private String partnumber;
	
	private String partdescription;
	
	private int purchasequantity;
	
	private double price;
	
	
	
	
	//Constructor
	public Invoice(String partnumber, String partdescription, int purchasequantity, double price)
	{
		this.partnumber = partnumber;
		this.partdescription = partdescription;
		
		if(purchasequantity < 0)
		{
			this.purchasequantity = 0;
		}else
		{
			this.purchasequantity = purchasequantity;
		}
		
		if(price < 0.0)
		{
			this.price = 0.0;
		}else
		{
			this.price = price;
		}
	}
	
	
	

	//Class methods
	public double getInvoiceAmount()
	{
		return purchasequantity * price;
	}
	
	
	
	
	//get, set methods
	public String getpartnumber()
	{
		return partnumber;
	}
	
	public void setpartnumber(String partnumber)
	{
		this.partnumber = partnumber;
	}
	
	public String getpartdescription()
	{
		return partdescription;
	}
	
	public void setpartdescription(String partdescription)
	{
		this.partdescription = partdescription;
	}
	
	public int getpurchasequantity()
	{
		return purchasequantity;
	}
	
	public void setpurchasequantity(int purchasequantity)
	{
		if(purchasequantity < 0)
		{
			this.purchasequantity = 0;
		}else
		{
			this.purchasequantity = purchasequantity;
		}
	}
	
	public double getprice()
	{
		return price;
	}
	
	public void setprice(double price)
	{
		if(price < 0.0)
		{
			this.price = 0.0;
		}else
		{
			this.price = price;
		}
	}
	
	
}
