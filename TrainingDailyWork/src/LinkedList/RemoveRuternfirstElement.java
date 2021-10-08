package LinkedList;

import java.util.LinkedList;
//WAP to remove and return the first element of a linked list.
public class RemoveRuternfirstElement {
	public static void main(String[]args)
	{
	LinkedList<String> list =new LinkedList<>();
	list.add("Orange");
	list.add("Mango");
	list.add("Apple");
	list.add("Strawberry");
	list.add("Pineapple");
	System.out.println("original list1 ....");
	System.out.println(list);
	System.out.println("__________________________________________");
	
	list.remove(0);
	//list.add(0, "Mango");
	System.out.println(list);
	System.out.println("__________________________________________");
	
}
}
