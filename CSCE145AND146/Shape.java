// Made By Damian Sclafani
package CSCE145AND146;

public class Shape implements Comparable<Shape> {
	private String name;
	private double area;
	public Shape(String aName)
	{
		this.setName(aName);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public String toString()
	{
		return "Name: " + getName();
	}
	public int compareTo(Shape s)
	{
		if(this.getArea() > s.getArea())
			return 1;
		else if(this.getArea() < s.getArea())
			return -1;
		else
			return 0;
	}
}
