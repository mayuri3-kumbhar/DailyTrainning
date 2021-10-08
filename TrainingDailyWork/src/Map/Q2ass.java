package Map;

import java.util.HashMap;
//WAP add elements to HashMap without using generics, 0th location use String as key and Integer as value,
//on 1st location use String as key String and Integer as value.
public class Q2ass {
	public static void main(String[] args) {
		HashMap m= new HashMap();
		m.put(23, "Mayuri");
		m.put("Gouri", 7);
		System.out.println(m);
		
	}

}
