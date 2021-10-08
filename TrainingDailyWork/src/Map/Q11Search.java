package Map;

import java.util.HashMap;

//WAP to search for an element from HashMap using key
public class Q11Search {
	public static void main(String[] args) {
		HashMap<Integer,String> m=new HashMap<>();
		m.put(34, "Amol");
		m.put(45, "Onkar");
		m.put(89, "Sarvesh");
		m.put(57, "Vinayk");
		m.put(12,"Ruturaj");
		
		System.out.println(m.get(12));
		System.out.println(m.get(100));
	}

}
