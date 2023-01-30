// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class Apple {
    private String type;
	private double weight;
	private double price;

	Scanner key = new Scanner(System.in);

    public Apple()
	{
		this.type = "Gala";
		this.weight = 0.5;
		this.price = 0.88;
	}
	
	public String getType()
	{
		return this.type;
	}
	
	public double getWeight()
	{
		return this.weight;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public void setType(String xType)
	{
		if(xType.equalsIgnoreCase("Red Delicious")
				|| xType.equalsIgnoreCase("Golden Delicious")
				|| xType.equalsIgnoreCase("Gala")
				|| xType.equalsIgnoreCase("Granny Smith"))
		{
			this.type = xType;
		}
		else
		{
			System.out.println("Invalid type entered!");
		}
	}
	
	public void setWeight(double xWeight)
	{
		if(xWeight > 0 && xWeight < 2)
		{
			this.weight = xWeight;
		}
		else
		{
			System.out.println("Invalid value for weight!");
		}
	}
	
	public void setPrice(double xPrice)
	{
		if(xPrice > 0)
		{
			this.price = xPrice;
		}
		else
		{
			System.out.println("Invalid value for weight!");
		}
	}
	
	public String toString()
	{
		return "Type: " + this.type + "\nWeight: " + this.weight + " kg\nPrice: $" + this.price;
	}

}
