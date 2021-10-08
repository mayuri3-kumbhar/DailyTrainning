package LinkedList;

import java.util.Collections;
import java.util.LinkedList;
//WAP to replace an element in a linked list.
public class ReplaceElement {

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
	
	System.out.println("replacing first and second element ....");
	Collections.replaceAll(list1, "hjk", "kjlh");
	System.out.println(list1);
	System.out.println("__________________________________________");
	

	}
}
