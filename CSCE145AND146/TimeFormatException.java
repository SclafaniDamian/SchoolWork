// Made By Damian Sclafani
package CSCE145AND146;

public class TimeFormatException extends Exception{

	public TimeFormatException()
	{
		super("This is an incorrect time!");
	}
	
	public TimeFormatException(String msg)
	{
		super(msg);
	}
}
