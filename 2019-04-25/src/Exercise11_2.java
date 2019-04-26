import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Exercise11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static List<Integer> alternate(List<Integer> myList1, List<Integer> myList2) {
		List<Integer> myNewList = new ArrayList<Integer>();
		Iterator<Integer> itr1 = myList1.iterator();
		Iterator<Integer> itr2 = myList2.iterator();
		while(itr1.hasNext() || itr2.hasNext()) {
			if(itr1.hasNext()) {
				myNewList.add(itr1.next());
			}
			if(itr2.hasNext()) {
				myNewList.add(itr2.next());
			}
		}
		return myNewList;
	}

}
