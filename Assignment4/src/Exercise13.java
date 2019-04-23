import java.util.*;

public class Exercise13 {

	public static void main(String[] args) {
		
		Map<String, String> testMap = new TreeMap<String, String>();
		testMap.put("Key1", "Bacon");
		testMap.put("Key2", "Tree");
		testMap.put("Key3", "Squirrel");
		testMap.put("Key4", "Wheel");
		testMap.put("Key5", "Capricorn");
		testMap.put("Key6", "Capricorn");
		testMap.put("Key7", "Silver");
		
		System.out.println(isUnique((TreeMap<String, String>) testMap));
		
	}
	
	public static boolean isUnique(TreeMap<String, String> myMap) {
		TreeSet<String> mySet = new TreeSet<String>(myMap.values());
		int mapSize = myMap.size();
		int setSize = mySet.size();
		if(mapSize == setSize) {
			return true;
		} else {
			return false;
		}
		
	}

}
