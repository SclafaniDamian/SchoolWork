// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class Lab8 {
    private Scanner key;

    public void Lab8Main() {
		
		key = new Scanner(System.in);
		
		System.out.println("How many books have you purchased this month?");
		int books = key.nextInt();
		
		if(books < 0)
		{
			System.out.println("Invalid Number of Books! Shutting Down!");
			System.exit(0);
		}
		
		switch(books)
		{
		case 0:
			System.out.println("You currently have 0 points.");
			break;
		case 1:
			System.out.println("You currently have 5 points.");
			break;
		case 2:
			System.out.println("You currently have 15 points.");
			break;
		case 3:
			System.out.println("You currently have 30 points.");
			break;
		default:
			System.out.println("You currently have 60 points.");
			break;
		}
	}
}
