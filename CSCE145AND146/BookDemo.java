// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class BookDemo {
    private Scanner key;

    public void bDemo() {
		key = new Scanner(System.in);

		//default values
		Book b0 = new Book();
		
		System.out.println("Default Values: \n" + b0.toString());
		
		//first book
		System.out.println("Enter the title of the first book:");
		String title1 = key.nextLine();
		
		System.out.println("Enter the author of the first book:");
		String author1 = key.nextLine();
		
		System.out.println("Enter the number of copies sold:");
		int numCopiesSold1 = key.nextInt();
		
		System.out.println("Enter the year of release:");
		int yearOfRelease1 = key.nextInt();
		
		Book b1 = new Book(title1, author1, numCopiesSold1, yearOfRelease1);
		
		System.out.println("First book: \n" + b1.toString());
		
		key.nextLine();
		
		//second book
		System.out.println("Enter the title of the second book:");
		String title2 = key.nextLine();
		
		System.out.println("Enter the author of the second book:");
		String author2 = key.nextLine();
		
		System.out.println("Enter the number of copies sold:");
		int numCopiesSold2 = key.nextInt();
		
		System.out.println("Enter the year of release:");
		int yearOfRelease2 = key.nextInt();
		
		Book b2 = new Book(title2, author2, numCopiesSold2, yearOfRelease2);
		
		System.out.println("Second book: \n" + b2.toString());
		
		if(b1.equals(b2))
		{
			System.out.println("The two books are the same!");
		}
		else
		{
			System.out.println("The two books are different!");
		}
		
		
		
		
	}

}
