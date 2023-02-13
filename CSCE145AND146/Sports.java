// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Random;

public class Sports {
    public static final int MAX = 5;

    public void sport() {
		
		System.out.println("Let the computer pick a sport to play");
		
		/*
		 * Basketball
		 * Frisbee
		 * Running Race
		 * Football
		 * Swimming Race
		 */
		
		String sports = "no sports selected";
		
		Random r = new Random();
		
		int choice = r.nextInt(MAX);	//0 1 2 3 4
		
		switch(choice)
		{
		case 0:
			sports = "Basketball";
			break;
		case 1:
			sports = "Frisbee";
			break;
		case 2:
			sports = "Running Race";
			break;
		case 3:
			sports = "Football";
			break;
		case 4:
			sports = "Swimming Race";
			break;
		default:
			sports = "Invalid sports option selected";
		}
		
		System.out.println("The computer picked " + sports);
		
	}
}
