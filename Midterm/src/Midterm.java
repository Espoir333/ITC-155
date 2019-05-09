import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Midterm {

	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<Integer>();

		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(1);
		myList.add(1);
		myList.add(1);
		myList.add(1);
		System.out.println(maxOccurrences(myList));

		/*
		Derek Hendrick
		Jennifer Villacis 
		Joanna Gromadzka
		
		mystery2
		1 2 6 8
		10 30 40 20 60 50
		-4 1 25 4 16 9 64 36 49
		
		mystery3
		6 = 6
		17 = 8
		*/
	}
	
	public static int maxOccurrences(List<Integer> numbers) {
		int numberSize = numbers.size();
		if(numberSize == 0) {
			return 0;
		} else {
			Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
			for(int i = 0; i < numberSize; i++) {
				int key = numbers.get(i);
				if (myMap.containsKey(key)) {
					int num = myMap.get(key);
					num = num+1;
					myMap.put(key, num);
				} else {
					myMap.put(key, 1);
				}
			}
			int mode = 0;
			for(int i = 0; i < numberSize; i++) {
				int key = numbers.get(i);
				int count = myMap.get(key);
				if(count > mode) {
					mode = count;
				}
			}
			return mode;
			
		}
		
	}

}
