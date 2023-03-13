// Made By Damian Sclafani
package CSCE145AND146;
import java.util.*;

public class MinHeapTester {
    
    public void MinHeapTesterMain() {
		MinHeap<String> strHeap = new MinHeap<String>();
		
		strHeap.add("aa");
		strHeap.add("aaaaaa");
		strHeap.add("aaa");
		strHeap.add("aaaaaaaaaaaa");
		strHeap.add("aaaa");
		
		strHeap.print();
		
		for(int i = 0; i < 5; i++)
			System.out.println(strHeap.remove());
		
		LinkedList<Integer> iLL = new LinkedList<Integer>();//built in to java
		Stack<Integer> iStack = new Stack<Integer>();//built in to Java
		Queue<Integer> iQ = new LinkedList<Integer>();//built in
		PriorityQueue<Integer> pQ = new PriorityQueue<Integer>();//Heap//built in to Java
	}
}
