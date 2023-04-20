// Made By Damian Sclafani
package CSCE145AND146;

public class DomesticDog extends Dog {

	private String type;
	
	public DomesticDog()
	{
		super();
		this.type = "Yappy";
	}
	
	public DomesticDog(String xName, double xWeight, int xEnergy, String xType)
	{
		super(xName, xWeight, xEnergy);
		this.setType(xType);
	}
	
	public String getType()
	{
		return this.type;
	}
	
	public void setType(String xType)
	{
		if(xType.equalsIgnoreCase("Retriever") ||
				xType.equalsIgnoreCase("Terrier") ||
				xType.equalsIgnoreCase("Husky") ||
				xType.equalsIgnoreCase("Yappy") ||
				xType.equalsIgnoreCase("Mutt"))
		{
			this.type = xType;
		}
	}
	
	public String toString()
	{
		return super.toString() +
				"\nType: " + this.type;
	}
	
	public boolean equals(DomesticDog d)
	{
		return super.equals(d) &&
				this.type.equals(d.getType());
	}
}
