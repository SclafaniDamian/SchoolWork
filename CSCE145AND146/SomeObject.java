// Made By Damian Sclafani
package CSCE145AND146;

public class SomeObject implements Comparable<SomeObject> {
    
    public double someValue;
	public int compareTo(SomeObject o)
	{
		//return (int)(this.someValue - o.someValue);//doesn't work since it could have the number equal 0 (which is what should be returned if the value is equal only)
		if(this.someValue > o.someValue)
			return 1;
		else if(this.someValue < o.someValue)
			return -1;
		else
			return 0;
	}
}
