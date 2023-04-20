// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class Lab11 {
    private Scanner key;

    public void Lab11Main() {
		
		key = new Scanner(System.in);
		
		System.out.println("Enter the height of the triangle:");
		int height = key.nextInt();
		
		if(height < 1)
		{
			System.exit(0);
		}
		
		//upper half of triangle
		for(int i = 1; i <= height; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//lower half of triangle
		for(int i = height - 1; i != 0; i--)
		{
			for(int j = i; j != 0; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("End of program!");
		
	}
}
