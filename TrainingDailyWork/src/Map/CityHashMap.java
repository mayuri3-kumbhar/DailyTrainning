package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class CityHashMap {
	public static void main(String[] args) {
		HashMap<Integer,String> a= new HashMap<>();
		a.put(123, "Mumbai");
		a.put(213, "Pune");
		a.put(134, "Satara");
		a.put(456, "Nashik");
		a.put(654, "Lonavla");
		a.put(123, "Kolhapur");
		a.put(null, "Dubai");
		System.out.println("Hashmap of a: "+a);
		System.out.println("_______________________________________________");
		
		HashMap<Integer,String> b=new HashMap<>();
		b.put(453, "Sangali");
		b.put(876, "Dhule");
		b.put(89, "Sindhudurg");
		System.out.println("Hashmap of a: "+b);
		System.out.println("_______________________________________________");
		
		
		a.putAll(b);
		System.out.println("join two hashmap : "+a);
		System.out.println("_______________________________________________");
		
		
		System.out.println("original value of key 123 : "+a.get(123));
		//System.out.println("key : ");
		System.out.println("_______________________________________________");
		
		//remove entry
		//System.out.println("Remove entry : "+a.remove(456, "Nashik"));
		System.out.println("remove entry : "+a.remove(134));
		System.out.println(a);
		System.out.println("_______________________________________________");
		
		//Is key or value is available or not
		System.out.println("does map contains key 123? : "+a.containsKey(123));
		System.out.println("does map contains value Dubai ? : "+a.containsValue("Dubai"));
		System.out.println("_______________________________________________");
		//System.out.println( "empty : "+a.em);
		
		 
		//all values
		System.out.println("Values are : ");
        Collection list =a.values();
        Iterator<String> itr =list.iterator();
        	  while(itr.hasNext())
        		 {
        			 System.out.println(itr.next());
        		 }
        System.out.println("_______________________________________________");
        		 
         //all keys
        System.out.println("key: ");
        Set<Integer> s=a.keySet();
        Iterator<Integer> i= s.iterator();
        	while( i.hasNext())
        		 {
        			 Integer key = i.next();
        			 System.out.println(key); 
        		 }
		

	}

}