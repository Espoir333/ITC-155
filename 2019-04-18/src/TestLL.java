import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class TestLL {

	public static void main(String[] args) {
		
		LinkedList<String> animals = new LinkedList<String>();
		animals.add("cat");
		animals.add("dog");
		animals.add("seal");
		animals.add("wolverine");
		
		System.out.println(animals);
		
		removeEvenLength(animals);
		
		System.out.println(animals);
		
		System.out.println(longest(animals));
	}
	
	//Improved removeEvenLengths uses LinkedList and iterator
	public static void removeEvenLength(LinkedList<String> list){
		Iterator<String> i = list.iterator();
		while(i.hasNext()) {
			String element = i.next();
			if(element.length() % 2 == 0) {
				i.remove();
			}
		}
	}
	
	//Return longest string in a list
	public static String longest(List<String> list) {
		Iterator<String> i = list.iterator();
		String result = i.next();
		while(i.hasNext()) {
			String next = i.next();
			if(next.length() > result.length()) {
				result = next;
			}
		}
		return result;
	}
}
