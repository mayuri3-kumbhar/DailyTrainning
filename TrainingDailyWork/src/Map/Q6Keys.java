package Map;
//WAP to get only the Keys from a HashMap

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Q6Keys {
	public static void main(String[]args)
	{
		HashMap<Integer,String> m=new HashMap<>();
		m.put(45, "Mayuri");
		m.put(23, "Pooja");
		m.put(76, "Vaishnavi");
		m.put(45, "Neha");
		m.put(null, "Namrata");
		m.put(44, "Rutuja");
		System.out.println(m);
		
		Set<Integer> s=m.keySet();
		Iterator <Integer>i=s.iterator();
		while(i.hasNext())
		{
			Integer key=i.next();
			System.out.println("  key : " +key);
		}
		
		
	}

}
