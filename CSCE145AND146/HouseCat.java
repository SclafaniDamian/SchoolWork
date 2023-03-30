// Made By Damian Sclafani
package CSCE145AND146;

public class HouseCat extends Cat {

	private String type;
	
	public HouseCat()
	{
		super();
		this.type = "Ragdoll";
	}
	
	public HouseCat(String xName, double xWeight, String xMood, String xType)
	{
		super(xName, xWeight, xMood);
		this.setType(xType);
	}
	
	public String getType()
	{
		return this.type;
	}
	
	public void setType(String xType)
	{
		if(xType.equalsIgnoreCase("Short Hair") ||
				xType.equalsIgnoreCase("Bombay") ||
				xType.equalsIgnoreCase("Ragdoll") ||
				xType.equalsIgnoreCase("Sphinx") ||
				xType.equalsIgnoreCase("Scottish Fold"))
		{
			this.type = xType;
		}
	}
	
	public String toString()
	{
		return super.toString() + 
				"\nType: " + this.type;
	}
	
	public boolean equals(HouseCat c)
	{
		return super.equals(c) &&
				this.type.equals(c.getType());
	}
}
