// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class EvenOrNot {
    private Scanner key;

    public void evenornot() {
		key = new Scanner(System.in);
        
		System.out.println("Enter a number:");
		
		int num = (int) key.nextDouble();
		
		//check if number is even or not
		if(num%2 == 0)
		{
			System.out.println(num + " is even!");
		}
		else
		{
			System.out.println(num + " is odd!");
		}
		
	}
}
