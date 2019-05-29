import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ch14test {

	public static void main(String[] args) {
		
		//Work with queue
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(12);
		q.add(-33);
		q.add(8);
		q.add(4);
		q.add(12);
		removeAll(q, 12);
		
		//Work with stack
		Stack<Integer> s1 = new Stack<Integer>();
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s1.add(4);
		s1.add(5);
		Stack<Integer> s2 = new Stack<Integer>();
		s2.add(3);
		s2.add(4);
		s2.add(5);
		s2.add(7);
		s2.add(7);
		System.out.println(sameParityPattern(s1, s2));
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}

	//Remove all occurrences of a value from a queue
	public static void removeAll(Queue<Integer> q, int value) {
		int oldsize = q.size();
		for(int i = 0; i < oldsize; i++) {
			int n = q.remove();
			if (n != value) {
				q.add(n);
			}
		}
		System.out.println(q.toString());
	}
	
	//Compare two stacks for similarity of parity (even or odd)
	public static boolean sameParityPattern(Stack<Integer> s1, Stack<Integer>s2) {
		boolean same = true;
		Stack<Integer> s1temp = new Stack<Integer>();
		Stack<Integer> s2temp = new Stack<Integer>();
		if(s1.size() != s2.size()) {
			same = false;
		} else {
			while(same && !s1.isEmpty()) {
				int num1 = s1.pop();
				int num2 = s2.pop();
				s1temp.push(num1);
				s2temp.push(num2);
				if(num1%2 != num2%2) {
					same = false;
				}
			}
			while(!s2temp.isEmpty()) {
				s1.push(s1temp.pop());
				s2.push(s2temp.pop());
			}
		}
		return same;
	}
	
}
