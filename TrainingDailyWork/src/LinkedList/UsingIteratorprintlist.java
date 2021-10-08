package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator; 

//WAP to iterate through all elements in a linked list.
public class UsingIteratorprintlist {
	public static void main(String[]args)
	{
	LinkedList<String> list1 =new LinkedList<>();
	list1.add("mayuri");
	list1.add("durga");
	list1.add("vaishnavi");
	list1.add("rutuja");
	list1.add("namrata");
	list1.add("neha");
	System.out.println("original list ....");
	System.out.println(list1);
	System.out.println("__________________________________________");

	System.out.println("Iteration using Iterator........");
	Iterator<String> itr= list1.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	}
}
