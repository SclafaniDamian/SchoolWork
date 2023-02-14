// Made By Damian Sclafani
package CSCE145AND146;
/*
 * CSCE 146 Exam01 Question03
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 * You may write additional methods to help
 * Testing is encouraged but remove all testing code before turning it in.
 */
//Do not alter-----------------------------------------------------------------------
public class Question03 {
    public class ListNode//public for testing purposes
	{
		public int data;//public for testing purposes
		public ListNode link;//public for testing purposes
		public ListNode(int aData, ListNode aLink)
		{
			data = aData;
			link = aLink;
		}
	}
	public ListNode head;//public for testing purposes
//-----------------------------------------------------------------------------------
	//Write your method here
	public int getMinValue()
	{
		if(head == null) //checks if the list is null
			return 0;
		int min = head.data; //assigns the min value to the first value
		while(head != null) //goes through the whole list
		{
			if(head.data < min) //checks if the current data is less than the min value
				min = head.data; //changes the min value of the if statement is true
			head = head.link; //moves to the next value
		}
		return min;
	}












	//Write additional methods or properties here
			
	//--------------------------------------------------------------------------------
	//Test your code here. You may alter this as needed.
	public static void Question03Main() {
		//Example
		Question03 intLL = new Question03();
		intLL.head = intLL.new ListNode(0, 
							intLL.new ListNode(1, 
									intLL.new ListNode(2,
											intLL.new ListNode(3,
													intLL.new ListNode(4,null)))));
		int min = intLL.getMinValue();
		System.out.println(min);
	}
	//--------------------------------------------------------------------------------
}//Do not alter this
