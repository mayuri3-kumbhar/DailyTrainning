package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
	public static void main(String[]args)
	{
		ArrayList<String> list=new ArrayList<String>();
		System.out.println(list);
	
		list.add("LMN");
		list.add("PQR");
		list.add("XY");
		list.add("DELL");
		System.out.println(list);
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list);
	}

}
