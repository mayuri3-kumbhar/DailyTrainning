package Map;
//WAP to create a map using Wrapper class as key and value same as keys� data type WAP to count the number 
//of key-value (size) mappings in a map.

import java.util.HashMap;

public class Q4ass {
	public static void main(String[] args) {
		HashMap<Integer,String>m= new HashMap();
		m.put(45, "Mayuri");
		m.put(32, "Gouri");
		m.put(67, "Arati");
		m.put(43, "Namrata");
		System.out.println(m);
		System.out.println("size of map : "+m.size());
	}
}
