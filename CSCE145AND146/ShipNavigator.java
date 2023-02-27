// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class ShipNavigator {
    private Scanner key;

    public void ShipNavigatorMain() {
		
		key = new Scanner(System.in);
		
		String response = "yes";
		
		do
		{
			System.out.println("Creating new Ship!");
			System.out.println();
			
			System.out.println("What is the name of this ship?");
			String name = key.nextLine();
			
			System.out.println("What is the launch date of the ship? (00/00/0000)");
			String launch = key.nextLine();
			if(launch.length() - 1 != 9)
			{
				launch = "11/04/2010";
			}
			
			System.out.println("Type 1 for cruise ship: \nType 2 for cargo ship:");
			int type = key.nextInt();
			key.nextLine();
			
			if(type == 1)
			{
				System.out.println("What is the passenger capacity?");
				int capacity = key.nextInt();
				key.nextLine();
				
				System.out.println("What is the number of crew members?");
				int crew = key.nextInt();
				key.nextLine();
				
				CruiseShip c1 = new CruiseShip(name, launch, capacity, crew);
				System.out.println(c1.toString());
			}
			else if(type == 2)
			{
				System.out.println("What is the tonnage?");
				double tonnage = key.nextDouble();
				key.nextLine();
				
				System.out.println("What is the maximum speed(mph)?");
				double speed = key.nextDouble();
				
				CargoShip c2 = new CargoShip(name, launch, tonnage, speed);
				System.out.println(c2.toString());
			}
			else
			{
				System.out.println("INVALID VALUE FOR SHIP ENTERED");
			}
			
			System.out.println();
			System.out.println("Type yes if you would like to create another ship:");
			response = key.nextLine();
			
		}while(response.equalsIgnoreCase("yes"));
	}
}
