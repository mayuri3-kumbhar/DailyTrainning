package ArrayList;

import java.util.ArrayList;

public class Evenno {
	public static void main(String[]args)
	{
		ArrayList<Integer> list=new ArrayList<>(50);
		
		for(Integer i : list)
		{
			list.add(i);
			System.out.println(list.get(i));
			
			
		}
		System.out.println("______________");
		
}
}