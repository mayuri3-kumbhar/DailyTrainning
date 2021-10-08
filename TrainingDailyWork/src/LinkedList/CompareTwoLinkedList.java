package LinkedList;

import java.util.LinkedList;

//WAP to compare two linked lists.
public class CompareTwoLinkedList {
	public static void main(String[]args)
	{
	LinkedList<String> list1 =new LinkedList<>();
	list1.add("mayuri");
	list1.add("durga");
	list1.add("vaishnavi");
	list1.add("rutuja");
	list1.add("namrata");
	list1.add("neha");
	System.out.println("list1 ....");
	System.out.println(list1);
	System.out.println("__________________________________________");
	
	LinkedList<String> list2 =new LinkedList<>();
	list2.add("mayuri");
	list2.add("durga");
	list2.add("vaishnavi");
	list2.add("rutuja");
	list2.add("namrata");
	list2.add("neha");
	/*list2.add("Aradhya");
	list2.add("Gouri");
	list2.add("Arati");*/
	System.out.println("list2 ....");
	System.out.println(list2);
	System.out.println("__________________________________________");
	
	System.out.println(list1.equals(list2));
	System.out.println(list1==list2);
	
	
	
	}
}