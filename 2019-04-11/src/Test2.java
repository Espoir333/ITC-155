import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<String>();
		
		words.add("seal");
		words.add("cat");
		words.add("dog");
		words.add("fox");
		words.add("sloth");
		
		System.out.println("Words:" + words);
		
		for(int i = 0; i < words.size(); i+=2) {
			words.add(i, "~");
		}
		
		System.out.println("After we add the tilde:" + words);
		
		for(int i = 0; i < words.size(); i++) {
			words.remove(i);
		}
		
		System.out.println("After we remove the tilde:" + words);
		
	}

}
