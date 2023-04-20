// Made By Damian Sclafani
package CSCE145AND146;

public class Vehicle {
    private String manName;
	private int cylinders;
	private String ownName;
	
	public Vehicle()
	{
		this.manName = "unknown";
		this.cylinders = 0;
		this.ownName = "unknown";
	}
	
	public Vehicle(String xManName, int xCylinders, String xOwnName)
	{
		this.setManName(xManName);
		this.setCylinders(xCylinders);
		this.setOwnName(xOwnName);
	}
	
	public String getManName()
	{
		return this.manName;
	}
	
	public int getCylinders()
	{
		return this.cylinders;
	}
	
	public String getOwnName()
	{
		return this.ownName;
	}
	
	public void setManName(String xManName)
	{
		this.manName = xManName;
	}
	
	public void setCylinders(int xCylinders)
	{
		if(xCylinders > 0)
		{
			this.cylinders = xCylinders;
		}
		else
		{
			System.out.println("INVALID AMOUNT OF CYLINDERS");
		}
	}
	
	public void setOwnName(String xOwnName)
	{
		this.ownName = xOwnName;
	}
	
	public boolean equals(Vehicle v)
	{
		return this.manName.equalsIgnoreCase(v.getManName())
				&& this.cylinders == v.getCylinders()
				&& this.ownName.equalsIgnoreCase(v.getOwnName());
	}
	
	public String toString()
	{
		return "Manufacturer\'s Name: " + this.manName +
				"\nAmount of Cylinders: " + this.cylinders +
				"\nOwner\'s Name: " + this.ownName;
	}
}
