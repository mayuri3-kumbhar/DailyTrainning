package LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestShuffule {
	public static void main(String[]args)
	{
		LinkedList<Integer> list= new LinkedList<>();
		list.add(2);
		list.add(8);
		list.add(5);
		list.add(1);
		
		Iterator i= list.iterator();
		Collections.reverse(list);
		Collections.shuffle(list);
		while(i.hasNext())
		{
			System.out.println(i.next() + " ");
		}
		
		
	}
}
