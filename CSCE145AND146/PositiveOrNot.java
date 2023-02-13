// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class PositiveOrNot {
    private Scanner key;

    public void PosOrNot() {
		
		key = new Scanner(System.in);
		
		System.out.println("Enter a non-zero integer:");
		
		int num = key.nextInt();
		
		if(num > 0)
		{
			//if-block
			System.out.println(num + " is positive!");
		}
		else
		{
			//else-block
			System.out.println(num + " is negative!");
		}

	}
}
