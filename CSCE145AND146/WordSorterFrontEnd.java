// Made By Damian Sclafani
package CSCE145AND146;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class WordSorterFrontEnd {

	public void frontEnd() {
		
		//Reads the given text file
		String[] words = readFile("SchoolWork/CSCE145ANDCSCE146/randomwords.txt");
		
		//Sorts the words using various criteria
		String[] vowelSorted = WordHelper.sortByVowels(words);
	
		String[] conSorted = WordHelper.sortByConsonants(words);
		//System.out.print("test");
		String[] lenSorted = WordHelper.sortByLength(words);
		
		//Prints the results
		System.out.println("The original word list");
		printStrArr(words);
		System.out.println("\nThe word list sorted by Vowels");
		printStrArr(vowelSorted);
		System.out.println("\nThe word list sorted by Consonants");
		printStrArr(conSorted);
		System.out.println("\nThe word list sorted by Length");
		printStrArr(lenSorted);
	}

    /**
	 * Returns an array of strings that correspond to words found
	 * line-by-line in a file
	 * @param fileName the name and path of the file to be read
	 * @return an array of Strings corresponding to each word found in the file
	 */
	public String[] readFile(String fileName)
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
	/**
	 * Prints out all of the words in an array of String
	 * @param words an array of words to be printed to the console
	 */
	public void printStrArr(String[] words)
	{
		for(String s : words)
			System.out.println(s);
	}

/*public static String[] getLines(String fileName) {
    String[] lines = new ArrayList<String>();

    try {
        File file = new File(fileName);
        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            lines.add(line);
        }
        reader.close();
    } catch (FileNotFoundException e) {
        System.out.println("Error reading file.");
        e.printStackTrace();
    }

    return lines;
}*/
}
