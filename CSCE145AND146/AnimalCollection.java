// Made By Damian Sclafani
package CSCE145AND146;

public class AnimalCollection {
    
    private Animal[] animals;
	
	public AnimalCollection()
	{
		animals = new Animal[5];
	}
	
	public void AddAnimal(Animal cat)
	{
		for(int i = 0; i < animals.length; i++)
		{
			if(animals[i] == null)
			{
				animals[i] = cat;
				break;
			}
			else if((i + 1 == animals.length))
			{
				System.out.println("Cannot add animals, array is full!");
			}
		}
	}
	
	public void removeAnimal(Animal a)
	{
		for(int i = 0; i < animals.length; i++)
		{
			if(animals[i] != null && animals[i].equals(a))
			{
				animals[i] = null;
				break;
			}
			else if((i + 1) == animals.length)
			{
				System.out.println("Cannot find animal!");
			}
		}
	}
	
	public String printAnimals()
	{
		System.out.println("Animals currently in");
		String result = "";
		
		for(int i = 0; i < animals.length; i++)
		{
			if(animals[i] != null)
			{
				result += animals[i].toString() + "\n";
			}
		}
		
		return result;

	}
}
