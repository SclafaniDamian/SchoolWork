// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class wordGame {
    private Scanner key;

    public void wordGameMain() {
		
		key = new Scanner(System.in);
		
		System.out.println("Enter a word to see if it is special or not: ");
		String word = key.next();
		
		String lWord = word.toLowerCase();
		
		String newWord = lWord.substring(1) + lWord.substring(0, 1);
		
		int count = newWord.length() - 1;
		int wordCount = 0;
		
		while(count > -1)
		{
			char newChar = newWord.charAt(count);
			char normChar = lWord.charAt(wordCount);
			if(newChar == normChar)
			{
				count--;
				wordCount++;
			}
			else
			{
				count = -2;
				System.out.println("Your word is not special.");
			}
		}
		
		if(count == -1)
		{
			System.out.println("Your word is special");
		}
	}
}
