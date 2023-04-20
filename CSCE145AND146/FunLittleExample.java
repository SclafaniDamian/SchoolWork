// Made By Damian Sclafani
package CSCE145AND146;

public class FunLittleExample {
    
    public void FunLittleExampleMain() {
		
		int n = 8;
		mysteryComplexity00(n);
		System.out.println();
		mysteryComplexity01(n);
		System.out.println();
		mysteryComplexity02(n);

	}
	public static void mysteryComplexity00(int n)
	{
		int count = 0;
		System.out.println("*");
		count++;
		System.out.println(count);
	}
	public static void mysteryComplexity01(int n)
	{
		int count = 0;
		for(int i = 0; i < n; i++)
		{
			System.out.println("*");
			count++;
		}
		System.out.println(count);
	}
	public static void mysteryComplexity02(int n)
	{
		int count = 0;
		int count2 = 0;
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print("*");
				count++;
			}
			System.out.println();
			count2++;
		}
		System.out.println(count + "\n" + count2);
	}
}
