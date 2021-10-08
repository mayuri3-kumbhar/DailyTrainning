package Map;

import java.util.ArrayList;
import java.util.HashMap;

public class Occurance {
	public static void main(String[] args) 
	{
		ArrayList<String> a= new ArrayList<>();
		a.add("nikita");
		a.add("Mayuri");
		a.add("nikita");
		a.add("Durga");
		a.add("nikita");
		
		HashMap<String,Integer> hm=new HashMap<>();
		for(String s : a)
		{
			if(hm.containsKey(s))
			{
				int val=hm.get(s);
				hm.put(s, val+1);
			}
			else
				hm.put(s, 1);
		}
		System.out.println(hm);
	}

}
