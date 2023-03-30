package CSCE145AND146;

public class Rectangle2 extends Shape {
	private double length;
	private double width;
	private double area;
	public Rectangle2(String aName, double l, double w)
	{
		super(aName);
		this.setLength(l);
		this.setWidth(w);
		this.setArea(getLength()*getWidth());
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		if(length > 0)
			this.length = length;
		else
			this.length = 3;//default value
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		if(width > 0)
			this.width = width;
		else
			this.width = 3;//default value
	}
	public String toString()
	{
		return "Name: " + getName() + "\tLength: " + getLength() + "\tWidth: " + getWidth();
	}
}
