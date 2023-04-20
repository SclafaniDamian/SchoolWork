// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class DrawABox {
    private Scanner key;

    public void DrawABoxMain() {
		
		key = new Scanner(System.in);
		
		System.out.println("Enter the height of the box:");
		
		int height = key.nextInt();
		
		System.out.println("Enter the width of the box:");
		
		int width = key.nextInt();
		
		for(int i = 0; i < height; i++)
		{
			for(int j = 0; j < width; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
