// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private Scanner key;

    public void RPS() {
        key = new Scanner(System.in);
		
		String response = "";
		String playAgain = "";
		
		System.out.println("Play rock, paper, scissors with the computer!");
		
		do
		{
			int computerPoint = 0;
			int userPoint = 0;
			
			for(int i = 0; i < 3; i++)
			{
				System.out.println("Rock, Paper, Scissors!");
				response = key.nextLine();
				
				Random r = new Random();
				
				int computer = r.nextInt(3);
				
				/* rock = 0
				 * paper = 1
				 * scissors = 2
				 */ 
				
				if((computer == 0) && (response.equalsIgnoreCase("paper")))
				{
					System.out.println("Paper vs Rock: User wins!");
					userPoint++;
				}
				else if((computer == 0) && (response.equalsIgnoreCase("rock")))
				{
					System.out.println("Rock vs Rock: Tie!");
				}
				else if((computer == 0) && (response.equalsIgnoreCase("Scissors")))
				{
					System.out.println("Scissors vs Rock: Computer wins!");
					computerPoint++;
				}
				else if((computer == 1) && (response.equalsIgnoreCase("paper")))
				{
					System.out.println("Paper vs Paper: Tie!");
				}
				else if((computer == 1) && (response.equalsIgnoreCase("Rock")))
				{
					System.out.println("Rock vs Paper: Computer Wins!");
					computerPoint++;
				}
				else if((computer == 1) && (response.equalsIgnoreCase("Scissors")))
				{
					System.out.println("Scissors vs Paper: User Wins!");
					userPoint++;
				}
				else if((computer == 2) && (response.equalsIgnoreCase("paper")))
				{
					System.out.println("Paper vs Scissors: Computer Wins!");
					computerPoint++;
				}
				else if((computer == 2) && (response.equalsIgnoreCase("rock")))
				{
					System.out.println("Rock vs Scissors: User Wins!");
					userPoint++;
				}
				else if((computer == 2) && (response.equalsIgnoreCase("scissors")))
				{
					System.out.println("Scissors vs Scissors: Tie!");
				}
				else
				{
					System.out.println("Invalid response! Computer Wins!");
					computerPoint++;
				}
				
			}
			
			System.out.println("You won " + userPoint + " times and the computer won " + computerPoint + " times.");
			if(userPoint > computerPoint)
			{
				System.out.println("User Wins!");
			}
			else if(computerPoint > userPoint)
			{
				System.out.println("Computer Wins!");
			}
			else
			{
				System.out.println("Tie!");
			}
			
			System.out.println("Type \"yes\" if you want to play again.");
			playAgain = key.nextLine();
			
		}while(playAgain.equalsIgnoreCase("yes"));
		
	}
}
