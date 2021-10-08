package Map;

import java.util.HashMap;
//WAP to add elements to a HashMap without using generics (ie do not use <>) and print content of it. 
//Use Integer as Key and String as Value. In second HashMap add elements of String type as Key and Integer as Value.
public class Q1hashmap {
	public static void main(String[] args) {
		HashMap m= new HashMap();
		m.put(23, "Orange");
		m.put(12, "Green");
		m.put(2, "Red");
		m.put(87, "Black");
		m.put(45, "Blue");
		System.out.println(m);
		
		HashMap m1= new HashMap();
		m1.put("yellow", 5);
		m1.put("Purple", 45);
		m1.put("White", 34);
		m1.put("Pink", 25);
		System.out.println(m1);
	}

}
