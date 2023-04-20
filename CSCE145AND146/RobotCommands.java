// Made By Damian Sclafani
package CSCE145AND146;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class RobotCommands {
    public static final int MAZE_SIZE = 10;
	
	private char[][] maze;//index 0 = y, index 1 = x
	public static final char EMPTY = '_';
	public static final char OBST = 'X';
	public static final char PLAYER = 'O';
	public static final char PATH = '#';
	
	public static final String NORTH = "Move Up";
	public static final String SOUTH = "Move Down";
	public static final String EAST = "Move Right";
	public static final String WEST = "Move Left";
	
	public boolean crash;
	private QueueI<String> queue;
	private int[] currLoc;//index 0 = y, index 1 = x
	public RobotCommands(String mazeFile, String commandsFile)
	{
		queue = new LLQueue<String>();
		maze = readMazeFile(mazeFile);
		readCommandsFile(commandsFile);
		maze[0][0] = PLAYER;
		currLoc = new int[] {0,0};
		crash = false;//this variable makes sure the movements stop if the robot runs into a wall
	}
	public String getCurrentCommand()//gets the command that would be used next and removes it from the queue
	{
		return queue.dequeue();
	}
	public int getSize()
	{
		return queue.size();
	}
	public void move(String input)
	{
		maze[currLoc[0]][currLoc[1]] = EMPTY;
		int currY = currLoc[0];
		int currX = currLoc[1];
		if(input.equalsIgnoreCase(NORTH) && !crash)//move up
		{
			System.out.println("Command Used: Move Up");
			if(isValid(currY-1) && maze[currY-1][currX] != OBST)
			{
				currLoc[0]--;
			}
			else
			{
				System.out.println("CRASH");
				crash = true;
			}
		}
		else if(input.equalsIgnoreCase(SOUTH) && !crash)//move down
		{
			System.out.println("Command Used: Move Down");
			if(isValid(currY+1) && maze[currY+1][currX] != OBST)
			{
				currLoc[0]++;
			}
			else
			{
				System.out.println("CRASH");
				crash = true;
			}
		}
		else if(input.equalsIgnoreCase(WEST) && !crash)//move left
		{
			System.out.println("Command Used: Move Left");
			if(isValid(currX-1) && maze[currY][currX-1] != OBST)
			{
				currLoc[1]--;
			}
			else
			{
				System.out.println("CRASH");
				crash = true;
			}
		}
		else if(input.equalsIgnoreCase(EAST) && !crash)//move right
		{
			System.out.println("Command Used: Move Right");
			if(isValid(currX+1) && maze[currY][currX+1] != OBST)
			{
				currLoc[1]++;
			}
			else
			{
				System.out.println("CRASH");
				crash = true;
			}
		}
		maze[currLoc[0]][currLoc[1]] = PLAYER;
	}
	private boolean isValid(int index)
	{
		return index >= 0 && index < maze.length;
	}
	public void printFullMaze()
	{
		for(int i = 0; i<maze.length;i++)
		{
			for(int j = 0; j<maze.length;j++)
			{
				System.out.print(maze[i][j]);
			}
			System.out.println();
		}
	}
	public char[][] readMazeFile(String fileName)
	{
		try
		{
			Scanner fileScanner = new Scanner(new File(fileName));
			int wordCount = 0;
			while(fileScanner.hasNextLine())
			{
				fileScanner.nextLine();
				wordCount++;
			}
			if(wordCount <= 0)
				return null;
			char[][] retArr = new char[MAZE_SIZE][MAZE_SIZE];
			fileScanner = new Scanner(new File(fileName));
			for(int i=0;i<MAZE_SIZE;i++)
			{
				String fileLine = fileScanner.nextLine();
				for(int j = 0; j < fileLine.length(); j++)
				{
					retArr[i][j] = fileLine.charAt(j);
				}
			}
			return retArr;//returns the file as a char[][]
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
	public void readCommandsFile(String fileName)
	{
		try
		{
			Scanner fileScanner = new Scanner(new File(fileName));
			int wordCount = 0;
			while(fileScanner.hasNextLine())
			{
				fileScanner.nextLine();
				wordCount++;
			}
			if(wordCount <= 0)
				System.out.println("No content in file");
			fileScanner = new Scanner(new File(fileName));
			for(int i=0;i<wordCount;i++)
			{
				if(!fileScanner.hasNextLine())
					break;
				queue.enqueue(fileScanner.nextLine());//adds each line into a queue as it is scanning the file
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
