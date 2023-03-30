// Made By Damian Sclafani
package CSCE145AND146;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FruitTreeTester {
    private Scanner keyboard;

    public void FruitTreeTesterMain() {
		keyboard = new Scanner(System.in);
		System.out.println("Enter the fruit file name: ");
		System.out.println("\tExample File: ./fruitFile.txt");
		String fileName = keyboard.nextLine();
		LinkedBST<Fruit> bst = new LinkedBST<Fruit>();
		Fruit[] fruit = readFile(fileName);//creates a new array with the values from the file
		for(int i = 0; i < fruit.length; i++)//adds each value in the array to the binary tree
			bst.add(fruit[i]);
		System.out.println("Printing Preorder!");
		bst.printPreorder();
		System.out.println();
		System.out.println("Printing Inorder!");
		bst.printInorder();
		System.out.println();
		System.out.println("Printing Postorder!");
		bst.printPostorder();
		System.out.println();
		System.out.println("Enter the fruit name you want to remove:");
		String type = keyboard.nextLine();
		System.out.println("Enter the weight of the fruit you want to remove:");
		double weight = keyboard.nextDouble();
		keyboard.nextLine();
		Fruit f = new Fruit(type,weight);//puts the values the user entered as a new Fruit
		bst.remove(f);//removes the new Fruit
		System.out.println("Printing out Inorder with the Fruit removed!");
		bst.printInorder();
	}
	public static Fruit[] readFile(String fileName)
	{
		try
		{
			//Creates a scanner for the file and then first counts each word
			Scanner fileScanner = new Scanner(new File(fileName));
			int wordCount = 0;
			while(fileScanner.hasNextLine())
			{
				fileScanner.nextLine();
				wordCount++;
			}
			if(wordCount <= 0)
				return null;
			//Creates the return array, resets the file scanner, and populates the array
			Fruit[] retArr = new Fruit[wordCount];
			fileScanner = new Scanner(new File(fileName));
			for(int i=0;i<retArr.length;i++)
			{
				if(!fileScanner.hasNextLine())
					break;
				String type = fileScanner.next();
				double weight = Double.parseDouble(fileScanner.next());
				Fruit fruit = new Fruit(type,weight);
				retArr[i] = fruit;
			}
			return retArr;
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}
}
