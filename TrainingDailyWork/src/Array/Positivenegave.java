package Array;

import java.util.Scanner;

public class Positivenegave 
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
		
		for (int i=0;i<=a.length-1;i++)
		{
			if(a[i]>0)
			{
			System.out.println("positive no in array= " +a[i]+" ");
			}
			else
			{
			System.out.println("negative no in array= " +a[i]+" ");	
			}
		
		}
	}
}