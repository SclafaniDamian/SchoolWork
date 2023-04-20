// Made By Damian Sclafani
package CSCE145AND146;

public class Circle extends Shape{
	private double radius;
	private double area;
	public Circle(String aName, double aRadius)
	{
		super(aName);
		this.setRadius(aRadius);
		this.setArea(getRadius()*getRadius()*Math.PI);
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		if(radius > 0)
			this.radius = radius;
		else
			this.radius = 3;//default value
	}
	public String toString()
	{
		return "Name: " + getName() + "\tRadius: " + getRadius();
	}
}
