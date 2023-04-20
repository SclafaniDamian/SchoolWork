// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class FunWithVariables {
    private Scanner key;

    public void FunWithVariablesMain() {
		//adding the scanner
		key = new Scanner(System.in);
		
		//asking the user for a seven word sentence
		System.out.println("Enter a sentence containing seven words: ");
		
		//turning each word in the sentence into a variable
		String one = key.next();
		String two = key.next();
		String three = key.next();
		String four = key.next();
		String five = key.next();
		String six = key.next();
		String seven = key.next();
		
		//printing out the user's sentence backwards
		System.out.println(seven + " * " + six + " * " + five + " * " + four + " * " + three + " * " + two + " * " + one);


	}
}
