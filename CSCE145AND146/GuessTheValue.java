// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Random;
import java.util.Scanner;

public class GuessTheValue {
    public static final int VAL = 50;
    private Scanner key;

    public void GuessTheValueMain() {
		
		key = new Scanner(System.in);
		
		Random r = new Random();
		
		int secretNumber = r.nextInt(VAL) + 1;
		
		//0 to 49
		//0+1	TO	49+1
		//1 to 50
		
		System.out.println("I will pick a number between 1 and 50, can you guess the value? \nEnter your guess:");
		
		int guess = key.nextInt();
		
		boolean correctGuess = false;
		
		while(correctGuess == false)
		{
			//body of the while loop
			if(guess < secretNumber)
			{
				System.out.println("Your guess is too low! Pick a larger value!");
			}
			else if(guess > secretNumber)
			{
				System.out.println("Your guess is too high! Pick a smaller value!");
			}
			else
			{
				System.out.println("You guessed the secret number!");
				correctGuess = true;
			}
				
			guess = key.nextInt();
		}
		
	}
}
