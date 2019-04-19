import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Lottery {

	public static final int NUMBERS = 6;
	public static final int MAX_NUMBER = 40;
	
	public static void main(String[] args) {
		
		//Get winning numbers and ticket numbers
		Set<Integer> winningNumbers = createWinningNumbers();
		System.out.println(winningNumbers);
		Set<Integer> ticket = getTicket();
		System.out.println();
		
		//Keep only winning numbers
		Set<Integer> intersection = new TreeSet<Integer>(ticket);
		intersection.retainAll(winningNumbers);
		
		//Print results
		System.out.println("Your ticket numbers: " + ticket);
		System.out.println("Winning numbers: " + winningNumbers);
		System.out.println("You had " + intersection.size() + " numbers. ");
		System.out.println("The matched numbers are: " + intersection);
		
		//Calculate prize
		double prize = 1 * Math.pow(10, intersection.size());
		if(intersection.size() == 0) {
			prize = 0;
		}
		System.out.println("Your prize is: $"+prize);
		
	}

	public static Set<Integer> createWinningNumbers() {
		Set<Integer> winningNumbers = new TreeSet<Integer>();
		Random r = new Random();
		while(winningNumbers.size() < NUMBERS) {
			int number = r.nextInt(MAX_NUMBER) + 1;
			winningNumbers.add(number);
		}
		return winningNumbers;
	}
	
	public static Set<Integer> getTicket() {
		Set<Integer> ticket = new TreeSet<Integer>();
		Scanner console = new Scanner(System.in);
		System.out.println("Type your " + NUMBERS + " unique lotto numbers");
		while(ticket.size() < NUMBERS) {
			int number = console.nextInt();
			if(number <= MAX_NUMBER) {
				ticket.add(number);
			}
		}
		return ticket;
	}



}
