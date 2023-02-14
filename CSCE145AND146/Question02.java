// Made By Damian Sclafani
package CSCE145AND146;
/*
 * CSCE 146 Exam01 Question02
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 * You may write additional methods to help
 * Testing is encouraged but remove all testing code before turning it in.
 */
//Do not alter-----------------------------------------------------------------------
public class Question02 {
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
	public void insertDoubles()
	{
		current = head; //sets the current to the head
		while(current != null) //keeps repeating until current is null
		{
			addAfterCurrent(current.data*2); //adds the doubled value after the current
			current = current.link.link; //moves twice so that it goes past the value that was just added
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		


	//Write additional methods or properties here
	private ListNode current;
	public void addAfterCurrent(int aData) //the method that adds the given data after the current
	{
		if(current == null)
			return;
		ListNode newNode = new ListNode(aData,current.link);
		current.link = newNode;
	}
			
	//--------------------------------------------------------------------------------
	//Test your code here. You may alter this as needed.
	public static void Question02Main() {
		//Example
		Question02 intLL = new Question02();
		intLL.head = intLL.new ListNode(0, 
							intLL.new ListNode(1, 
									intLL.new ListNode(2,
											intLL.new ListNode(3,
													intLL.new ListNode(4,null)))));
		intLL.insertDoubles();
		//Printing Results
		for(Question02.ListNode temp = intLL.head;temp != null; temp = temp.link)
			System.out.println(temp.data);
	}
	//--------------------------------------------------------------------------------
}//Do not alter this
