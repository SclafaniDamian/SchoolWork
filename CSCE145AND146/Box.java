// Made by Damian Sclafani
package CSCE145AND146;

public class Box {
    
    private String label;
	private double length;
	private double width;
	private double height;
	
	//default const.
	public Box()
	{
		this.label = "";
		this.length = 0.0;
		this.width = 0.0;
		this.height = 0.0;
	}
	
	//para. const.
	public Box(String xLabel, double xLength, double xWidth, double xHeight)
	{
		this.setLabel(xLabel);
		this.setLength(xLength);
		this.setWidth(xWidth);
		this.setHeight(xHeight);
	}
	
	//accessors
	public String getLabel()
	{
		return this.label;
	}
	
	public double getLength()
	{
		return this.length;
	}
	
	public double getWidth()
	{
		return this.width;
	}
	
	public double getHeight()
	{
		return this.height;
	}
	
	//mutators
	public void setLabel(String xLabel)
	{
		this.label = xLabel;
	}
	
	public void setLength(double xLength)
	{
		if(xLength > 0)
		{
			this.length = xLength;
		}
		else
		{
			System.out.println("INVALID LENGTH");
		}
	}
	
	public void setWidth(double xWidth)
	{
		if(xWidth > 0)
		{
			this.width = xWidth;
		}
		else
		{
			System.out.println("INVALID WIDTH");
		}
	}
	
	public void setHeight(double xHeight)
	{
		if(xHeight > 0)
		{
			this.height = xHeight;
		}
		else
		{
			System.out.println("INVALID HEIGHT");
		}
	}
	
	//volume
	public double getVolume()
	{
		return this.length * this.width * this.height;
	}
	
	//toString
	public String toString()
	{
		return "Box Label: " + this.label +
				"\nVolume: " + getVolume() + " cubic feet";
	}
}
