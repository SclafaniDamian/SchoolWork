// Made By Damian Sclafani
package CSCE145AND146;

public class Leopard extends Cat {

	private int spots;
	
	public Leopard()
	{
		super();
		this.spots = 0;
	}
	
	public Leopard(String xName, double xWeight, String xMood, int xSpots)
	{
		super(xName, xWeight, xMood);
		this.setSpots(xSpots);
	}
	
	public int getSpots()
	{
		return this.spots;
	}
	
	public void setSpots(int xSpots)
	{
		if(xSpots >= 0)
		{
			this.spots = xSpots;
		}
	}
	
	public String toString()
	{
		return super.toString() +
				"\nNumber of Spots: " + this.spots;
	}
	
	public boolean equals(Leopard l)
	{
		return super.equals(l) &&
				this.spots == l.getSpots();
	}
}
