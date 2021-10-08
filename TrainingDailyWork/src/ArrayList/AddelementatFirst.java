package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class AddelementatFirst {
	public static void main(String[]args)
	{
		ArrayList<String> list=new ArrayList<>();
		System.out.println(list);
	
		list.add("Mayuri");
		list.add("Pooja");
		list.add("Rutuja");
		list.add("Namrata");
		
	
		list.set(3, "Gouri");
		System.out.println("list of names are...");
		System.out.println(list);
		System.out.println("_____________________");
		
		Collections.synchronizedList(list);
		list.add(1, "Gouri");
		//System.out.println("list after adding at 1st position...");
		System.out.println(list);
		
		
	}
}
