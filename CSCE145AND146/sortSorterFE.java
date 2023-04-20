// Made By Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;

public class sortSorterFE {
    private Scanner keyboard;

    public void sortSorterFEMain() {
		keyboard = new Scanner(System.in);
		sortSorter list = new sortSorter();
		boolean sortAgain = true;
		while(sortAgain)//lets the user repeat this code as much as they want
		{
			System.out.println("Enter any amount of strings. Enter \"quit\" to quit.");
			boolean quit = false;
			while(!quit)//allows the user to enter any amount of strings until they want to quit
			{
				String input = keyboard.nextLine();
				if(input.equals("quit"))
					quit = true;
				else
					list.addString(input);//adds the entered String to a linked list
			}
			String[] a = new String[list.stringListSize()];//creates an array that is the same size as the linked list after the user is done entering strings
			for(int i = 0; i < list.stringListSize(); i++)//adds the strings from the linked list to the array
			{
				a[i] = list.getString();
				list.next();
			}
			mergeSort(a);//sorts the array
			System.out.println("Sort SORTED!");
			System.out.println();
			for(int i = 0; i < a.length; i++)//prints the array after done sorting
			{
				System.out.println(a[i]);
			}
			list.resetStrings();//resets the linked list so that it can be used again
			System.out.println();
			System.out.println("Do you want to sort strings again? (true or false)");
			sortAgain = keyboard.nextBoolean();
		}
		System.out.println("Goodbye");
	}
	public static void mergeSort(String[] a)
	{
		int size = a.length;
		if(size < 2)//Halting condition
			return;
		int mid = size / 2;
		int leftSize = mid;
		int rightSize = size - mid;
		String[] left = new String[leftSize];
		String[] right = new String[rightSize];
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
	public static void merge(String[] left, String[] right, String[] a)
	{
		int leftSize = left.length;
		int rightSize = right.length;
		int i = 0;//Left array's index
		int j = 0;//Right array's index
		int k = 0;//Merged array a's index
		while(i < leftSize && j < rightSize)
		{
			//TODO create SORT counter method
			int sortAMTi = 0;
			int sortAMTj = 0;
			for(int c = 0; c < left[i].length(); c++)//counts number of SORT's in the left String
			{
				if(left[i].charAt(c) == 's' || left[i].charAt(c) == 'S')
				{
					if(c+1 != left[i].length() && (left[i].charAt(c+1) == 'o' || left[i].charAt(c+1) == 'O'))
					{
						c++;
						if(c+1 != left[i].length() && (left[i].charAt(c+1) == 'r' || left[i].charAt(c+1) == 'R'))
						{
							c++;
							if(c+1 != left[i].length() && (left[i].charAt(c+1) == 't' || left[i].charAt(c+1) == 'T'))
							{
								c++;
								sortAMTi++;
							}
						}
					}
				}
			}
			for(int c = 0; c < right[j].length(); c++)//counts number of SORT's in the right String
			{
				if(right[j].charAt(c) == 's' || right[j].charAt(c) == 'S')
				{
					if(c+1 != right[j].length() && (right[j].charAt(c+1) == 'o' || right[j].charAt(c+1) == 'O'))
					{
						c++;
						if(c+1 != right[j].length() && (right[j].charAt(c+1) == 'r' || right[j].charAt(c+1) == 'R'))
						{
							c++;
							if(c+1 != right[j].length() && (right[j].charAt(c+1) == 't' || right[j].charAt(c+1) == 'T'))
							{
								c++;
								sortAMTj++;
							}
						}
					}
				}
			}
			if(sortAMTi <= sortAMTj)
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
}
