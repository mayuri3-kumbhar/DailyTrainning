package LinkedList;

import java.util.LinkedList;
//WAP to remove first and last element from a linked list.
public class REmoveFirstandLast {
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
	
	System.out.println("removing first and last element ....");
	list1.removeFirst();
	list1.removeLast();
	System.out.println(list1);
	System.out.println("__________________________________________");
	
	
	}

}
