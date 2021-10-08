package Array2D;

//1 1 1 1
//0 0 0 0
//1 1 1 1
//0 0 0 0
import java.util.Scanner;

public class Matrix 
{
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
				if(i%2==0)
				{
					a[i][j]=0;
				}
				else
				{
					a[i][j]=1;
				}
					
			}
			
			
		}
		for (int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(a[i][j] +" ");
		
			}
			System.out.println();
		}
		
			}
    }

