// Made By Damian Sclafani
package CSCE145AND146;

public class Car extends Vehicle {
    private double gas;
	private int people;
	
	public Car()
	{
		super();	//calls parent variables
		this.gas = 0.0;
		this.people = 2;
	}
	
	public Car(String xManName, int xCylinders, String xOwnName, double xGas, int xPeople)
	{
		super(xManName, xCylinders, xOwnName);
		this.setGas(xGas);
		this.setPeople(xPeople);
	}
	
	public double getGas()
	{
		return this.gas;
	}
	
	public int getPeople()
	{
		return this.people;
	}
	
	public void setGas(double xGas)
	{
		if(xGas > 0)
		{
			this.gas = xGas;
		}
		else
		{
			System.out.println("INVALID GAS MILEAGE");
		}
	}
	
	public void setPeople(int xPeople)
	{
		if(xPeople > 0)
		{
			this.people = xPeople;
		}
		else
		{
			System.out.println("INVALID PASSENGER CAPACITY");
		}
	}
	
	public boolean equals(Car c)
	{
		return super.equals(c) && this.gas == c.getGas()
				&& this.people == c.getPeople();
	}
	
	public String toString()
	{
		return super.toString() + "\nGas Mileage: " + this.gas +
				"\nPassenger Capacity: " + this.people;
	}
}
