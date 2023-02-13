// Made By Damian Sclafani
package CSCE145AND146;

public class Truck extends Vehicle {
    private double loadCap;
	private double towCap;
	
	public Truck()
	{
		super();	//calls parent values
		this.loadCap = 0.0;
		this.towCap = 0.0;
	}
	
	public Truck(String xManName, int xCylinders, String xOwnName, double xLoadCap, double xTowCap)
	{
		super(xManName, xCylinders, xOwnName);		//gets parent values
		this.setLoadCap(xLoadCap);
		this.setTowCap(xTowCap);
	}
	
	public double getLoadCap()
	{
		return this.loadCap;
	}
	
	public double getTowCap()
	{
		return this.towCap;
	}
	
	public void setLoadCap(double xLoadCap)
	{
		if(xLoadCap > 0)
		{
			this.loadCap = xLoadCap;
		}
		else
		{
			System.out.println("INVALID LOADING CAPACITY");
		}
	}
	
	public void setTowCap(double xTowCap)
	{
		if(xTowCap > 0)
		{
			this.towCap = xTowCap;
		}
		else
		{
			System.out.println("INVALID TOWING CAPACITY");
		}
	}
	
	public boolean equals(Truck t)
	{
		return super.equals(t) && this.loadCap == t.getLoadCap()
				&& this.towCap == t.getTowCap();
	}
	
	public String toString()
	{
		return super.toString() + "\nLoading Capacity: " + this.loadCap +
				"\nTowing Capacity: " + this.towCap;
	}
}
