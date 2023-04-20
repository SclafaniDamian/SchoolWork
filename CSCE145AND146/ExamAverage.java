// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class ExamAverage {
    private Scanner key;

    public void EvamAverageMain() {
		
		key = new Scanner(System.in);
		String response = "";
		
		do
		{
			double sum = 0, avg = 0;
			int gradeCounter = 0;
			System.out.println("Enter the grades whose average you want to calculate. Enter a negative number once done:");
			
			double grade = key.nextDouble();
			
			while(grade >= 0 && grade <= 100)
			{
				sum += grade;		//sum = sum + grade;
				
				gradeCounter++;
				
				grade = key.nextDouble();
			}
			
			if(gradeCounter > 0)
			{
				avg = sum/gradeCounter;
			}
			
			System.out.println("Average = "+ avg);
			
			System.out.println("Do you want to calculate the average for another set of grades? Enter yes or no:");
			
			response = key.next();
			
			
		}while(response.equalsIgnoreCase("Yes"));
		
			//do-while loop
		
		/* do
		 * {
		 * 		code;
		 * }while(condition);
		 */
	}
}
