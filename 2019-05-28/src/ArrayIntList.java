//ArrayIntList stores and works with a list of integers
public class ArrayIntList {
	private int[] elementData;
	private int size;
	
	public static final int DEFAULT_CAPACITY = 100;
	
	public ArrayIntList() {
		this(DEFAULT_CAPACITY);
	}
	
	public ArrayIntList(int capacity) {
		if(capacity < 0) {
			throw new IllegalArgumentException("Capacity: "+capacity);
		}
		elementData = new int[capacity];
		size = 0;
	}
	
	//Return the size, current elements in the list
	public int size() {
		return size;
	}
	
	//Return the integer at the given index
	public int get(int index) {
		checkIndex(index);
		return elementData[index];
	}

	private void checkIndex(int index) {
		if(index >= size || index < 0) {
			throw new IndexOutOfBoundsException("Index"+index);
		}
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
}
