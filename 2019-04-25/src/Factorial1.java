
public class Factorial1 {

	public static void main(String[] args) {
		System.out.println(loopfac(14,1));
		System.out.println(recufac(14));

	}
	
	public static int loopfac(int number, int fact) {
		int fac = fact;
		for(int n = 1; n <= number; n++) {
			fac *= n;
		}
		return fac;
	}
	
	public static int recufac(int n) {
		if(n==1) {
			return 1;
		} else {
			return(n*recufac(n-1));
		}
	}

}
