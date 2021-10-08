package LinkedList;

import java.util.Vector;

public class Vectoreg {
	public static void main(String[]args)
	{
		Vector v=new Vector();
		System.out.println("Initial capacity of vector : "+v.capacity());
		v.add(90);
		v.add(6);
		v.add(23);
		v.add(56);
		v.add(2, "Mayuri");
		v.add(34);
		System.out.println(v);
		System.out.println("no of elements in vector : "+v.size());
		v.add(456);
		System.out.println("no of elements in vector : "+v.size());
		System.out.println("new capacity of vector : "+v.capacity());
		System.out.println(v);
		
		Vector xerox =(Vector) v.clone();
	}

}
