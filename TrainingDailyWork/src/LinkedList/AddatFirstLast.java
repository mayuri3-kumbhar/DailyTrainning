package LinkedList;

import java.util.LinkedList;
//WAP to insert elements into the linked list at the first and last position
//WAP to insert the specified element at the front of a linked list.
//WAP to insert the specified element at the end of a linked list.
public class AddatFirstLast {
	public static void main(String[]args)
	{
		LinkedList<Integer> list= new LinkedList<>();
		list.add(89);
		list.add(90);
		list.add(45);
		list.add(455);
		list.add(34);
		list.add(24);
		System.out.println("Original list.....");
		System.out.println(list);
		System.out.println("__________________________________________");
		
		System.out.println("Adding 1st and last postion........");
		list.addFirst(56);
		list.addLast(67);
		System.out.println(list);
		System.out.println("__________________________________________");
	
		list.offerFirst(12);
		System.out.println(list);
		System.out.println("__________________________________________");
		
		list.offerLast(89);
		System.out.println(list);
		System.out.println("__________________________________________");
	
	}

}
