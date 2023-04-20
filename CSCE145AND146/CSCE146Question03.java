// Made By Damian Sclafani
package CSCE145AND146;
/*
 * CSCE 146 S2022 Exam01 Question03
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 */
//Do not alter------------------------------------------------------------------------
public class CSCE146Question03 {
    
    private Candy[] heap = new Candy[10];
	public int size;//First null element
		
	public void add(Candy aData)
	{
//------------------------------------------------------------------------------------	
		//Write your code here
		if(size >= heap.length)
			return;//Heap is full
		heap[size] = aData;
		this.bubbleUp();
		size++;

	}//Do not alter

//Do not alter------------------------------------------------------------------------	
	public Candy remove()
	{
//------------------------------------------------------------------------------------	
		//Write your code here
		if(size <= 0)
			return null;
		Candy ret = heap[0];
		heap[0] = heap[size-1];
		heap[size-1] = null;
		size--;
		this.bubbleDown();
		return ret;

	}//Do not alter

	//Write any additional helper properties or methods here
	private void bubbleUp()
	{
		int index = size;//Where we currently are at
		while(index > 0 && heap[pIndex(index)].compareTo(heap[index])>0)
		{
			Candy temp = heap[pIndex(index)];
			heap[pIndex(index)] = heap[index];
			heap[index] = temp;
			index = pIndex(index);
		}
	}
	private int pIndex(int index)
	{
		return (index-1)/2;
	}
	private int lIndex(int index)
	{
		return index*2+1;
	}
	private int rIndex(int index)
	{
		return index*2+2;
	}
	private void bubbleDown()
	{
		int index = 0;//start at the root
		while(lIndex(index) < size)
		{
			//Determined who is the smaller child
			int smallIndex = lIndex(index);
			if(rIndex(index) < size && heap[lIndex(index)].compareTo(heap[rIndex(index)])>0)
				smallIndex = rIndex(index);
			if(heap[index].compareTo(heap[smallIndex])>0)
			{
				//SWAP
				Candy temp = heap[index];
				heap[index] = heap[smallIndex];
				heap[smallIndex] = temp;
			}
			else
				break;
			index = smallIndex;
		}
	}
	//--------------------------------------------------------------------------------
//Do not alter------------------------------------------------------------------------

	public void printBreadthOrder()
	{
		for(Candy c : this.heap)
		{
			if(c != null)
				System.out.print(c+", ");
			else
				System.out.print("null, ");
		}
		System.out.println();
	}
    public void CSCE146Question03Main() {
		System.out.println("Testing the Add Method");
		Candy[] array = {
				new Candy(100.0),
				new Candy(80.0),
				new Candy(60.0),
				new Candy(40.0),
				new Candy(20.0),
				new Candy(10.0),
				new Candy(30.0),
				new Candy(50.0),
				new Candy(70.0),
				new Candy(90.0)};
		CSCE146Question03 heap = new CSCE146Question03();
		for(Candy c : array)
			heap.add(c);
		heap.printBreadthOrder();
		
		System.out.println("Testing the Remove Method");
		for(int i=0;i<array.length;i++)
			System.out.print(heap.remove()+", ");
	}
	//--------------------------------------------------------------------------------
}//Do not alter
