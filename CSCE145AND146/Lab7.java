// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class Lab7 {
    private Scanner key;

    public void Lab7Main() {
		
		key = new Scanner(System.in);
		
		System.out.println("Enter your birth year:");
		int birthYear = key.nextInt();
		
		int symbol = birthYear - 1924;
		String zodSymbol = "nothing";
		String element = "nothing";
		
		if(birthYear < 1924)
		{
			System.out.println("Invaliad birth year! Exiting program!");
			System.exit(0);
		}
		
		if(symbol % 12 == 0)
		{
			zodSymbol = "Rat";
		}
		else if(symbol % 12 == 1)
		{
			zodSymbol = "Ox";
		}
		else if(symbol % 12 == 2)
		{
			zodSymbol = "Tiger";
		}
		else if(symbol % 12 == 3)
		{
			zodSymbol = "Rabbit";
		}
		else if(symbol % 12 == 4)
		{
			zodSymbol = "Dragon";
		}
		else if(symbol % 12 == 5)
		{
			zodSymbol = "Snake";
		}
		else if(symbol % 12 == 6)
		{
			zodSymbol = "Horse";
		}
		else if(symbol % 12 == 7)
		{
			zodSymbol = "Goat";
		}
		else if(symbol % 12 == 8)
		{
			zodSymbol = "Monkey";
		}
		else if(symbol % 12 == 9)
		{
			zodSymbol = "Rooster";
		}
		else if(symbol % 12 == 10)
		{
			zodSymbol = "Dog";
		}
		else if(symbol % 12 == 11)
		{
			zodSymbol = "Pig";
		}
		
		if(zodSymbol.equals("Tiger") || zodSymbol.equals("Rabbit"))
		{
			element = "Wood";
		}
		else if(zodSymbol.equals("Snake") || zodSymbol.equals("Horse"))
		{
			element = "Fire";
		}
		else if(zodSymbol.equals("Ox") || zodSymbol.equals("Dragon") || zodSymbol.equals("Goat") || zodSymbol.equals("Dog"))
		{
			element = "Earth";
		}
		else if(zodSymbol.equals("Monkey") || zodSymbol.equals("Rooster"))
		{
			element = "Metal";
		}
		else if(zodSymbol.equals("Pig") || zodSymbol.equals("Rat"))
		{
			element = "Water";
		}
		
		System.out.println("You are a(n) " + element + " " + zodSymbol);
	}
}
