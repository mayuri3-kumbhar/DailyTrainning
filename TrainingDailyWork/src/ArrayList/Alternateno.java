package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Alternateno {
	public static void main(String[]args)
	{
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		System.out.println(list);

		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(8);
		list1.add(9);
		list1.add(10);
		list1.add(11);
		System.out.println(list1);
		
		ArrayList<Integer> list2=new ArrayList<>();
		/* Iterator<Integer> itl = list.iterator();
		    Iterator<Integer> itl1 = list1.iterator();
		  

		    while (itl.hasNext() || itl1.hasNext()) 
		    {
		        if (itl.hasNext()) list2.add(itl.next());
		        if (itl1.hasNext()) list2.add(itl1.next());
		    }

		    System.out.println(list2);*/
		int i=0;
		if(list.size() < list1.size())
		{
			for( i=0;i<list1.size();i++)
			{
				list2.add(list.get(i));
				i++;
				list2.add(list1.get(i));
			}
			for(;i<list1.size();i++)
			{
				list2.add(list1.get(i));
			}
		}
	//	else (list.size() > list1.size())
		{
			for( i=0;i<list.size();i++)
			{
				list2.add(list.get(i));
				i++;
				list2.add(list1.get(i));
			}
			for(;i<list.size();i++)
			{
				list2.add(list.get(i));
			}
		}
	}
	
}		
	