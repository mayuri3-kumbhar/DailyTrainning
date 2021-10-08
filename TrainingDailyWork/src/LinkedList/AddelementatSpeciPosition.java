package LinkedList;

import java.util.LinkedList;
//WAP to insert the specified element at the specified position in the linked list.
public class AddelementatSpeciPosition {
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
	
	System.out.println("After adding element at specific position ....");
	list1.add(3, "snehal");
	System.out.println(list1);
	System.out.println("__________________________________________");
	
	
	
	}

}
