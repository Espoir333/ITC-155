
public class LinkedClient1 {

	public static void main(String[] args) {
		
		LinkedIntList list = new LinkedIntList();
		list.add(18);
		list.add(27);
		list.add(42);
		
		System.out.println(list);
		//Checking if it's sorted...
		System.out.println(list.isSorted());
		
		//Then after adding a value guaranteeing it won't be sorted...
		list.add(41);
		System.out.println(list.isSorted());
		
		LinkedIntList list2 = new LinkedIntList();
		//Also it will come up as true for an empty list.
		System.out.println(list2.isSorted());

	}

}
