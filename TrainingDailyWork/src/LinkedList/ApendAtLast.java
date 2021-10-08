package LinkedList;

import java.util.Collections;
import java.util.LinkedList;
//WAP to append the specified element to the end of a linked list.


public class ApendAtLast {
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

	System.out.println("After adding element at last.........");
	list1.addLast("Gouri");
	System.out.println(list1);
	System.out.println("__________________________________________");

	
	}

}
