//Simple binary tree that constructs a tree of ints, prints it, prints the data using pre, in and post-order traversal 
//The nodes are numbered starting with 1 and sequentially level by level with no gaps in the tree
public class IntTree {

	private IntTreeNode overallRoot;
	//Pre: max > 0
	//Construct a sequential tree with a given number of nodes
	public IntTree(int max) {
		if (max <= 0) {
			throw new IllegalArgumentException("Max: " + max);
		}
		overallRoot = buildTree(1, max);
	}
	
	//Return a sequential tree with n as its root unless n > max in which case it will be an empty tree
	private IntTreeNode buildTree(int n, int max) {
		if(n > max) {
			return null;
		} else {
			return new IntTreeNode(n, buildTree(2*n, max), buildTree(2*n+1, max));
		}
	}
	
	//prints the tree contents in pre-order traversal
	public void printPreorder() {
		System.out.print("Preorder");
		printPreorder(overallRoot);
		System.out.println();
	}

	//Print the tree using pre-order traversal with the given root
	private void printPreorder(IntTreeNode root) {
		if (root != null) {// If not empty
			System.out.print(" " + root.data);
			printPreorder(root.left);
			printPreorder(root.right);
		}
	}
	
	//Print the tree in order with a given root
	public void printInorder() {
		System.out.print("Inorder");
		printInorder(overallRoot);
		System.out.println();
	}

	private void printInorder(IntTreeNode root) {
		if (root != null) {// If not empty
			printInorder(root.left);
			System.out.print(" " + root.data);
			printInorder(root.right);
		}
	}
	
	//Print the tree in  postorder with a given root
	public void printPostorder() {
		System.out.print("Postorder");
		printPostorder(overallRoot);
		System.out.println();
	}

	private void printPostorder(IntTreeNode root) {
		if (root != null) {// If not empty
			printPostorder(root.left);
			printPostorder(root.right);
			System.out.print(" " + root.data);
		}
	}
	
	//Counting the empty parts of the tree
	public int countEmpty() {
		if(overallRoot != null) {
			int count = countEmpty(overallRoot);
			return count;
		} else {
			return(1);
			}
	}
	
	private int countEmpty(IntTreeNode root) {
		int count = 0;
		if (root.left != null) {
			count += countEmpty(root.left);
		} else {
			count ++;
			}
		if(root.right != null) {
			count += countEmpty(root.right);
		} else {
			count ++;
		}
		return count;
	}
	
	//Print in reversed order the tree indenting each line to the given level to show node depth
	//Print right to left 
	public void printSideways() {
		printSideways(overallRoot, 0);
	}

	private void printSideways(IntTreeNode root, int level) {
		if (root != null) {// If not empty
			printSideways(root.right,level+1);
			String indent = "";
			for(int n = 0; n < level; n++) {
				indent += "   ";
			}
			System.out.println(indent + root.data);
			printSideways(root.left,level+1);
		}
	}
	
}
