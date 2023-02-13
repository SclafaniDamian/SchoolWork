// Made By Damian Sclafani
package CSCE145AND146;

public class Taco {
    private String name;
	private double price;
	
	public Taco()
	{
		this.name = "none";
		this.price = 0.0;
	}
	
	public Taco(String xName, double xPrice)
	{
		this.setName(xName);
		this.setPrice(xPrice);
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public void setName(String xName)
	{
		this.name = xName;
	}
	
	public void setPrice(double xPrice)
	{
		if(xPrice > 0.0)
		{
			this.price = xPrice;
		}
		else
		{
			System.out.println("INVALID PRICE ENTERED");
		}
	}
	
	public boolean equals(Taco t)
	{
		return this.name.equalsIgnoreCase(t.getName())
				&& this.price == t.getPrice();
	}
	
	public String toString()
	{
		return "Name: " + this.name +
				"\nPrice: $" + this.price;
	}
}
