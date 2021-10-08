package Array;

import java.util.Scanner;

public class Reversearray 
{
	public static void main(String[]args)
	{
		int a[]=new int[] {1,2,3,4,5};
		System.out.println(" array element: ");
		for (int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println(" array element in reverse order: ");
		for (int i=a.length-1;i>=0;i--)
		{
		System.out.println(a[i]+" ");
		}
		
	}
}