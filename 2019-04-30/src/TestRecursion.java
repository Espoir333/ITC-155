
public class TestRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("racecar"));
		System.out.println(isPalindrome("race car"));
		System.out.println(isPalindrome("Racecar"));
		System.out.println(isPalindrome("gohangasalamiimalasagnahog"));
		System.out.println(isPalindrome("sitonapotatopanotis"));
		System.out.println(isPalindrome("tinaemilimeanit"));
		System.out.println(isPalindrome("wontonnotnow"));
		System.out.println(isPalindrome("starrats"));
		System.out.println(isPalindrome("neilanalien"));
	}
	
	public static boolean isPalindrome(String s) {
		if(s.length() < 2) {
			return true;
		} else {
			char first = s.charAt(0);
			char last = s.charAt(s.length()-1);
			if (first != last) {
				return false;
			} else {
				String middle = s.substring(1, s.length()-1);
				return isPalindrome(middle);
			}
		}
	}

}
