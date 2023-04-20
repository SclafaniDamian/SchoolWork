// Made by Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class CoffeeTester {
    private Scanner key;

    public void CoffeeTesterMain() {
		
		key = new Scanner(System.in);
		
		//Coffee #1
		System.out.println("Enter the name of the first coffee:");
		String name1 = key.nextLine();
		
		System.out.println("Enter the caffine amount for the first coffee:");
		int caffine1 = key.nextInt();
		
		Coffee c1 = new Coffee(name1, caffine1);
		
		key.nextLine();
		
		//Coffee #2
		System.out.println("Enter the name of the second coffee:");
		String name2 = key.nextLine();
		
		System.out.println("Enter the caffine amount for the second coffee:");
		int caffine2 = key.nextInt();
		
		Coffee c2 = new Coffee(name2, caffine2);
		
		System.out.println(c1.toString());
		
		System.out.println(c2.toString());
	}
}
