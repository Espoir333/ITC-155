import java.util.ArrayList;

public class Exercise3 {

	public static void main(String[] args) {
		
		ArrayList<String> myList = new ArrayList<String>();
		
		myList.add("1");
		myList.add("12");
		myList.add("123");
		myList.add("1234");
		myList.add("12345");
		myList.add("123456");
		myList.add("1234567");
		myList.add("12345678");
		myList.add("123456789");
		myList.add("1234567890");
		
		int mySize1 = myList.size();
		for(int n = 0; n < mySize1; n++) {
			System.out.println(myList.get(n));
		}
		
		removeEvenLength(myList);
		
		System.out.println("");
		
		int mySize2 = myList.size();
		for(int n = 0; n < mySize2; n++) {
			System.out.println(myList.get(n));
		}

	}
	
	public static ArrayList<String> removeEvenLength(ArrayList<String> myList) {
		
		int mySize = myList.size();
		for(int n = 0; n < mySize; n++) {
			String myString = myList.get(n);
			int myStringLength = myString.length();
			if(myStringLength % 2 == 0) {
				mySize --;
				myList.remove(n);
			}
		}
		return myList;
	}

}
