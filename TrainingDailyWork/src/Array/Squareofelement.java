package Array;
import java.util.Scanner;
public class Squareofelement {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size]; 
		
		System.out.println("enter elemeent=");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("square of array elemeent=");
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]*a[i]+" ");
		}
		
	}

}
