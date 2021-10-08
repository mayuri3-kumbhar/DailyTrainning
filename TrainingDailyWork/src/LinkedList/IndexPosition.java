package LinkedList;

import java.util.LinkedList;

//WAP to display the elements and their positions in a linked list.
public class IndexPosition {
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
	
	for(int i=0;i<list1.size();i++)
	{
		System.out.println("element a : "+i+ " position is "+list1.get(i));
	}
	
	}
	

}
