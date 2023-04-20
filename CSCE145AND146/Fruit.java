// Made By Damian Sclafani
package CSCE145AND146;

public class Fruit implements Comparable<Fruit> {
	private String type;
	private double weight;
	public Fruit()
	{
		this.type = "apple";
		this.weight = 1.0;
	}
	public Fruit(String aType, double aWeight)
	{
		this.setType(aType);
		this.setWeight(aWeight);
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String toString()
	{
		return "Type: " + getType() + "\tWeight: " + getWeight();
	}
	public int compareTo(Fruit f)
	{
		if(this.weight > f.weight)
			return 2;
		else if(this.weight < f.weight)
			return -2;
		else
		{
			if(this.type.equals(f.type))
				return 0;
			else
				return -1;
		}
	}
}
