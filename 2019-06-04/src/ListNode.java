
public class ListNode {

	public int data;	//The data stored in the node
	public ListNode next;	//Link to the next node in the list.
	
	//Constructs a node with a data and a null link
	public ListNode() {
		this(0, null);
	}
	
	//Construct a node with a given data and a null link
	public ListNode(int data) {
		this(data, null);
	}
	
	public ListNode(int data, ListNode next) {
		this.data = data;
		this.next = next;
	}
	
}
