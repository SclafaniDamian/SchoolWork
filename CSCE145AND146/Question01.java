// Made By Damian Sclafani
package CSCE145AND146;
/*
 * CSCE 146 Exam01 Question01
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 * You may write additional methods to help
 */
//Do not alter-----------------------------------------------------------------------
public class Question01 {
    //-----------------------------------------------------------------------------------	
	//Write your method here
	public static boolean largerComponents(int[] aTest1, int[] aTest2)
	{
		if(aTest1.length != aTest2.length || aTest1 == null || aTest2 == null) //checks if the arrays are the same length and that neither are null
			return false;
		int counter = 0; //initializes a counter
		for(int i = 0; i < aTest1.length; i++) //cycles through each value in each array
		{
			if(aTest1[i] > aTest2[i]) //if the first array's value is greater than the second, increase the counter by 1
			{
				counter++;
			}
		}
		if(counter == aTest1.length) //if the counter matches the array length, that means that array1 is bigger
		{
			return true;
		}
		else
		{
			return false;
		}
	}
				
	//Write any additional helper properties or methods here
	
	//--------------------------------------------------------------------------------
	//Test your code here. You may alter this as needed.
	public static void Question01Main() {

		int[] test01 = {5,4,3};
		int[] test02 = {2,1,0};

		System.out.println(largerComponents(test01,test02));
	}
}
