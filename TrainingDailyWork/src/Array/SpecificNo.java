package Array;

import java.util.Scanner;

public class SpecificNo 
{
	public void noInArray(int a[],int x)
	{
		boolean found=false;
		for (int i=0;i<a.length;i++)
		{
			if(a[i]==x)
			{
				found=true;
				break;
			}
		 }
		if(found==true)
		{
			System.out.println("your specific no"+x+" is present in array");
		}
		else
			System.out.println("your specific no"+x+" is not present in array");
}


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
		System.out.println("enter the no to check" );
		
		 //new SpecificNo.noInArray();
	
	}
}
