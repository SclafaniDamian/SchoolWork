// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class SelectionSort {
    private Scanner key;

    public void SelectionSortMain() {
		
		key = new Scanner(System.in);
		
		System.out.println("How many numbers would you like to sort?");
		
		int size = key.nextInt();
		
		double[] myArray = new double[size];
		
		for(int i = 0; i < myArray.length; i++)
		{
			System.out.println("Enter the array value at index " + i + ":");
			myArray[i] = key.nextDouble();
		}
		
		//selection sort
		for(int i = 0; i < myArray.length; i++)
		{
			double smallest = myArray[i];
			int minIndex = i;
			
			for(int j = i+1; j < myArray.length; j++)
			{
				if(myArray[j] < smallest)
				{
					smallest = myArray[j];
					minIndex = j;
				}
			}
			
			if(smallest < myArray[i])
			{
				double temp = myArray[i];
				myArray[i] = myArray[minIndex];
				myArray[minIndex] = temp;
			}
		}
		
		//printing the final sorted array
		
		for(int k = 0; k < myArray.length; k++)
		{
			System.out.print(myArray[k] + " ");
		}
	}
}
