package Map;
//WAP to copy all of the mappings from the specified HashMap to another map.

import java.util.HashMap;

public class Q8copy {
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
	System.out.println("copy map b in map a");
	System.out.println(a);
	}

}
