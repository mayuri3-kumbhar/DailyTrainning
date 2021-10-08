package LinkedList;

import java.util.LinkedList;
//WAP to insert some elements at the specified position into a linked list.
public class Elementsadd {
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
	
	LinkedList<String> list2=new LinkedList<>();
	list2.add("Gouri");
	list2.add("Arati");
	list2.add("poonam");
	System.out.println("original list2 ....");
	System.out.println(list2);
	System.out.println("__________________________________________");
	
	System.out.println("list1+list2=list3 ....");
	list1.addAll(list2);
	System.out.println(list1);
	System.out.println("__________________________________________");
	
	
	
	
	
	
	
	}

}
