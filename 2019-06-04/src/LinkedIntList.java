//Simple version of the linked list class
public class LinkedIntList {
	
	private ListNode front;
	
	//construct an empty list
	public LinkedIntList(){
		front = null;
	}
	
	//append a value to the end of the list
	public void add(int value) {
		if(front == null) {
			front = new ListNode(value);
		} else {
			ListNode current = front;
			while(current.next != null) {
				current = current.next;
			}
			current.next = new ListNode(value);
		}
	}
	
	//To String method
	public String toString() {
		if(front == null) {
			return "[]";
		} else {
			String result = "[" + front.data; //Fence post
			ListNode current = front.next;
			while(current != null) {
				result += " , " + current.data;
				current = current.next;
			}
			
			result += "]";
			return result;
		}
	}
	
	//return the current number of elements in the list
	public int size() {
		int count = 0;
		ListNode current = front;
		while(current != null) {
			current = current.next;
			count++;
		}
		return count;
	}
	
	//Return the value at the given index in the list
	public int get(int index) {
		return nodeAt(index).data;
	}

	private ListNode nodeAt(int index) {
		ListNode current = front;
		for(int i = 0; i < index; i++) {
			current = current.next;
		}
		return current;
	}
	
	public void add(int index, int value) {
		if(index == 0) {
			front = new ListNode(value, front);
		} else {
			ListNode current = nodeAt(index-1);
			current.next = new ListNode(value, current.next);
		}
	}
	
	public void remove(int index) {
		if(index == 0) {
			front = front.next;
		} else {
			ListNode current = nodeAt(index - 1);
			current.next = current.next.next;
		}
	}
	
}
