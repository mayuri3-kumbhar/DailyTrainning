package LinkedList;

import java.util.Collections;
import java.util.LinkedList;
//WAP to shuffle the elements in a linked list.
public class ShuffleElement {
	public static void main(String[]args)
	{
		LinkedList<String> list=new LinkedList<>();
		list.add("Sunday");
		list.add("Monday");
		list.add("Tuesday");
		list.add("Wednesday");
		list.add("Thursday");
		list.add("Friday");
		list.add("Saturday");
		
		System.out.println("original list ....");
		System.out.println(list);
		System.out.println("__________________________________________");

		System.out.println("Shuffle list ....");
		Collections.shuffle(list);
		System.out.println(list);
		System.out.println("__________________________________________");

		
	}

}
