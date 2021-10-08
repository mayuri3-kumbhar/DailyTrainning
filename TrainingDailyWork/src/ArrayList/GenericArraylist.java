package ArrayList;

import java.util.ArrayList;
public class GenericArraylist {
	public static void main(String[]args)
	{
		ArrayList<Integer> list=new ArrayList<>();
		System.out.println(list);
		
		list.add(34);
		list.add(23);
		list.add((int)56.9f);
		list.add(12);
		//list.add("mayuri");			//we can't add the string bcz it is integer type generic list.
		
		System.out.println(list);
		for(int i=0;i<list.size();i++)
		{
			int data= list.get(i);
			list.set(i, data+5);
		}
		System.out.println("adding after 5 to each object... ");
		System.out.println(list);
		
		//using for each loop
		System.out.println("using enhanced for loop");
		for(Integer o:list)
		{
			System.out.println("Object is= "+o);
		}
		
		
		
	}

}
