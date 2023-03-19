// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class RobotCommandsFE {
    private Scanner keyboard;

    public void RobotCommandsFEMain() {
		keyboard = new Scanner(System.in);
		System.out.println("Welcome to the RobotCommands Front End!\n");
		boolean quit = true;
		
		while(quit)
		{
			System.out.println("Enter the mazeFile name. Here is a few default files.");
			System.out.println("\t(1) ./board.txt");
			System.out.println("\t(2) ./board2.txt");
			String mazeFile = keyboard.nextLine();
			System.out.println();//Spacer
			System.out.println("Enter the robotCommandsFile. Here is a few default files.");
			System.out.println("\t ./robotCommands.txt");
			System.out.println("\t ./robotCommands2.txt");
			System.out.println("\t ./robotCommandsBad.txt");
			String commandsFile = keyboard.nextLine();
			
			RobotCommands commands = new RobotCommands(mazeFile, commandsFile);
			
			while(commands.getSize() > 0 && commands.crash == false)
			{
				commands.move(commands.getCurrentCommand());
				commands.printFullMaze();
				System.out.println();
			}
			System.out.println();//spacer
			System.out.println("Play Again?");
			quit = keyboard.nextBoolean();
			keyboard.nextLine();
			
			
		}
		
		
	}
}
