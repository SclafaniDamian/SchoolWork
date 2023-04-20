// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class AppleTester {
    private Scanner key;

    public void testApple() {
        key = new Scanner(System.in);
		
		Apple a1 = new Apple();
		
		System.out.println("Printing default values.");
		System.out.println(a1.toString());
		
		Apple a2 = new Apple();
		
		System.out.println("Enter the type for the second apple:");
		String type2 = key.nextLine();
		a2.setType(type2);
		
		System.out.println("Enter the weight for the second apple:");
		double weight2 = key.nextDouble();
		a2.setWeight(weight2);
		
		System.out.println("Enter the price for the second apple:");
		double price2 = key.nextDouble();
		a2.setPrice(price2);
		
		System.out.println(a2.toString());
		
		Apple a3 = new Apple();
		
		key.nextLine();
		
		System.out.println("Enter the type for the third apple:");
		String type3 = key.nextLine();
		a3.setType(type3);
		
		System.out.println("Enter the weight for the third apple:");
		double weight3 = key.nextDouble();
		a3.setWeight(weight3);
		
		System.out.println("Enter the price for the third apple:");
		double price3 = key.nextDouble();
		a3.setPrice(price3);
		
		System.out.println(a3.toString());
    }
}
