
public class Exercise12_2 {

	public static void main(String[] args) {
		writeNums(12);

	}
	
	public static void writeNums(int num) throws IllegalArgumentException{
		if (num < 1){
			throw new IllegalArgumentException(Integer.toString(num));
		}
		if(num == 1){
			System.out.print(num);
		} else {
			writeNums(num-1);
			System.out.print(", " + num);
		}
	}

}
