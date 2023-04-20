// Made By Damian Sclafani
package CSCE145AND146;
//import java.util.Scanner;

public class Clock24 {
    
    private int hours;
	private int minutes;
	private boolean isAM;
	
	public Clock24()
	{
		this.hours = 0;
		this.minutes = 0;
		this.isAM = true;
	}
	
	public Clock24(int xHours, int xMinutes)
	{
		this.setHours(xHours);
		this.setMinutes(xMinutes);
	}
	
	public int getHours()
	{
		return this.hours;
	}
	
	public int getMinutes()
	{
		return this.minutes;
	}
	
	public boolean getIsAM()
	{
		return this.isAM;
	}
	
	public void setHours(int xHours)
	{
		if((xHours >= 0) && (xHours <= 24))
		{
			this.hours = xHours;
		}
		else
		{
			System.out.println("Invalid hours entered!");
		}
	}
	
	public void setMinutes(int xMinutes)
	{
		if((xMinutes >= 0) && (xMinutes < 60))
		{
			this.minutes = xMinutes;
		}
		else
		{
			System.out.println("Invalid minutes entered!");
		}
	}
	
	public void setIsAM(boolean xIsAM)
	{
		this.isAM = xIsAM;
	}
	
	
	public void setTime(int xHours, int xMinutes) throws TimeFormatException
	{
		if(xHours >= 12 && xHours < 24)
		{
			this.hours = xHours % 12;
			this.isAM = false;
		}
		else if(xHours < 12 && xHours > 0)
		{
			this.hours = xHours;
			this.isAM = true;
		}
		else if(xHours == 0)
		{
			this.hours = 12;
			this.isAM = true;
		}
		else
		{
			throw new TimeFormatException();
		}
		if(xMinutes < 60 && xMinutes >= 0)
		{
			this.minutes = xMinutes;
		}
		else
		{
			throw new TimeFormatException();
		}
	}
	
	
	public void setTime(String time) throws TimeFormatException
	{
		try {
			int colon = time.indexOf(":");
			String hr = time.substring(0,colon);
			String min = time.substring(colon + 1);
			int hour = Integer.parseInt(hr);
			int minute = Integer.parseInt(min);
			this.setTime(hour, minute);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
		
	public void printTime()
	{
		System.out.print(this.hours + ":");
		if(this.minutes < 10)
		{
			System.out.print("0" + this.minutes + " ");
		}
		else
		{
			System.out.print(this.minutes + " ");
		}
		if(this.isAM == true)
		{
			System.out.print("AM");
		}
		else
		{
			System.out.print("PM");
		}
		System.out.println();
	}
}
