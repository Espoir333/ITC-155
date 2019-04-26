
public class Stars {

	public static void main(String[] args) {

		stars(9);
		System.out.println();
		System.out.print(pow(4,4));
		System.out.println();
		binary(2);

		

	}
	
	public static void stars(int n) {
		if(n == 0) {
			//NOTHING
		} else {
			
			stars(n-1);
			System.out.print("*");
		}
	}
	
	public static int pow(int num, int ex) {
		if(ex == 0) {
			return 1;
		} else {
			return num * pow(num, ex-1);
		}
	}
	
	public static void binary(int num){
		if (num < 2) {
			System.out.print(num);
		} else {
			binary(num / 2);
			binary(num % 2);
		}
		
	}

}
