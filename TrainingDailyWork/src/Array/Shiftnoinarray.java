package Array;
// 1 2 3 4 5
// 5 1 2 3 4
import java.util.Scanner;

public class Shiftnoinarray 
{
	public static void main(String[]args)
	{
		int temp;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array");
	int size=sc.nextInt();
	int a[]=new int[size];

	System.out.print("array element:");
	for (int i=0;i<=a.length-1;i++)
	{
		a[i]=sc.nextInt();
	}
	
	temp=a[a.length-1];
	for (int i=a.length-1;i>0;i--)
			{
				a[i]=a[i-1];
			}
		a[0]=temp;
		System.out.println(" array element after shifting: ");
		for (int i=0;i<=a.length-1;i++)
		{
			System.out.print(a[i]+ " "); 
		}
	}
}
