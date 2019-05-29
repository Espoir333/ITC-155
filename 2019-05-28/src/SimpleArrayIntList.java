//Simple version of ArrayList of integers
public class SimpleArrayIntList {
	private int[] elementData;
	private int size;
	
	//Constructor
	public SimpleArrayIntList() {
		elementData = new int[100];
		size = 0;
	}
	
	public void add(int value) {
		elementData[size] = value;
		size++;
	}
	
	public String toString() {
		String print = "[";
		for(int n = 0; n < size; n++) {
			if(n == 0) {
				print += elementData[n];
			} else {
				print += ", "+elementData[n];
			}
		}
		print += "]";
		return print;
	}
}
