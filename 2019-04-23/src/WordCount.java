import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//use maps to implement the word count to see which words occur most frequently in the novel
public class WordCount {

	public static final int OCCURRENCES = 4000;
	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println("Display the words which occur most frequently in Moby Dick.");
		//Read the book into a map
		Scanner in = new Scanner(new File("mobydick.txt"));
		Map<String, Integer> wordCountMap = getCountMap(in);
		
		for(String word : wordCountMap.keySet()) {
			int count = wordCountMap.get(word);
			if(count >= OCCURRENCES) {
				System.out.println(word);
			}
		}
	}
	
	private static Map<String, Integer> getCountMap(Scanner in) {
		Map<String, Integer> wordCountMap = new TreeMap<String, Integer>();
		while(in.hasNext()) {
			String word = in.next().toLowerCase();
			if(!wordCountMap.containsKey(word)) {
				wordCountMap.put(word, 1);
			} else {
				wordCountMap.put(word, wordCountMap.get(word)+1);
			}
		}
		return wordCountMap;
	}

}
