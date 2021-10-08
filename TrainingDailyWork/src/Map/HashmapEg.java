package Map;

import java.util.ArrayList;
import java.util.HashMap;
public class HashmapEg {
	public static void main(String[]args)
	{
		HashMap<Integer,String> m=new HashMap<>();
		m.put(45, "Mayuri");
		m.put(23, "Pooja");
		m.put(76, "Vaishnavi");
		m.put(45, "Neha");
		m.put(null, "Namrata");
		m.put(44, "Rutuja");
		m.put(2, null);
		System.out.println(m);
		
		//size of map
		System.out.println("Size of map is : "+m.size());
		System.out.println("*********************************************************************");
		
		
		//value of key
		System.out.println("original valiue of key 23 : "+m.put(23, "Pooja"));
		System.out.println(m);
		System.out.println("Size of map is : "+m.size());
		System.out.println("*********************************************************************");
		
		System.out.println(" value of key 25 : "+m.get(45));
		System.out.println("*********************************************************************");
		
		//remove the key value
		System.out.println("remove 45 : "+m.remove(45));
		System.out.println(m);
		System.out.println("*********************************************************************");
		
		//value of null key 
		System.out.println(" value of null key  : "+m.get(null));
		System.out.println(" value of key 2 : "+m.get(2));
		System.out.println("*********************************************************************");
		
		System.out.println("does map contains key null? : "+m.containsKey(null));
		System.out.println("does map contains key 2? : "+m.containsKey(2));
		System.out.println("*********************************************************************");
		
		System.out.println("does more than one key of  Mayuri available in map? : "+m.containsValue("Mayuri"));
		
		System.out.println("*********************************************************************");
		
		//replace the value
		String a=m.replace(44, "Arati");
		System.out.println(a);
		System.out.println(m);
	}

}
