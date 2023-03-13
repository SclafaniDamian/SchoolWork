// Made By Damian Sclafani
package CSCE145AND146;

public class SimpleRecursion {
    
    public void SimpleRecursionMain() {
		
		countDown(5);
		System.out.println(factorial(5));
		System.out.println(gcd(27,9));
		System.out.println(fibo(7));
	}
	public static void countDown(int i)
	{
		if(i < 0)//Halting condition
		{
			return;
		}
		System.out.println(i);
		countDown(--i);//Recursive Call
	}
	public static int factorial(int number)
	{
		if(number <= 0)//Halting condition
		{
			return 1;
		}
		else
		{
			return number * factorial(number-1);
		}
	}
	public static int gcd(int a, int b)
	{
		if(b <= 0)
			return a;
		else
			return gcd(b,a%b);
	}
	public static int fibo(int number)
	{
		if(number == 1 || number == 2)
			return 1;
		else
			return fibo(number-1) + fibo(number-2);
	}
}
