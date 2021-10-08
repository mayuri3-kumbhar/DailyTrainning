package Array;

import java.util.Scanner;

public class Zero 
{
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
		
		System.out.println(" array element: ");
		for (int i=0;i<=a.length-1;i++)
		{
			if(a[i]%10==9)
				System.out.println("0");
			else
				System.out.println(a[i]);

			
		}
	}
}