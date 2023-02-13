// Made By Damian Sclafani
package CSCE145AND146;

import java.util.Scanner;

public class ProductsDemo {
    private Scanner key;

    public void ProductsDemoMain() {
		
		//create first object
		Products p1 = new Products();
		
		System.out.println("First object values: \n" + p1.toString());
		
		//create a second object
		Products p2 = new Products(1200, "Laptop", 2);
		
		System.out.println("Second object values: \n" + p2.toString());
		
		//create a third object
		Products p3 = new Products(p2);
		
		System.out.println("Third object values: \n" + p3.toString());
		
		if(p2.equals(p3))
		{
			System.out.println("Objects p2 and p3 are equal!");
		}
		else
		{
			System.out.println("Objects p2 and p3 are not equal!");
		}
		
		System.out.println("Total cost: $" + p2.totalCost());
		
		System.out.println("Enter the new price of the laptop:");
		
		key = new Scanner(System.in);
		double newPrice = key.nextDouble();
		
		System.out.println("Total Cost: $" + p2.totalCost(newPrice));
		
		System.out.println("Enter the latest price of the laptop:");
		
		double latestPrice = key.nextDouble();
		
		System.out.println("Enter the count of laptops:");
		
		int laptopCount = key.nextInt();
		
		System.out.println("Total cost using the 3rd overloaded method: " + p2.totalCost(latestPrice, laptopCount));
	}
}
