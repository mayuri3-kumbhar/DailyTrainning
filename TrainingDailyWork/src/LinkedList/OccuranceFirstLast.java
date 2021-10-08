package LinkedList;

import java.util.LinkedList;

//WAP to get the first and last occurrence of the specified elements in a linked list.
public class OccuranceFirstLast {

	public static void main(String[]args)
	{
	LinkedList<String> list1 =new LinkedList<>();
	list1.add("mayuri");
	list1.add("durga");
	list1.add("vaishnavi");
	list1.add("rutuja");
	list1.add("namrata");
	list1.add("neha");
	System.out.println("original list1 ....");
	System.out.println(list1);
	System.out.println("__________________________________________");
	
	
	String element = (String) list1.element();
	System.out.println("first element : "+element);
	
	
	System.out.println("first element : "+list1.getFirst());
	System.out.println("____________________________________________");
	
	System.out.println("last element : "+list1.getLast());
	System.out.println("____________________________________________");
	
	}
}
