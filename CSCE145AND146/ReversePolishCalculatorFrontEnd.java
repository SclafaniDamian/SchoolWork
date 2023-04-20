// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class ReversePolishCalculatorFrontEnd {
    private Scanner keyboard;

    public void ReversePolishCalculatorFrontEndMain() {
		// TODO Auto-generated method stub
		keyboard = new Scanner(System.in);
		ReversePolishCalculator rpCal = new ReversePolishCalculator();
		boolean quit = false;
		while(quit == false)
		{
			System.out.println("Enter a reverse polish expression or \"quit\" to quit");
			String input = keyboard.nextLine();
			if(input.equalsIgnoreCase("quit"))
			{
				System.out.println("Goodbye");
				break;
			}
			System.out.println(rpCal.calculate(input));
		}
			
	}
}
