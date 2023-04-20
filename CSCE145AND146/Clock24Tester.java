// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class Clock24Tester {
    private Scanner key;

    public void Clock24TesterMain() {

		Clock24 clock = new Clock24();
		key = new Scanner(System.in);
		
		boolean quit = false;
		while(quit == false)
		{
			//Prompt the user
			System.out.println("Enter a time in the 24-hour notation or enter \"Exit\" to quit:");
			//Gets the user input
			String input = key.nextLine();
			if(input.equalsIgnoreCase("exit"))
			{
				System.out.println("Goodbye!");
				break;
			}
			try
			{
				clock.setTime(input);
				clock.printTime();
			}
			catch(TimeFormatException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
}
