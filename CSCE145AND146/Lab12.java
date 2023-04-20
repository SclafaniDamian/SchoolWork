// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class Lab12 {
    private Scanner key;

    public void Lab12Main() {
		
		key = new Scanner(System.in);
		
		double sum = 0;
		
		double[] myArray = new double[7];
		
		//Entering values
		for(int i = 0; i < myArray.length; i++)
		{
			System.out.println("Enter the gas price(per gallon) on day " + (i+1) + ":");
			myArray[i] = key.nextDouble();
			sum += myArray[i];
		}
		
		//calculating the average gas price
		double average = sum / 7;
		
		System.out.println("The average for one gallon of gas during the last 7 days = " + average);
		
		//finding what days the price was above average
		System.out.println("The price was above average on:");
		for(int i = 0; i < myArray.length; i++)
		{
			if(myArray[i] > average)
			{
				System.out.println("Day " + (i+1) + ": " + myArray[i]);
			}
		}
		
	}
}
