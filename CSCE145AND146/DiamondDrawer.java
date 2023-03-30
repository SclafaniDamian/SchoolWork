// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class DiamondDrawer {
    private Scanner key;

    public void DiamondDrawerMain() {
		System.out.println("Welcome to the diamond drawer!");
		key = new Scanner(System.in);
		
		//Prompt the user
		System.out.println("Enter the diamond size:");
		int width = key.nextInt();

		System.out.println("Enter the offset:");
		int offset = key.nextInt();
			
		if(width > 0 && offset >= 0)
		{
			//Draw the diamond
			Diamond d = new Diamond(offset, width);
			d.drawHere();
		}
		else
		{	
			System.out.println("Invalid input entered! Goodbye!");
		}
	}
}
