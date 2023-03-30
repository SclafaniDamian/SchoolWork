// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class Calculator {
    
    private Scanner key;
    private double result;
	private double precision = 0.000001;
	
	public Calculator()
	{
		this.result = 0.0;
	}
	
	public Calculator(double xResult)
	{
		this.setResult(xResult);
	}
	
	public double getResult()
	{
		return this.result;
	}
	
	public void setResult(double xResult)
	{
		this.result = xResult;
	}
	
	public void calculate()
	{
		key = new Scanner(System.in);
		
		boolean done = false;
		
		while(done == false)
		{
			System.out.println("Result = " + this.result);
			
			char op = key.next().charAt(0);
			
			if(op == 'E' || op == 'e')
			{
				System.out.println("Exiting Program!");
				done = true;
			}
			else
			{
				double num2 = key.nextDouble();
				
				try
				{
				this.result = evaluate(op, this.result, num2);
				}
				catch(UnknownOperatorException e)
				{
					System.out.println(e.getMessage());
				}
				catch(DivideByZeroException e)
				{
					System.out.println(e.getMessage());
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				finally
				{
					//code that always runs
				}
			}
		}
	}
	
	public double evaluate(char op, double num1, double num2) throws UnknownOperatorException, DivideByZeroException
	{
		double answer = 0;
		
		switch(op)
		{
		case '+':
			answer = num1 + num2;
			break;
		case '-':
			answer = num1 - num2;
			break;
		case '*':
			answer = num1 * num2;
			break;
		case '/':
			if(num2 < precision && num2 > - precision)
			{
				throw new DivideByZeroException();
			}
			else
			{
				answer = num1/num2;
			}
			break;
		default:
			throw new UnknownOperatorException();
		}
		
		return answer;
	}
	
	public double conversion(int num)
	{
		double number = num;
		
		return number;
	}
	
	public double conversion(String num)
	{
		double number = Double.parseDouble(num);
		
		return number;
	}
	
	public int cal(String num)
	{
		int s = Integer.parseInt(num);
		
		return s;
	}
}
