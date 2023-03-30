// Made By Damian Sclafani
package CSCE145AND146;

public class Dog extends Animal {

	private int energy;
	
	public Dog()
	{
		super();
		this.energy = 0;
	}
	
	public Dog(String xName, double xWeight, int xEnergy)
	{
		super(xName, xWeight);
		this.setEnergy(xEnergy);
	}
	
	public int getEnergy()
	{
		return this.energy;
	}
	
	public void setEnergy(int xEnergy)
	{
		if(xEnergy >= 0 && xEnergy <= 100)
		{
			this.energy = xEnergy;
		}
	}
	
	public String toString()
	{
		return super.toString() +
				"\nEnergy Level: " + this.energy;
	}
	
	public boolean equals(Dog d)
	{
		return super.equals(d) &&
				this.energy == d.getEnergy();
	}
	
}
