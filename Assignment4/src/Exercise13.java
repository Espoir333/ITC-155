import java.util.*;

public class Exercise13 {

	public static void main(String[] args) {
		
		Map<String, String> testMap = new TreeMap<String, String>();
		testMap.put("Key1", "Bacon");
		testMap.put("Key2", "Tree");
		testMap.put("Key3", "Squirrel");
		testMap.put("Key4", "Wheel");
		testMap.put("Key5", "Capricorn");
		
		System.out.println(testMap.get("Key4"));
		
	}
	
	public static boolean isUnique(TreeMap<String, String> myMap) {
		return true;
	}

}
