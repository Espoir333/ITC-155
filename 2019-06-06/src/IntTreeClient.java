
public class IntTreeClient {

	public static void main(String[] args) {
		
		//Construct a new tree
		IntTree t = new IntTree(12);
		System.out.println("Tree structure: ");
		t.printPreorder();
		t.printInorder();
		t.printPostorder();

		t.printSideways();
		
		System.out.println("Empty:"+t.countEmpty());
	}

}
