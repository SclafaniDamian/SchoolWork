// Made By Damian Sclafani
package CSCE145AND146;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class VideoGameData {
    public static final String DELIM = "\t";
	public static final int BODY_FIELD_AMT = 2;
	private GenLL<Game> games;
	private GenLL<Game> result;
	
	public VideoGameData()
	{
		games = new GenLL<Game>();
		result = new GenLL<Game>();
	}
	public void addGame(Game aGame)
	{
		games.add(aGame);
	}
	public void writeGameFileAppend(String aFile) //adds to the current file
	{
		try
		{
			PrintWriter fileWriter = new PrintWriter(new FileOutputStream(new File(aFile),true));
			games.reset();
			while(games.hasMore())
			{
				Game aGames = games.getCurrent();
				fileWriter.println(aGames.getGame()+DELIM+aGames.getConsole());
				games.gotoNext();
			}
			fileWriter.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void writeGameFileReplace(String aGame) //creates a new file
	{
		try
		{
			PrintWriter fileWriter = new PrintWriter(new FileOutputStream(new File(aGame)));
			games.reset();
			while(games.hasMore())
			{
				Game aGames = games.getCurrent();
				fileWriter.println(aGames.getGame()+DELIM+aGames.getConsole());
				games.gotoNext();
			}
			fileWriter.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void readGameFile(String aName)
	{
		try
		{
			Scanner fileScanner = new Scanner(new File(aName));
			while(fileScanner.hasNextLine())
			{
				String fileLine = fileScanner.nextLine();
				String[] splitLines = fileLine.split(DELIM);
				if(splitLines.length == BODY_FIELD_AMT)
				{
					String game = splitLines[0];
					String console = splitLines[1];
					Game aGame = new Game(game,console);
					this.addGame(aGame);
				}
			}
			fileScanner.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void printGames()
	{
		games.print();
	}
	public void searchGame(String game)
	{
		games.reset();
		if(game.equals("*"))
		{
			while(games.hasMore()) //adds all the games to the results
			{
				result.add(games.getCurrent());
				games.gotoNext();
			}
		}
		else
		{
			while(games.hasMore()) //adds the specific games to results
			{
				String temp = games.getCurrent().getGame();
				int search = temp.toLowerCase().indexOf(game.toLowerCase());
				if(search != -1)
				{
					result.add(games.getCurrent());
				}
				games.gotoNext();
			}
		}
	}
	public void searchConsole(String console)
	{
		result.reset();
		if(console.equals("*")) //does nothing since it doesn't need to filter out any games
		{
			return;
		}
		else
		{
			while(result.hasMore()) //filters out games in results that don't match the correct console
			{
				String temp = result.getCurrent().getConsole();
				int search = temp.toLowerCase().indexOf(console.toLowerCase());
				if(search == -1)
				{
					result.removeCurrent();
				}
				result.gotoNext();
			}
		}
	}
	public void printResult()
	{
		result.print();
	}
}
