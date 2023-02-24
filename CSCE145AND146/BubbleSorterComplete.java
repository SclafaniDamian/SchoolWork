// Made by Damian Sclafani
package CSCE145AND146;
import java.util.Scanner;
//Do not alter-----------------------------------------------
public class BubbleSorterComplete {
    //-----------------------------------------------------------
	public static final int ARRAY_SIZE = 10;
    //Do not alter-----------------------------------------------
    private Scanner key;
    public void BubbleSorterCompleteMain() {
        //-----------------------------------------------------------
            key = new Scanner(System.in);
            System.out.println("Enter " + ARRAY_SIZE + " numbers and I\'ll sort them");
            int[] array = new int[ARRAY_SIZE];
            for(int i = 0; i < array.length; i++)
            {
                System.out.println("Enter value " + i);
                array[i] = key.nextInt();
            }
            //Bubble Sort
            boolean hasSwapped = true;
            while(hasSwapped)
            {
                hasSwapped = false;
                for(int i = 0; i < array.length-1; i++)
                {
                    if(array[i] > array[i+1])
                    {
                        //Swap
                        int temp = array[i];
                        array[i] = array[i+1];
                        array[i+1] = temp;
                        hasSwapped = true;
                    }
                }
            }
            //print
            for(int i = 0; i < array.length; i++)
            {
                System.out.println(array[i]);
            }
            }//Do not alter
}//Do not alter
