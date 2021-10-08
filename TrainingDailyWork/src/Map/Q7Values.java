package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
//WAP to get only the Values from a HashMap
public class Q7Values {
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
		
		
		Collection list=m.values();
		Iterator <String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println("  values : "+itr.next());
		}
	}
}
