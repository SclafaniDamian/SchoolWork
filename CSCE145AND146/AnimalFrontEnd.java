// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class AnimalFrontEnd {
    private Scanner key;

    public void AnimalFrontEndMain() {
		
		key = new Scanner(System.in);
		
		AnimalCollection a = new AnimalCollection();
		
		boolean quit = false;
		
		while(quit == false)
		{
			System.out.println("Would you like to add an animal(1), remove an animal(2), or quit(3)");
			int response = key.nextInt();
			key.nextLine();
			
			switch(response)
			{
			case 1: //create
				System.out.println("Would you like to create a HouseCat(1), Leopard(2), Domestic Dog(3), or Wolf(4)?");
				int response2 = key.nextInt();
				key.nextLine();
				
				switch(response2)
				{
				case 1: //house cat
					System.out.println("Enter the name, weight, mood, and type of the house cat:");
					String name = key.nextLine();
					double weight = key.nextDouble();
					String mood = key.nextLine();
					String type = key.nextLine();
					key.nextLine();
					Animal cat = new HouseCat(name, weight, mood, type);
					a.AddAnimal(cat);
					break;
				case 2: //leopard
					System.out.println("Enter the name, weight, mood, and number of spots of the leopard:");
					name = key.nextLine();
					weight = key.nextDouble();
					mood = key.nextLine();
					int spots = key.nextInt();
					key.nextLine();
					Animal leop = new Leopard(name, weight, mood, spots);
					a.AddAnimal(leop);
					break;
				case 3: //domestic dog
					System.out.println("Enter the name, weight, energy level, and type of the domestic dog:");
					name = key.nextLine();
					weight = key.nextDouble();
					int energy = key.nextInt();
					type = key.nextLine();
					key.nextLine();
					Animal dog = new DomesticDog(name, weight, energy, type);
					a.AddAnimal(dog);
					break;
				case 4: //wolf
					System.out.println("Enter the name, weight, energy level, and name of pack leader for the wolf:");
					name = key.nextLine();
					weight = key.nextDouble();
					energy = key.nextInt();
					String pln = key.nextLine();
					key.nextLine();
					Animal wolf = new Wolf(name, weight, energy, pln);
					a.AddAnimal(wolf);
					break;
				default:
					System.out.println("INVALID");
				}
			case 2: //remove
				System.out.println("Do you want to remove a house cat(1), leopard(2), domestic dog(3), or wolf(4)?");
				response2 = key.nextInt();
				
				switch(response2)
				{
				case 1: //house cat
					System.out.println("Enter the name, weight, mood, and type of the house cat:");
					String name = key.nextLine();
					double weight = key.nextDouble();
					String mood = key.nextLine();
					String type = key.nextLine();
					key.nextLine();
					Animal catR = new HouseCat(name, weight, mood, type);
					a.removeAnimal(catR);
					break;
				case 2: //leopard
					System.out.println("Enter the name, weight, mood, and number of spots of the leopard:");
					name = key.nextLine();
					weight = key.nextDouble();
					mood = key.nextLine();
					int spots = key.nextInt();
					key.nextLine();
					Animal leopR = new Leopard(name, weight, mood, spots);
					a.removeAnimal(leopR);
					break;
				case 3: //domestic dog
					System.out.println("Enter the name, weight, energy level, and type of the domestic dog:");
					name = key.nextLine();
					weight = key.nextDouble();
					int energy = key.nextInt();
					type = key.nextLine();
					key.nextLine();
					Animal dogR = new DomesticDog(name, weight, energy, type);
					a.removeAnimal(dogR);
					break;
				case 4: //wolf
					System.out.println("Enter the name, weight, energy level, and name of pack leader for the wolf:");
					name = key.nextLine();
					weight = key.nextDouble();
					energy = key.nextInt();
					String pln = key.nextLine();
					key.nextLine();
					Animal wolfR = new Wolf(name, weight, energy, pln);
					a.removeAnimal(wolfR);
					break;
				default:
					System.out.println("INVALID");
				}
			case 3: //quit
				quit = true;
			}
			System.out.println(a.printAnimals());
		}
	}
}
