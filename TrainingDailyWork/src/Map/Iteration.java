package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Iteration {
	public static void main(String[] args) {
		
	
	HashMap<Integer,String> m=new HashMap<>();
	m.put(34, "Amol");
	m.put(45, "Onkar");
	m.put(89, "Sarvesh");
	m.put(57, "Vinayk");
	m.put(12,"Ruturaj");
	
	//iterating map using iterator to keyset
	System.out.println("iterating map using iterator to keyset");
	Set<Integer> s=m.keySet();
	Iterator <Integer>i=s.iterator();
	while(i.hasNext())
	{
		Integer key=i.next();
		System.out.println("  key : " +key);
		System.out.println(" Value: "+m.get(key));
	}
	//Iterating map using iterator to collection received from collection 
	System.out.println("Iterating map using iterator collection list using values().....");
	Collection list=m.values();
	Iterator <String> itr=list.iterator();
	while(itr.hasNext())
	{
		System.out.println("  values : "+itr.next());
	}
	
	//Iterating map using iterator to entryset
	System.out.println("Iterating map using iterator to entryset");
	Set<Map.Entry<Integer, String>> entryset=m.entrySet();
	Iterator<Map.Entry<Integer, String>> it=entryset.iterator();
	while(it.hasNext())
	{
		Map.Entry<Integer, String> entry=(Map.Entry<Integer, String>)it.next();
		System.out.println("Key : "+entry.getKey()+"  Value: "+entry.getValue());
		
	}
	
	
	}
	
}
