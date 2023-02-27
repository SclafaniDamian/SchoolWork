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
}
