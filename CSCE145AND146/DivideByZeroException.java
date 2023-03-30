// Made By Damian Sclafani
package CSCE145AND146;

public class DivideByZeroException extends Exception{
	
	public DivideByZeroException()
	{
		super("Cannot divide by zero!");
	}

	public DivideByZeroException(String msg)
	{
		super(msg);
	}
}
