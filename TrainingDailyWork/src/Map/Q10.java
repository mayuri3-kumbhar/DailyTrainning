package Map;

import java.util.HashMap;
//WAP to test if a HashMap contains a mapping for the specified key.
public class Q10 {
	public static void main(String[] args) {
		HashMap<Integer,String>m= new HashMap();
		m.put(45, "Mayuri");
		m.put(32, "Gouri");
		m.put(67, "Arati");
		m.put(43, "Namrata");
		System.out.println(m);
		
		if(m.containsKey(56))
		{
			System.out.println("key is present");
		}
		else
		{
			System.out.println("key is not present");
		}
		
		//System.out.println("is the 56 is in map or not : "+m.containsKey(56));
		//System.out.println("is the 32 is in map or not : "+m.containsKey(32));
	}

}
