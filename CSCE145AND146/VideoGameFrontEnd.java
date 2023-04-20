// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class VideoGameFrontEnd {
    public static VideoGameData videoGameData = new VideoGameData();	
	private static Scanner keyboard = new Scanner(System.in);
	public static final String FILE_NAME = "./gameCollection.txt";//the example file

    public void videogame() {
		
		boolean quit = false;
		while(!quit)
		{
			System.out.println("Welcome to the VideoGameFrontEnd!");
			System.out.println();
			System.out.println("Enter the file you want to scan in");
			String fileName = keyboard.nextLine();
			videoGameData.readGameFile(fileName);
		
			System.out.println("Enter the name or partial name of the game you wish to look for:\n"
				+ "Enter * to show all names");
			String input = keyboard.nextLine();
			videoGameData.searchGame(input);
		
			System.out.println("Enter the console of the games you wish to look for:\n"
				+ "Enter * to show all consoles");
			input = keyboard.nextLine();
			videoGameData.searchConsole(input);
		
			videoGameData.printResult();
			
			System.out.println("Do you want to print the results to the current file (1) or print the results to a new file (2)?");
			int printInput = keyboard.nextInt();
			keyboard.nextLine();
			switch(printInput)
			{
			case 1:
				videoGameData.writeGameFileAppend(FILE_NAME);
				break;
			case 2:
				System.out.println("What is the name of the new file?");
				String newFileName = keyboard.nextLine();
				videoGameData.writeGameFileReplace(newFileName);
				break;
			default:
				System.out.println("Invalid response");
			}
			
			System.out.println();
			System.out.println("End the program? True or false.");
			quit = keyboard.nextBoolean();
			keyboard.nextLine();
		}
		
	}
}
