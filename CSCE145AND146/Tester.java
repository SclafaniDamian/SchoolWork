// Made By Damian Sclafani
package CSCE145AND146;

public class Tester {
    
    public void TesterLinkedBSTMain() {
		// TODO Auto-generated method stub
		//Object o = new Object();
		
		LinkedBST<Integer> bst = new LinkedBST<Integer>();
		//int[] a = {8,2,12,1,4,10,16};
		//int[] a = {1,2,3,4,5,6,7};
		int[] a = {85,65,125,25,75,115,225};
		for(int i : a)
			bst.add(i);
		bst.remove(65);
		bst.remove(85);
		bst.printPreorder();
		//System.out.println();
		//bst.printInorder();
		
		//LinkedBST<Object> oBst = new LinkedBST<Object>();
		//LinkedBST<SomeObject> oBst = new LinkedBST<SomeObject>();
		
		//bst.remove(8);
	}

	public void MaxHeapTester() {
		MaxHeap<Integer> iHeap = new MaxHeap<Integer>();
		MaxHeap<Double> dHeap = new MaxHeap<Double>();
		MaxHeap<String> sHeap = new MaxHeap<String>();
		
		/*sHeap.add("aaa");
		sHeap.add("aaaaaa");
		sHeap.add("a");
		sHeap.add("aa");
		sHeap.add("aaaaaaaaaaaaaaa");
		sHeap.print();
		
		for(int i = 0; i < 5; i++)
			System.out.println(sHeap.remove());*/
		iHeap.add(23);
		iHeap.add(45);
		iHeap.add(1);
		iHeap.add(3);
		iHeap.add(17);
		iHeap.add(4);
		iHeap.add(56);
		iHeap.print();
	}
}
