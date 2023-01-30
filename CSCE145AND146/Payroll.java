// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class Payroll {
    private Scanner key;

    public void checkPayroll() {
        key = new Scanner(System.in);
		
		System.out.println("Enter the number of employees whose gross wages you wish to calculate:");
		int size = key.nextInt();
		
		key.nextLine();
		
		String[] employeeName = new String[size];
		double[] hoursWorked = new double[size];
		double[] hourlyWage = new double[size];
		double[] grossWages = new double[size];
		
		//entering values
		for(int i = 0; i < size; i++)
		{
			System.out.println("Enter the name of employee " + (i+1) + ":");
			employeeName[i] = key.next();
			
			System.out.println("How many hours did " + employeeName[i] + " work this week?");
			hoursWorked[i] = key.nextDouble();
			
			System.out.println("What is " + employeeName[i] + "\'s hourly wage?");
			hourlyWage[i] = key.nextDouble();
			if(hourlyWage[i] < 8.0)
			{
				System.out.println("Hourly wage should not be less than 8 dollar per hour! Exiting program!");
				// System.exit(0);
			}
            else {
			    grossWages[i] = hoursWorked[i] * hourlyWage[i];

                //Print out the values
		        System.out.println("Name    Hours Worked    Hourly Pay Rate    Gross Wages Earned");
		        for(int j = 0; j < size; j++)
		        {
			        System.out.print(employeeName[i] + "       " + hoursWorked[i] + "             " + hourlyWage[i] + "                 " + grossWages[i]);
			        System.out.println();
		        }
            }
			
		}
    }
}
