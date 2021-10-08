package Map;
import java.util.HashMap;
import java.util.Map;
public class Occuranceofword {
	
		public static void main(String[] args) {
			Occuranceofword  countWordTest = new Occuranceofword ();
	        countWordTest.countWords("Java is robust Java is simple");
	    }
	 
	    public void countWords(String input) {
	        Map <String, String> map = new HashMap <String, String> ();
	 
	        if (input != null) {
	            String[] separatedWords = input.split(" ");
	            for (String str: separatedWords) {
	                if (map.containsKey(str)) {
	                    int count = Integer.parseInt(map.get(str));
	                    map.put(str, String.valueOf(count + 1));
	                } else {
	                    map.put(str, "1");
	                }
	            }
	        }
	 
	        System.out.println("Count :- " + map);
	    }
	 
	
	}


