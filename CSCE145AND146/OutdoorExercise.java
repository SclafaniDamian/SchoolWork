// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class OutdoorExercise {
    private Scanner key;

    public void outdoors() {
		key = new Scanner(System.in);
		
		System.out.println("Enter today\'s temperature (in Fahrenheit):");
		
		int temperature = key.nextInt();
		
		//-144 F to +134 F
		//0 F to 32 F = cold
		//76 F to 110 F = hot
		//33 F to 75 F = ideal temp
		
		if(temperature < -144 || temperature > 134 )
		{
			System.out.println("Invalid temperature entered for Earth!");
			System.exit(0);
		}
		else if(temperature >= 0 && temperature < 33)
		{
			System.out.println("Temperature is too cold!");
		}
		else if(temperature >= 33 && temperature < 76)
		{
			System.out.println("Ideal weather to exersice outdoors!");
		}
		else if(temperature >= 76 && temperature < 111)
		{
			System.out.println("Temperature is too hot!!!");
		}
		else
		{
			System.out.println("Temperature is not suitable for outdoor activity!");
		}
		
	}
}
