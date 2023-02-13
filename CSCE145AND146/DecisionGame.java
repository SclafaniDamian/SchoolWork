// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class DecisionGame {
    private Scanner key;

    public void game() {
		key = new Scanner(System.in);
        
		String contestant1Prize = "nothing";
		String contestant2Prize = "nothing";
		
		String chalkPrize = "a colored chalk";
		String pocketPrize = "a blue pen";
		String bagPrize = "a Post-it notes";
		
		System.out.println("Contestant 1: I will give you this colored chalk, would you like to keep it or trade it with what\'s in my pocket or what\'s in my bag? Enter \"keep\", \"pocket\", or \"bag\":");
		String response = key.next();
		
		if(response.equalsIgnoreCase("pocket"))
		{
			contestant1Prize = pocketPrize;
			
			System.out.println("Contestant 2 gets the colored chalk from Contestant 1");
			
			System.out.println("Contestant 2: Would you like to keep the colored chalk or trade it with what\'s in my bag? Enter \"keep\" or \"bag\":");
			response = key.next();
			
			if(response.equalsIgnoreCase("bag"))
			{
				contestant2Prize = bagPrize;
			}
			else if(response.equalsIgnoreCase("keep"))
			{
				contestant2Prize = chalkPrize;
			}
			else
			{
				System.out.println("You get nothing...");
			}
		}
		else if(response.equalsIgnoreCase("keep"));
		{
			contestant1Prize = chalkPrize;
			
			System.out.println("Contestant 2: Would you like to choose what\'s in my pocket or what\'s in my bag? Enter \"pocket\" or \"bag\":");
			response = key.next();
			
			if(response.equalsIgnoreCase("pocket"))
			{
				contestant2Prize = pocketPrize;
			}
			else if(response.equalsIgnoreCase("bag"))
			{
				contestant2Prize = bagPrize;
			}
			else
			{
				System.out.println("You get nothing");
			}
		}
		if(response.equalsIgnoreCase("bag"))
		{
			contestant1Prize = bagPrize;
			
			System.out.println("Contestant 2 gets the colored chalk.");
			
			System.out.println("Contestant 2: Would you like to keep the colored chalk or trade it with what\'s in my pocket? Enter \"keep\" or \"pocket\": ");
			response = key.next();
			
			if(response.equalsIgnoreCase("keep"))
			{
				contestant2Prize = chalkPrize;
			}
			else if(response.equalsIgnoreCase("pocket"))
			{
				contestant2Prize = pocketPrize;
			}
			else
			{
				System.out.println("you get nothing...");
			}
		}
		else
		{
			System.out.println("You get nothing you loser.");
		}
		
		System.out.println("Contestant 1 gets " + contestant1Prize + "\nContestant 2 gets " + contestant2Prize);
		
		
	}

}
