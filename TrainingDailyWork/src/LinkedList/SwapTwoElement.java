package LinkedList;
import java.util.Collections;
//WAP of swap two elements in a linked list.
import java.util.LinkedList;
public class SwapTwoElement {
	public static void main(String[]args)
	{
		LinkedList<String> list=new LinkedList<>();
		list.add("Pink");
		list.add("Yellow");
		list.add("Black");
		list.add("Purple");
		list.add("White");
		list.add("Blue");
		
		System.out.println("original list ....");
		System.out.println(list);
		System.out.println("__________________________________________");

		
	//swaping the element using Coolections.swap
		System.out.println("after swaping the element....");
		Collections.swap(list, 2, 3);
		System.out.println(list);
		System.out.println("__________________________________________");

		
		System.out.println(" list ....");
		list.remove(2);
		list.add(2, "Purple");
		list.remove(3);
		list.add(3,"Black");
		System.out.println(list);
		
	}

}
