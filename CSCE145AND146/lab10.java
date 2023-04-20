// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class lab10 {
    private Scanner key;

    public void lab10Main() {
		
		key = new Scanner(System.in);
		
		System.out.println("A chocolate bar costs $1 and gives one coupon. How much money will you spend on chocolate bars?");
		
		int money = key.nextInt();
		int totalBars = 0;
		int coupon = 0;
		
		while(money != 0)
		{
			money--;
			totalBars++;
			coupon++;
			if(coupon == 6)
			{
				coupon -= 6;
				totalBars++;
				coupon++;
			}
		}
		
		System.out.println("You can get " + totalBars + " chocolate bars and you will have " + coupon + " coupons left!");

	}
}
