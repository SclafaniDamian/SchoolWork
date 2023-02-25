// Made By Damian Sclafani
package CSCE145AND146;
/*
 * CSCE 146 S2022 Exam02 Question02
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 * You may write additional methods to help
 */
//Do not alter-----------------------------------------------------------------------
public class CSCE146Question02 {
    
    public class Node //public for testing purposes
	{
		private CSCE146Book data;
		private Node leftChild;
		private Node rightChild;
		public Node(CSCE146Book aData)
		{
			this.data = aData;
			this.leftChild = null;
			this.rightChild = null;
		}
	}
	public Node root; //public for testing purposes
	public void add(CSCE146Book aData)
	{
//-----------------------------------------------------------------------------------
		//Write your solution here
		if(root == null)
			root = new Node(aData);
		else
			add(root,aData);

	}//Do not alter this
	

//Do not alter-----------------------------------------------------------------------	
	public CSCE146Book getBookWithMostWords()
	{
//-----------------------------------------------------------------------------------
		//Write your solution here
		return getBookWithMostWords(root);

	}//Do not alter this
	
	
	//Write additional methods or properties here
	private Node add(Node aNode, CSCE146Book aData)
	{
		if(aNode == null)//Leaf
			aNode = new Node(aData);
		else if(aData.getWordCount()<aNode.data.getWordCount())//Go left
			aNode.leftChild = add(aNode.leftChild,aData);
		else if(aData.getWordCount()>aNode.data.getWordCount())//Go right
			aNode.rightChild = add(aNode.rightChild,aData);
		return aNode;
	}
	private CSCE146Book getBookWithMostWords(Node aNode)
	{
		if(aNode == null)
			return null;
		else if(aNode.rightChild == null)
			return aNode.data;
		else
			return getBookWithMostWords(aNode.rightChild);
	}
	//--------------------------------------------------------------------------------
//Do not alter------------------------------------------------------------------------
	public void printPreorder()
	{
		printPreorder(root);
	}
	private void printPreorder(Node aNode)
	{
		if(aNode == null)
		{
			System.out.print("leaf, ");
			return;
		}
		System.out.print(aNode.data+", ");
		printPreorder(aNode.leftChild);
		printPreorder(aNode.rightChild);
	}
//-----------------------------------------------------------------------------------
	//Test your code here. You may alter this as needed.
    public void CSCE146Question02Main() {
		System.out.println("Adding books to book tree");
		CSCE146Book[] books = {new CSCE146Book(800),
				new CSCE146Book(600),
				new CSCE146Book(400),
				new CSCE146Book(200),
				new CSCE146Book(100),
				new CSCE146Book(700),
				new CSCE146Book(500),
				new CSCE146Book(3000)};
		CSCE146Question02 tree = new CSCE146Question02();
		for(CSCE146Book b: books)
			tree.add(b);
		System.out.println("Printing the preorder traversal of books");
		tree.printPreorder();
		
		System.out.println("\nThe book with the most words is: "+tree.getBookWithMostWords());

	}
	//--------------------------------------------------------------------------------
}
