// Made By Damian Sclafani
package CSCE145AND146;

public class UnknownOperatorException extends Exception{
	
	public UnknownOperatorException()
	{
		super("Unknown operator found!");
	}
	
	public UnknownOperatorException(String msg)
	{
		super(msg);
	}

}
