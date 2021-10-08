package Map;

import java.util.HashMap;

//WAP to test if a HashMap contains a mapping for the specified value
public class Q12valueContain {
	public static void main(String[] args) {
		HashMap<Integer,String>m= new HashMap();
		m.put(45, "Mayuri");
		m.put(32, "Gouri");
		m.put(67, "Arati");
		m.put(43, "Namrata");
		System.out.println(m);
		
		System.out.println("is the Mayuri is in map or not : "+m.containsValue("Mayuri"));
		System.out.println("is the Amol is in map or not : "+m.containsValue("Amol"));
	}

}
