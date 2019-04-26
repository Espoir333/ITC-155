import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Exercise6 {

	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		myList.add(6);
		myList.add(6);
		myList.add(3);
		myList.add(27);

		System.out.println("The number of unique values in this array is "+countUnique(myList)+".");
	}
	
	public static int countUnique(List<Integer> myList) {
		TreeSet<Integer> mySet = new TreeSet<Integer>(myList);
		return mySet.size();
	}

}
