
public class IntTreeNode {

	public int data;
	public IntTreeNode left;
	public IntTreeNode right;
	
	//Construct a leaf node with given data
	public IntTreeNode(int data) {
		this(data, null, null);
	}
	
	//Construct a branch node with data, left, and right subtrees
	public IntTreeNode(int data, IntTreeNode left, IntTreeNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
}
