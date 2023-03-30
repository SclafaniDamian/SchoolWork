// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class EvenInList {
    private Scanner key;

    public void EvenInListMain() {
		
		key = new Scanner(System.in);
		
		System.out.println("Enter the lower bound of a range of numbers:");
		int lower = key.nextInt();
		
		System.out.println("Enter the upper bound of a range of numbers:");
		int upper = key.nextInt();
		
		//for loop
		
		for(int i = lower; i <= upper; i++)
		{
			if(i%2 == 0)
			{
				System.out.print(i+" ");
			}
			
		}
	}
}
