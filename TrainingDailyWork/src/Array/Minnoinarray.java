package Array;

import java.util.Scanner;

public class Minnoinarray {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		System.out.println("enter array element: ");
		for (int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int min=a[0];
		for (int i=0;i<=a.length-1;i++)
		{
			if (a[i]<min)
				min=a[i];
		}
		System.out.print("min no in array= " +min);
		
				
	}
	
}
