// Made By Damian Sclafani
package CSCE145AND146;

public class Wolf extends Dog {

	private String pln;
	
	public Wolf()
	{
		super();
		this.pln = "not named";
	}
	
	public Wolf(String xName, double xWeight, int xEnergy, String xPLN)
	{
		super(xName, xWeight, xEnergy);
		this.setPLN(xPLN);
	}
	
	public String getPLN()
	{
		return this.pln;
	}
	
	public void setPLN(String xPLN)
	{
		this.pln = xPLN;
	}
	
	public String toString()
	{
		return super.toString() +
				"\nPack Leader Name: " + this.pln;
	}
	
	public boolean equals(Wolf w)
	{
		return super.equals(w) &&
				this.pln.equals(w.getPLN());
	}
}
