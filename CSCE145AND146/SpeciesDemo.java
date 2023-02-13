// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class SpeciesDemo {
    private Scanner key;

    public void SpeciesDemoMain() {
		
		//create an object of type Species
		Species sp1 = new Species();
		
		sp1.readInput();
		sp1.writeOutput();
		int futurePopulationIn10 = sp1.getPopulationIn10();
		System.out.println("Population in 10 years: " + futurePopulationIn10);
		
		key = new Scanner(System.in);
		
		System.out.println("Enter the number of years for which you would like to forecast the population growth:");
		int years = key.nextInt();
		
		int futurePopulation = sp1.getPopulationGrowth(years);
		
		System.out.println("Future population in " + years + " years = " + futurePopulation);
		
		Species sp2 = new Species();
		
		sp2.name = "Killer Whale";
		sp2.foodSource = "Shrimp";
		sp2.population = 200;
		sp2.growthRate = 1.7;
		
		sp2.writeOutput();
		
	}
}
