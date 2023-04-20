// Made By Damian Sclafani
package CSCE145AND146;
/*
 * CSCE 146 S2022 Exam02 Question01
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 * You may write additional methods to help
 */
//Do not alter-----------------------------------------------------------------------
public class CSCE146Question01 {
    
    public static void sort(PepperoniPizza[] pizzas)//uses merge sort to fit the O(nlg(n)) complexity requirement
	{
//-----------------------------------------------------------------------------------	
		//Write your solution here
		int size = pizzas.length;
		if(size < 2)//Halting condition
			return;
		int mid = size / 2;
		int leftSize = mid;
		int rightSize = size - mid;
		PepperoniPizza[] left = new PepperoniPizza[leftSize];
		PepperoniPizza[] right = new PepperoniPizza[rightSize];
		//Add values to left and right array
		for(int i = 0; i < mid; i++)
			left[i] = pizzas[i];
		for(int i = mid; i < size; i++)
			right[i-mid] = pizzas[i];
		//Recursive Calls MergeSort
		sort(left);
		sort(right);
		//merge
		merge(left,right,pizzas);
	}//Do not alter this
	//Write any additional helper properties or methods here
	public static void merge(PepperoniPizza[] left, PepperoniPizza[] right, PepperoniPizza[] a)
	{
		int leftSize = left.length;
		int rightSize = right.length;
		int i = 0;//Left array's index
		int j = 0;//Right array's index
		int k = 0;//Merged array a's index
		while(i < leftSize && j < rightSize)
		{
			if(left[i].getPepperonis() >= right[j].getPepperonis())
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
	//}
	//--------------------------------------------------------------------------------
	//Test your code here. You may alter this as needed.
    public void CSCE146Question01Main() {
		PepperoniPizza[] array = {new PepperoniPizza(10),
				new PepperoniPizza(5),
				new PepperoniPizza(3),
				new PepperoniPizza(1),
				new PepperoniPizza(8),
				new PepperoniPizza(6)};
		sort(array);
		for(PepperoniPizza w : array)
			System.out.println(w);
	}
	//--------------------------------------------------------------------------------
}//Do not alter this
