import java.util.List;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static List<Integer> removeInRange(List<Integer> myList, int value, int start, int end) {
		int n = end-1;
		while(n >= start) {
			if(myList.get(n) == value) {
				myList.remove(n);
			}
			n --;
		}
		return myList;
	}

}
