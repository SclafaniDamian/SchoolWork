// Made By Damian Sclafani
package CSCE145AND146;

public class Ship {
    
    //instance variables
	private String name;
	private String launchDate;
	
	//default const.
	public Ship()
	{
		this.name = "unknown";
		this.launchDate = "11/04/2010";
	}
	
	//para. const.
	public Ship(String xName, String xLaunchDate)
	{
		this.setName(xName);
		this.setLaunchDate(xLaunchDate);
	}
	
	//accessors
	public String getName()
	{
		return this.name;
	}
	
	public String getLaunchDate()
	{
		return this.launchDate;
	}
	
	//mutators
	public void setName(String xName)
	{
		this.name = xName;
	}
	
	public void setLaunchDate(String xLaunchDate)
	{
		if(xLaunchDate.length() - 1 == 9)
		{
			if(xLaunchDate.substring(6).equals("1990")
				|| xLaunchDate.substring(6).equals("1991")
				|| xLaunchDate.substring(6).equals("1992")
				|| xLaunchDate.substring(6).equals("1993")
				|| xLaunchDate.substring(6).equals("1994")
				|| xLaunchDate.substring(6).equals("1995")
				|| xLaunchDate.substring(6).equals("1996")
				|| xLaunchDate.substring(6).equals("1997")
				|| xLaunchDate.substring(6).equals("1998")
				|| xLaunchDate.substring(6).equals("1999")
				|| xLaunchDate.substring(6).equals("2000")
				|| xLaunchDate.substring(6).equals("2001")
				|| xLaunchDate.substring(6).equals("2002")
				|| xLaunchDate.substring(6).equals("2003")
				|| xLaunchDate.substring(6).equals("2004")
				|| xLaunchDate.substring(6).equals("2005")
				|| xLaunchDate.substring(6).equals("2006")
				|| xLaunchDate.substring(6).equals("2007")
				|| xLaunchDate.substring(6).equals("2008")
				|| xLaunchDate.substring(6).equals("2009")
				|| xLaunchDate.substring(6).equals("2010")
				|| xLaunchDate.substring(6).equals("2011")
				|| xLaunchDate.substring(6).equals("2012")
				|| xLaunchDate.substring(6).equals("2013")
				|| xLaunchDate.substring(6).equals("2014")
				|| xLaunchDate.substring(6).equals("2015")
				|| xLaunchDate.substring(6).equals("2016")
				|| xLaunchDate.substring(6).equals("2017")
				|| xLaunchDate.substring(6).equals("2018")
				|| xLaunchDate.substring(6).equals("2019"))
			{
				this.launchDate = xLaunchDate;
			}
			else
			{
				System.out.println("INVALID LAUNCH DATE");
			}
		}
		else
		{
			System.out.println("INVALID LAUNCH DATE");
		}
	}
	
	//tostring
	public String toString()
	{
		return "Ship Name: " + this.name +
				"\nLaunch Date: " + this.launchDate;
	}
}
