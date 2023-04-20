// Made by Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class BoxSorter {
    private Scanner key;

    public void BoxSorterMain() {
		key = new Scanner(System.in);
		
		Box[] boxes = new Box[5];
		
		//inputs
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Enter the label for box #" + (i + 1));
			String label = key.nextLine();
			
			System.out.println("Enter the length, width, and height of the box.");
			double length = key.nextDouble();
			key.nextLine();
			double width = key.nextDouble();
			key.nextLine();
			double height = key.nextDouble();
			key.nextLine();
			boxes[i] = new Box(label, length, width, height);
		}
		
		//sorting
		for(int i = 0; i < boxes.length; i++)
		{
			double smallest = boxes[i].getVolume();
			int minIndex = i;
			double volumei = boxes[i].getVolume();
			
			for(int j = i+1; j < boxes.length; j++)
			{
				double volume = boxes[j].getVolume();
				if(volume < smallest)
				{
					smallest = boxes[j].getVolume();
					minIndex = j;
				}
			}
			
			if(smallest < volumei)
			{
				Box temp = boxes[i];
				boxes[i] = boxes[minIndex];
				boxes[minIndex] = temp;
			}
			
		}
		
		//print out boxes
		System.out.println("Sorted Boxes:");
		for(int k = 0; k < boxes.length; k++)
		{
			System.out.print(boxes[k] + "\n");
		}
		
		
	}
}
