// Made By Damian Sclafani
package CSCE145AND146;

public class RightTriangle extends Shape {
	private double base;
	private double height;
	private double area;
	public RightTriangle(String aName, double b, double h)
	{
		super(aName);
		this.setBase(b);
		this.setHeight(h);
		this.setArea(0.5*getBase()*getHeight());
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		if(base > 0)
			this.base = base;
		else
			this.base = 3;//default value
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		if(height > 0)
			this.height = height;
		else
			this.height = 3;//default value
	}
	public String toString()
	{
		return "Name: " + getName() + "\tBase: " + getBase() + "\tHeight: " + getHeight();
	}
}
