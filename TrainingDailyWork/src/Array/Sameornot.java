package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Sameornot {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size]; 
		
		System.out.println("enter element=");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int cnt=0;
		int[] cheked= new int[a.length];
		int k=0;
		//System.out.print("same no in array= ");
		outerloop:
		for(int j=0;j<a.length;j++)
		{
			for(int l=0;l<cheked.length;l++)
			{
				if(cheked[l]==a[j])
					continue outerloop;
			}
		
		for (int i=j+1;i<=a.length-1;i++)
		{
			if(a[j]==a[i])
			{
				cheked[k]=a[j]
;				cnt++;
				k++;
				
			}
				
		}
		
		
		}
		System.out.println(" Duplicate elements are : " +Arrays.toString(cheked));
		System.out.println(" Total duplicates in array are "+cnt);
	}
}