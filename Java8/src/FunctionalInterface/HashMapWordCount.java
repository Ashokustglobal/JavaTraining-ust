package FunctionalInterface;
import java.util.HashMap;
import java.util.Map;
public class HashMapWordCount {

	// Java Program to find the occurrence
	// of words in a String using HashMap.
	 
		public static void main(String[] args)
		{

			String str = "Alice is girl and Bob is boy";
			 
			 Map<String,Integer> hashMap = new HashMap<>();
			 
			String[] words = str.split(" ");

			for (String word : words) {
				 
	           
	            Integer integer = hashMap.get(word);
	 
	            if (integer == null)
	                
	            	hashMap.put(word, 1);
				else {
					 
					hashMap.put(word, integer + 1);
				}
			}
			System.out.println(hashMap);
		}
	}

	

