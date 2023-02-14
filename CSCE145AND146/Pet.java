// Made By Damian Sclafani
package CSCE145AND146;

public class Pet {
    
    //Encapsulation
	private String type;
	private String name;
	private double weight;
	
	//default constructor
	public Pet()
	{
		this.name = "no name yet";
		this.weight = 0.0;
		this.type = "unknown";
	}
	
	//parameterized constructor
	public Pet(String xName, double xWeight, String xType)
	{
		this.setName(xName);
		this.setWeight(xWeight);
		this.setType(xType);
	}
	
	//accessors
	public String getName()
	{
		return this.name;
	}
	
	public double getWeight()
	{
		return this.weight;
	}
	
	public String getType()
	{
		return this.type;
	}
	
	//mutators
	public void setName(String xName)
	{
		this.name = xName;
	}
	
	public void setWeight(double xWeight)
	{
		if(xWeight > 0)
		{
			this.weight = xWeight;
		}
		else
		{
			System.out.println("Invalid value for weight!");
		}
	}
	
	public void setType(String xType)
	{
		if(xType.equalsIgnoreCase("dog") 
				|| xType.equalsIgnoreCase("Cat") 
				|| xType.equalsIgnoreCase("Fish") 
				|| xType.equalsIgnoreCase("Bird")
				|| xType.equalsIgnoreCase("Monkey"))
		{
			this.type = xType;
		}
		else
		{
			System.out.println("Invalid type entered!");
		}
	}
	
	public String toString()
	{
		return "Name: " + this.name + "\nWeight: " + this.weight + "lbs" + "\nType: " + this.type;
	}
}
