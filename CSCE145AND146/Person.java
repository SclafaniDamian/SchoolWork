// Made By Damian Sclafani
package CSCE145AND146;

public class Person {
    
    //instance variables
	private String name;
	private int age;
	
	//default constructor
	public Person()
	{
		this.name = "no name yet";
		this.age = 0;
	}
	
	//parameterized constructor
	public Person(String xName, int xAge)
	{
		this.setName(xName);
		this.setAge(xAge);
	}
	
	//accessors
	public String getName()
	{
		return this.name;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	//mutators
	public void setName(String xName)
	{
		this.name = xName;
	}

	public void setAge(int xAge)
	{
		if(xAge > 0)
		{
			this.age = xAge;
		}
		else
		{
			System.out.println("ERROR");
		}
	}
	
	public void writeOutput()
	{
		System.out.println("Name: " + this.name + "\nAge: " + this.age);
	}
}
