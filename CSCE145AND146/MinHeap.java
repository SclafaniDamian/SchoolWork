// Made By Damian Sclafani
package CSCE145AND146;

public class MinHeap <T extends Comparable<T>> {
    private T[] heap;
	public static final int DEF_SIZE = 128;
	private int size;//First null element
	public MinHeap()
	{
		init(DEF_SIZE);
	}
	public MinHeap(int size)
	{
		init(size);
	}
	private void init(int size)
	{
		if(size > 0)
		{
			heap = (T[])(new Comparable[size]);
			size = 0;
		}
		else
			init(DEF_SIZE);
	}
	public void add(T aData)
	{
		if(size >= heap.length)
			return;//Heap is full
		heap[size] = aData;
		this.bubbleUp();
		size++;
	}
	private void bubbleUp()
	{
		int index = size;//Where we currently are at
		while(index > 0 && heap[pIndex(index)].compareTo(heap[index])>0)
		{
			T temp = heap[pIndex(index)];
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
	public T remove()
	{
		if(size <= 0)
			return null;
		T ret = heap[0];
		heap[0] = heap[size-1];
		heap[size-1] = null;
		size--;
		this.bubbleDown();
		return ret;
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
				T temp = heap[index];
				heap[index] = heap[smallIndex];
				heap[smallIndex] = temp;
			}
			else
				break;
			index = smallIndex;
		}
	}
	public void print()
	{
		for(T h : heap)
		{
			if(h == null)
				break;
			System.out.println(h);
		}
	}
}
