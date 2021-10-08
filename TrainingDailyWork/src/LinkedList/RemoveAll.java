package LinkedList;

import java.util.LinkedList;
//WAP to remove all the elements from a linked list.
public class RemoveAll {
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
	
	System.out.println("remove all element in list1 ....");
	list1.clear();
	System.out.println(list1);
	System.out.println("__________________________________________");
	 
	}
}

