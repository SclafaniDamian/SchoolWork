// Made By Damian Sclafani
package CSCE145AND146;

public class Process {
    
    private String name;
	private double time;
	
	public Process()
	{
		this.name = "none";
		this.time = 0.0;
	}
	public Process(String aName, double aTime)
	{
		name = aName;
		time = aTime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null)
		{
			this.name = name;
		}
		else
		{
			this.name = "none";
		}
	}
	public double getCompletionTime() {
		return time;
	}
	public void setCompletionTime(double time) {
		if(time >= 0.0)
		{
			this.time = time;
		}
		else
		{
			this.time = 0.0;
		}
	}
	public String toString()
	{
		return "Process Name: " + getName() + " Completion Time: " + getCompletionTime();
	}
}
