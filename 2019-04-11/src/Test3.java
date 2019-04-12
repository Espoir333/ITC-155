import java.util.ArrayList;

public class Test3 {

	public static void main(String[] args) {
	
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(13);
		list.add(47);
		list.add(15);
		list.add(9);
		
		int sum = 0;
		for(int n : list) {
			sum += n;
		}
		
		System.out.println(list);
		System.out.println("Sum: " + sum);
		
	}
	
}
