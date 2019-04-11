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
		
		System.out.println(myList);
		
		removeEvenLength(myList);
		
		System.out.println("");
		
		System.out.println(myList);

	}
	
	public static ArrayList<String> removeEvenLength(ArrayList<String> myList) {
		
		for(int n = 0; n < myList.size(); n++) {
			String myString = myList.get(n);
			int myStringLength = myString.length();
			if(myStringLength % 2 == 0) {
				myList.remove(n);
			}
		}
		return myList;
	}

}
