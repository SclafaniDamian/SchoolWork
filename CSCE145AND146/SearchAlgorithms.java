// Made By Damian Sclafani
package CSCE145AND146;

public class SearchAlgorithms {
    
    public void SearchAlgorithmsMain() {

		int[] array = {5,6,7,8,9,10,11,12};
		//System.out.println(linearSearch(array,11));//returns true
		//System.out.println(linearSearch(array,13));//returns false
		//System.out.println(binarySearch(array,11,0,array.length-1));//returns true
		System.out.println(binarySearch(array,13,0,array.length-1));//returns false
	}
	public static boolean linearSearch(int[] a, int target)
	{
		for(int i = 0; i < a.length; i++) {
			if(a[i] == target)
				return true;
		}
		return false;
	}
	public static boolean binarySearch(int[] a, int target, int start, int end)
	{
		if(start > end)
			return false;
		int mid = (start+end)/2;
		if(a[mid] == target)
			return true;
		else if(a[mid] > target)
			return binarySearch(a,target,start, mid-1);//lower half of the array
		else
			return binarySearch(a,target,mid+1,end);//upper half of the array
	}
}
