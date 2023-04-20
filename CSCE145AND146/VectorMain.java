// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class VectorMain {
    private Scanner keyboard;

    public void VectorMainMethod() {
		
		keyboard = new Scanner(System.in);
		
		boolean quit = false;
		while(!quit)
		{
			System.out.println("Welcome to VectorMain! Please create one vector before you proceed.");
			//creating first vector
			System.out.println("Create your first vector!");
			System.out.println("What size do you want your vectors to be?");
			int vectorSize = keyboard.nextInt();
			if(vectorSize < 1)
			{
				System.out.println("Invalid size entered. Setting value to default value of 3");
				vectorSize = 3;
			}
			
			int[] vector1 = new int[vectorSize];
			
			//initializing first vector
			for(int i = 0; i < vector1.length; i++)
			{
				System.out.println("Enter value #" + (i+1) + " for this vector: ");
				vector1[i] = keyboard.nextInt();
			}
			
			System.out.println("Do you want to:" + 
					"\nAdd a second vector to the first (press 1)" +
					"\nSubtract a second vector to the first (press 2)" + 
					"\nGet the magnitude of the first vector (press 3)" + 
					"\nQuit (press 9)");
			int userInput = keyboard.nextInt();
			
			switch(userInput)
			{
			//adding vectors
			case 1:
				//creating second vector
				System.out.println("You have selected Add. Please create another vector.");
				System.out.println("What is the size of this vector?");
				int vector2Size = keyboard.nextInt();
				if(vector2Size < 1)
				{
					System.out.println("Invalid size entered. Setting value to default value of 3");
					vector2Size = 3;
				}
				if(vectorSize != vector2Size)
				{
					System.out.println("ERROR: For adding values, the two vectors must have the same size.");
					System.out.println("Resetting program...");
					break;
				}
				int[] vector2 = new int[vector2Size];
				for(int i = 0; i < vector2.length; i++)
				{
					System.out.println("Enter value #" + (i+1) + " for this vector: ");
					vector2[i] = keyboard.nextInt();
				}
				//adding vectors
				System.out.println("Adding vectors...");
				int[] newVector = new int[vector2Size];
				for(int i = 0; i < vector2.length; i++)
				{
					newVector[i] = vector1[i] + vector2[i];
				}
				//printing new vector
				for(int i = 0; i < newVector.length; i++)
				{
					System.out.println(newVector[i]);
				}
				break;
			//subtracting vectors
			case 2:
				//creating second vector
				System.out.println("You have selected Subtract. Please create another vector.");
				System.out.println("What is the size of this vector?");
				int vector02Size = keyboard.nextInt();
				if(vector02Size < 1)
				{
					System.out.println("Invalid size entered. Setting value to default value of 3");
					vector02Size = 3;
				}
				if(vectorSize != vector02Size)
				{
					System.out.println("ERROR: For subtracting values, the two vectors must have the same size.");
					System.out.println("Resetting program...");
					break;
				}
				int[] vector02 = new int[vector02Size];
				for(int i = 0; i < vector02.length; i++)
				{
					System.out.println("Enter value #" + (i+1) + " for this vector: ");
					vector02[i] = keyboard.nextInt();
				}
				//subtracting vectors
				System.out.println("Subtracting vectors...");
				int[] newVector0 = new int[vector02Size];
				for(int i = 0; i < vector02.length; i++)
				{
					newVector0[i] = vector1[i] - vector02[i];
				}
				//printing new vector
				for(int i = 0; i < newVector0.length; i++)
				{
					System.out.println(newVector0[i]);
				}
				break;
			//getting magnitude of vector
			case 3:
				System.out.println("You chose to get the magnitude.");
				//calculating magnitude
				System.out.println("Calculating magnitude...");
				int[] magVector = new int[vectorSize];
				for(int i = 0; i < vector1.length; i++)
				{
					magVector[i] = vector1[i] * vector1[i];
				}
				double total = 0.0;
				for(int i = 0; i < vector1.length; i++)
				{
					total += magVector[i];
				}
				double answer = Math.sqrt(total);
				//print the answer
				System.out.println(answer);
				break;
			//quitting
			case 9:
				System.out.println("Quitting program...");
				quit = true;
				break;
			//default to quit
			default:
				System.out.println("Invalid function entered, quitting program");
				quit = true;
			}
			
			
			
			
			
		}
		
	}
}
