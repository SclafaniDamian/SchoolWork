// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class DriversLicenseEligibility {
    public static final int MIN_AGE = 16;
    private Scanner key;

    public void dle() {
		key = new Scanner(System.in);
        
		System.out.println("Enter your age:");
		
		int age = key.nextInt();
		
		//input validation
		if(age <= 0)
		{
			System.out.println("Invalid age entered! Exiting the program!");
			System.exit(0);		//quits the program
		}
		
		//comparing the user's age to the min-age requirement
		if(age >= MIN_AGE)
		{
			System.out.println("You are eligible for a driver\'s license!");
		}
		else
		{
			int waitTime = MIN_AGE - age;
			System.out.println("You will have to wait for another " + waitTime + " years to get a driver\'s license");
		}
		

	}
}
