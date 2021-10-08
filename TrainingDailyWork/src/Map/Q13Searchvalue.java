package Map;

import java.util.HashMap;
//WAP to remove an element from HashMap using key
public class Q13Searchvalue {
	public static void main(String[] args) {
		HashMap<Integer,String> m=new HashMap<>();
		m.put(34, "Amol");
		m.put(45, "Onkar");
		m.put(89, "Sarvesh");
		m.put(57, "Vinayk");
		m.put(12,"Ruturaj");
		
		System.out.println(m.getOrDefault(34, "Amol"));
		System.out.println(m.get(100));

}
}