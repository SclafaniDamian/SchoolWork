// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class TacoDemo {
    private Scanner key;

    public void TacoDemoMain() {
		
		key = new Scanner(System.in);
		
		TacosDB tdb = new TacosDB();
		
		System.out.println("Welcome to the Tacos Demo!");
		
		boolean quit = false;
		
		while(quit == false)
		{
			System.out.println("\nEnter 1 to add a taco \nEnter 2 to remove a taco \nEnter 3 to view the taco database \nEnter 9 to quit:");
			
			int userInput = key.nextInt();
			key.nextLine();
			
			switch(userInput)
			{
			case 1: //add taco
				System.out.println("Enter the name of the taco:");
				String name = key.nextLine();
				System.out.println("Enter taco price:");
				double price = key.nextDouble();
				key.nextLine();
				tdb.addTaco(name, price);
				break;
			case 2: //remove taco
				System.out.println("Enter taco name:");
				name = key.nextLine();
				System.out.println("Enter taco price:");
				price = key.nextDouble();
				key.nextLine();
				tdb.removeTaco(new Taco(name, price));
				break;
			case 3: //view taco DB
				System.out.println(tdb.toString());
				break;
			case 9: //quit
				quit = true;
				break;
			default:
				System.out.println("INVALID ENTRY");
			}
		}
	}
}
