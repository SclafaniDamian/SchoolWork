// Made By Damian Sclafani
package CSCE145AND146;

public class CargoShip extends Ship {
    
    private double tonnage;
	private double speed;
	
	//default const.
	public CargoShip()
	{
		super();
		this.tonnage = 0.0;
		this.speed = 0;
	}
	
	public CargoShip(String xName, String xLaunchDate, double xTonnage, double xSpeed)
	{
		super(xName, xLaunchDate);
		this.setTonnage(xTonnage);
		this.setSpeed(xSpeed);
	}
	
	//accessors
	public double getTonnage()
	{
		return this.tonnage;
	}
	
	public double getSpeed()
	{
		return this.speed;
	}
	
	//mutators
	public void setTonnage(double xTonnage)
	{
		if(xTonnage > 0.0)
		{
			this.tonnage = xTonnage;
		}
		else
		{
			System.out.println("INVALID TONNAGE");
		}
	}
	
	public void setSpeed(double xSpeed)
	{
		if(xSpeed > 0)
		{
			this.speed = xSpeed;
		}
		else
		{
			System.out.println("INVALID MAXIMUM SPEED ENTERED");
		}
	}
	
	//tostring
	public String toString()
	{
		return super.toString() +
				"\nTonnage: " + this.tonnage +
				"\nMaximum Speed(mph): " + this.speed;
	}
}
