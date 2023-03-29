// Made By Damian Sclafani
package CSCE145AND146;

public class Undergraduate extends Student {
	
	private String minor;
	private int level;
	
	//default constructor
	public Undergraduate()
	{
		super();
		this.minor = "no minor selected";
		this.level = 1;
	}
	
	//parameterized constructor
	public Undergraduate(String xName, int xAge, int xStudentID, double xGpa, String xMajor, String xMinor, int xLevel)
	{
		super(xName, xAge, xStudentID, xGpa, xMajor);
		this.setMinor(xMinor);
		this.setLevel(xLevel);
	}
	
	//accessors
	public String getMinor()
	{
		return this.minor;
	}
	
	public int getLevel()
	{
		return this.level;
	}
	
	//mutators
	public void setMinor(String xMinor)
	{
		if(xMinor.equalsIgnoreCase("Finance")
				|| xMinor.equalsIgnoreCase("Psychology"))
		{
			this.minor = xMinor;
		}
		else
		{
			System.out.println("INVALID MINOR");
		}
	}
	
	public void setLevel(int xLevel)
	{
		if(xLevel >= 1 && xLevel <= 4)
		{
			this.level = xLevel;
		}
		else
		{
			System.out.println("INVALID LEVEL");
		}
	}
	
	public void writeOutput()
	{
		super.writeOutput();
		System.out.println("Minor: " + this.minor + "\nLevel: " + this.level);
	}
}
