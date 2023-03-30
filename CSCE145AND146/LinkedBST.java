// Made By Damian Sclafani
package CSCE145AND146;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class LinkedBST <T extends Comparable<T>> {
    private class Node
	{
		T data;
		Node leftChild;
		Node rightChild;
		public Node(T aData)
		{
			data = aData;
			leftChild = rightChild = null;
		}
	}
	private Node root;//head
	public LinkedBST()
	{
		root = null;
	}
	public void add(T aData)
	{
		if(root == null)
			root = new Node(aData);
		else
			add(root,aData);
	}
	private Node add(Node aNode, T aData)
	{
		if(aNode == null)//Leaf
			aNode = new Node(aData);
		else if(aData.compareTo(aNode.data)<0)//Go left
			aNode.leftChild = add(aNode.leftChild,aData);
		else if(aData.compareTo(aNode.data)>0)//Go right
			aNode.rightChild = add(aNode.rightChild,aData);
		return aNode;
	}
	public void printPreorder()
	{
		printPreorder(root);
	}
	private void printPreorder(Node aNode)
	{
		if(aNode == null)
			return;
		System.out.println(aNode.data);//Process
		printPreorder(aNode.leftChild);//left
		printPreorder(aNode.rightChild);//right
	}
	public void printInorder()
	{
		printInorder(root);
	}
	private void printInorder(Node aNode)
	{
		if(aNode == null)
			return;
		printInorder(aNode.leftChild);//left
		System.out.println(aNode.data);//Process
		printInorder(aNode.rightChild);//right
	}
	public void printPostorder()
	{
		printPostorder(root);
	}
	private void printPostorder(Node aNode)
	{
		if(aNode == null)
			return;
		printPostorder(aNode.leftChild);//left
		printPostorder(aNode.rightChild);//right
		System.out.println(aNode.data);//Process
	}
	public boolean search(T aData)
	{
		return search(root,aData);
	}
	private boolean search(Node aNode, T aData)
	{
		if(aNode == null)//Leaf
			return false;
		else if(aData.compareTo(aNode.data)<0)//go left
			return search(aNode.leftChild,aData);
		else if(aData.compareTo(aNode.data)>0)//go right
			return search(aNode.rightChild,aData);
		else
			return true;
	}
	public void remove(T aData)
	{
		root = remove(root,aData);
	}
	private Node remove(Node aNode, T aData)
	{
		//Search
		if(aNode == null)//Leaf...the value was not found
			return null;
		else if(aData.compareTo(aNode.data)<0)//go left
			aNode.leftChild = remove(aNode.leftChild,aData);
		else if(aData.compareTo(aNode.data)>0)//go right
			aNode.rightChild = remove(aNode.rightChild,aData);
		else//found it!!!
		{
			//case 0 and half of case 1
			if(aNode.rightChild == null)
				return aNode.leftChild;
			else if(aNode.leftChild == null)//other part of case 1
				return aNode.rightChild;
			//if we get here, aNode has two children
			//Case 2
			Node temp = findMinInTree(aNode.rightChild);
			aNode.data = temp.data;
			//takes care of the duplicate value
			aNode.rightChild = remove(aNode.rightChild,temp.data);
		}
		return aNode;
	}
	private Node findMinInTree(Node aNode)
	{
		if(aNode == null)
			return null;
		else if(aNode.leftChild == null)
			return aNode;
		else
			return findMinInTree(aNode.leftChild);
	}
	public String findMaxArea()
	{
		return findMaxArea(root);
	}
	private String findMaxArea(Node aNode)
	{
		if(aNode == null)
			return null;
		else if(aNode.rightChild == null)
			return aNode.data.toString();
		else
			return findMaxArea(aNode.rightChild);
	}
	public void removeShapesGreaterThan(T s)
	{
		removeShapesGreaterThan(root, s);
	}
	private Node removeShapesGreaterThan(Node aNode, T s)
	{
		if(aNode == null)
			return null;
		removeShapesGreaterThan(aNode.leftChild, s);
		removeShapesGreaterThan(aNode.rightChild, s);
		if(aNode.data.compareTo(s) > 0)
		{
			remove(aNode.data);
			return aNode;
		}
		return aNode;
	}
	public String printPreorderFile()
	{
		if(root == null)
		{
			return "No Data";
		}
		return printPreorderFile(root);
	}
	
	private String printPreorderFile(Node aNode)
	{
		if(aNode == null)
		{
			return "";
		}
		String tree1 = aNode.data.toString() + "\n";
		tree1 += printPreorderFile(aNode.leftChild);
		tree1 += printPreorderFile(aNode.rightChild);
		return tree1;
	}
	public void writeFile(String aGame) //creates a new file
	{
		try
		{
			PrintWriter fileWriter = new PrintWriter(new FileOutputStream(new File(aGame)));
			fileWriter.println(printPreorderFile());
			fileWriter.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
