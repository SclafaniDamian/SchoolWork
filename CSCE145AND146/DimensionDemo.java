// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class DimensionDemo {
    private Scanner key;

    public void DimensionDemoMain() {

		key = new Scanner(System.in);
		
		System.out.println("Enter a value in inches:");
		double inches = key.nextDouble();
		
		System.out.println(inches+ " inches = " + DimensionConverter.InchesToFeet(inches) + " feet");
		
		System.out.println("Enter a value in feet:");
		double feet = key.nextDouble();
		
		System.out.println(feet + " feet = " + DimensionConverter.FeetToInches(feet) + " inches");
	}
}
