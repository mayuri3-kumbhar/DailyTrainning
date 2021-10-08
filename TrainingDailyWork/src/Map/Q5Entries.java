package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
//WAP to get all the entries from a HashMap. Iterate the entries and print the Key & Value values
public class Q5Entries {
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

		Set<Map.Entry<Integer, String>> entryset=m.entrySet();
		Iterator<Map.Entry<Integer, String>> it=entryset.iterator();
		while(it.hasNext())
		{
			Map.Entry<Integer, String> entry=(Map.Entry<Integer, String>)it.next();
			System.out.println("Key : "+entry.getKey()+"  Value: "+entry.getValue());
			
		}
		System.out.println("_________________________________________________________");
		
		
		//using foreach
		for(Integer key : m.keySet())
		{
		    String value = m.get(key);
		    System.out.println(" " + key + ":" + value);
		}
		
		
	}

}
