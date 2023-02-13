// Made By Damian Sclafani
package CSCE145AND146;

public class Products {
    
    //instance variables
	private String name;
	private double price;
	private int quantity;
	
	//default constructor
	public Products()
	{
		this.name = "no name yet";
		this.price = 0.0;
		this.quantity = 0;
	}
	
	//parameterized constructor
	public Products(String xName, double xPrice, int xQuantity)
	{
		this.setName(xName);
		this.setPrice(xPrice);
		this.setQuantity(xQuantity);
	}
	
	public Products(double xPrice, String xName, int xQuantity)
	{
		this.setPrice(xPrice);
		this.setName(xName);
		this.setQuantity(xQuantity);
	}
	
	//copy constructor
	public Products(Products p)
	{
		this.setName(p.getName());
		this.setPrice(p.getPrice());
		this.setQuantity(p.getQuantity());
	}
	
	//accessors
	public String getName()
	{
		return this.name;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public int getQuantity()
	{
		return this.quantity;
	}
	
	//mutators
	public void setName(String xName)
	{
		this.name = xName;
	}
	
	public void setPrice(double xPrice)
	{
		if(xPrice > 0)
		{
			this.price = xPrice;
		}
		else
		{
			System.out.println("ERROR");
		}
	}
	
	public void setQuantity(int xQuantity)
	{
		if(xQuantity > 0)
		{
			this.quantity = xQuantity;
		}
		else
		{
			System.out.println("ERROR");
		}
	}
	
	public String toString()
	{
		return "Product name: " + this.name
				+ "\nPrice: $" + this.price
				+ "\nQuantity: " + this.quantity;
	}
	
	public boolean equals(Products p)
	{
		return this.name.equalsIgnoreCase(p.getName())
				&& this.price == p.getPrice()
				&& this.quantity == p.getQuantity();
	}
	
	public double totalCost()
	{
		return this.price * this.quantity;
	}
	
	public double totalCost(double xPrice)
	{
		if(xPrice > 0)
		{
			return xPrice * this.quantity;
		}
		else
		{
			return 0;
		}
	}
	
	public double totalCost(double xPrice, int xQuantity)
	{
		if(xPrice > 0 && xQuantity > 0)
		{
			return xPrice * xQuantity;
		}
		else
		{
			return 0;
		}
	}
}
