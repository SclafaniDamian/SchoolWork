// Made By Damian Sclafani
package CSCE145AND146;

public class Animal {
    
    private String name;
	private double weight;
	
	public Animal()
	{
		this.name = "not named";
		this.weight = 50.0;
	}
	
	public Animal(String xName, double xWeight)
	{
		this.setName(xName);
		this.setWeight(xWeight);
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public double getWeight()
	{
		return this.weight;
	}
	
	public void setName(String xName)
	{
		this.name = xName;
	}
	
	public void setWeight(double xWeight)
	{
		if(xWeight > 0.0)
		{
			this.weight = xWeight;
		}
	}
	
	public String toString()
	{
		return "Name: " + this.name +
				"\nWeight: " + this.weight;
	}
	
	public boolean equals(Animal a)
	{
		return this.name.equals(a.getName())
				&& this.weight == a.getWeight();
	}
}
