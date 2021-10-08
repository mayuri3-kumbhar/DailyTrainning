package Array2D;

import java.util.Scanner;

public class Uppertriangularmatrix {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of rows and coloumn of array");
		System.out.println("enter row size");
		int row=sc.nextInt();
		System.out.println("enter coloumn size");
		int col=sc.nextInt();
		int a[][]=new int [row][col];
		
		System.out.println("length of array(no of row):"+a.length);
		
		System.out.println("enter array element...");
		for (int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("array element...");
		for (int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("upper triangular matrix...");
			for (int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					if(i>j)
						System.out.print("0 ");
					else
						System.out.print(a[i][j] +" ");
						
				}	
				System.out.println();
			}
			
}
}