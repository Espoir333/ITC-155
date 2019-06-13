import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Final {

	public static void main(String[] args) {
		
		/*
		 * Derek Hendrick
		 * Joanna Gromadzka
		 * Jennifer Villacis
		 */
		
		//Question1 O(N^2)
		//Question2
		Stack<Integer> sta1 = new Stack<Integer>();
		sta1.add(1);
		sta1.add(2);
		sta1.add(3);
		sta1.add(4);
		sta1.add(5);
		sta1.add(6);
		sta1.add(7);
		
		Stack<Integer> sta2 = copyStack(sta1);
		
		System.out.println(sta1);
		System.out.println(sta2);
		
		//Question3
		//isSorted is within the LinkedIntList
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
	
	public static Stack<Integer> copyStack(Stack<Integer> sta1) {
		Stack<Integer> sta2 = new Stack<Integer>();
		Queue<Integer> qqq = new LinkedList<Integer>();
		
		//Step 1
		while(!sta1.isEmpty()) {
			qqq.add(sta1.pop());
		}
		
		//Step 2
		while(!qqq.isEmpty()) {
			sta1.add(qqq.remove());
		}
		
		//Step 3
		while(!sta1.isEmpty()) {
			qqq.add(sta1.pop());
		}
		
		//Step4
		while(!qqq.isEmpty()) {
			sta1.add(qqq.peek());
			sta2.add(qqq.remove());
		}
		return(sta2);
	}

}
