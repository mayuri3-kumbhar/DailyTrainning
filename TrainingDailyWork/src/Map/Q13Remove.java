package Map;

import java.util.HashMap;
//WAP to remove an element from HashMap using key
public class Q13Remove {
	public static void main(String[] args) {
		HashMap<Integer,String>m= new HashMap();
		m.put(45, "Mayuri");
		m.put(32, "Gouri");
		m.put(67, "Arati");
		m.put(43, "Namrata");
		System.out.println(m);
		
		System.out.println("removed key value is : "+m.remove(32));
		System.out.println(m.remove(89));
		
	}

}
