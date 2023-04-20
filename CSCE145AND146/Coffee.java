// Made by Damian Sclafani
package CSCE145AND146;

public class Coffee {
    
    private String name;
	private int caffine;
	
	public Coffee()
	{
		//this.name = name;
		//this.caffine = caffine;
	}
	
	public Coffee(String xName, int xCaffine)
	{
		this.setName(xName);
		this.setCaffine(xCaffine);
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getCaffine()
	{
		return this.caffine;
	}
	
	public void setName(String xName)
	{
		this.name = xName;
	}
	
	public void setCaffine(int xCaffine)
	{
		if((xCaffine > 49) && (xCaffine < 301))
		{
			this.caffine = xCaffine;
		}
		else
		{
			System.out.println("ERROR");
		}
	}
	
	public double RiskyAmount(int xCaffine)
	{
		return 180.0/((xCaffine/100.0)*6.0);
	}
	
	public String toString()
	{
		return "It would take " + RiskyAmount(this.caffine) + " cups of " + this.name + " before it's too dangerous to drink.";
	}
}
