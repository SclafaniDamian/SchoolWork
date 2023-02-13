// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class Species {
    public String name;
	public String foodSource;
	public int population;
	public double growthRate;
    private Scanner key;
	
	//storing user input
	public void readInput()
	{
		key = new Scanner(System.in);
		
		System.out.println("Enter the name of the species:");
		name = key.nextLine();
		
		System.out.println("Enter food source:");
		foodSource = key.nextLine();
		
		System.out.println("Enter species population:");
		population = key.nextInt();
		
		System.out.println("Enter the annual growth rate(%):");
		growthRate = key.nextDouble();
		
	}
	
	/*
	 * Pre-condition: The calling object contains values
	 * Post-condition: The values are displayed on the console
	 */
	
	public void writeOutput()
	{
		System.out.println("Species Name: " + name);
		System.out.println("Food Sources: " + foodSource);
		System.out.println("Population: " + population);
		System.out.println("Annual Growth Rate: " + growthRate + "%");
		
	}
	
	public int getPopulationIn10()
	{
		int result = 0;
		int count = 10;
		double populationAmount = population;
		
		for(count = 10; 0 < count && populationAmount > 0; count--)
		{
			populationAmount += populationAmount * (growthRate/100);
		}
		
		if(populationAmount > 0)
		{
			result = (int)populationAmount;
		}
		
		return result;
	}
	
	public int getPopulationGrowth(int years)
	{
		int result = 0;
		// int count = years;
		double populationAmount = population;
		
		while(years > 0 && populationAmount > 0)
		{
			populationAmount += populationAmount * (growthRate/100);
            years--;
		}
		
		if(populationAmount > 0)
		{
			result = (int)populationAmount;
		}
		
		return result;
	}
}
