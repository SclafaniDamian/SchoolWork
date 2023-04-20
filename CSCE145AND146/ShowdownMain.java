// Made By Damian Sclafani
package CSCE145AND146;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;

public class ShowdownMain {
    public static final String FILE_NAME = "./prizeList.txt";
    private Scanner keyboard;

    public void ShowdownMainMain() {
		keyboard = new Scanner(System.in);
		//setting up the arrays
		String[] file = readFile(FILE_NAME);
		String[] prices = setPrices(file);
		String[] items = setItems(file);
		boolean playAgain = true;
		while(playAgain)
		{
			System.out.println("Welcome to ShowcaseShowdown!");
			System.out.println("You will be shown 5 prizes! If you guess the cost of between within $3500 below and the exact price, you keep the prize!");
			//getting the random items
			Random r = new Random();
			boolean randomized = false;
			int item1 = 0;
			int item2 = 0;
			int item3 = 0;
			int item4 = 0;
			int item5 = 0;
			while(!randomized)
			{
				item1 = r.nextInt(items.length);
				item2 = r.nextInt(items.length);
				item3 = r.nextInt(items.length);
				item4 = r.nextInt(items.length);
				item5 = r.nextInt(items.length);
				//checking to make sure nothing is equal or null
				if(item1 == item2 || item1 == item3 || item1 == item4 || item1 == item5 ||
					item2 == item3 || item2 == item4 || item2 == item5 ||
					item3 == item4 || item3 == item5 || item4 == item5 ||
					items[item1] == null || items[item2] == null ||
					items[item3] == null || items[item4] == null ||
					items[item5] == null)
				{
					randomized = false;
				}
				else
				{
					randomized = true;
				}
			}
			//guessing first item
			System.out.println("Your first item is... A new " + items[item1]);
			System.out.println("Please guess the value of this item now.");
			int guess = keyboard.nextInt();
			if(guess <= Integer.parseInt(prices[item1]) && guess >= Integer.parseInt(prices[item1])-3500)
			{
				System.out.println("You won the " + items[item1]);
				System.out.println("Congrats!");
			}
			else
			{
				System.out.println("Sorry...but that is not correct");
			}
			//guessing second item
			System.out.println("Your second item is... A new " + items[item2]);
			System.out.println("Please guess the value of this item now.");
			guess = keyboard.nextInt();
			if(guess <= Integer.parseInt(prices[item2]) && guess >= Integer.parseInt(prices[item2])-3500)
			{
				System.out.println("You won the " + items[item2]);
				System.out.println("Congrats!");
			}
			else
			{
				System.out.println("Sorry...but that is not correct");
			}
			//guessing third item
			System.out.println("Your third item is... A new " + items[item3]);
			System.out.println("Please guess the value of this item now.");
			guess = keyboard.nextInt();
			if(guess <= Integer.parseInt(prices[item3]) && guess >= Integer.parseInt(prices[item3])-3500)
			{
				System.out.println("You won the " + items[item3]);
				System.out.println("Congrats!");
			}
			else
			{
				System.out.println("Sorry...but that is not correct");
			}
			//guessing fourth item
			System.out.println("Your fourth item is... A new " + items[item4]);
			System.out.println("Please guess the value of this item now.");
			guess = keyboard.nextInt();
			if(guess <= Integer.parseInt(prices[item4]) && guess >= Integer.parseInt(prices[item4])-3500)
			{
				System.out.println("You won the " + items[item4]);
				System.out.println("Congrats!");
			}
			else
			{
				System.out.println("Sorry...but that is not correct");
			}
			//guessing fifth item
			System.out.println("Your fifth item is... A new " + items[item5]);
			System.out.println("Please guess the value of this item now.");
			guess = keyboard.nextInt();
			if(guess <= Integer.parseInt(prices[item5]) && guess >= Integer.parseInt(prices[item5])-3500)
			{
				System.out.println("You won the " + items[item5]);
				System.out.println("Congrats!");
			}
			else
			{
				System.out.println("Sorry...but that is not correct");
			}
			//play again?
			System.out.println("Do you want to play again? (true or false)");
			playAgain = keyboard.nextBoolean();
			if(!playAgain)
			{
				System.out.println("Thank you for playing! Goodbye");
			}
		}
	}
	//reads the file
	public static String[] readFile(String fileName)
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
			String[] retArr = new String[wordCount];
			fileScanner = new Scanner(new File(fileName));
			for(int i=0;i<retArr.length;i++)
			{
				if(!fileScanner.hasNextLine())
					break;
				retArr[i] = fileScanner.nextLine();
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
	//creates the array that only shows the prices
	//NOTE: these are still in String values. Make sure they get changed to integers when needed!
	public static String[] setPrices(String[] words)
	{
		String[] prices = new String[words.length];
		
		for(int i = 0; i < words.length; i++)
		{
			if(words[i].contains("\t"))
			{
				prices[i] = words[i].substring(words[i].lastIndexOf("\t")+1);
			}
		}
		return prices;
	}
	//creates the array that shows only the items
	public static String[] setItems(String[] words)
	{
		String[] items = new String[words.length];
		
		for(int i = 0; i < words.length; i++)
		{
			if(words[i].contains("\t"))
			{
				items[i] = words[i].substring(0, words[i].lastIndexOf("\t"));
			}
		}
		return items;
	}
}
