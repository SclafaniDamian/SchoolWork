// Made By Damian Sclafani
package CSCE145AND146;

public class DoubleDoubleLL {
    
    private class ListNode
	{
		double data; 
		ListNode link;
		ListNode prev; 
		public ListNode(double aData, ListNode aLink, ListNode aPrev)
		{
			data = aData;
			link = aLink;
			prev = aPrev;
		}
	}
	private ListNode head;
	private ListNode current;
	//private ListNode previous;
	private int size;
	public DoubleDoubleLL()
	{
		head = current = null;
		this.size = 0;
	}
	public void add(double aData)
	{
		ListNode newNode = new ListNode(aData,null,null);
		if(head == null) //list is empty
		{
			head = current = newNode;
			this.size = 1;
			return;
		}
		ListNode temp = head;
		while(temp.link != null)
		{
			temp = temp.link;
		}
		temp.link = newNode;
		newNode.prev = temp;
		this.size++;
	}
	public void remove(double aData)
	{
		ListNode temp = head;
		while(temp != null)
		{
			if(temp.data == aData)
			{
				if(temp.prev == null)
				{
					head = temp.link;
					return;
				}
				else if(temp.link == null)
				{
					temp.prev.link = null;
					return;
				}
				else
				{
					temp.prev.link = temp.link;
					temp.link.prev = temp.prev;
					return;
				}
			}
			temp = temp.link;
		}
	}
	public void print()
	{
		ListNode temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.link;
		}
	}
	public void addAfterCurrent(double aData)
	{
		if(current == null)
		{
			return;
		}
		ListNode newNode = new ListNode(aData,current.link,current);
		current.link.prev = newNode;
		this.size++;
	}
	public double getCurrent()
	{
		if(current == null)
		{
			return 0;
		}
		return current.data;
	}
	public void setCurrent(double aData)
	{
		if(current == null)
		{
			return;
		}
		current.data = aData;
	}
	public void gotoNext()
	{
		if(current != null)
		{
			current = current.link;
		}
	}
	public void gotoPrev()
	{
		if(current != null)
		{
			current = current.prev;
		}
	}
	public void gotoEnd() //moves to the last node
	{
		ListNode temp = head;
		while(temp.link != null)
		{
			temp = temp.link;
		}
		current = temp;
	}
	public void reset()
	{
		current = head;
	}
	public boolean hasMore()
	{
		return current != null;
	}
	public boolean contains(double aData)
	{
		ListNode temp = head;
		while(temp != null)
		{
			if(temp.data == aData)
			{
				return true;
			}
			temp = temp.link;
		}
		return false;
	}
	public void removeCurrent()
	{
		if(current == null)
			return;
		if(current == head)
		{
			head = head.link;
			current = head;
		}
		else
		{
			current.prev.link = current.link;
			current = current.link;
		}
		if(this.size > 0)
		{
			size--;
		}
	}
	public int getSize()
	{
		return this.size;
	}
	public double getAt(int index)
	{
		if(index < 0 || index >= size)
		{
			return -1;
		}
		ListNode temp = head;
		for(int i = 0; i < index; i++)
		{
			temp = temp.link;
		}
		return temp.data;
	}
	public void setAt(int index, double aData)
	{
		if(index < 0 || index >= size)
		{
			return;
		}
		ListNode temp = head;
		for(int i = 0; i < index; i++)
		{
			temp = temp.link;
		}
		temp.data = aData;
	}

}
