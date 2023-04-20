// Made By Damian Sclafani
package CSCE145AND146;

public class SortingAlgorithms {
    

    public void SortingAlgorithmsMain() {

		int[] array = {8,7,6,5,4,3,2,1};
		//mergeSort(array);
		quickSort(array);
		printArray(array);
	}
	public static void selectionSort(int[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			int smallestIndex = i;
			for(int j = i+1; j < a.length; j++)
			{
				if(a[j] < a[smallestIndex])
				{
					smallestIndex = j;
				}
			}
			if(i != smallestIndex)
			{
				//SWAP
				int temp = a[i];
				a[i] = a[smallestIndex];
				a[smallestIndex] = temp;
			}
		}
	}
	public static void bubbleSort(int[] a)
	{
		boolean hasSwapped = true;
		while(hasSwapped)
		{
			hasSwapped = false;
			for(int i = 0; i < a.length-1; i++)
			{
				if(a[i] > a[i+1])
				{
					//SWAP
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					hasSwapped = true;
				}
			}
		}
	}
	public static void mergeSort(int[] a)
	{
		int size = a.length;
		if(size < 2)//Halting condition
			return;
		int mid = size / 2;
		int leftSize = mid;
		int rightSize = size - mid;
		int[] left = new int[leftSize];
		int[] right = new int[rightSize];
		//Add values to left and right array
		for(int i = 0; i < mid; i++)
			left[i] = a[i];
		for(int i = mid; i < size; i++)
			right[i-mid] = a[i];
		//Recursive Calls MergeSort
		mergeSort(left);
		mergeSort(right);
		//merge
		merge(left,right,a);
	}
	public static void merge(int[] left, int[] right, int[] a)
	{
		int leftSize = left.length;
		int rightSize = right.length;
		int i = 0;//Left array's index
		int j = 0;//Right array's index
		int k = 0;//Merged array a's index
		while(i < leftSize && j < rightSize)
		{
			if(left[i] <= right[j])
			{
				a[k] = left[i];
				i++;
				k++;
			}
			else
			{
				a[k] = right[j];
				j++;
				k++;
			}
		}
		while(i < leftSize)
		{
			a[k] = left[i];
			i++;
			k++;
		}
		while(j < rightSize)
		{
			a[k] = right[j];
			j++;
			k++;
		}
	}
	public static void printArray(int[] a)
	{
		for(int i : a)
			System.out.print(i + " ");
	}
	public static void mergeSortInLine(int[] a)
	{
		//copy array
		int[] copy = copyArray(a);
		split(a,copy,0,a.length);
	}
	public static void split(int[] left, int[] right, int start, int end)
	{
		if(end - start <= 1)//Halting condition
			return;
		int mid = (start+end)/2;
		split(right,left,start,mid);
		split(right,left,mid,end);
		//merge
		merge(left,right,start,mid,end);
	}
	public static void merge(int[] left, int[] right, int start, int mid, int end)
	{
		int i = start;
		int j = mid;
		for(int k = start; k < end; ++k)
		{
			if(i < mid && (j>=end || right[i] < right[j]))
				left[k] = right[i++];
			else
				left[k] = right[j++];
		}
	}
	public static int[] copyArray(int[] a)
	{
		int[] ret = new int[a.length];
		for(int i = 0; i < a.length;i++)
			ret[i] = a[i];
		return ret;
	}
	public static void quickSort(int[] a)
	{
		quickSort(a,0,a.length-1);
	}
	public static void quickSort(int[] a, int start, int end)
	{
		if(start >= end)//Halting condition
			return;
		int pivotIndex = partition(a,start,end);
		quickSort(a,start,pivotIndex-1);
		quickSort(a,pivotIndex+1,end);
	}
	public static int partition(int[] a, int start, int end)
	{
		int pivot = a[end];
		int i = start;
		for(int j = start; j <= end; j++)
		{
			if(a[j] < pivot)
			{
				//SWAP
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
			}
		}
		//Swap the pivot value
		int temp = a[i];
		a[i] = a[end];
		a[end] = temp;
		return i;
	}
}
