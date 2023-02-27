// Made By Damian Sclafani
package CSCE145AND146;

public class CruiseShip extends Ship {
    
    private int capacity;
	private int crew;
	
	//default const.
	public CruiseShip()
	{
		super();
		this.capacity = 0;
		this.crew = 0;
	}
	
	//param. const.
	public CruiseShip(String xName, String xLaunchDate, int xCapacity, int xCrew)
	{
		super(xName, xLaunchDate);
		this.setCapacity(xCapacity);
		this.setCrew(xCrew);
	}
	
	//accessors
	public int getCapacity()
	{
		return this.capacity;
	}
	
	public int getCrew()
	{
		return this.crew;
	}
	
	//mutators
	public void setCapacity(int xCapacity)
	{
		if(xCapacity > 0)
		{
			this.capacity = xCapacity;
		}
		else
		{
			System.out.println("INVALID PASSENGER CAPACITY");
		}
	}
	
	public void setCrew(int xCrew)
	{
		if(xCrew > 0)
		{
			this.crew = xCrew;
		}
		else
		{
			System.out.println("INVALID NUMBER OF CREW MEMBERS");
		}
	}
	
	//tostring
	public String toString()
	{
		return super.toString() +
				"\nPassenger Capacity: " + this.capacity +
				"\nNumber of Crew Members: " + this.crew;
	}
}
