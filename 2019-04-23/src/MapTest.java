import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {

		//Create a map
		Map<String, Double> salaryMap = new HashMap<String, Double>();
		
		//Add key value pairs
		salaryMap.put("Stuart Reges", 100000.00);
		salaryMap.put("Marty Stepp", 20000.00);
		salaryMap.put("Mickey Mouse", 1000000.00);
		
		System.out.println(salaryMap);
		
		//Look at a value
		double mickeySalary = salaryMap.get("Mickey Mouse");
		System.out.printf("Mickey's Salary is $%.2f\n", mickeySalary);
		
		//Create SSN and name map
		Map<Integer, String> ssnMap = new TreeMap<Integer, String>();
		
		ssnMap.put(111111111, "Stuart Reges");
		ssnMap.put(123456789, "Marty Steppe");
		ssnMap.put(999999999, "Mickey Mouse");
		
		Set<Integer> ssnSet = ssnMap.keySet();
		for(int ssn : ssnSet) {
			System.out.println(ssnMap.get(ssn)+": "+ssn);
		}
		
		//Loop over each person's name
		Collection<String> names = ssnMap.values();
		for(String name : names) {
			System.out.println("Name: "+name);
		}

	}

}
