package Array;

import java.util.Scanner;

public class Maxnoinarray {
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
		
		int max=a[0];
		for (int i=0;i<=a.length-1;i++)
		{
			if (a[i]>max)
				max=a[i];
		}
		System.out.print("maximum no in array= " +max);
		
				
	}

}
