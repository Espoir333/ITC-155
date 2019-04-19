import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


public class Sieve {

	public static void main(String[] args) {
		
		System.out.println("This program will tell you all prime numbers up to a max number.");
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("Max number: ");
		int max = console.nextInt();
		
		LinkedList<Integer> primes = sieve(max);
		System.out.println(primes);

	}

	private static LinkedList<Integer> sieve(int max) {

		LinkedList<Integer> primes = new LinkedList<Integer>();
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		
		for(int i = 2; i <= max; i++) {
			numbers.add(i);
		}
		
		while(!numbers.isEmpty()) {
			//remove prime number from the front
			int front = numbers.remove(0);
			primes.add(front);
			
			//remove all multiples of this prime number
			Iterator<Integer> itr = numbers.descendingIterator();
			while(itr.hasNext()) {
				int current = itr.next();
				if(current % front == 0) {//Front is not prime
					itr.remove();
				}
			}
		}
		
		return primes;
		
	}

}
