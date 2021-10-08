package Array2D;

import java.util.Scanner;

public class Sumofcoloumn {
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
		
		System.out.println("sum of coloumn element...");
		for(int j=0;j<col;j++)
		{
			int sum=0;
			for (int i=0;i<row;i++)
				{
				sum=sum+a[j][i];
			}
			System.out.println("coloumn " +(j+1)+ " elements sum is:"+sum);
		}
		
}
}