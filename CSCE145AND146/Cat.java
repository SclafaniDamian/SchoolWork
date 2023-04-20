// Made By Damian Sclafani
package CSCE145AND146;

public class Cat extends Animal {

	private String mood;
	
	public Cat()
	{
		super();
		this.mood = "sleepy";
	}
	
	public Cat(String xName, double xWeight, String xMood)
	{
		super(xName, xWeight);
		this.setMood(xMood);
	}
	
	public String getMood()
	{
		return this.mood;
	}
	
	public void setMood(String xMood)
	{
		if(xMood.equalsIgnoreCase("sleepy") ||
				xMood.equalsIgnoreCase("playful") ||
				xMood.equalsIgnoreCase("hungry"))
			{
				this.mood = xMood;
			}
	}
	
	public String toString()
	{
		return super.toString() +
				"\nMood: " + this.mood;
	}
	
	public boolean equals(Cat c)
	{
		return super.equals(c) &&
				this.mood.equals(c.getMood());
	}
}
