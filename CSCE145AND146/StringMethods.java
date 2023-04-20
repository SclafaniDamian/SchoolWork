// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class StringMethods {
    private Scanner key;

    public void stringMethod() {

		key = new Scanner(System.in);
		
		System.out.println("Enter a sentence:");
		
		String  sentence = key.nextLine();
		
		int length = sentence.length();
		
		System.out.println("Length: " + length);
		
		int position = sentence.indexOf('D');
		
		System.out.println("Position of letter \'D\' is: " + position);
		
		char letter = sentence.charAt(3);
		
		System.out.println("Character at position 3 is: " + letter);
		
		String str1 = sentence.substring(9);
		
		System.out.println("Substring starting at index 9 is: " + str1);
		
		String str2 = sentence.substring(9, 13);
		
		System.out.println("Substring starting at index 9 and ending at index 13 is: " + str2);
		
		System.out.println("Uppercase: " + sentence.toUpperCase());
		
		System.out.println("Lowercase: " + sentence.toLowerCase());
		
	}
}
