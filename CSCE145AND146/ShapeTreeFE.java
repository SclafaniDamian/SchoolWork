// Made By Damian Sclafani
package CSCE145AND146;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ShapeTreeFE {
    private Scanner keyboard;

    public void ShapeTreeFEMain() {
		
        keyboard = new Scanner(System.in);
		LinkedBST<Shape> bst = new LinkedBST<Shape>();
		System.out.println("Enter the name of the shape file you want to enter:");
		System.out.println("\tExample File: ./exampleShapeFile.txt");
		String fileName = keyboard.nextLine();
		Shape[] shape = readFile(fileName);//reads the file and puts it into an array
		System.out.println("Adding the file input to the binary tree.");
		for(int i = 0; i < shape.length; i++)//adding the file input to the binary tree
		{
			if(shape[i] != null)//checking for any invalid values
				bst.add(shape[i]);
		}	
		boolean quit = false;
		while(!quit)
		{
			System.out.println("Enter the number for what you want to do:");
			System.out.println("\t(0) Quit");
			System.out.println("\t(1) Print Preorder");
			System.out.println("\t(2) Print Inorder");
			System.out.println("\t(3) Print Postorder");
			System.out.println("\t(4) Add a shape");
			System.out.println("\t(5) Remove a shape");
			System.out.println("\t(6) Search for a shape");
			System.out.println("\t(7) Find shape with maximum area");
			System.out.println("\t(8) Remove ALL shapes with an area greater than an entered area");
			System.out.println("\t(9) Write the current information as a new file");
			int input = keyboard.nextInt();
			keyboard.nextLine();
			switch(input)
			{
			case 0://quit
				System.out.println("Goodbye");
				quit = true;
				break;
			case 1://print preorder
				bst.printPreorder();
				break;
			case 2://print inorder
				bst.printInorder();
				break;
			case 3://print postorder
				bst.printPostorder();
				break;
			case 4://add shape
				System.out.println("Enter the type of shape you want to add:");
				String name = keyboard.nextLine();
				if(name.equals("Circle"))
				{
					System.out.println("Enter the radius of the circle:");
					double radius = keyboard.nextDouble();
					keyboard.nextLine();
					Shape c = new Circle(name,radius);
					bst.add(c);
				}
				else if(name.equals("Right Triangle"))
				{
					System.out.println("Enter the base of the right triangle:");
					double base = keyboard.nextDouble();
					keyboard.nextLine();
					System.out.println("Enter the height of the right triangle:");
					double height = keyboard.nextDouble();
					keyboard.nextLine();
					Shape rt = new RightTriangle(name,base,height);
					bst.add(rt);
				}
				else if(name.equals("Rectangle"))
				{
					System.out.println("Enter the length of the rectangle:");
					double length = keyboard.nextDouble();
					keyboard.nextLine();
					System.out.println("Enter the width of the rectangle:");
					double width = keyboard.nextDouble();
					keyboard.nextLine();
					Shape r = new Rectangle2(name,length,width);
					bst.add(r);
				}
				else
				{
					System.out.println("Invalid name entered!");
				}
				break;
			case 5://remove shape
				System.out.println("Enter the type of shape you want to remove:");
				String removeName = keyboard.nextLine();
				if(removeName.equals("Circle"))
				{
					System.out.println("Enter the radius of the circle:");
					double radius = keyboard.nextDouble();
					keyboard.nextLine();
					Shape c = new Circle(removeName,radius);
					bst.remove(c);
				}
				else if(removeName.equals("Right Triangle"))
				{
					System.out.println("Enter the base of the right triangle:");
					double base = keyboard.nextDouble();
					keyboard.nextLine();
					System.out.println("Enter the height of the right triangle:");
					double height = keyboard.nextDouble();
					keyboard.nextLine();
					Shape rt = new RightTriangle(removeName,base,height);
					bst.remove(rt);
				}
				else if(removeName.equals("Rectangle"))
				{
					System.out.println("Enter the length of the rectangle:");
					double length = keyboard.nextDouble();
					keyboard.nextLine();
					System.out.println("Enter the width of the rectangle:");
					double width = keyboard.nextDouble();
					keyboard.nextLine();
					Shape r = new Rectangle2(removeName,length,width);
					bst.remove(r);
				}
				else
				{
					System.out.println("Invalid name entered!");
				}
				break;
			case 6://search for shape
				System.out.println("Enter the name of the shape you want to search for:");
				String searchName = keyboard.nextLine();
				if(searchName.equals("Circle"))
				{
					System.out.println("Enter the radius of the circle:");
					double radius = keyboard.nextDouble();
					keyboard.nextLine();
					Shape c = new Circle(searchName,radius);
					System.out.println(bst.search(c));
				}
				else if(searchName.equals("Right Triangle"))
				{
					System.out.println("Enter the base of the right triangle:");
					double base = keyboard.nextDouble();
					keyboard.nextLine();
					System.out.println("Enter the height of the right triangle:");
					double height = keyboard.nextDouble();
					keyboard.nextLine();
					Shape rt = new RightTriangle(searchName,base,height);
					System.out.println(bst.search(rt));
				}
				else if(searchName.equals("Rectangle"))
				{
					System.out.println("Enter the length of the rectangle:");
					double length = keyboard.nextDouble();
					keyboard.nextLine();
					System.out.println("Enter the width of the rectangle:");
					double width = keyboard.nextDouble();
					keyboard.nextLine();
					Shape r = new Rectangle2(searchName,length,width);
					System.out.println(bst.search(r));
				}
				else
				{
					System.out.println("Invalid name entered!");
				}
				break;
			case 7://find maximum area
				System.out.println(bst.findMaxArea());
				break;
			case 8://remove all shapes with an area greater than the amount entered
				System.out.println("Enter an area. All shapes in the tree with an area greater than the data entered will be removed.");
				double data = keyboard.nextDouble();
				keyboard.nextLine();
				Shape decoy = new Rectangle2("Rectangle", data/2, 2);
				bst.removeShapesGreaterThan(decoy);
				break;
			case 9://writes a new file with the current information given
				System.out.println("What do you want to name the file?");
				String newFile = keyboard.nextLine();
				bst.writeFile(newFile);
				break;
			default:
				System.out.println("Invalid option picked!");
			}
		}
	}
	public static Shape[] readFile(String fileName)
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
			Shape[] retArr = new Shape[wordCount];
			fileScanner = new Scanner(new File(fileName));
			for(int i=0;i<retArr.length;i++)
			{
				if(!fileScanner.hasNextLine())
					break;
				String name = fileScanner.next();
				double radius = 0;
				double base = 0;
				double height = 0;
				double length = 0;
				double width = 0;
				if(name.equals("Circle"))
				{
					radius = Double.parseDouble(fileScanner.next());
					Shape shape = new Circle(name,radius);
					retArr[i] = shape;
				}
				else if(name.equals("Right"))
				{
					String decoy = fileScanner.next();//moves the fileScanner past the word "Triangle"
					if(decoy.equals("Triangle"))//checks to make sure that the next word is triangle
					{
						base = Double.parseDouble(fileScanner.next());
						height = Double.parseDouble(fileScanner.next());
						Shape shape = new RightTriangle("Right Triangle",base,height);
						retArr[i] = shape;
					}
					else
					{
						System.out.println("Invalid name of shape");
					}
				}
				else if(name.equals("Rectangle"))
				{
					length = Double.parseDouble(fileScanner.next());
					width = Double.parseDouble(fileScanner.next());
					Shape shape = new Rectangle2(name,length,width);
					retArr[i] = shape;
				}
				else
				{
					System.out.println("Invalid shape entered");
				}
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
